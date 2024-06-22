package kr.hs.dgsw.iidx.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import kr.hs.dgsw.iidx.entity.IIDXEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IIDXDto {
    private Long id;

    private Integer version;

    @NotBlank
    @NotEmpty
    private String name;

    @NotBlank
    @NotEmpty
    private String artist;

    @NotBlank
    @NotEmpty
    private String genre;

    @NotBlank
    @NotEmpty
    private String bpm;

    @NotBlank
    @NotEmpty
    private String beg;

    @NotBlank
    @NotEmpty
    private String spn;

    @NotBlank
    @NotEmpty
    private String sph;

    @NotBlank
    @NotEmpty
    private String spa;

    @NotBlank
    @NotEmpty
    private String spl;

    private LocalDateTime regDate, modDate;

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
        this.regDate = entity.getRegDate();
        this.modDate = entity.getModDate();
    }
}
