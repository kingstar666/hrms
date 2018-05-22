package com.zhangyi.hrms.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "dic_nation", schema = "hrms", catalog = "")
public class DicNation {
    private int id;

    @Id
    @javax.persistence.Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String shortnameCn;

    @Basic
    @javax.persistence.Column(name = "shortname_cn", nullable = true, length = 255)
    public String getShortnameCn() {
        return shortnameCn;
    }

    public void setShortnameCn(String shortnameCn) {
        this.shortnameCn = shortnameCn;
    }

    private String shortnameEn;

    @Basic
    @javax.persistence.Column(name = "shortname_en", nullable = true, length = 255)
    public String getShortnameEn() {
        return shortnameEn;
    }

    public void setShortnameEn(String shortnameEn) {
        this.shortnameEn = shortnameEn;
    }

    private String char2Code;

    @Basic
    @javax.persistence.Column(name = "char_2_code", nullable = true, length = 2)
    public String getChar2Code() {
        return char2Code;
    }

    public void setChar2Code(String char2Code) {
        this.char2Code = char2Code;
    }

    private String char3Code;

    @Basic
    @javax.persistence.Column(name = "char_3_code", nullable = true, length = 3)
    public String getChar3Code() {
        return char3Code;
    }

    public void setChar3Code(String char3Code) {
        this.char3Code = char3Code;
    }

    private String numberCode;

    @Basic
    @javax.persistence.Column(name = "number_code", nullable = true, length = 3)
    public String getNumberCode() {
        return numberCode;
    }

    public void setNumberCode(String numberCode) {
        this.numberCode = numberCode;
    }

    private String fullnameCn;

    @Basic
    @javax.persistence.Column(name = "fullname_cn", nullable = true, length = 255)
    public String getFullnameCn() {
        return fullnameCn;
    }

    public void setFullnameCn(String fullnameCn) {
        this.fullnameCn = fullnameCn;
    }

    private String fullnameEn;

    @Basic
    @javax.persistence.Column(name = "fullname_en", nullable = true, length = 255)
    public String getFullnameEn() {
        return fullnameEn;
    }

    public void setFullnameEn(String fullnameEn) {
        this.fullnameEn = fullnameEn;
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

    private Integer sequence;

    @Basic
    @javax.persistence.Column(name = "sequence", nullable = true)
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DicNation dicNation = (DicNation) o;
        return id == dicNation.id &&
                Objects.equals(shortnameCn, dicNation.shortnameCn) &&
                Objects.equals(shortnameEn, dicNation.shortnameEn) &&
                Objects.equals(char2Code, dicNation.char2Code) &&
                Objects.equals(char3Code, dicNation.char3Code) &&
                Objects.equals(numberCode, dicNation.numberCode) &&
                Objects.equals(fullnameCn, dicNation.fullnameCn) &&
                Objects.equals(fullnameEn, dicNation.fullnameEn) &&
                Objects.equals(visible, dicNation.visible) &&
                Objects.equals(sequence, dicNation.sequence) &&
                Objects.equals(standard, dicNation.standard);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shortnameCn, shortnameEn, char2Code, char3Code, numberCode, fullnameCn, fullnameEn, visible, sequence, standard);
    }
}
