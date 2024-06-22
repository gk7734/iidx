package kr.hs.dgsw.iidx.repository;

import kr.hs.dgsw.iidx.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
