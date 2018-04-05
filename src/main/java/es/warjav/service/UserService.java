package es.warjav.service;

import java.util.List;
import java.util.Optional;

import es.warjav.model.User;

public interface UserService {
	/**
	 * Almacena un usuario
	 * @param user
	 * @return el ususario almacenado
	 */
	User save(User user);
	
	/**
	 * Devuelve una lista de usuarios
	 * @return lista de usuarios
	 */
	List<User> findAll();
	
	/**
	 * Elimina un usuario con el id recibido
	 * @param id identificador del usuario
	 */
	void deleteUser(Long id);

	Optional<User> getUser(Long id);

}
