package springonespoon.four.DTO;

import lombok.*;

@Data
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {
    String username;
    String password;
}
