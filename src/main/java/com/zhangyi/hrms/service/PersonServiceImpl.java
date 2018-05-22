package com.zhangyi.hrms.service;

import com.zhangyi.hrms.dao.IPersonDao;
import com.zhangyi.hrms.domain.*;
import com.zhangyi.hrms.util.IDCardUtil;
import com.zhangyi.hrms.util.PinYin4jUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.Date;

@Service
@Transactional
public class PersonServiceImpl implements IPersonService {
    @Autowired
    private IPersonDao personDao;

    @Override
    public PersonInfo query(String personId) {
        return personDao.findById(personId);
    }

    @Override
    public void updatePhoto(String personId) {
        personDao.updatePhoto(personId);
    }

    @Override
    public void addPersonInfo(PersonInfo model, String orgId, String deptId) throws ParseException {
        DeptInfo deptInfo = new DeptInfo();
        deptInfo.setDeptId(deptId);
        OrgInfo orgInfo = new OrgInfo();
        orgInfo.setOrgId(orgId);
        model.setDeptInfo(deptInfo);
        model.setOrgInfo(orgInfo);
        String identityCard = model.getIdentityCard();
        IDCardUtil.validate(identityCard);
        Date birthday = IDCardUtil.getBirthday(identityCard);
        model.setBirthday(birthday);
        String districts = identityCard.substring(0, 6);
        DicDistricts dicDistricts = new DicDistricts();
        dicDistricts.setDistrictCode(districts);
        model.setBirthPlace(dicDistricts);
        model.setDomicilePlace(dicDistricts);
        model.setNativePlace(dicDistricts);
        DicGender gender = new DicGender();
        int genderId = IDCardUtil.getGender(identityCard);
        gender.setGenderId(genderId);
        model.setGender(gender);
        model.setPersonSequence(Integer.MAX_VALUE);
        String[] twoCharName = new String[]{"欧阳","太史","端木","上官","司马","东方","独孤","南宫","万俟","闻人","夏侯","诸葛","尉迟","公羊","赫连","澹台","皇甫","宗政","濮阳","公冶","太叔","申屠","公孙","慕容","仲孙","钟离","长孙","宇文","司徒","鲜于","司空","闾丘","子车","亓官","司寇","巫马","公西","颛孙","壤驷","公良","漆雕","乐正","宰父","谷梁","拓跋","夹谷","轩辕","令狐","段干","百里","呼延","东郭","南门","羊舌","微生","公户","公玉","公仪","梁丘","公仲","公上","公门","公山","公坚","左丘","公伯","西门","公祖","第五","公乘","贯丘","公皙","南荣","东里","东宫","仲长","子书","子桑","即墨","达奚","褚师"};
        String personName = model.getPersonName();
        String surname = personName.substring(0,1);
        String givenName = personName.substring(1,personName.length());
        for(String name : twoCharName){
            if(name.equals(personName.substring(0,2))){
                surname = personName.substring(0,2);
                givenName = personName.substring(2,personName.length());
            }
        }
        surname = PinYin4jUtils.hanziToPinyin(surname,"");
        surname = surname.substring(0,1).toUpperCase() + surname.substring(1,surname.length());
        givenName = PinYin4jUtils.hanziToPinyin(givenName,"");
        givenName = givenName.substring(0,1).toUpperCase() + givenName.substring(1,surname.length());
        String foreignName = surname + " " + givenName;
        model.setForeignName(foreignName);
        model.setUsedName("无");
        personDao.save(model);
    }
}

