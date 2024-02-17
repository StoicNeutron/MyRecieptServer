package com.myreciept.beta.DTO;

import lombok.*;

/**
 * @author Samnang Thorn
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequestDTO{

    @NonNull
    private String email;
    @NonNull
    private String passWord;

}
