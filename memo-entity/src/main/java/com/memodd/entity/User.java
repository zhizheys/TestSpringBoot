package com.memodd.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer userId;
    private String userName;
    private Date birthday;
    private String account;
    private String password;
    private String salt;
    private Integer updateBy;
    private Date updateDate;

    public User() {
    }


    public Integer getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public String getAccount() {
        return this.account;
    }

    public String getPassword() {
        return this.password;
    }

    public String getSalt() {
        return this.salt;
    }

    public Integer getUpdateBy() {
        return this.updateBy;
    }

    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.userId;
        final Object other$userId = other.userId;
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$userName = this.userName;
        final Object other$userName = other.userName;
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) return false;
        final Object this$birthday = this.birthday;
        final Object other$birthday = other.birthday;
        if (this$birthday == null ? other$birthday != null : !this$birthday.equals(other$birthday)) return false;
        final Object this$account = this.account;
        final Object other$account = other.account;
        if (this$account == null ? other$account != null : !this$account.equals(other$account)) return false;
        final Object this$password = this.password;
        final Object other$password = other.password;
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        final Object this$salt = this.salt;
        final Object other$salt = other.salt;
        if (this$salt == null ? other$salt != null : !this$salt.equals(other$salt)) return false;
        final Object this$updateBy = this.updateBy;
        final Object other$updateBy = other.updateBy;
        if (this$updateBy == null ? other$updateBy != null : !this$updateBy.equals(other$updateBy)) return false;
        final Object this$updateDate = this.updateDate;
        final Object other$updateDate = other.updateDate;
        if (this$updateDate == null ? other$updateDate != null : !this$updateDate.equals(other$updateDate))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.userId;
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $userName = this.userName;
        result = result * PRIME + ($userName == null ? 43 : $userName.hashCode());
        final Object $birthday = this.birthday;
        result = result * PRIME + ($birthday == null ? 43 : $birthday.hashCode());
        final Object $account = this.account;
        result = result * PRIME + ($account == null ? 43 : $account.hashCode());
        final Object $password = this.password;
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final Object $salt = this.salt;
        result = result * PRIME + ($salt == null ? 43 : $salt.hashCode());
        final Object $updateBy = this.updateBy;
        result = result * PRIME + ($updateBy == null ? 43 : $updateBy.hashCode());
        final Object $updateDate = this.updateDate;
        result = result * PRIME + ($updateDate == null ? 43 : $updateDate.hashCode());
        return result;
    }

    public String toString() {
        return "User(userId=" + this.userId + ", userName=" + this.userName + ", birthday=" + this.birthday + ", account=" + this.account + ", password=" + this.password + ", salt=" + this.salt + ", updateBy=" + this.updateBy + ", updateDate=" + this.updateDate + ")";
    }
}
