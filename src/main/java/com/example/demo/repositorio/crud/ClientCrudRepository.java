package com.example.demo.repositorio.crud;

import com.example.demo.modelo.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository <Client, Integer> {
}
