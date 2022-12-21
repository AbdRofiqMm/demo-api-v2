package com.domain.demoapiv2.dto;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class CategoryData {

    @NotEmpty(message = "Name is required")
    private String name;

}
