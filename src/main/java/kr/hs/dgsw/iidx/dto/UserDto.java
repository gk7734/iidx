package kr.hs.dgsw.iidx.dto;

import jakarta.persistence.EnumType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
    private String diffculty;

    @NotBlank
    @NotEmpty
    private String rank;

    @NotBlank
    @NotEmpty
    private String gauge;

    @NotBlank
    @NotEmpty
    private String ex_score;

    public UserDto(UserEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.diffculty = entity.getDiffculty();
        this.rank = entity.getRank();
        this.gauge = entity.getGauge();
        this.ex_score = entity.getEx_score();
    }
}
