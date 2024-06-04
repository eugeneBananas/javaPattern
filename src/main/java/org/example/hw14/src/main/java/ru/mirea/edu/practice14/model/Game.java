package ru.mirea.edu.practice14.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

import java.util.Set;

@Entity
public class Game {
    @Id
    private String name;
    private Date creationDate;
    @ManyToOne
    private GameAuthor gameAuthor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


//    public GameAuthor getGameAuthor() {
//        return gameAuthor;
//    }
//
//    public void setGameAuthor(GameAuthor gameAuthor) {
//        this.gameAuthor = gameAuthor;
//    }

}
