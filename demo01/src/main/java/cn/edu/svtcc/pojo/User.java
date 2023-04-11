package cn.edu.svtcc.pojo;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
        //bigint-->Long
        //int-->Integer
        private Long uid;

    //archar-->String
        private String uname;

        private Long uage;
        private List<Order> orders;
        private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Long getUage() {
        return uage;
    }

    public void setUage(Long uage) {
        this.uage = uage;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                ", orders=" + orders +
                ", roles=" + roles +
                '}';
    }
}
