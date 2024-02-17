package com.myreciept.beta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

/**
 * @author Samnang Thorn
 * @author Dalbir Kang
 */
@AllArgsConstructor
@Entity(name ="Items_Returned")
public class Items_Returned {

    @Id
    @Column(name = "receiptnum", nullable = false, columnDefinition = "INTEGER")
    private int ReceiptNum;
    @Column(name = "items", nullable = false, columnDefinition = "INTEGER")
    private int Items;
    @Column(name = "quantity", nullable = false, columnDefinition = "INTEGER")
    private int Quantity;
    @Column(name = "dateandtime", nullable = false, columnDefinition = "TEXT"))
    private String DateAndTime;
    public Item_Return() {

    }
}
