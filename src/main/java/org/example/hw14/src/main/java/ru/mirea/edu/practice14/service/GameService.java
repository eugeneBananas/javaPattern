package ru.mirea.edu.practice14.service;

import jakarta.persistence.criteria.*;
import org.hibernate.query.Query;
import ru.mirea.edu.practice14.model.Game;
import org.springframework.stereotype.*;
import ru.mirea.edu.practice14.model.GameAuthor;
import ru.mirea.edu.practice14.repository.GameRepository;

import java.util.*;

@Service
//public class GameService {
//    private final GameRepository gameRepository;
//
//    public GameService(GameRepository gameRepository) {
//        this.gameRepository = gameRepository;
//    }
//
//    public List<Game> getAllGames() {
//        return gameRepository.findAll();
//    }
//
//    public Game getGame(String name) {
//        return gameRepository.findByName(name);
//    }
//
//    public String addGame(Game game) {
//        gameRepository.save(game);
//        return game.getName();
//    }
//
//    public void deleteGame(String name) {
//        Game game = gameRepository.findByName(name);
//        if (game != null) {
//            gameRepository.delete(game);
//        }
//    }
//
//    public List<Game> findByStartingLetter(String letter) {
//        List<Game> result = new ArrayList<>();
//        for (Game game : getAllGames()) {
//            if (game.getName().startsWith(letter)) {
//                result.add(game);
//            }
//        }
//        return result;
//    }
//}
public interface GameService {
    List<Game> getAllMarkets();
    Game getMarket(String name);
    String addMarket(Game gameAuthor);
    void deleteMarket(String name);
}