package com.knu.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.PropertyAccessor;

@Getter
@Setter

public class PostForm {
    private String name;
    private String id;
    private String department;
}
