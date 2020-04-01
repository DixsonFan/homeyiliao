package com.yiliao.controller;


import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yiliao.entity.TEmp;
import com.yiliao.entity.TMedcenter;
import com.yiliao.entity.TMedicine;
import com.yiliao.service.YaopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/yaop")
public class YaopController {

   @Autowired
    private YaopService yaopService;


    // TODO: 2020/2/19 跳转
    @RequestMapping("/yaopMain")
    public String yaopMain(Model model){
        List<TMedicine> allYaopList = yaopService.queryAllYaop();
        model.addAttribute("allYaopList",allYaopList);
        return "yaop/yaopMain";
    }

    @RequestMapping("/medcenterMain")
    public String medcenterMain(Model model){
        List<TMedcenter> allMedcenterList = yaopService.queryAllMedcenter();
        model.addAttribute("allMedcenterList",allMedcenterList);
        return "yaop/medcenterMain";
    }

    @RequestMapping("/empmain")
    public String empmain(Model model){
        List<TEmp> allEmpList = yaopService.queryAllEmp();

        for (TEmp e:allEmpList) {
            System.out.println("Emp"+e.toString());
        }

        model.addAttribute("allEmpList",allEmpList);
        return "/yaop/empmain";
    }




   @RequestMapping("/queryAllYaop")
    public String queryAllYaop(Model model){
       List<TMedicine> allYaopList = yaopService.queryAllYaop();
       model.addAttribute("allYaopList",allYaopList);
       return "yaop/yaopMain";
   }

   @RequestMapping("/queryAllMedcenter")
    public String queryAllMedcenter(Model model ){
       List<TMedcenter> allMedcenterList = yaopService.queryAllMedcenter();
       model.addAttribute("allMedcenterList",allMedcenterList);
       return "yaop/medcenterMain";
   }

    @RequestMapping("/queryAllEmp")
    public String queryAllEmp(Model model){
        List<TEmp> allEmpList = yaopService.queryAllEmp();

        for (TEmp e:allEmpList) {
            System.out.println("zhandianEmp"+ e.toString());
        }

        model.addAttribute("allEmpList",allEmpList);
        return "/yaop/empmain";
    }

}
