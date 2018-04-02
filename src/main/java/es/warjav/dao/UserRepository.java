package es.warjav.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.warjav.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
