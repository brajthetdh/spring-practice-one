package practice.repository;

import java.util.List;

import practice.model.User;

public interface UserRepository {

	List<User> findAll();

}