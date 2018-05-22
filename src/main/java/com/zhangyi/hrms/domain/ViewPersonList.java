package com.zhangyi.hrms.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "view_person_list", schema = "hrms", catalog = "")
public class ViewPersonList {
    private String personId;
    private String personName;
    private Date birthday;
    private String orgId;
    private String orgName;
    private String deptId;
    private String deptName;
    private String ethnicity;
    private String partyName;
    private String nativePlace;

    @Basic
    @Column(name = "person_id", nullable = false, length = 32)
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "person_name", nullable = true, length = 36)
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Basic
    @Column(name = "birthday", nullable = true)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "org_id", nullable = true, length = 32)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "org_name", nullable = true, length = 120)
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Basic
    @Column(name = "dept_id", nullable = true, length = 32)
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
    @Column(name = "ethnicity", nullable = true, length = 15)
    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    @Basic
    @Column(name = "party_name", nullable = true, length = 32)
    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    @Basic
    @Column(name = "native_place", nullable = true, length = 60)
    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewPersonList that = (ViewPersonList) o;
        return Objects.equals(personId, that.personId) &&
                Objects.equals(personName, that.personName) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(orgName, that.orgName) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(ethnicity, that.ethnicity) &&
                Objects.equals(partyName, that.partyName) &&
                Objects.equals(nativePlace, that.nativePlace);
    }

    @Override
    public int hashCode() {

        return Objects.hash(personId, personName, birthday, orgId, orgName, deptId, deptName, ethnicity, partyName, nativePlace);
    }
}
