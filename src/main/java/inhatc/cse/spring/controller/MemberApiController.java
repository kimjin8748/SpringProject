package inhatc.cse.spring.controller;

import inhatc.cse.spring.dto.BookDto;
import inhatc.cse.spring.dto.MemberDto;
import inhatc.cse.spring.service.BookService;
import inhatc.cse.spring.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class MemberApiController {

    private final MemberService memberService;
    private final BookService bookService;

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

    @GetMapping("memberlist")
    public ResponseEntity<?> memberList() {
        List<MemberDto> memberList = memberService.findAll();
        return new ResponseEntity<>(memberList, HttpStatus.OK);
    }

    @GetMapping("memberDetail/{id}")
    public ResponseEntity<?> memberIdList(@PathVariable int id) {
        MemberDto memberDto = memberService.findId(id);
        return new ResponseEntity<>(memberDto, HttpStatus.OK);
    }

    @PostMapping("/booksave")
    public ResponseEntity<?> saveBook(
            @RequestPart("bookname") String bookname,
            @RequestPart("writer") String writer,
            @RequestPart("bookImage") MultipartFile bookImage) {

        BookDto bookDto = new BookDto();
        bookDto.setBookname(bookname);
        bookDto.setWriter(writer);
        System.out.println("========================" + bookDto);

        int result = bookService.save(bookDto, bookImage);

        if (result > 0) {
            return new ResponseEntity<>(bookDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("책 등록 실패", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
