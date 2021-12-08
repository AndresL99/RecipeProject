package guru.springframework.RecipeProject.repositories;

import guru.springframework.RecipeProject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long>
{

}
