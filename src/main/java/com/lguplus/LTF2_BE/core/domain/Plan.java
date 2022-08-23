package com.lguplus.LTF2_BE.core.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Table(name="plan")
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id")
    private Long id;

    private String name;

    private Integer monthPrice;

    private String data;

    private String dataPlus;

    private String shareData;

    private String shareDataPlus;

    private String voice;

    private String voicePlus;

    @Convert
    private String message;

    private String smartDevice;

    private String smartDeviceDiscount;

    private String premiumService;

    @Convert
    private String basicBenefit;

    private String familySig5g;

    @Convert
    private String telecomTech;

    @Convert
    private String planType;

    @OneToMany(mappedBy = "plan", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<PublicSupport> publicSupports = new ArrayList<>();

    @OneToMany(mappedBy = "plan", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Orders> orders = new ArrayList<>();

    @OneToMany(mappedBy = "plan", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<PlanMediaService> planMediaServices = new ArrayList<>();
}