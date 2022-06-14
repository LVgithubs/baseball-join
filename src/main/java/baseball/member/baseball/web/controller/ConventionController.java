package baseball.member.baseball.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import baseball.member.baseball.service.ConventionService;
import baseball.member.baseball.web.dto.JoinDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller // view를 리턴하겠다. < MVC 패턴!
public class ConventionController {
    private final ConventionService conventionService;

    @GetMapping({ "/conv" })
    public String conv(Model model) {
        return "/convention/conjoin";
    }

    @PostMapping("/conv-join")
    public String conventionJoin(JoinDto joinDto) {
        conventionService.구장등록(joinDto);
        return "redirect:/";
    }
}
