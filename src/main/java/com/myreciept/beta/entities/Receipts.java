package com.myreciept.beta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author Samnang Thorn
 * @author Dalbir Kang
 */
@Entity(name ="receipt")
public class Receipts {

    @Id
    @Column(name = "receiptNum")
    private String receiptNum;
}
