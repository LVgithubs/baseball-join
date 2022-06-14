package baseball.member.baseball.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import baseball.member.baseball.domain.member.Member;
import baseball.member.baseball.domain.member.MemberRepository;
import baseball.member.baseball.web.dto.MemberJoinDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public List<Member> 선수전체보기() {
        List<Member> list = memberRepository.findAll();
        return list;
    }

    @Transactional
    public void 선수등록(MemberJoinDto joinDto) {
        memberRepository.save(joinDto.toEntity());
    }
}
