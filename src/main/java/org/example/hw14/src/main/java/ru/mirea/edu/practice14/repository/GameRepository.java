package ru.mirea.edu.practice14.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.edu.practice14.model.Game;


@Repository
public interface GameRepository extends JpaRepository<Game, String> {
    public Game findByName(String name);
}
