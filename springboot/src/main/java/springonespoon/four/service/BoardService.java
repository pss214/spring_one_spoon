package springonespoon.four.service;

import org.springframework.stereotype.Service;
import springonespoon.four.DTO.ResponseDTO;
import springonespoon.four.entity.Board;
import springonespoon.four.repository.BoardRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class BoardService {
    final private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<Board> GetBoardList(){
        return boardRepository.findAll();
    }
    public Board GetBoard(int num){
        return boardRepository.findBynum(num);
    }
    public ResponseDTO SaveBoard(int num,Board res_board){
        Board repo_board = boardRepository.findBynum(num);
        if(repo_board != null){
            boardRepository.save(Board.builder()
                    .id(repo_board.getId())
                    .num(repo_board.getNum())
                    .subject(res_board.getSubject())
                    .writer(res_board.getWriter())
                    .content(res_board.getContent())
                    .registDate(LocalDate.now())
                    .build()
            );
        }else{
            res_board.setRegistDate(LocalDate.now());
            boardRepository.save(res_board);
        }
        return ResponseDTO.builder()
                .message("저장 되었습니다!")
                .build();
    }
    public ResponseDTO DeleteBoard(int num){
        Board board = boardRepository.findBynum(num);
        boardRepository.delete(board);
        return ResponseDTO.builder()
                .message("삭제 되었습니다!")
                .build();
    }

}
