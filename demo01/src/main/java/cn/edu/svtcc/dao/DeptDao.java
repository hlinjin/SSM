package cn.edu.svtcc.dao;

import cn.edu.svtcc.pojo.Dept;

public interface DeptDao {
    Dept selectById(Long deptId);
}
