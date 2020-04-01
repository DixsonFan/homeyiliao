package com.yiliao.mapper;

import com.yiliao.entity.TDepart;
import com.yiliao.entity.TEmp;
import com.yiliao.entity.TStation;

import java.util.List;

public interface RenshiMapper {

    //查询所有部门
    public List<TDepart> queryAllDepart();

    //查询所有岗位
    public List<TStation> queryAllStation();

    //查询所有员工
    List<TEmp> queryAllEmp();

}
