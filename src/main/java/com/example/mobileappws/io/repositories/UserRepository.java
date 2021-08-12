package com.example.mobileappws.io.repositories;

import com.example.mobileappws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

// work with user details(save, read, update, delete, etc)
@Repository // to specify this is a Spring data JPA
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {
    // define a method that find user by email ID
    // these methods come from Spring JPA, it is called query method, so the name of the methods
    // is very important
    UserEntity findByEmail(String email);// have to start with find then By then the column name in db
    UserEntity findByUserId(String userId);
    UserEntity findByLastName(String lastName);
}
