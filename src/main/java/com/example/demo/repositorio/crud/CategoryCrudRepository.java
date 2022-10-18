package com.example.demo.repositorio.crud;


import com.example.demo.modelo.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
}
