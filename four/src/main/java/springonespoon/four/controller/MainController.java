package springonespoon.four.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springonespoon.four.DTO.ResponseDTO;
import springonespoon.four.entity.Board;

import java.time.LocalDate;
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
    public ResponseEntity<?> boardview(@PathVariable int id) {
        for (Board a : listadd) {
            if (a.getId()==id) {
                return ResponseEntity.ok().body(a);
            }
        }
        return ResponseEntity.ok().body(ResponseDTO.builder().message("리스트가 없습니다").build());
    }
    @PostMapping("/boardsave/{id}")
    public ResponseEntity<?> boardsave(@PathVariable int id,@RequestBody Board board){
        for (Board a : listadd) {
            if (a.getId()==id) {
                a.setWriter(board.getWriter());
                a.setSubject(board.getSubject());
                a.setContent(board.getContent());
                a.setRegistDate(LocalDate.now());
                return ResponseEntity.ok().body(ResponseDTO.builder().message("저장 되었습니다").build());
            }
        }
        listadd.add(board);
        return ResponseEntity.ok().body(ResponseDTO.builder().message("저장 되었습니다").build());
    }
    @DeleteMapping("/boarddelete/{id}")
    public ResponseEntity<?> boarddelete(@PathVariable Long id){
        for (Board a : listadd) {
            if (a.getId()==id) {
                listadd.remove(a);
                return ResponseEntity.ok().body(ResponseDTO.builder().message("삭제 되었습니다").build());
            }
        }
        return ResponseEntity.badRequest().body(ResponseDTO.builder().message("찾을 수 없습니다").build());
    }
}

