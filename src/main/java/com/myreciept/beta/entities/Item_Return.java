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
@Entity(name ="Items_Returned")
public class Item_Return {

    @Id
    @Column(name = "ReceiptNum", nullable = false, columnDefinition = "INTEGER")
    private int ReceiptNum;
    @Column(name = "Items", nullable = false, columnDefinition = "INTEGER")
    private int Items;
    @Column(name = "Quantity", nullable = false, columnDefinition = "INTEGER")
    private int Quantity;
    @Column(name = "DateAndTime", nullable = false, columnDefinition = "TEXT")
    private String DateAndTime;
}