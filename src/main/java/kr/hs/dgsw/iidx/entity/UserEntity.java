package kr.hs.dgsw.iidx.entity;

import jakarta.persistence.*;
import kr.hs.dgsw.iidx.Enum.DifficultyEnum;
import kr.hs.dgsw.iidx.Enum.GaugeEnum;
import kr.hs.dgsw.iidx.Enum.RankEnum;
import kr.hs.dgsw.iidx.dto.UserDto;
import lombok.*;

@Entity
@Table(name = "user_rank")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String username;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    DifficultyEnum diffculty;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    RankEnum rank;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    GaugeEnum gauge;

    @Column(nullable = false)
    String ex_score;

    public UserEntity(UserDto dto) {
        this.id = dto.getId();
        this.username = dto.getUsername();
        this.name = dto.getName();
        this.diffculty = dto.getDiffculty();
        this.rank = dto.getRank();
        this.gauge = dto.getGauge();
        this.ex_score = dto.getEx_score();
    }
}
