package com.geeker.love.dao;

import com.geeker.love.pojo.Topic;
import com.geeker.love.pojo.post;
import com.geeker.love.pojo.support;
import com.geeker.love.pojo.topic_post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ArticleMapper {
    List<post> getPostByClass(@Param("pc_id") Integer pc_id);
    List<post> getPostByUser(@Param("uid") Integer uid);
    List<post> getAllPostByUser(@Param("uid") Integer uid);
    post getPostById(@Param("pid") Integer pid);
    List<support> getSupportById(@Param("uid") Integer uid);
    int DingCai(@Param("uid") Integer uid,
                    @Param("pid") Integer pid,
                    @Param("type") Integer type);
    support getSupport(@Param("uid")Integer uid,
                       @Param("pid") Integer pid);
    int updateSupport(@Param("uid") Integer uid,
                      @Param("pid") Integer pid,
                      @Param("type") Integer type);

    List<Map<String, Object>> getPostByClassMulti(Integer pc_id);

    List<Map> getCommentsByPostId(Integer post_id);
    int addPost(@Param("post") post post);
    int selectByCreateTime(@Param("time") Long time);
    int addTP(@Param("tp") topic_post tp);
}
