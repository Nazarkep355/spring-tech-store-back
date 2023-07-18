package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ItemType {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @ManyToMany
    private List<DetailName> commonDetails;
}
