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
    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String Email;
    @Column(name = "passkey", nullable = false, columnDefinition = "TEXT")
    private String Passkey;
    @Column(name = "dob", nullable = false, columnDefinition = "TEXT")
    private String DOB;
    @Column(name = "myreceiptemail" , nullable = false, columnDefinition = "TEXT")
    private String ReceiptEmail;
    @Column(name = "username" , nullable = false, columnDefinition = "TEXT")
    private String Username;

}
