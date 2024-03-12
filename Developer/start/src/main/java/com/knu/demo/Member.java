package com.knu.demo;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Member {
    @NotBlank
    private final String name;
    @NotBlank
    private final String id;
    @NotBlank
    private final String department;
}
