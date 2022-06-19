package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.Book;
import ru.netology.manager.Product;
import ru.netology.manager.ProductManager;
import ru.netology.manager.Smartphone;
import ru.netology.repository.ProductRepository;

public class ProductManagerTest {
    Book first = new Book(38, "Вечер", 24, "Петров");
    Book second = new Book(121, "Небо", 30, "Перов");
    Book third = new Book(123, "Вечереет", 55, "Чехов");
    Smartphone first1 = new Smartphone(143, "FDS51", 40, "Япония");
    Smartphone second1 = new Smartphone(1, "PPC51", 85, "Россия");
    Smartphone third1 = new Smartphone(121, "BBD", 32, "Германия");

    @Test

    public void searchByProd() {
        ProductRepository repo = new ProductRepository();

        ProductManager manager = new ProductManager(repo);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(first1);
        manager.add(second1);
        manager.add(third1);

        Product[] actual = manager.searchBy("PPC51");
        Product[] expected = {second1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void searchByProd1() {
        ProductRepository repo = new ProductRepository();

        ProductManager manager = new ProductManager(repo);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(first1);
        manager.add(second1);
        manager.add(third1);

        Product[] actual = manager.searchBy("Вечер");
        Product[] expected = {first, third};
        Assertions.assertArrayEquals(expected, actual);
    }
}
