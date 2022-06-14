package baseball.member.baseball.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * MemberRepository
 */
public interface MemberRepository extends JpaRepository<Member, Integer> {

}