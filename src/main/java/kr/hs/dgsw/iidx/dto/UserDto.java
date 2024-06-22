package kr.hs.dgsw.iidx.dto;

import jakarta.persistence.EnumType;
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

    private String name;

    private String diffculty;

    private String rank;

    private String gauge;

    private String ex_score;
}
