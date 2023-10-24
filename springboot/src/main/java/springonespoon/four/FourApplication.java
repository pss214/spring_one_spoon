package springonespoon.four;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springonespoon.four.entity.Board;
import springonespoon.four.repository.BoardRepository;

import java.time.LocalDate;

@SpringBootApplication
public class FourApplication implements CommandLineRunner {

//	public static List<Board> listadd = new ArrayList<Board>();
    final private BoardRepository boardRepository;

    public FourApplication(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(FourApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        boardRepository.save(Board.builder().num(1).subject("처음작성").writer("박성수").content("처음작성합니다").registDate(LocalDate.now()).build());
        boardRepository.save(Board.builder().num(2).subject("두번째작성").writer("박성수").content("두번째 작성합니다").registDate(LocalDate.now()).build());
        boardRepository.save(Board.builder().num(3).subject("세번째작성").writer("박성수").content("세번째 작성합니다").registDate(LocalDate.now()).build());
        boardRepository.save(Board.builder().num(4).subject("네번째작성").writer("박성수").content("네번째 작성합니다").registDate(LocalDate.now()).build());
	}
}
