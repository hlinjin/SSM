package cn.edu.svtcc.dao;

import cn.edu.svtcc.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {


        public int addUser(User user);
        public int updateUser(User user);

        public int deleteUser(Long uid);

        public List<User> selectUserByName(String uname);
//        public List<User> selectUserByName(String name);
        public List<User> selectUserByAge(Long uage);

        public List<User> selectUsersByNameAndAge(@Param("uname") String uname,@Param("uage") Long uage);
        public List<User> selectUsers(User user);
        public int deleteUserByIds(Long[] userIds);

        public User selectUserById(Long uid);

}
