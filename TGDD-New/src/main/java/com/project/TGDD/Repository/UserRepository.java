package com.project.TGDD.Repository;

import com.project.TGDD.Model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("select u from User u where u.numberPhone = ?1")
    public User findUserByNumPhone(Integer NumberPhone);
}
