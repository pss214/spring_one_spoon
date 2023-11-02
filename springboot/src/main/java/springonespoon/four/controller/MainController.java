package springonespoon.four.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springonespoon.four.DTO.LoginDTO;
import springonespoon.four.DTO.ResponseDTO;
import springonespoon.four.DTO.TokenDTO;
import springonespoon.four.entity.Board;
import springonespoon.four.service.BoardService;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",originPatterns = "http://localhost:8080")
public class MainController {
    final private BoardService boardService;

    public MainController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public List<?> mainpage(){
        return List.of("A","B","C","d");
    }
    @GetMapping("/boardlist")
    public ResponseEntity<?> boardList(){
        return ResponseEntity.ok().body(boardService.GetBoardList());
    }
    @GetMapping("/board/{id}")
    public ResponseEntity<?> boardview(@PathVariable int id) {
        return ResponseEntity.ok().body(boardService.GetBoard(id));
    }
    @PostMapping("/boardsave")
    public ResponseEntity<?> boardsave(@RequestBody Board board){
        return ResponseEntity.ok().body(boardService.SaveBoard(board));
    }
    @DeleteMapping("/boarddelete/{id}")
    public ResponseEntity<?> boarddelete(@PathVariable int id){
        return ResponseEntity.ok().body(boardService.DeleteBoard(id));
    }
    @PutMapping("/boardmodify/{id}")
    public ResponseEntity<?> boardmodify(@PathVariable int id,@RequestBody Board board){
        return ResponseEntity.ok().body(boardService.ModifyBoard(id, board));
    }
}

/*
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
 */

