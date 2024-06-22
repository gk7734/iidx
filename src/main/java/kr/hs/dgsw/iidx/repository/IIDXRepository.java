package kr.hs.dgsw.iidx.repository;

import kr.hs.dgsw.iidx.entity.IIDXEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IIDXRepository extends JpaRepository<IIDXEntity, Long> {
    List<IIDXEntity> findByVersion(Integer version);


    @Query("SELECT e FROM IIDXEntity e WHERE e.name LIKE %:name%")
    List<IIDXEntity> findByName(@Param("name") String name);

    @Query("SELECT e FROM IIDXEntity e WHERE e.artist LIKE %:artist%")
    List<IIDXEntity> findByArtist(@Param("artist") String artist);

    @Query("SELECT e FROM IIDXEntity e WHERE e.name LIKE %:name% AND e.artist LIKE %:artist%")
    List<IIDXEntity> findByNameAndArtist(@Param("name") String name, @Param("artist") String artist);
}
