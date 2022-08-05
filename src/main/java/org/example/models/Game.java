package org.example.models;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Table(name= "GAME_DATA")
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String genre;
    private String title;
    private String platform;
    private int Price;
    private Date created_at;
    private Date updated_at;

    @OneToMany(mappedBy = "game")
    private List<Review> reviewsList= new ArrayList<>();
}