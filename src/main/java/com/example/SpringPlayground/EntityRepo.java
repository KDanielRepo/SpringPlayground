package com.example.SpringPlayground;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EntityRepo extends CrudRepository<Autokary,Integer> {
    Autokary findById(int id);
}
