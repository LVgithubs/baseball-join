package baseball.member.baseball.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import baseball.member.baseball.domain.convention.Convention;
import baseball.member.baseball.domain.convention.ConventionRepository;
import baseball.member.baseball.web.dto.JoinDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ConventionService {
    private final ConventionRepository conventionRepository;

    public List<Convention> 구장전체보기() {
        List<Convention> list = conventionRepository.findAll();
        return list;
    }

    @Transactional
    public void 구장등록(JoinDto joinDto) {
        conventionRepository.save(joinDto.toEntity());
    }

}
