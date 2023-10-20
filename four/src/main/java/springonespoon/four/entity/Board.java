package springonespoon.four.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Board {
    int id;
    String subject;
    String writer;
    String content;
    int readCnt;
    LocalDate registDate;

    public Board(int id, String subject, String writer, String content, int readCnt, LocalDate registDate) {
        this.id = id;
        this.subject = subject;
        this.content = content;
        this.writer = writer;
        this.readCnt = readCnt;
        this.registDate = registDate;
    }
}
/*
@Data
@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subject;
    private String writer;
    private String content;
    private int readCnt;
    private LocalDate registDate;
}
 */
