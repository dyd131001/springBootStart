package com.knu.demo;

import java.util.HashMap;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class APIController
{
    @PostMapping("/api")
    @ResponseBody
    public Member APIHello(@RequestBody HashMap<String, Object> map){
        Member member = Member.builder()
                .id(map.get("id").toString())
                .name(map.get("name").toString())
                .department(map.get("department").toString())
                .build();
        return member;
    }

    @PostMapping("/api/2")
    @ResponseBody
    public PostForm APIHello2(PostForm postForm){
        return postForm;
    }
}
