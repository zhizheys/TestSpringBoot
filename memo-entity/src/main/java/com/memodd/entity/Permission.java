package com.memodd.entity;

import java.util.Date;

public class Permission {
    private Integer permissionId;
    private String applicationName;
    private String moduleName;
    private String permissionName;
    private String description;
    private String url;
    private Boolean needPermission;
    private Date updateDate;
    private Integer updateBy;

    public Permission() {
    }


    public Integer getPermissionId() {
        return this.permissionId;
    }

    public String getApplicationName() {
        return this.applicationName;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public String getPermissionName() {
        return this.permissionName;
    }

    public String getDescription() {
        return this.description;
    }

    public String getUrl() {
        return this.url;
    }

    public Boolean getNeedPermission() {
        return this.needPermission;
    }

    public Date getUpdateDate() {
        return this.updateDate;
    }

    public Integer getUpdateBy() {
        return this.updateBy;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNeedPermission(Boolean needPermission) {
        this.needPermission = needPermission;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Permission)) return false;
        final Permission other = (Permission) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$permissionId = this.permissionId;
        final Object other$permissionId = other.permissionId;
        if (this$permissionId == null ? other$permissionId != null : !this$permissionId.equals(other$permissionId))
            return false;
        final Object this$applicationName = this.applicationName;
        final Object other$applicationName = other.applicationName;
        if (this$applicationName == null ? other$applicationName != null : !this$applicationName.equals(other$applicationName))
            return false;
        final Object this$moduleName = this.moduleName;
        final Object other$moduleName = other.moduleName;
        if (this$moduleName == null ? other$moduleName != null : !this$moduleName.equals(other$moduleName))
            return false;
        final Object this$permissionName = this.permissionName;
        final Object other$permissionName = other.permissionName;
        if (this$permissionName == null ? other$permissionName != null : !this$permissionName.equals(other$permissionName))
            return false;
        final Object this$description = this.description;
        final Object other$description = other.description;
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$url = this.url;
        final Object other$url = other.url;
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$needPermission = this.needPermission;
        final Object other$needPermission = other.needPermission;
        if (this$needPermission == null ? other$needPermission != null : !this$needPermission.equals(other$needPermission))
            return false;
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
        return other instanceof Permission;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $permissionId = this.permissionId;
        result = result * PRIME + ($permissionId == null ? 43 : $permissionId.hashCode());
        final Object $applicationName = this.applicationName;
        result = result * PRIME + ($applicationName == null ? 43 : $applicationName.hashCode());
        final Object $moduleName = this.moduleName;
        result = result * PRIME + ($moduleName == null ? 43 : $moduleName.hashCode());
        final Object $permissionName = this.permissionName;
        result = result * PRIME + ($permissionName == null ? 43 : $permissionName.hashCode());
        final Object $description = this.description;
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $url = this.url;
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $needPermission = this.needPermission;
        result = result * PRIME + ($needPermission == null ? 43 : $needPermission.hashCode());
        final Object $updateDate = this.updateDate;
        result = result * PRIME + ($updateDate == null ? 43 : $updateDate.hashCode());
        final Object $updateBy = this.updateBy;
        result = result * PRIME + ($updateBy == null ? 43 : $updateBy.hashCode());
        return result;
    }

    public String toString() {
        return "Permission(permissionId=" + this.permissionId + ", applicationName=" + this.applicationName + ", moduleName=" + this.moduleName + ", permissionName=" + this.permissionName + ", description=" + this.description + ", url=" + this.url + ", needPermission=" + this.needPermission + ", updateDate=" + this.updateDate + ", updateBy=" + this.updateBy + ")";
    }
}
