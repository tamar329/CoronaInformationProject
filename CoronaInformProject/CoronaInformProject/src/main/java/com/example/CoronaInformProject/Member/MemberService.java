package com.example.CoronaInformProject.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

    public Member getMember(Long id){
        Optional<Member> memberOptional = memberRepository.findById(id);
        Member member = null;
        if (memberOptional.isPresent()) {
            member = memberOptional.get();
        }else {
            throw new RuntimeException(
                    "Member with id" + id + "does not exists");
        }
        return member;
    }

    public boolean addNewMember(Member member){
        Optional<Member> memberOptional = memberRepository.findById(member.getId());
        if (member.getPositiveResultDate() != null && member.getRecoveryDate() == null ||
                member.getPositiveResultDate() == null && member.getRecoveryDate() != null)
            return false;
        if (memberOptional.isPresent()){
            return false;
        }
        memberRepository.save(member);
        return true;
    }

    public void updateMember(Member member){
        memberRepository.save(member);
    }

    public void deleteMember(Long memberId) {
        boolean exists = memberRepository.existsById(memberId);
        if(!exists){
            throw new IllegalStateException(
                    "Member with id" + memberId + "does not exists");
        }
        memberRepository.deleteById(memberId);
    }
}
