package com.somil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.somil.models.Recipe;

public interface RecipeRepo extends JpaRepository<Recipe, Long>{

}
