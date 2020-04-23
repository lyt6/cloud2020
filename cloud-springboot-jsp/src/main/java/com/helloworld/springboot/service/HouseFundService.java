package com.helloworld.springboot.service;

import com.helloworld.springboot.model.HouseFund;

import java.util.List;

public interface HouseFundService{

    int deleteByPrimaryKey(Long id);

    int insert(HouseFund record);

    int insertSelective(HouseFund record);

    HouseFund selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HouseFund record);

    int updateByPrimaryKey(HouseFund record);

    List<HouseFund> getAllHouseFundList();

}
