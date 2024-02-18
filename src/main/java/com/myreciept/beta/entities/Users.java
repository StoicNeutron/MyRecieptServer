package com.myreciept.beta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Samnang Thorn
 * @author Dalbir Kang
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name ="Users")
public class Users {

    @Id
    @Column(name = "Email", nullable = false)
    private String email;
    @Column(name = "Password", nullable = false)
    private String Password;
    @Column(name = "Salt", nullable = false)
    private String Salt;
    @Column(name = "MyReceiptEmail" , nullable = false)
    private String ReceiptEmail;
    @Column(name = "Username" , nullable = false)
    private String Username;

}