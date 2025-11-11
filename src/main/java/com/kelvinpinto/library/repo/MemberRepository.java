package com.kelvinpinto.library.repo;

import com.kelvinpinto.library.model.Member;
import java.util.Optional;

public interface MemberRepository {
    Optional<Member> findById(String id);
    void save(Member member);
}
