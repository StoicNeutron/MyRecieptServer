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
    @Column(name = "Email", nullable = false, columnDefinition = "TEXT")
    private String email;
    @Column(name = "Password", nullable = false, columnDefinition = "TEXT")
    private String Password;
    @Column(name = "Salt", nullable = false, columnDefinition = "TEXT")
    private String Salt;
    @Column(name = "MyReceiptEmail" , nullable = false, columnDefinition = "TEXT")
    private String ReceiptEmail;
    @Column(name = "Username" , nullable = false, columnDefinition = "TEXT")
    private String Username;

}