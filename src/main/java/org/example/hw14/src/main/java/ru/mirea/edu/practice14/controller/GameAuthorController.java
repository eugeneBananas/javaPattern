package ru.mirea.edu.practice14.controller;

import org.springframework.web.bind.annotation.*;
import ru.mirea.edu.practice14.model.*;
import ru.mirea.edu.practice14.service.GameAuthorService;

import java.util.*;

@RestController
@RequestMapping("/gameAuthor")
public class GameAuthorController {
    private final GameAuthorService authorNameService;

    public GameAuthorController(GameAuthorService authorNameService) {
        this.authorNameService = authorNameService;
    }

    @GetMapping()
    public List<GameAuthor> getAllMarkets() {
        return authorNameService.getAllAuthors();
    }

    @GetMapping("/{nickname}")
    public GameAuthor getMarket(@PathVariable String nickname) {
        return authorNameService.getAuthor(nickname);
    }

    @PostMapping()
    public Integer addMarket(@RequestBody GameAuthor nickname) {
        return authorNameService.addAuthor(nickname);
    }

    @DeleteMapping("/{nickname}")
    public GameAuthor deleteGameAuthor(@PathVariable String nickname) {
        return authorNameService.deleteAuthor(nickname);
    }
}
