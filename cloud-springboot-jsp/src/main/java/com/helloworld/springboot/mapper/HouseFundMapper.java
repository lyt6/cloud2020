package com.helloworld.springboot.mapper;

import com.helloworld.springboot.model.HouseFund;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HouseFundMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HouseFund record);

    int insertSelective(HouseFund record);

    HouseFund selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HouseFund record);

    int updateByPrimaryKey(HouseFund record);

    List<HouseFund> getAllHouseFundList();

}