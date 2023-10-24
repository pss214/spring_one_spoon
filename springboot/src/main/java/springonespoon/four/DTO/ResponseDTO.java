package springonespoon.four.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Getter
@Builder
public class ResponseDTO<T> {
        List<T> data;
        String message;
}
