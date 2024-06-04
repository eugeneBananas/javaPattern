package ru.mirea.edu.practice14.service;

import ru.mirea.edu.practice14.model.GameAuthor;

import java.util.HashMap;
import java.util.List;

import java.util.*;

public class JPAGameAuthorService {
    private final Map<Integer, GameAuthor> authors = new HashMap<>();
    private int count;

    public List<GameAuthor> getAllAuthors() {
        return authors.values().stream().toList();
    }

    public GameAuthor getAuthor(String nickname) {
        return authors.get(nickname);
    }

    public Integer addAuthor(GameAuthor gameAuthor) {
        authors.put(count, gameAuthor);
        count++;
        return count - 1;
    }

    public GameAuthor deleteAuthor(String nickname) {
        return authors.remove(nickname);
    }
}
