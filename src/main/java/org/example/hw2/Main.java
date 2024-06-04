package org.example.hw2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static class Human {
        String name;
        int age;
        LocalDate birthDate;
        int weight;

        public Human(String name, int age, LocalDate birthDate, int weight) {
            this.name = name;
            this.birthDate = birthDate;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }
    }

    public static void main(String[] args) {
        List<Human> people = new ArrayList<>();
        people.add(new Human("Алина", 23, LocalDate.of(2001, 3, 20), 52));
        people.add(new Human("Маша", 34, LocalDate.of(1990, 2, 10), 64));
        people.add(new Human("Александр", 45, LocalDate.of(1980, 9, 1), 78));

        // Сортировка людей по возрасту от большего к меньшему
        people.stream()
                .sorted(Comparator.comparing(Human::getAge).reversed())
                .forEach(person -> System.out.println(person.getName() + " - " + person.getAge()));

        // Фильтрация людей с именем, начинающимся на букву "А"
        people.stream()
                .filter(person -> person.getName().startsWith("А"))
                .forEach(person -> System.out.println(person.getName()));

        // Сортировка людей по дате рождения от старших к младшим
        people.stream()
                .sorted(Comparator.comparing(Human::getBirthDate).reversed())
                .forEach(person -> System.out.println(person.getName() + " - " + person.getBirthDate()));

        // Расчёт среднего веса людей
        double averageWeight = people.stream()
                .mapToDouble(Human::getWeight)
                .average()
                .orElse(0);

        System.out.println("Средний вес: " + averageWeight);

    }
}