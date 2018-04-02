package es.warjav.service;

import java.util.List;

import es.warjav.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

}
