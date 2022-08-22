package com.lguplus.LTF2_BE.core.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "color_id")
    private Long id;

    private String name;

    private String hexCode;

    @OneToMany(mappedBy = "color", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<PhoneColor> phoneColors = new ArrayList<>();
}
