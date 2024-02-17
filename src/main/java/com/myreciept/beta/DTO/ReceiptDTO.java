package com.myreciept.beta.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * @author Samnang Thorn
 */
@Getter
@Setter
@AllArgsConstructor
public class ReceiptDTO {

    @NonNull
    private double totalAmount;
    @NonNull
    private String dateNTime;
    @NonNull
    private String category;
    @NonNull
    private String companyName;
    @NonNull
    private String myReceiptEmail;
}
