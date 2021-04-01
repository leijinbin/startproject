package com.example.reviewcrud.controller;

import com.example.reviewcrud.dao.DeptDao;
import com.example.reviewcrud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/dept")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
public class DeptController {
    @Autowired
    private DeptDao deptDao;

    @GetMapping("/getAllDept")
    @ResponseBody
    public List<Dept> getAllDept(){
        System.out.println("获取全部部门信息+++++++++++++++++++++++++");
        return deptDao.getAllDept();
    }

    @PostMapping("/createDept")
    public void createDept(@RequestBody Dept dept){
        System.out.println(dept);
        deptDao.createDept(dept);
    }

    @PutMapping("/updateDept")
    public void updataDept(Dept dept){
        deptDao.upDept(dept);
    }

    @PostMapping("/deleteDept")
    public void deleteDept(@RequestParam Integer id){
        System.out.println("删除部门-------------------------");
        deptDao.delDept(id);
    }
}
