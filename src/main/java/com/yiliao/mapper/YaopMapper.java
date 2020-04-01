package com.yiliao.mapper;

import com.yiliao.entity.TEmp;
import com.yiliao.entity.TMedcenter;
import com.yiliao.entity.TMedicine;

import java.util.List;

public interface YaopMapper {

    //查找所有药品
    List<TMedicine> queryAllYaop();
    //查找所有医疗中心
    List<TMedcenter> queryAllMedcenter();
    //查询所有员工
    List<TEmp> queryAllEmp();
}
