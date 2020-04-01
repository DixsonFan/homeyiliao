package com.yiliao.controller;


import com.yiliao.entity.TDepart;
import com.yiliao.entity.TEmp;
import com.yiliao.entity.TStation;
import com.yiliao.service.RenshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/renshi")
public class RenshiController {

//创建服务层对象
    @Autowired
    private RenshiService renshiService;


    //TODO 》》》》》》》》》》》》》》》跳转主页
    @RequestMapping("/renshimain")
    public String renshimain(Model model){
        List<TDepart> allDepartList = renshiService.queryAllDepart();

        String test = null;
        for (TDepart t:allDepartList) {
            System.out.println("firstdepart"+t.toString());
            test = t.getIdAdmin()+t.getNameAdmin();
        }

        model.addAttribute("allDepartList",allDepartList);
        System.out.println(">>>>>>>>>>>>");
        model.addAttribute("babala",test);
        return "/renshi/renshimain";
    }

    @RequestMapping("/empmain")
    public String empmain(Model model){
        List<TEmp> allEmpList = renshiService.queryAllEmp();

        for (TEmp e:allEmpList) {
            System.out.println("Emp"+e.toString());
        }

        model.addAttribute("allEmpList",allEmpList);
        return "/renshi/empmain";
    }




    //TODO  >>>>>>>>>>>>>>>>>>>>>>>>>>>>部门


    @RequestMapping("/queryAllDepart")
    public String queryAllDepart(Model model){
        List<TDepart> allDepartList = renshiService.queryAllDepart();
        for (TDepart t:allDepartList) {
            System.out.println("seconddepart"+t.toString());
        }

        model.addAttribute("allDepartList",allDepartList);
        return "/renshi/renshimain";
    }



    //TODO  >>>>>>>>>>>>>>>>>>>>>>>>>>>>岗位

    @RequestMapping("/queryAllStation")
    public String queryAllStation(Model model){
        List<TStation> allStationList = renshiService.queryAllStation();

        for (TStation s:allStationList) {
            System.out.println("Station"+s.toString());
        }
        model.addAttribute("allStationList",allStationList);
        return "/renshi/stationmain";
    }


    //TODO  >>>>>>>>>>>>>>>>>>>>>>>>>>>>员工
    @RequestMapping("/queryAllEmp")
    public String queryAllEmp(Model model){
        List<TEmp> allEmpList = renshiService.queryAllEmp();

        for (TEmp e:allEmpList) {
            System.out.println("Emp"+ e.toString());
        }

        model.addAttribute("allEmpList",allEmpList);
        return "/renshi/empmain";
    }

}
