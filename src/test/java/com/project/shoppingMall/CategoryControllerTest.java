package com.project.shoppingMall;

import com.project.shoppingMall.Category.Controller.CategoryController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CategoryController.class)
public class CategoryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("GET /categories - Test")
    void list() throws Exception {
        mockMvc.perform(get("/categories"))
                .andExpect(status().isOk());
    }

}
