package com.restaurent.mangment.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "reservationdb1")
@Data
public class restaurent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String FirstName;
    private String SecondName;
    private String Email;
    private String Phone;
    private String Region;
    private String distract;
    private String Address;
    private String ReservationDate;
    private String ReservationTime;
    private String ChooseTble;
    private String ManyOfPeople;
    @Column(length = 200)
    private String Notes;
    @Column(nullable = false)
    private String Status = "Pending";
}
