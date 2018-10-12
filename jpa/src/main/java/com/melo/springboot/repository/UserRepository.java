package com.melo.springboot.repository;

import com.melo.springboot.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.GeneratedValue;

/**
 * User Repository 接口
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
