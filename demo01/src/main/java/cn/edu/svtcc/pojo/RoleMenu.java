package cn.edu.svtcc.pojo;

public class RoleMenu {
    private Long roleMenuId;
    private Long roleId;
    private Long menuId;

    public Long getRoleMenuId() {
        return roleMenuId;
    }

    public void setRoleMenuId(Long roleMenuId) {
        this.roleMenuId = roleMenuId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "RoleMenu{" +
                "roleMenuId=" + roleMenuId +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                '}';
    }
}
