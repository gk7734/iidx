package kr.hs.dgsw.iidx.dto;

import jakarta.persistence.EnumType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import kr.hs.dgsw.iidx.Enum.DiffucltyEnum;
import kr.hs.dgsw.iidx.Enum.GaugeEnum;
import kr.hs.dgsw.iidx.Enum.RankEnum;
import kr.hs.dgsw.iidx.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private Long id;

    @NotBlank
    @NotEmpty
    private String name;

    @NotBlank
    @NotEmpty
    private String username;

    private DiffucltyEnum diffculty;

    private RankEnum rank;

    private GaugeEnum gauge;

    @NotBlank
    @NotEmpty
    private String ex_score;

    public UserDto(UserEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.username = entity.getUsername();
        this.diffculty = entity.getDiffculty();
        this.rank = entity.getRank();
        this.gauge = entity.getGauge();
        this.ex_score = entity.getEx_score();
    }
}
