package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private ItemType itemType;
    @ManyToMany
    private List<Detail> details;
}
