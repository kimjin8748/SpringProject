//package inhatc.cse.spring.utils;
//
//
//import inhatc.cse.spring.dto.MemberDto;
//
//public class BuilderTest {
//    public static void main(String[] args) {
//        MemberDto memberDto = new MemberDto();
//        MemberDto memberDto1 = new MemberDto("abc@test.com", "1111",
//                "홍길동", 10, "010-123");
//        System.out.println(memberDto1);
//        MemberDto memberDto2 = MemberDto.builder()
//                .phone("010-222")
//                .age(30)
//                .name("김길동")
//                .build();
//        System.out.println(memberDto2);
//    }
//}
