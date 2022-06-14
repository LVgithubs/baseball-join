package baseball.member.baseball.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import baseball.member.baseball.domain.team.Teams;
import baseball.member.baseball.service.TeamService;
import baseball.member.baseball.web.dto.TeamJoinDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller // view를 리턴하겠다. < MVC 패턴!
public class TeamController {
    private final TeamService teamservice;

    @GetMapping({ "/team/list" })
    public String memberList(Model model) {
        List<Teams> list = teamservice.팀전체보기();
        model.addAttribute("team", list);
        return "/member/memberlist";
    }

    @GetMapping({ "/team/join" })
    public String memberJoin() {
        return "/team/teamjoin";
    }

    @PostMapping("/team-join")
    public String Join(TeamJoinDto joinDto) {
        teamservice.팀등록(joinDto);
        return "redirect:/team/list";
    }
}
