package com.myreciept.beta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author Samnang Thorn
 * @author Dalbir Kang
 */
@Entity(name ="users")
public class Users {

    @Id
    @Column(name = "email")
    private String email;

}
