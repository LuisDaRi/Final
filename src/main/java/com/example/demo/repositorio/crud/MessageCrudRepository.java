package com.example.demo.repositorio.crud;

import com.example.demo.modelo.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
