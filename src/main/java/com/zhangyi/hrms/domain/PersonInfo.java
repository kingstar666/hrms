package com.zhangyi.hrms.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tab_person_info", schema = "hrms", catalog = "")
public class PersonInfo {
    private String personId;
    private String personName;
    private String foreignName;
    private String usedName;
    private Date birthday;
    private String homeAddress;
    private String email;
    private String phone;
    private Integer personSequence;
    private String identityCard;
    private String photo;
    private Byte deleted;
    private Timestamp modifyTime;
    private PersonPoliticalStatus tabPersonPoliticalStatusByPersonId;
    private OrgInfo orgInfo;
    private DeptInfo deptInfo;
    private DicGender gender;
    private DicNation nationality;
    private DicDistricts nativePlace; //籍贯
    private DicDistricts birthPlace; //出生地
    private DicDistricts domicilePlace; //户籍地
    private DicEthnicity ethnicity;
    private DicHealth health;
    private DicMarriage marriage;

    public DicGender getGender() {
        return gender;
    }

    public void setGender(DicGender gender) {
        this.gender = gender;
    }

    public DicNation getNationality() {
        return nationality;
    }

    public void setNationality(DicNation nationality) {
        this.nationality = nationality;
    }

    public DicDistricts getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(DicDistricts nativePlace) {
        this.nativePlace = nativePlace;
    }

    public DicDistricts getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(DicDistricts birthPlace) {
        this.birthPlace = birthPlace;
    }

    public DicDistricts getDomicilePlace() {
        return domicilePlace;
    }

    public void setDomicilePlace(DicDistricts domicilePlace) {
        this.domicilePlace = domicilePlace;
    }

    public DicEthnicity getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(DicEthnicity ethnicity) {
        this.ethnicity = ethnicity;
    }

    public DicHealth getHealth() {
        return health;
    }

    public void setHealth(DicHealth health) {
        this.health = health;
    }

    public DicMarriage getMarriage() {
        return marriage;
    }

    public void setMarriage(DicMarriage marriage) {
        this.marriage = marriage;
    }

    public DeptInfo getDeptInfo() {
        return deptInfo;
    }

    public void setDeptInfo(DeptInfo deptInfo) {
        this.deptInfo = deptInfo;
    }



    @OneToOne(targetEntity = OrgInfo.class)
    @JoinColumn(name="org_id",referencedColumnName = "org_id")
    public OrgInfo getOrgInfo() {
        return orgInfo;
    }

    public void setOrgInfo(OrgInfo orgInfo) {
        this.orgInfo = orgInfo;
    }

    @Id
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
    @Column(name = "foreign_name", nullable = true, length = 36)
    public String getForeignName() {
        return foreignName;
    }

    public void setForeignName(String foreignName) {
        this.foreignName = foreignName;
    }

    @Basic
    @Column(name = "used_name", nullable = true, length = 36)
    public String getUsedName() {
        return usedName;
    }

    public void setUsedName(String usedName) {
        this.usedName = usedName;
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
    @Column(name = "home_address", nullable = true, length = 120)
    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 40)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 11)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "person_sequence", nullable = true)
    public Integer getPersonSequence() {
        return personSequence;
    }

    public void setPersonSequence(Integer personSequence) {
        this.personSequence = personSequence;
    }

    @Basic
    @Column(name = "identity_card", nullable = true, length = 18)
    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    @Basic
    @Column(name = "photo", nullable = true, length = 255)
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "deleted", nullable = true)
    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "modify_time", nullable = false)
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonInfo that = (PersonInfo) o;
        return Objects.equals(personId, that.personId) &&
                Objects.equals(personName, that.personName) &&
                Objects.equals(foreignName, that.foreignName) &&
                Objects.equals(usedName, that.usedName) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(homeAddress, that.homeAddress) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(personSequence, that.personSequence) &&
                Objects.equals(identityCard, that.identityCard) &&
                Objects.equals(photo, that.photo) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(personId, personName, foreignName, usedName, birthday, homeAddress, email, phone, personSequence, identityCard, photo, deleted, modifyTime);
    }

    @OneToOne(mappedBy = "tabPersonInfoByPersonId")
    public PersonPoliticalStatus getTabPersonPoliticalStatusByPersonId() {
        return tabPersonPoliticalStatusByPersonId;
    }

    public void setTabPersonPoliticalStatusByPersonId(PersonPoliticalStatus tabPersonPoliticalStatusByPersonId) {
        this.tabPersonPoliticalStatusByPersonId = tabPersonPoliticalStatusByPersonId;
    }
}
