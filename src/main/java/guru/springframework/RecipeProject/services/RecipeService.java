package guru.springframework.RecipeProject.services;

import guru.springframework.RecipeProject.domain.Recipe;

import java.util.Set;

public interface RecipeService
{
    Set<Recipe> getRecipes();
}
