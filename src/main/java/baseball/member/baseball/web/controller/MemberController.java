package baseball.member.baseball.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import baseball.member.baseball.domain.member.Member;
import baseball.member.baseball.service.MemberService;
import baseball.member.baseball.web.dto.MemberJoinDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller // view를 리턴하겠다. < MVC 패턴!
public class MemberController {
    private final MemberService memberService;

    @GetMapping({ "/member/list" })
    public String memberList(Model model) {
        List<Member> list = memberService.선수전체보기();
        model.addAttribute("member", list);
        return "/member/memberlist";
    }

    @GetMapping({ "/member/join" })
    public String memberJoin() {
        return "/member/memberjoin";
    }

    @PostMapping("/member-join")
    public String Join(MemberJoinDto joinDto) {
        memberService.선수등록(joinDto);
        return "redirect:/member/list";
    }
}
