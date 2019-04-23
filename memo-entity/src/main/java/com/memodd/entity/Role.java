package com.memodd.entity;

import java.util.Date;

public class Role {
    private Integer roleId;
    private String roleName;
    private String description;
    private Boolean active;
    private Date updateDate;
    private Integer updateBy;

    public Role() {
    }


    public Integer getRoleId() {
        return this.roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public String getDescription() {
        return this.description;
    }

    public Boolean getActive() {
        return this.active;
    }

    public Date getUpdateDate() {
        return this.updateDate;
    }

    public Integer getUpdateBy() {
        return this.updateBy;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Role)) return false;
        final Role other = (Role) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$roleId = this.roleId;
        final Object other$roleId = other.roleId;
        if (this$roleId == null ? other$roleId != null : !this$roleId.equals(other$roleId)) return false;
        final Object this$roleName = this.roleName;
        final Object other$roleName = other.roleName;
        if (this$roleName == null ? other$roleName != null : !this$roleName.equals(other$roleName)) return false;
        final Object this$description = this.description;
        final Object other$description = other.description;
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$active = this.active;
        final Object other$active = other.active;
        if (this$active == null ? other$active != null : !this$active.equals(other$active)) return false;
        final Object this$updateDate = this.updateDate;
        final Object other$updateDate = other.updateDate;
        if (this$updateDate == null ? other$updateDate != null : !this$updateDate.equals(other$updateDate))
            return false;
        final Object this$updateBy = this.updateBy;
        final Object other$updateBy = other.updateBy;
        if (this$updateBy == null ? other$updateBy != null : !this$updateBy.equals(other$updateBy)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Role;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $roleId = this.roleId;
        result = result * PRIME + ($roleId == null ? 43 : $roleId.hashCode());
        final Object $roleName = this.roleName;
        result = result * PRIME + ($roleName == null ? 43 : $roleName.hashCode());
        final Object $description = this.description;
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $active = this.active;
        result = result * PRIME + ($active == null ? 43 : $active.hashCode());
        final Object $updateDate = this.updateDate;
        result = result * PRIME + ($updateDate == null ? 43 : $updateDate.hashCode());
        final Object $updateBy = this.updateBy;
        result = result * PRIME + ($updateBy == null ? 43 : $updateBy.hashCode());
        return result;
    }

    public String toString() {
        return "Role(roleId=" + this.roleId + ", roleName=" + this.roleName + ", description=" + this.description + ", active=" + this.active + ", updateDate=" + this.updateDate + ", updateBy=" + this.updateBy + ")";
    }
}
