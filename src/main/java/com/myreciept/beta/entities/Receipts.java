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
    @Column(name = "receiptno", nullable = false, columnDefinition = "INTEGER"))
    private int ReceiptNo;
    @Column(name = "totalamount", nullable = false, columnDefinition = "INTEGER")
    private int TotalAmount;
    @Column(name = "dandt", nullable = false, columnDefinition = "TEXT")
    private String DAndT;
    @Column(name = "category" , nullable = false, columnDefinition = "TEXT")
    private String Category;
    @Column(name = "companyname" , nullable = false, columnDefinition = "TEXT")
    private String CompanyName;
    @Column(name = "u_email" , nullable = false, columnDefinition = "TEXT")
    private String U_Email;
}
