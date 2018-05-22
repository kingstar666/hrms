package com.zhangyi.hrms.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "dic_gender", schema = "hrms", catalog = "")
public class DicGender {
    private int genderId;

    @Id
    @javax.persistence.Column(name = "gender_id", nullable = false)
    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }

    private String genderName;

    @Basic
    @javax.persistence.Column(name = "gender_name", nullable = true, length = 100)
    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    private Integer standard;

    @Basic
    @javax.persistence.Column(name = "standard", nullable = true)
    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    private Integer sequence;

    @Basic
    @javax.persistence.Column(name = "sequence", nullable = true)
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    private Integer visible;

    @Basic
    @javax.persistence.Column(name = "visible", nullable = true)
    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DicGender dicGender = (DicGender) o;
        return genderId == dicGender.genderId &&
                Objects.equals(genderName, dicGender.genderName) &&
                Objects.equals(standard, dicGender.standard) &&
                Objects.equals(sequence, dicGender.sequence) &&
                Objects.equals(visible, dicGender.visible);
    }

    @Override
    public int hashCode() {

        return Objects.hash(genderId, genderName, standard, sequence, visible);
    }
}
