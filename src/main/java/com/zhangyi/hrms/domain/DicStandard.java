package com.zhangyi.hrms.domain;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "dic_standard", schema = "hrms", catalog = "")
public class DicStandard {
    private int standardId;

    @javax.persistence.Id
    @javax.persistence.Column(name = "standard_id", nullable = false)
    public int getStandardId() {
        return standardId;
    }

    public void setStandardId(int standardId) {
        this.standardId = standardId;
    }

    private String standardName;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "standard_name", nullable = true, length = 255)
    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    private String standardCode;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "standard_code", nullable = true, length = 255)
    public String getStandardCode() {
        return standardCode;
    }

    public void setStandardCode(String standardCode) {
        this.standardCode = standardCode;
    }

    private Integer standardYear;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "standard_year", nullable = true)
    public Integer getStandardYear() {
        return standardYear;
    }

    public void setStandardYear(Integer standardYear) {
        this.standardYear = standardYear;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DicStandard that = (DicStandard) o;
        return standardId == that.standardId &&

                Objects.equals(standardName, that.standardName) &&
                Objects.equals(standardCode, that.standardCode) &&
                Objects.equals(standardYear, that.standardYear);
    }

    @Override
    public int hashCode() {

        return Objects.hash(standardId, standardName, standardCode, standardYear);
    }
}
