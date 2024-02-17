package com.myreciept.beta.Services;

import com.myreciept.beta.DTO.ReceiptDTO;
import com.myreciept.beta.entities.Receipts;
import com.myreciept.beta.entities.Users;
import com.myreciept.beta.reposotories.ReceiptRepository;
import com.myreciept.beta.reposotories.UserRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * @author Samnang Thorn
 */
@Service
public class ReceiptService {

    private final ReceiptRepository receiptRepository;

    @Autowired
    public ReceiptService(ReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    @Transactional
    public void saveReceipt(@NonNull ReceiptDTO receiptDTO) {
        receiptRepository.save(new Receipts(receiptDTO.getTotalAmount(), receiptDTO.getDateNTime(), receiptDTO.getCategory(), receiptDTO.getCompanyName(), receiptDTO.getMyReceiptEmail()));
    }


    public List<Receipts> findAllReceipt(@NonNull String myReceiptEmail){
        return receiptRepository.findByMyReceiptEmail(myReceiptEmail);
    }
}
