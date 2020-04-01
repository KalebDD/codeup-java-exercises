
class Product {

     int productID;
     String productName;
     int productPrice;


    // Constructor
    public Product() {
        System.out.println("Object constructed successfully");
    }

    // Setters and getters for id, name, and price. required if access modifier is set to private
    void setProductID(int pid) {
        this.productID = pid;
    }

    int getProductID() {
        return productID;
    }

    void setProductName(String name) {
        this.productName = name;
    }

    String getProductName() {
        return productName;
    }

    void setProductPrice(int price) {
        this.productPrice = price;
    }

    int getProductPrice() {
        return productPrice;
    }

    // Setter for product details - setting values of whatever object we create for product
    void setProductDetails(int pid, String name, int price) {
        this.productID = pid;
        this.productName = name;
        this.productPrice = price;
    }


    // Read data from product object
    void showProductDetails() {
        System.out.println("-----Product ID: "+productID+"-----");

        System.out.println("Name: "+productName);
        System.out.println("Price: "+productPrice);

        System.out.println("-----------------------");
    }
}

// Let's extend the product class - we'll use the already established variables, and add some specific ones
class Mobile extends Product {

    // additional attributes specific to mobile
    String os;
    int ram;
    int sdCardSize;

    // Set constructor for object
    public Mobile() {
        System.out.println("Mobile object created.");
    }

    // We've redefined the same method from the parent into the child with different inputs
    // We now have 2 methods in the child, 1 from Parent and 1 from Child
    // both are different even though the name is the same
    // Method Overloading! same method name, different parameters
    void setProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize) {
        this.productID = pid;
        this.productName = name;
        this.productPrice = price;
        this.os = os;
        this.ram = ram;
        this.sdCardSize = sdCardSize;
    }

    // We need to redefine showProductDetails to output child show
    // METHOD OVERRIDING! Very useful concept - will only output the child method
    void showProductDetails() {
        System.out.println("-----Product ID: "+productID+"-----");

        System.out.println("Name: "+productName);
        System.out.println("Price: "+productPrice);
        System.out.println("OS: "+os);
        System.out.println("Ram: "+ram);
        System.out.println("SD Card Size: "+sdCardSize);

        System.out.println("-----------------------");
    }

}

public class PersonalPractice {

    // Main is executed whenever JVM runs
    public static void main(String[] args) {

        // Creating the object!
        Product product1 = new Product();
        // Product1 is not an object - it's a reference variable pointing to location in memory

        // Writing data in object!
        product1.setProductDetails(101, "iPhone", 1000);

        // Showing object!
        product1.showProductDetails();

        // We can write the data directly
        Product product2 = new Product();
        // error after setting access modifier on attributes to private - good habit to set it as private so users cannot access
        product2.setProductID(201);
        product2.setProductName("Nike Shoes");
        product2.setProductPrice(250);

        product2.showProductDetails();

        //Requesting to get Mobile Object constructed!
        Mobile mobile = new Mobile();
        // Product object gets constructed before Mobile Object
        // We have parent Object constructed before child (mobile) object - rule to inheritance (object to object)

        mobile.setProductDetails(301, "iPhoneX", 3000, "iOS", 4, 128);
        mobile.showProductDetails();


    }
}
