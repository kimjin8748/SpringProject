package inhatc.cse.spring.repository;

import inhatc.cse.spring.dto.BookDto;
import inhatc.cse.spring.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookRepository {

    private final SqlSessionTemplate sqlSession;

    public int save(BookDto bookDto) {
        int result = sqlSession.insert("Book.save", bookDto);
        return result;
    }
}
