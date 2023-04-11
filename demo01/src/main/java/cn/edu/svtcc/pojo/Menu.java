package cn.edu.svtcc.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * 菜单实体类
 * 作者哈林金
 *时间：2023-3-17
 */
public class Menu {
    @TableId(value = "menu_id",type = IdType.AUTO)
    private Long menuId;
    private String menuName;
    private String menuUrl;
    private Long menuSort;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Long getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Long menuSort) {
        this.menuSort = menuSort;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuName=" + menuName +
                ", menuUrl='" + menuUrl + '\'' +
                ", menuSort=" + menuSort +
                '}';
    }
}
