package com.myreciept.beta.controllers;

import com.myreciept.beta.DTO.ReceiptDTO;
import com.myreciept.beta.DTO.SignUpRequestDTO;
import com.myreciept.beta.MockData.ReceiptsData;
import com.myreciept.beta.MockData.UsersData;
import com.myreciept.beta.Services.ReceiptService;
import com.myreciept.beta.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Samnang Thorn
 */
@RestController
public class MockController {

    private ReceiptService receiptService;
    private UserService userService;

    @Autowired
    public void UserController(ReceiptService receiptService, UserService userService) {
        this.receiptService = receiptService;
        this.userService = userService;
    }

    /**
     * Populate the database with random data for testing. Testing purposes only!
     * @param mockDTO
     * @return String status either it successful or not.
     */
    @PostMapping(value = "/v1/mock")
    public ResponseEntity<String> createReceipt(){
        ReceiptsData.generateRandomData();
        for(ReceiptDTO receiptDTO: ReceiptsData.receiptDTOList){
            this.receiptService.saveReceipt(receiptDTO);
        }
        UsersData.generateRandomData();
        for(SignUpRequestDTO signUpRequestDTO: UsersData.userList){
            this.userService.registerNewUser(signUpRequestDTO.getUserName(), signUpRequestDTO.getPassword(), signUpRequestDTO.getEmail());
        }
        return new ResponseEntity<>("Populate Database Successfully!", HttpStatus.CREATED);
    }

}
