package cn.edu.svtcc.pojo;

/**
 * 用户角色关联类
 */

public class UserRole {
    private Long userRoleId;
    private Long uid;
    private Long roleId;

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userRoleId=" + userRoleId +
                ", uid=" + uid +
                ", RoleId=" + roleId +
                '}';
    }
}
