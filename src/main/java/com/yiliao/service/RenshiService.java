package com.yiliao.service;

import com.yiliao.entity.TDepart;
import com.yiliao.entity.TEmp;
import com.yiliao.entity.TStation;

import java.util.List;
public interface RenshiService {
    //查询所有科室
    List<TDepart> queryAllDepart();

    //查询所有岗位
    List<TStation> queryAllStation();

    //查询所有员工
    List<TEmp> queryAllEmp();


}
