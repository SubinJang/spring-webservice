package com.songjang.webservice.member.repository;

import com.songjang.webservice.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
