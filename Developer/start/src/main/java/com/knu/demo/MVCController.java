package com.knu.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MVCController {

    @GetMapping("/")
    public String hello(){
        return "home";
    }
    @GetMapping("/get")
    public String getStart(){
        return "getInput";
    }

    @GetMapping("/post")
    public String postStart(){
        return "postInput";
    }
    @GetMapping("/post2")
    public String APIpostStart(){
        return "APIPostInput";
    }

    @GetMapping("/info")
    public String getResult(
            @RequestParam("name") String name,
            @RequestParam("id") String id,
            @RequestParam("department") String department,
            Model model){

        model.addAttribute("name",name);
        model.addAttribute("id",id);
        model.addAttribute("department",department);

        return "getResult";
    }
    @PostMapping("/info")
    public String postResult(
            PostForm postForm,
            Model model){
        model.addAttribute("name",postForm.getName());
        model.addAttribute("id",postForm.getId());
        model.addAttribute("department",postForm.getDepartment());
        return "postResult";
    }


}
