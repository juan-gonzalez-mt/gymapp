package com.usa.gymapp.repository.crudRepository;

import com.usa.gymapp.model.Machine;
import org.springframework.data.repository.CrudRepository;

public interface MachineCrudRepository extends CrudRepository<Machine, Integer> {
}
