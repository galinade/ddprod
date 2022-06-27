package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.Book;
import ru.netology.manager.Product;
import ru.netology.manager.Smartphone;
import ru.netology.repository.NotFoundException;
import ru.netology.repository.ProductRepository;

public class ProductRepositoryTest {

    Book first = new Book(38, "Вечер", 24, "Петров");
    Book second = new Book(121, "Небо", 30, "Перов");
    Book third = new Book(123, "Вечереет", 55, "Чехов");
    Smartphone first1 = new Smartphone(143, "FDS51", 40, "Япония");
    Smartphone second1 = new Smartphone(1, "PPC51", 85, "Россия");
    Smartphone third1 = new Smartphone(121, "BBD", 32, "Германия");

    @Test
    public void muTest() {
        ProductRepository repo = new ProductRepository();
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(first1);
        repo.save(second1);
        repo.save(third1);
        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(-143);
        });
 //  @Test
       // public void muTest2() {
        //    ProductRepository repo = new ProductRepository();
            repo.save(first);
            repo.save(second);
            repo.save(third);
            repo.save(first1);
            repo.save(second1);
            repo.save(third1);
            Assertions.assertThrows(NotFoundException.class, () -> {
                repo.removeById(143);
            });


        }

        @Test
        public void muTest1() {

            ProductRepository repo = new ProductRepository();
            repo.save(first);
            repo.save(second);
            repo.save(third);
            repo.save(first1);
            repo.save(second1);
            repo.save(third1);

            repo.removeById(38);

            Product[] actual = repo.findAll();
            Product[] expected = {second, third, first1, second1, third1};
            Assertions.assertArrayEquals(expected, actual);


        }


    }

