package com.myreciept.beta.MockData;

import com.myreciept.beta.DTO.SignUpRequestDTO;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Samnang Thorn
 */
public class UsersData {

    public static List<SignUpRequestDTO> userList = new ArrayList<>();
    private static String[] userNameList = {"user123", "john_doe", "emma_s", "alpha_beta", "user567"};
    private static String[] passwordList = {"pass123", "secret", "password123", "qwerty", "admin"};
    private static String[] emailList = {"waleed@gmail.com", "pete@gmail.com", "sample@gmail.com", "user4@gmail.com", "user5@gmail.com"};

    /**
     * Must call this function to use this Mock class.
     */
    public static void generateRandomData(){
        for(int i = 0; i < 5; i++){
            userList.add(new SignUpRequestDTO(userNameList[i], passwordList[i], emailList[i]));
        }
    }
}

