
package com.example.security.repository;

import com.example.security.User.User;
import org.hibernate.query.criteria.JpaRoot;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer>{

}
