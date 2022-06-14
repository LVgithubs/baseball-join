package baseball.member.baseball.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import baseball.member.baseball.domain.convention.Convention;
import baseball.member.baseball.service.ConventionService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller // view를 리턴하겠다. < MVC 패턴!
public class mainController {
    private final ConventionService conventionService;

    @GetMapping({ "/", "" })
    public String index(Model model) {
        List<Convention> conAll = conventionService.구장전체보기();
        model.addAttribute("con", conAll);
        return "/main";
    }
}
