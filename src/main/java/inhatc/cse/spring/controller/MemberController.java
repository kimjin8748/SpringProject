package inhatc.cse.spring.controller;

import inhatc.cse.spring.dto.MemberDto;
import inhatc.cse.spring.service.MemberService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    @GetMapping("/save")
    public String save() {
        log.info("==================회원 가입 처리중");
        return "member/save";
    }

    @PostMapping("/save")
    public String memberInsert(@ModelAttribute MemberDto memberDto) {
        System.out.println("============" + memberDto);
        int result = memberService.save(memberDto);
        if (result > 0) {
            return "member/login";
        }
        return "member/save";
    }

    @GetMapping("/login")
    public String loginForm(){
        return "member/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute MemberDto memberDto, HttpSession session){
        boolean result = memberService.login(memberDto);
        if(result) {
            session.setAttribute("loginEmail", memberDto.getEmail());
            return "main";
        } else {
            return "member/login";
        }
    }


    @GetMapping("/list")
    public String memberList(Model model){
        List<MemberDto> memberList = memberService.findAll();
        System.out.println("========" + memberList);
        model.addAttribute("memberList", memberList);
        return "member/list";
    }
}
