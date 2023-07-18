package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Detail {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private DetailName detailName;
    private String article;
}
