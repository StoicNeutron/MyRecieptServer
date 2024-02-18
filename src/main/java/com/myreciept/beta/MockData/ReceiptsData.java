package com.myreciept.beta.MockData;

import com.myreciept.beta.DTO.ReceiptDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samnang Thorn
 */
public class ReceiptsData {

    public static List<ReceiptDTO> receiptDTOList = new ArrayList<>();
    private static int[] totalAmountList = {123, 456, 789, 234, 567, 890, 345, 678, 901, 432};
    private static String[] dateNTimeList = {"2022", "2022", "2023", "2020", "2021", "2022", "2023", "2024", "2020", "2023"};
    private static String[] categoryList = {"Foods", "Shopping", "Foods", "Shopping", "Shopping", "Foods", "Entertainment", "Foods", "Foods", "Entertainment"};
    private static String[] companyNameList = {"Apple", "Google", "Microsoft", "Amazon", "Facebook", "Tesla", "Netflix", "Adobe", "Intel", "Twitter"};

    /**
     * Must call this function to use this Mock class.
     */
    public static void generateRandomData(){
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0) {
                receiptDTOList.add(new ReceiptDTO(totalAmountList[i], dateNTimeList[i], categoryList[i], companyNameList[i], "waleed@receipt.com"));
            }else{
                receiptDTOList.add(new ReceiptDTO(totalAmountList[i], dateNTimeList[i], categoryList[i], companyNameList[i], "pete@receipt.com"));
            }
        }
    }
}
