package com.myreciept.beta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author Samnang Thorn
 * @author Dalbir Kang
 */
@Entity(name ="Users")
public class Users {

    @Id
    @Column(name = "Email", nullable = false, columnDefinition = "TEXT")
    private String Email;
    @Column(name = "Passkey", nullable = false, columnDefinition = "TEXT")
    private String Passkey;
    @Column(name = "DOB", nullable = false, columnDefinition = "TEXT")
    private String DOB;
    @Column(name = "MyReceiptEmail" , nullable = false, columnDefinition = "TEXT")
    private String ReceiptEmail;
    @Column(name = "Username" , nullable = false, columnDefinition = "TEXT")
    private String Username;

}