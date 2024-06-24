package kr.hs.dgsw.iidx.repository;

import kr.hs.dgsw.iidx.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findByUsername(String username);
}
