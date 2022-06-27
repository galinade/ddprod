package ru.netology.repository;

import ru.netology.manager.Product;

public class ProductRepository {

    protected Product[] prod = new Product[0];

    public void save(Product product) {

        int length = prod.length + 1;
        Product[] tmp = new Product[length];

        for (int i = 0; i < prod.length; i++) {
            tmp[i] = prod[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = product;

        prod = tmp;
    }


    public Product[] findAll() {
        return prod;
    }

    public Product[] removeById(int id) {
        //if (findById() == null) {
            throw new NotFoundException("Element with id: " + id + " not found");
        }
        int length = prod.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        //for (Product product : prod) {
         //   if (product.getId() != id) {
         //       tmp[index] = product;
          //      index++;
         //   }
      //  }
     //   prod = tmp;

        public Product[] findById(int id){
            for (Product product : prod) {
                if (product.getId() != id) {
                    return prod;
                }
            }
            return null;
        }


    }



