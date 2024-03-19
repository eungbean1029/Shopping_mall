package com.project.shoppingMall.Category.Controller;

import com.project.shoppingMall.Category.dto.CategoryDto;
import com.project.shoppingMall.Category.dto.CategoryListDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping
    public CategoryListDto list() {
        List<CategoryDto> categories = null;
        return new CategoryListDto(categories);
    }
} 

