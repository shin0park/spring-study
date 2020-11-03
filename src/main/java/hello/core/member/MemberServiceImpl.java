package hello.core.member;
//구현체가 하나만 있을경우 인터페이스 명에 Impl 관례상 씀
public class MemberServiceImpl implements MemberService{
    //추상화(인터페이스)에도 의존 구현체에도 의존
    //private final MemberRepository memberRepository = new MemoryMemberRepository();
    //추상화(인터페이스)에만 의존
    private final MemberRepository memberRepository;
    //생성자 주입
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
