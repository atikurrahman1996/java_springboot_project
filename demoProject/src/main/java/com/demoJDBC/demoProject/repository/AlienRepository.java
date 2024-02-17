package com.demoJDBC.demoProject.repository;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demoJDBC.demoProject.model.Alien;


@Repository
public class AlienRepository {
	
	// jdbc template

	private JdbcTemplate jdbcTemplate;
	
	// setters & getters method
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	// save alien object // update used for > insert, update, delete, save data
	
	public void save(Alien alien) {
		
		String sql = "insert into alien(id, name, tech) values(?,?,?)";
		
		int rows = jdbcTemplate.update(sql, alien.getId(), alien.getName(), alien.getTech());                       
		
		System.out.println(rows+"row/s affected");
		
	}
	
	
	// create method to fetch the data from database
	

	public List<Alien> findAll() {
		
	    String sql = "select * from alien";
	    
	    // RowMapper is a functional Interface so we make it lambda expression with arrow sign to reduce code

	    RowMapper<Alien> mapper = (rs, row) -> {
	            Alien alien = new Alien();
	            
	            alien.setId(rs.getInt("id"));
	            alien.setName(rs.getString("name"));
	            alien.setTech(rs.getString("tech"));
	            
	            return alien;
	        
	    };
	    
	    List<Alien> aliens = jdbcTemplate.query(sql, mapper);

	    return aliens;
	}

}