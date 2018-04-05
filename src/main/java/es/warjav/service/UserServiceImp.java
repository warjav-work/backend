package es.warjav.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.warjav.dao.UserRepository;
import es.warjav.model.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
		
		return this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		
		return this.userRepository.findAll();
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public Optional<User> getUser(Long id) {
		
		return userRepository.findById(id);
	}

}
