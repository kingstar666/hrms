package com.zhangyi.hrms.domain;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "dic_marriage", schema = "hrms", catalog = "")
public class DicMarriage {
    private int id;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String itemName;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "item_name", nullable = true, length = 100)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private Integer standardId;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "standard_id", nullable = true)
    public Integer getStandardId() {
        return standardId;
    }

    public void setStandardId(Integer standardId) {
        this.standardId = standardId;
    }

    private Integer superId;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "super_id", nullable = true)
    public Integer getSuperId() {
        return superId;
    }

    public void setSuperId(Integer superId) {
        this.superId = superId;
    }

    private Integer sequence;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "sequence", nullable = true)
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    private Integer visible;

    @javax.persistence.Basic
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
        DicMarriage that = (DicMarriage) o;
        return id == that.id &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(standardId, that.standardId) &&
                Objects.equals(superId, that.superId) &&
                Objects.equals(sequence, that.sequence) &&
                Objects.equals(visible, that.visible);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, itemName, standardId, superId, sequence, visible);
    }
}
