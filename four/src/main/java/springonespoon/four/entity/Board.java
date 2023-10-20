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
