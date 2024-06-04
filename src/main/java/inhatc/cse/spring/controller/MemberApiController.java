package inhatc.cse.spring.controller;

import inhatc.cse.spring.dto.MemberDto;
import inhatc.cse.spring.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin
public class MemberApiController {

    private final MemberService memberService;
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody MemberDto memberDto){
        System.out.println("=======================>" + memberDto);
        boolean result = memberService.login(memberDto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<?> memberInsert(@RequestBody MemberDto memberDto) {
        System.out.println("============" + memberDto);
        int result = memberService.save(memberDto);

        return new ResponseEntity<>(memberDto, HttpStatus.OK);
    }
}
