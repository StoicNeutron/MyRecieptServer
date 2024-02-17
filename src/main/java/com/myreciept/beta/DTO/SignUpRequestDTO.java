package com.myreciept.beta.DTO;

import lombok.*;

/**
 * @author Samnang Thorn
 */
@Getter
@Setter
@AllArgsConstructor
public class SignUpRequestDTO {

    @NonNull
    private String userName;
    @NonNull
    private String password;
    @NonNull
    private String email;

}
