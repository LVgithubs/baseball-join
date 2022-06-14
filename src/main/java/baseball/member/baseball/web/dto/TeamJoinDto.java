package baseball.member.baseball.web.dto;

import baseball.member.baseball.domain.team.Teams;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamJoinDto {
    private String teamName;

    public Teams toEntity() {
        Teams team = new Teams();
        team.setTeamName(teamName);
        return team;
    }

}
