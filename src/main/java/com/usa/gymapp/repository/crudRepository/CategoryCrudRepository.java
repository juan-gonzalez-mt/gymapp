package com.usa.gymapp.repository.crudRepository;

import com.usa.gymapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category,  Integer> {
}
