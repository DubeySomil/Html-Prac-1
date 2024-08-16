package com.somil.controller;

import com.somil.models.Recipe;
import com.somil.models.User;
import com.somil.service.RecipeService;
import com.somil.service.UserService;
import com.somil.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @Autowired
    UserService userService;

    @PostMapping("api/recipe/user/{userId}")
    public Recipe createRecipe(@RequestBody Recipe recipe, @PathVariable Long userId) throws Exception {
        User user = userService.findUserById(userId);
        Recipe creatredRecipe = recipeService.createRecipe(recipe,user);
        return  creatredRecipe;
    }

    @PostMapping("api/recipe")
    public List<Recipe> getAllRecipe() throws Exception {
        List<Recipe> createdRecipe = recipeService.getAllRecipe();
        if(createdRecipe.isEmpty()){
            throw new Exception("No recipe found");
        }else{
            return  createdRecipe;
        }
    }
}
