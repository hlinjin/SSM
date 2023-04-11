package cn.edu.svtcc.dao;

import cn.edu.svtcc.pojo.Teacher;

import java.util.List;

public interface TeacherDao {
    Teacher selectById(Long teacherId);

    List<Teacher> selectAll();
}
