package com.zhangyi.hrms.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tab_person_political_status", schema = "hrms", catalog = "")
public class PersonPoliticalStatus {
    private String personId;
    private String politicalStatus;
    private Date prepareDate;
    private String partyIntroducer;
    private Date formalDate;
    private String abnormalReason;

    @Id
    @Column(name = "personId", nullable = false, length = 32)
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "political_status", nullable = true, length = 8)
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    @Basic
    @Column(name = "prepare_date", nullable = true)
    public Date getPrepareDate() {
        return prepareDate;
    }

    public void setPrepareDate(Date prepareDate) {
        this.prepareDate = prepareDate;
    }

    @Basic
    @Column(name = "party_introducer", nullable = true, length = 32)
    public String getPartyIntroducer() {
        return partyIntroducer;
    }

    public void setPartyIntroducer(String partyIntroducer) {
        this.partyIntroducer = partyIntroducer;
    }

    @Basic
    @Column(name = "formal_date", nullable = true)
    public Date getFormalDate() {
        return formalDate;
    }

    public void setFormalDate(Date formalDate) {
        this.formalDate = formalDate;
    }

    @Basic
    @Column(name = "abnormal_reason", nullable = true, length = 256)
    public String getAbnormalReason() {
        return abnormalReason;
    }

    public void setAbnormalReason(String abnormalReason) {
        this.abnormalReason = abnormalReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonPoliticalStatus that = (PersonPoliticalStatus) o;
        return Objects.equals(personId, that.personId) &&
                Objects.equals(politicalStatus, that.politicalStatus) &&
                Objects.equals(prepareDate, that.prepareDate) &&
                Objects.equals(partyIntroducer, that.partyIntroducer) &&
                Objects.equals(formalDate, that.formalDate) &&
                Objects.equals(abnormalReason, that.abnormalReason);
    }

    @Override
    public int hashCode() {

        return Objects.hash(personId, politicalStatus, prepareDate, partyIntroducer, formalDate, abnormalReason);
    }
}
