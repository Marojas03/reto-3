package com.ciclo3.reto3.repository.crud;

import com.ciclo3.reto3.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
}