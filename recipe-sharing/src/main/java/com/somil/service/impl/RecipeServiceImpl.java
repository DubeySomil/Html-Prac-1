package com.somil.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.somil.models.Recipe;
import com.somil.models.User;
import com.somil.repository.RecipeRepo;
import com.somil.service.RecipeService;

public class RecipeServiceImpl implements RecipeService{
    
    @Autowired
    RecipeRepo recipeRepo;

    @Override
    public Recipe createRecipe(Recipe recipe, User user) {
        
        return null;
    }

    @Override
    public Recipe findRecipeById(Long id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Recipe deleteRecipe(Long id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Recipe updateRecipe(Recipe recipe, Long id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Recipe> getAllRecipe() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Recipe likeRecipe(Long recipeId, Long userId) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
