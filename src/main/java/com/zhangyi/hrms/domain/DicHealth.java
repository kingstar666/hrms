package com.zhangyi.hrms.domain;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "dic_health", schema = "hrms", catalog = "")
public class DicHealth {
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

    private Integer standard;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "standard", nullable = true)
    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
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
        DicHealth dicHealth = (DicHealth) o;
        return id == dicHealth.id &&
                Objects.equals(itemName, dicHealth.itemName) &&
                Objects.equals(standard, dicHealth.standard) &&
                Objects.equals(superId, dicHealth.superId) &&
                Objects.equals(sequence, dicHealth.sequence) &&
                Objects.equals(visible, dicHealth.visible);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, itemName, standard, superId, sequence, visible);
    }
}
