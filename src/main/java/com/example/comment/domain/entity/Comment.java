package com.example.comment.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity @Setter
@Getter @Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "comments",
        indexes = @Index(name = "idx_target", columnList = "targetId")
)
public class Comment {

    @Id @GeneratedValue
    private Long id;
    private String content;
    private UUID targetId;
    private Long memberId;
    private String memberImage;
    private String memberName;

}
