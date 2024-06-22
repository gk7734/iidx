package kr.hs.dgsw.iidx.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    String diffculty;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    String rank;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    String gauge;

    @Column(nullable = false)
    String ex_score;
}
