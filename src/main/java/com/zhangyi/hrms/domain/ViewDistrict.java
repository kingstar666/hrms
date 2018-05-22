package com.zhangyi.hrms.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "view_district", schema = "hrms", catalog = "")
public class ViewDistrict {
    private String districtCode;
    private String districtName;
    private String country;
    private String cityCode;
    private String cityName;
    private String provinceCode;
    private String provinceName;
    private String province;
    private String shortName;

    @Basic
    @Column(name = "district_code", nullable = false, length = 6)
    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    @Basic
    @Column(name = "district_name", nullable = true, length = 30)
    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @Basic
    @Column(name = "country", nullable = true, length = 30)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "city_code", nullable = true, length = 6)
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "city_name", nullable = true, length = 30)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "province_code", nullable = true, length = 6)
    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Basic
    @Column(name = "province_name", nullable = true, length = 30)
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Basic
    @Column(name = "province", nullable = true, length = 30)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "short_name", nullable = true, length = 60)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewDistrict that = (ViewDistrict) o;
        return Objects.equals(districtCode, that.districtCode) &&
                Objects.equals(districtName, that.districtName) &&
                Objects.equals(country, that.country) &&
                Objects.equals(cityCode, that.cityCode) &&
                Objects.equals(cityName, that.cityName) &&
                Objects.equals(provinceCode, that.provinceCode) &&
                Objects.equals(provinceName, that.provinceName) &&
                Objects.equals(province, that.province) &&
                Objects.equals(shortName, that.shortName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(districtCode, districtName, country, cityCode, cityName, provinceCode, provinceName, province, shortName);
    }
}
