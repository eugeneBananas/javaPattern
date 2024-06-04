package org.example.hw3.synchronizedcollections;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static public class ThreadSafeSet<T> {
        private Set<T> set = new HashSet<>();
        private Semaphore semaphore = new Semaphore(1);

        public void add(T element) throws InterruptedException {
            semaphore.acquire();
            try {
                set.add(element);
            } finally {
                semaphore.release();
            }
        }

        public boolean contains(T element) throws InterruptedException {
            semaphore.acquire();
            try {
                return set.contains(element);
            } finally {
                semaphore.release();
            }
        }

    }


    public class ThreadSafeList<T> {
        private List<T> list = new ArrayList<>();

        public synchronized void add(T element) {
            list.add(element);
        }

        public synchronized boolean contains(T element) {
            return list.contains(element);
        }

    }


    public static void main(String[] args) {
        ThreadSafeSet<Integer> threadSafeSet = new ThreadSafeSet<>();

        // Создаем и запускаем несколько потоков для добавления элементов в Set
        for (int i = 0; i < 5; i++) {
            final int element = i;
            new Thread(() -> {
                try {
                    threadSafeSet.add(element);
                    System.out.println("Добавлен элемент: " + element);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        // Поток для проверки наличия элемента в Set
        new Thread(() -> {
            try {
                int elementToCheck = 3;
                boolean containsElement = threadSafeSet.contains(elementToCheck);
                System.out.println("Элемент " + elementToCheck + " присутствует в Set: " + containsElement);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        ////////////////////

        List<Integer> synchronizedList = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        synchronized (synchronizedList) {
            synchronizedList.addAll(list);
        }

        // Проверка добавленных элементов
        System.out.println("Элементы в синхронизированном списке:");
        for (Integer num : synchronizedList) {
            System.out.println(num);
        }
    }
}