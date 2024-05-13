package inhatc.cse.spring.repository;

import inhatc.cse.spring.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final SqlSessionTemplate sqlSession;

    public int save(MemberDto memberDto) {
        System.out.println("==========memberDto : " + memberDto);
        int result = sqlSession.insert("Member.save", memberDto);
        System.out.println("result : " + result);
        return result;
    }
}
