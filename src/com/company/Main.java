package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberProduct = 3;
        Product[] products = new Product[numberProduct];

        Scanner in = new Scanner(System.in);
        for (int i=0; i<numberProduct; i++) {
            products[i] = new Product();
            System.out.println("Product "+(i+1));
            System.out.print("Input Id: ");
            products[i].setId(Integer.parseInt(in.nextLine()));
            System.out.print("Input Name: ");
            products[i].setName(in.nextLine());
            System.out.print("Input Price: ");
            products[i].setPrice(Double.parseDouble(in.nextLine()));
            System.out.print("Input Discount (%): ");
            products[i].setDiscount(Integer.parseInt(in.nextLine()));
        }

        System.out.println("before sort");
        for (Product product : products) {
            System.out.println(product.Print());
        }

        System.out.println("after sort");
        Product[] productAfterSort = Product.sortByPrice(products);
        for (Product product : productAfterSort) {
            System.out.println(product.Print());
        }
    }
}
