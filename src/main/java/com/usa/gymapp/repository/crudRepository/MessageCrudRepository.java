package com.usa.gymapp.repository.crudRepository;

import com.usa.gymapp.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
