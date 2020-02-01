package com.yoga.classservice.repository;

import com.yoga.classservice.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
