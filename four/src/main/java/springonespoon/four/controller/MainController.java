package springonespoon.four.controller;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springonespoon.four.entity.Board;

import java.util.List;

import static springonespoon.four.FourApplication.listadd;

@RestController
@CrossOrigin(origins = "*",originPatterns = "http://localhost:8080")
public class MainController {

    @GetMapping("/")
    public List<?> mainpage(){
        return List.of("A","B","C","d");
    }
    @GetMapping("/boardlist")
    public ResponseEntity<?> boardList(){
        return ResponseEntity.ok().body(listadd);
    }
    @GetMapping("/board/{id}")
    public ResponseEntity<?> boardview(@PathVariable Long id) {
        for (Board a : listadd) {
            if (a.getId().equals(id)) {
                return ResponseEntity.ok().body(a);
            }
        }
        return ResponseEntity.ok().body(ResponseDTO.builder().message("리스트가 없습니다").build());
    }
    @PostMapping("/boardsave/{id}")
    public ResponseEntity<?> boardsave(@PathVariable Long id,@RequestBody Board board){
        for (Board a : listadd) {
            if (a.getId().equals(id)) {
                a.setWriter(board.getWriter());
                a.setSubject(board.getSubject());
                a.setContent(board.getContent());
                return ResponseEntity.ok().body(ResponseDTO.builder().message("저장 되었습니다").build());
            }
        }
        listadd.add(board);
        return ResponseEntity.ok().body(ResponseDTO.builder().message("저장 되었습니다").build());
    }
}
@Data
@Builder
class ResponseDTO {
    String message;
}
//Board.builder().seqno(1L).subject("처음 작성").readCnt(1).registDate(LocalDate.now()).build()

