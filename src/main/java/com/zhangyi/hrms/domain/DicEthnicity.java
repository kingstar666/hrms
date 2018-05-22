package com.zhangyi.hrms.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "dic_ethnicity", schema = "hrms", catalog = "")
public class DicEthnicity {
    private int id;

    @Id
    @javax.persistence.Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String itemName;

    @Basic
    @javax.persistence.Column(name = "item_name", nullable = true, length = 15)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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
        DicEthnicity that = (DicEthnicity) o;
        return id == that.id &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(char2Code, that.char2Code) &&
                Objects.equals(standard, that.standard) &&
                Objects.equals(sequence, that.sequence) &&
                Objects.equals(visible, that.visible);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, itemName, char2Code, standard, sequence, visible);
    }
}
