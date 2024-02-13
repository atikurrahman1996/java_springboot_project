package com.example.demo4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo4.model.Programmer;

@Repository
public interface ProgrammerRepo extends JpaRepository<Programmer, Integer> {
	

}


//JpaRepository comes with two parameters > define class > which class we are going to use> exp: Programmer class
//primary key data type exp: int