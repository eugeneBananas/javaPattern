package ru.mirea.edu.practice14.controller;

import org.springframework.web.bind.annotation.*;
import ru.mirea.edu.practice14.model.*;
import ru.mirea.edu.practice14.service.*;

import java.util.*;

@RestController
@RequestMapping("/game")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/{name}")
    public Game getGame(@PathVariable String name) {
        return gameService.getGame(name);
    }

    @PostMapping()
    public String addGame(@RequestBody Game game) {
        return gameService.addGame(game);
    }

    @DeleteMapping("/{name}")
    public void deleteGame(@PathVariable String name) {
    }

    @GetMapping("/filter")
    public List<Game> findByStartingLetter(@RequestParam("letter") String filter) {
        return gameService.findByStartingLetter(filter);
    }
}
