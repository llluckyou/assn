package com.assn.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/4/6.
 */
@Entity
@Table(name = "assn_category", schema = "assn", catalog = "")
public class AssnCategoryEntity {
    private String categoryId;
    private String categoryName;
    private int categoryParentId;
    private String categoryParentName;

    @Id
    @Column(name = "category_id", nullable = false, length = 20)
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "category_name", nullable = false, length = 12)
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "category_parent_id", nullable = false)
    public int getCategoryParentId() {
        return categoryParentId;
    }

    public void setCategoryParentId(int categoryParentId) {
        this.categoryParentId = categoryParentId;
    }

    @Basic
    @Column(name = "category_parent_name", nullable = false, length = 12)
    public String getCategoryParentName() {
        return categoryParentName;
    }

    public void setCategoryParentName(String categoryParentName) {
        this.categoryParentName = categoryParentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssnCategoryEntity that = (AssnCategoryEntity) o;

        if (categoryParentId != that.categoryParentId) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (categoryParentName != null ? !categoryParentName.equals(that.categoryParentName) : that.categoryParentName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId != null ? categoryId.hashCode() : 0;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + categoryParentId;
        result = 31 * result + (categoryParentName != null ? categoryParentName.hashCode() : 0);
        return result;
    }
}
