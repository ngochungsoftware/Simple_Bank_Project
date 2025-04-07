package hung.practice.app.IOBANK.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String firstname;
    private String lastname;

    private String username;

    private String dob;
    private long tel;
    private String tag;
    private String password;
    private String gender;


}

