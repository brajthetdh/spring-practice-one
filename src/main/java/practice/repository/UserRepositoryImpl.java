package practice.repository;

import java.util.ArrayList;
import java.util.List;

import practice.model.User;

public class UserRepositoryImpl implements UserRepository {

	@Override
	public List<User> findAll(){
		List<User> users = new ArrayList<>();
		
		User user =  new User();
		user.setFirstName("Ramesh");
		user.setLastName("mehta");
		
		users.add(user);
		
		return users;
		
	}
}
