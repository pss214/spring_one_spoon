package springonespoon.four;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springonespoon.four.entity.Board;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FourApplication implements CommandLineRunner {

	public static List<Board> listadd = new ArrayList<Board>();
	public static void main(String[] args) {
		SpringApplication.run(FourApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Board board = new Board(1L,"처음작성","박성수","처음작성합니다.",1, LocalDate.now());
		Board board2 = new Board(2L,"두번째 작성","박성수","두번째 입니다.",1,LocalDate.now());
		Board board3 = new Board(3L,"세번째 작성","박성수","세번째 입니다.",1,LocalDate.now());
		Board board4 = new Board(4L,"네번째 작성","박성수","네번째 입니다.",1,LocalDate.now());
		listadd.add(board);
		listadd.add(board2);
		listadd.add(board3);
		listadd.add(board4);
	}
}
