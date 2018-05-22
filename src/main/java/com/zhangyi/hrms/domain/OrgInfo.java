package com.zhangyi.hrms.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tab_org_info", schema = "hrms", catalog = "")
public class OrgInfo {
    private String orgId;
    private String orgName;
    private String orgCode;
    private String zipCode;
    private String orgAddress;
    private String orgPhone;
    private Integer belongto;
    private Integer orgLevel;
    private String superOrg;
    private Integer orgType;
    private Integer corpType;
    private Integer refToCivilServiceLaw;
    private Integer orgSequence;
    private Integer deleted;
    private Timestamp modified;

    @Id
    @Column(name = "org_id", nullable = false, length = 32)
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
    @Column(name = "org_code", nullable = true, length = 18)
    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @Basic
    @Column(name = "zip_code", nullable = true, length = 6)
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "org_address", nullable = true, length = 120)
    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    @Basic
    @Column(name = "org_phone", nullable = true, length = 16)
    public String getOrgPhone() {
        return orgPhone;
    }

    public void setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone;
    }

    @Basic
    @Column(name = "belongto", nullable = true)
    public Integer getBelongto() {
        return belongto;
    }

    public void setBelongto(Integer belongto) {
        this.belongto = belongto;
    }

    @Basic
    @Column(name = "org_level", nullable = true)
    public Integer getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    @Basic
    @Column(name = "super_org", nullable = true, length = 120)
    public String getSuperOrg() {
        return superOrg;
    }

    public void setSuperOrg(String superOrg) {
        this.superOrg = superOrg;
    }

    @Basic
    @Column(name = "org_type", nullable = true)
    public Integer getOrgType() {
        return orgType;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    @Basic
    @Column(name = "corp_type", nullable = true)
    public Integer getCorpType() {
        return corpType;
    }

    public void setCorpType(Integer corpType) {
        this.corpType = corpType;
    }

    @Basic
    @Column(name = "ref_to_civil_service_law", nullable = true)
    public Integer getRefToCivilServiceLaw() {
        return refToCivilServiceLaw;
    }

    public void setRefToCivilServiceLaw(Integer refToCivilServiceLaw) {
        this.refToCivilServiceLaw = refToCivilServiceLaw;
    }

    @Basic
    @Column(name = "org_sequence", nullable = true)
    public Integer getOrgSequence() {
        return orgSequence;
    }

    public void setOrgSequence(Integer orgSequence) {
        this.orgSequence = orgSequence;
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
        OrgInfo orgInfo = (OrgInfo) o;
        return Objects.equals(orgId, orgInfo.orgId) &&
                Objects.equals(orgName, orgInfo.orgName) &&
                Objects.equals(orgCode, orgInfo.orgCode) &&
                Objects.equals(zipCode, orgInfo.zipCode) &&
                Objects.equals(orgAddress, orgInfo.orgAddress) &&
                Objects.equals(orgPhone, orgInfo.orgPhone) &&
                Objects.equals(belongto, orgInfo.belongto) &&
                Objects.equals(orgLevel, orgInfo.orgLevel) &&
                Objects.equals(superOrg, orgInfo.superOrg) &&
                Objects.equals(orgType, orgInfo.orgType) &&
                Objects.equals(corpType, orgInfo.corpType) &&
                Objects.equals(refToCivilServiceLaw, orgInfo.refToCivilServiceLaw) &&
                Objects.equals(orgSequence, orgInfo.orgSequence) &&
                Objects.equals(deleted, orgInfo.deleted) &&
                Objects.equals(modified, orgInfo.modified);
    }

    @Override
    public int hashCode() {

        return Objects.hash(orgId, orgName, orgCode, zipCode, orgAddress, orgPhone, belongto, orgLevel, superOrg, orgType, corpType, refToCivilServiceLaw, orgSequence, deleted, modified);
    }
}
