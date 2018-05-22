package com.zhangyi.hrms.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhangyi.hrms.service.IPersonService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class UploadAction extends ActionSupport {
    @Autowired
    private IPersonService personService;
    private File upload;
    private String uploadContentType;
    private String uploadFileName;
    private String savePath;
    private String personId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getSavePath() {
        return ServletActionContext.getServletContext().getRealPath(savePath);
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    @Override
    public String execute() throws Exception {
        FileOutputStream fs = new FileOutputStream(getSavePath() + "\\" + personId + ".jpg");
        FileInputStream fi = new FileInputStream(getUpload());
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fi.read(buffer)) > 0) {
            fs.write(buffer, 0, len);
        }
        personService.updatePhoto(personId);
        return "detail";
    }
}
