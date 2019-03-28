package com.example.spring.windmill.controller;

import com.example.spring.windmill.mapper.PersonMapper;
import com.example.spring.windmill.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: windmill
 * @Description:
 * @Date: 2019/3/21 17:37
 */
@Controller
public class PersonController {
    @Autowired
    private PersonMapper personMapper;
    @RequestMapping("/listInfo")
    public String listStudent(Model model) {
        List<Person> students = personMapper.findAll();
        model.addAttribute("students", students);
        return "list";
    }
}
