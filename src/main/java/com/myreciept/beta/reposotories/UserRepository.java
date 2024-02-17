package com.myreciept.beta.reposotories;

import com.myreciept.beta.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Samnang Thorn
 */
@Repository
public interface UserRepository extends JpaRepository<Users, String> {

    // Auto Query generate by JPA
    Users findByEmail(String email);
}
