package baseball.member.baseball.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import baseball.member.baseball.domain.team.TeamRepository;
import baseball.member.baseball.domain.team.Teams;
import baseball.member.baseball.web.dto.TeamJoinDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public List<Teams> 팀전체보기() {
        List<Teams> list = teamRepository.findAll();
        return list;
    }

    @Transactional
    public void 팀등록(TeamJoinDto joinDto) {
        teamRepository.save(joinDto.toEntity());
    }
}
