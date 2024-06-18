package kr.hs.dgsw.iidx.dto;

import kr.hs.dgsw.iidx.entity.IIDXEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IIDXDto {
    private Long id;
    private Integer version;
    private String name;
    private String artist;
    private String genre;
    private Integer bpm;
    private String beg;
    private String spn;
    private String sph;
    private String spa;
    private String spl;

    public IIDXDto(IIDXEntity entity) {
        this.id = entity.getId();
        this.version = entity.getVersion();
        this.name = entity.getName();
        this.artist = entity.getArtist();
        this.genre = entity.getGenre();
        this.bpm = entity.getBpm();
        this.beg = entity.getBeg();
        this.spn = entity.getSpn();
        this.sph = entity.getSph();
        this.spa = entity.getSpa();
        this.spl = entity.getSpl();
    }
}
