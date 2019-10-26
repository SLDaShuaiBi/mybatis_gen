package com.xcy.wedding.mapper;

import com.xcy.wedding.pojo.Packages;

public interface PackagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Packages record);

    int insertSelective(Packages record);

    Packages selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Packages record);

    int updateByPrimaryKey(Packages record);
}