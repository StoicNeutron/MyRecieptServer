package com.myreciept.beta.controllers;

import com.myreciept.beta.DTO.ReceiptDTO;
import com.myreciept.beta.DTO.SignUpRequestDTO;
import com.myreciept.beta.Services.ReceiptService;
import com.myreciept.beta.Services.UserService;
import com.myreciept.beta.entities.Receipts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samnang Thorn
 */
@RestController
public class ReceiptAPI {

    private ReceiptService receiptService;

    @Autowired
    public void UserController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }

    /**
     * For company access API
     * @param receiptDTO
     * @return
     */
    @PostMapping(value = "/v1/send_receipt", consumes = "application/json")
    public ResponseEntity<String> createReceipt(@RequestBody ReceiptDTO receiptDTO){
        this.receiptService.saveReceipt(receiptDTO);
        return new ResponseEntity<>("User Created Successfully!", HttpStatus.CREATED);
    }

    @GetMapping(value = "/v1/receipts", consumes = "application/json")
    public ResponseEntity<List<Receipts>> getReceipts(@RequestBody String myReceiptEmail){
        return new ResponseEntity<>(this.receiptService.findAllReceipt(myReceiptEmail), HttpStatus.CREATED);
    }

}
