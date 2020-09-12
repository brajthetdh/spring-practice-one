package practice.service;

import java.util.List;

import practice.model.User;
import practice.repository.UserRepository;
import practice.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository = new UserRepositoryImpl();
	
	@Override
	public List<User> findAll(){
		return userRepository.findAll();
	}

}
