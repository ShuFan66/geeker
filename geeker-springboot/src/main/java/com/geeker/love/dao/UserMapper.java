package com.geeker.love.dao;


import com.geeker.love.pojo.User;
import com.geeker.love.pojo.UserInfo;
import com.geeker.love.pojo.blacklist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User queryUserByPhone(String phone);
    Integer insertUserByPhone(@Param("phone") String phone,@Param("create_time") Long create_time);
    User queryUserByUserId(Integer id);
    int updateUserInfo(@Param("uInfo") UserInfo uInfo,@Param("uid") Integer uid);
    int updatePassword(@Param("newPw") String newPw,@Param("uid") Integer uid);
    blacklist getBlackListById(@Param("bid") Integer bid,@Param("uid") Integer uid);
    int insertBlackList(@Param("bid") Integer bid,@Param("uid") Integer uid);
    int deleteBlackList(@Param("bid") Integer bid,@Param("uid") Integer uid);
}
