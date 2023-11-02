package springonespoon.four.DTO;

import lombok.*;

import java.util.List;

@Data
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO<T> {
        List<T> data;
        String message;
}
