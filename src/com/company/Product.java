package com.company;

public class Product {
    int Id;
    String Name;
    Double Price;
    int discount;

    public Product() {

    }
    public Product(int id, String name, Double price, int discount) {
        Id = id;
        Name = name;
        Price = price;
        this.discount = discount;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String Print() {
        String content;
        content = this.getId() + " - " + this.getName() + " - " + this.getPrice() + " - " + this.getDiscount();
        return content;
    }

    public Double getRealPrice() {
        return (this.getPrice()*this.getDiscount())/100;
    }

    public static Product[] sortByPrice(Product[] products) {
        for (int i=0; i<products.length-1; i++) {
            for (int j=i+1; j<products.length; j++) {
                if (products[i].getPrice() > products[j].getPrice()) {
                    Product tmp;
                    tmp = products[j];
                    products[j] = products[i];
                    products[i] = tmp;
                }
            }
        }
        return products;
    }
}
