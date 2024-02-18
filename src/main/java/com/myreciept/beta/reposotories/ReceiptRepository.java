package com.myreciept.beta.reposotories;

import com.myreciept.beta.entities.Receipts;
import com.myreciept.beta.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipts, Integer> {

    @Query("SELECT r FROM Receipts r WHERE r.myReceiptEmail = :myReceiptEmail")
    List<Receipts> findAllBy(String myReceiptEmail);

    @Query("SELECT r FROM Receipts r WHERE r.myReceiptEmail = :myReceiptEmail AND r.category = :category")
    List<Receipts> findAllByCategory(String myReceiptEmail, String category);

    List<Receipts> findAllBy();

}
