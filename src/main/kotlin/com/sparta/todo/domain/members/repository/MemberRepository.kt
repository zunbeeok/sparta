package com.sparta.todo.domain.members.repository

import com.sparta.todo.domain.members.model.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository :JpaRepository<Member,Long> {
}