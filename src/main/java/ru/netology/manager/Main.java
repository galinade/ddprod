package ru.netology.manager;

import ru.netology.repository.ProductRepository;

public class Main {


    public static void main(String[] args) {
        Book first = new Book(38, "Вечер", 24, "Петров");
        Book second = new Book(12, "Небо", 30, "Перов");
        Book third = new Book(123, "Вечереет", 55, "Чехов");
        Smartphone first1 = new Smartphone(143, "FDS51", 40, "Япония");
        Smartphone second1 = new Smartphone(1, "PPC51", 85, "Россия");
        Smartphone third1 = new Smartphone(111, "BBD", 32, "Германия");

        ProductRepository repo = new ProductRepository();
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(first1);
        repo.save(second1);
        repo.save(third1);

        repo.removeById(12);
        Product[] all = repo.findAll();


    }
}







