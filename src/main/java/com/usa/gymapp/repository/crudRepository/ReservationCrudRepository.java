package com.usa.gymapp.repository.crudRepository;

import com.usa.gymapp.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository   <Reservation, Integer> {
}
