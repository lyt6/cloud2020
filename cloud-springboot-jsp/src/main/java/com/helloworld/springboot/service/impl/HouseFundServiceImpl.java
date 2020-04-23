package com.helloworld.springboot.service.impl;

import com.helloworld.springboot.mapper.HouseFundMapper;
import com.helloworld.springboot.model.HouseFund;
import com.helloworld.springboot.service.HouseFundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseFundServiceImpl implements HouseFundService{

    @Autowired
    private HouseFundMapper houseFundMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return houseFundMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HouseFund record) {
        return houseFundMapper.insert(record);
    }

    @Override
    public int insertSelective(HouseFund record) {
        return houseFundMapper.insertSelective(record);
    }

    @Override
    public HouseFund selectByPrimaryKey(Long id) {
        return houseFundMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HouseFund record) {
        return houseFundMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HouseFund record) {
        return houseFundMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<HouseFund> getAllHouseFundList() {
        return houseFundMapper.getAllHouseFundList();
    }

}
