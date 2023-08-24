package com.mpjmario.teamspringbootcruddatajpadatarestwebmysql.repository;

import com.mpjmario.teamspringbootcruddatajpadatarestwebmysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
