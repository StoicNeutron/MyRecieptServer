package com.myreciept.beta.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Samnang Thorn
 * @author Dalbir Kang
 */
@Getter
@Setter
@Entity(name ="Receipts")
public class Receipts {

    @Id
    @SequenceGenerator(name = "User_sequence", sequenceName = "User_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_sequence")
    @Column(name = "ReceiptNum", nullable = false, columnDefinition = "INTEGER")
    private Integer ReceiptNo;
    @Column(name = "TotalAmount", nullable = false, columnDefinition = "FLOAT")
    private double totalAmount;
    @Column(name = "DateAndTime", nullable = false, columnDefinition = "TEXT")
    private String dateNTime;
    @Column(name = "Category" , nullable = false, columnDefinition = "TEXT")
    private String category;
    @Column(name = "CompanyName" , nullable = false, columnDefinition = "TEXT")
    private String companyName;
    @Column(name = "Email" , nullable = false, columnDefinition = "TEXT")
    private String myReceiptEmail;

    public Receipts(double totalAmount, String dateNTime, String category, String companyName, String myReceiptEmail){
        this.totalAmount = totalAmount;
        this.dateNTime = dateNTime;
        this.category = category;
        this.companyName = companyName;
        this.myReceiptEmail = myReceiptEmail;
    }
}