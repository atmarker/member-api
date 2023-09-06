package com.cirrusjoe.members.repositories;

import com.cirrusjoe.members.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersRepository extends JpaRepository<Member, Long> {
}