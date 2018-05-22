package com.zhangyi.hrms.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tab_dept_info", schema = "hrms")
public class DeptInfo {
    private String deptId;
    private String deptName;
    private String phone;
    private String room;
    private Integer deptSequence;
    private String setby;
    private Integer deleted;
    private Timestamp modified;

    @Id
    @Column(name = "dept_id", nullable = false, length = 32)
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "dept_name", nullable = true, length = 100)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "room", nullable = true, length = 100)
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Basic
    @Column(name = "dept_sequence", nullable = true)
    public Integer getDeptSequence() {
        return deptSequence;
    }

    public void setDeptSequence(Integer deptSequence) {
        this.deptSequence = deptSequence;
    }

    @Basic
    @Column(name = "setby", nullable = true, length = 100)
    public String getSetby() {
        return setby;
    }

    public void setSetby(String setby) {
        this.setby = setby;
    }

    @Basic
    @Column(name = "deleted", nullable = true)
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "modified", nullable = false)
    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeptInfo deptInfo = (DeptInfo) o;
        return Objects.equals(deptId, deptInfo.deptId) &&
                Objects.equals(deptName, deptInfo.deptName) &&
                Objects.equals(phone, deptInfo.phone) &&
                Objects.equals(room, deptInfo.room) &&
                Objects.equals(deptSequence, deptInfo.deptSequence) &&
                Objects.equals(setby, deptInfo.setby) &&
                Objects.equals(deleted, deptInfo.deleted) &&
                Objects.equals(modified, deptInfo.modified);
    }

    @Override
    public int hashCode() {

        return Objects.hash(deptId, deptName, phone, room, deptSequence, setby, deleted, modified);
    }
}
