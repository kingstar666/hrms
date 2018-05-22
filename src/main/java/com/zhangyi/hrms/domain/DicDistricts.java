package com.zhangyi.hrms.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "dic_districts", schema = "hrms", catalog = "")
public class DicDistricts {
    private String districtCode;

    @Id
    @javax.persistence.Column(name = "district_code", nullable = false, length = 6)
    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    private String districtName;

    @Basic
    @javax.persistence.Column(name = "district_name", nullable = true, length = 30)
    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    private String districtLevel;

    @Basic
    @javax.persistence.Column(name = "district_level", nullable = true, length = 1)
    public String getDistrictLevel() {
        return districtLevel;
    }

    public void setDistrictLevel(String districtLevel) {
        this.districtLevel = districtLevel;
    }

    private String shortName;

    @Basic
    @javax.persistence.Column(name = "short_name", nullable = true, length = 30)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    //    private String superDistirctCode;
//
//    @Basic
//    @javax.persistence.Column(name = "super_distirct_code", nullable = true, length = 6)
//    public String getSuperDistirctCode() {
//        return superDistirctCode;
//    }
//
//    public void setSuperDistirctCode(String superDistirctCode) {
//        this.superDistirctCode = superDistirctCode;
//    }
    @ManyToOne
    @JoinColumn(name = "super_distirct_code", unique = true)
    private DicDistricts superDistirctCode;

    public DicDistricts getSuperDistirctCode() {
        return superDistirctCode;
    }

    public void setSuperDistirctCode(DicDistricts superDistirctCode) {
        this.superDistirctCode = superDistirctCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DicDistricts that = (DicDistricts) o;
        return Objects.equals(districtCode, that.districtCode) &&
                Objects.equals(districtName, that.districtName) &&
                Objects.equals(districtLevel, that.districtLevel) &&
                Objects.equals(shortName, that.shortName) &&
                Objects.equals(superDistirctCode, that.superDistirctCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(districtCode, districtName, districtLevel, shortName, superDistirctCode);
    }
}
