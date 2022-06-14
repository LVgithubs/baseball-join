package baseball.member.baseball.web.dto;

import baseball.member.baseball.domain.member.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberJoinDto {
    private String memberName;
    private String teamName;
    private String position;

    public Member toEntity() {
        Member member = new Member();
        member.setMemberName(memberName);
        member.setTeamName(teamName);
        member.setPosition(position);
        return member;
    }
}
