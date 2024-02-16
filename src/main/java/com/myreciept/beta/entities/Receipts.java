package com.myreciept.beta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author Samnang Thorn
 * @author Dalbir Kang
 */
@Entity(name ="Receipts")
public class Receipts {

    @Id
    @Column(name = "ReceiptNum", nullable = false, columnDefinition = "INTEGER"))
    private int ReceiptNo;
    @Column(name = "TotalAmount", nullable = false, columnDefinition = "INTEGER")
    private int TotalAmount;
    @Column(name = "DateAndTime", nullable = false, columnDefinition = "TEXT")
    private String DAndT;
    @Column(name = "Category" , nullable = false, columnDefinition = "TEXT")
    private String Category;
    @Column(name = "CompanyName" , nullable = false, columnDefinition = "TEXT")
    private String CompanyName;
    @Column(name = "U_Email" , nullable = false, columnDefinition = "TEXT")
    private String U_Email;
}
