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
@Entity(name ="item_return")
public class Item_Return {

    @Id
    @Column(name = "receiptNum")
    private String receiptNum;

    public Item_Return() {

    }
}
