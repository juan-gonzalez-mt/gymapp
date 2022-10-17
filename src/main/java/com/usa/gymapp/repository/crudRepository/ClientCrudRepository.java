package com.usa.gymapp.repository.crudRepository;

import com.usa.gymapp.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
}
