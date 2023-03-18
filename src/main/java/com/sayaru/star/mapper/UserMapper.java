package com.sayaru.star.mapper;

import com.sayaru.star.vo.DAttUserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<DAttUserVO> selectUserInfo();
}
