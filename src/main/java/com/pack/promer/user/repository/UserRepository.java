package com.pack.promer.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pack.promer.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

	@Query(value="select u from UserEntity u where u.emailId = ?1")
	public UserEntity findUserByEmailId(String emailId);
}
