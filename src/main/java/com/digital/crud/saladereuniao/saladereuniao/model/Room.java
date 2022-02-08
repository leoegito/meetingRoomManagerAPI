package com.digital.crud.saladereuniao.saladereuniao.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="meetingroom")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "date")
    @NotNull
    private String date;
    @Column(name = "startHour")
    @NotNull
    private String startHour;
    @Column(name = "endHour")
    @NotNull
    private String endHour;

}
