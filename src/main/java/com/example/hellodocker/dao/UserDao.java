package com.example.hellodocker.dao;

import com.example.hellodocker.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chencheng
 * @since 2022-04-20
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
