package com.curvwind.onboarding.repositories;

import com.curvwind.onboarding.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String userName);
}
