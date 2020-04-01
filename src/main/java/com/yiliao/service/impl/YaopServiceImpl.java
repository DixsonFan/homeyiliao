package com.yiliao.service.impl;

import com.yiliao.entity.TEmp;
import com.yiliao.entity.TMedcenter;
import com.yiliao.entity.TMedicine;
import com.yiliao.mapper.YaopMapper;
import com.yiliao.service.YaopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YaopServiceImpl implements YaopService {

    @Autowired
    YaopMapper yaopMapper;



    @Override
    public List<TMedicine> queryAllYaop() {
        return yaopMapper.queryAllYaop();
    }

    @Override
    public List<TMedcenter> queryAllMedcenter() {
        return yaopMapper.queryAllMedcenter();
    }

    @Override
    public List<TEmp> queryAllEmp() { return yaopMapper.queryAllEmp(); }
}
