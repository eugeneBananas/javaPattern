package ru.mirea.edu.practice14.service;

import ru.mirea.edu.practice14.model.Game;
import ru.mirea.edu.practice14.repository.GameRepository;

import java.util.ArrayList;
import java.util.List;

public class JPAGameService {
    private final GameRepository gameRepository;

    public JPAGameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGame(String name) {
        return gameRepository.findByName(name);
    }

    public String addGame(Game game) {
        gameRepository.save(game);
        return game.getName();
    }

    public void deleteGame(String name) {
        Game game = gameRepository.findByName(name);
        if (game != null) {
            gameRepository.delete(game);
        }
    }

    public List<Game> findByStartingLetter(String letter) {
        List<Game> result = new ArrayList<>();
        for (Game game : getAllGames()) {
            if (game.getName().startsWith(letter)) {
                result.add(game);
            }
        }
        return result;
    }
}
