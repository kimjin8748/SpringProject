package inhatc.cse.spring.repository;

import inhatc.cse.spring.dto.MemberDto;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    public int save(MemberDto memberDto) {
        System.out.println("==========memberDto : " + memberDto);
        return 0;
    }
}
