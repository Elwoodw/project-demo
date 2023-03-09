package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * Demo 用于参考
* @author 18212
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-03-08 16:15:09
* @Entity com.example.demo.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




