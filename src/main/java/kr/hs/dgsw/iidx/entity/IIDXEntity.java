package kr.hs.dgsw.iidx.entity;

import jakarta.persistence.*;
import kr.hs.dgsw.iidx.dto.IIDXDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "iidx")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class IIDXEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "version", length = 32, nullable = false)
    private Integer version;

    @Column(name = "song_name", nullable = false)
    private String name;

    @Column(name = "artist", nullable = false)
    private String artist;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "bpm", nullable = false)
    private Integer bpm;

    @Column(name = "beginner")
    private String beg;

    @Column(name = "normal")
    private String spn;

    @Column(name = "hyper")
    private String sph;

    @Column(name = "another")
    private String spa;

    @Column(name = "leggendaria")
    private String spl;

    public IIDXEntity(IIDXDto dto) {
        this.id = dto.getId();
        this.version = dto.getVersion();
        this.name = dto.getName();
        this.artist = dto.getArtist();
        this.genre = dto.getGenre();
        this.bpm = dto.getBpm();
        this.beg = dto.getBeg();
        this.spn = dto.getSpn();
        this.sph = dto.getSph();
        this.spa = dto.getSpa();
        this.spl = dto.getSpl();
    }
}
