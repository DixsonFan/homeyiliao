package com.yiliao.service.impl;

import com.yiliao.entity.TDepart;
import com.yiliao.entity.TEmp;
import com.yiliao.entity.TStation;
import com.yiliao.mapper.RenshiMapper;
import com.yiliao.service.RenshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RenshiServiceImpl implements RenshiService {

    @Autowired
    RenshiMapper renshiMapper;

    @Override
    public List<TDepart> queryAllDepart() {
        return renshiMapper.queryAllDepart();
    }

    @Override
    public List<TStation> queryAllStation() { return renshiMapper.queryAllStation(); }

    @Override
    public List<TEmp> queryAllEmp() { return renshiMapper.queryAllEmp();}
}
