package com.xcy.wedding.mapper;

import com.xcy.wedding.pojo.Wedding;

public interface WeddingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Wedding record);

    int insertSelective(Wedding record);

    Wedding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wedding record);

    int updateByPrimaryKey(Wedding record);
}