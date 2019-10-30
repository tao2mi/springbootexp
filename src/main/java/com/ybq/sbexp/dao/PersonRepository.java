package com.ybq.sbexp.dao;

import com.ybq.sbexp.entiry.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
