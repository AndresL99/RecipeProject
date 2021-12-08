package guru.springframework.RecipeProject.repositories;

import guru.springframework.RecipeProject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long>
{

}
