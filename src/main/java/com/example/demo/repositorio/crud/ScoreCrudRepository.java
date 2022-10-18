package com.example.demo.repositorio.crud;


import com.example.demo.modelo.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreCrudRepository extends CrudRepository <Score, Integer> {
}
