package kr.hs.dgsw.iidx.repository;

import kr.hs.dgsw.iidx.entity.IIDXEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIDXRepository extends JpaRepository<IIDXEntity, Long> {}
