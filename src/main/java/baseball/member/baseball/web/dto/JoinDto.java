package baseball.member.baseball.web.dto;

import baseball.member.baseball.domain.convention.Convention;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinDto {
    private String conName;

    public Convention toEntity() {
        Convention convention = new Convention();
        convention.setConName(conName);
        return convention;
    }
}
