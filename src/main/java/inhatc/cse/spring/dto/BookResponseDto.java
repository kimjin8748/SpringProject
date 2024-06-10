package inhatc.cse.spring.dto;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor
@Builder
public class BookResponseDto {
    private int id;
    private String bookname;
    private String writer;
    private String bookImagePath;

}
