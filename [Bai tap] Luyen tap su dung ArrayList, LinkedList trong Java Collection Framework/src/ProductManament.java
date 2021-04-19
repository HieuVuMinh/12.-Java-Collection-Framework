import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManament {
    Scanner sc = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();
    LinkedList<Product> productLinkedList = new LinkedList<>();

    public ProductManament() {
        Product product1 = new Product("Yamaha YZF R1", "Y1", 22.295);
        Product product2 = new Product("Panigale v4s", "P1", 17.399);
        // add arrayList
        productList.add(product1);
        productList.add(product2);
        // add linkedList
        productLinkedList.add(product1);
        productLinkedList.add(product2);

    }
    // Hiển thị danh sách sản phẩm Array List
    public void displayProductList() {
        for (Product pr : productList) {
            System.out.println(pr);
        }
    }

    // Hiển thị danh sách sản phẩm Linked List
    public void displayProductLinkedList() {
        for (Product pr : productLinkedList) {
            System.out.println(pr);
        }
    }

    // Thêm sản phẩm
    public void addProduct() {
        System.out.println("1. Thêm vào Array List");
        System.out.println("2. Thêm vào Linked List");
        int selection = sc.nextInt();
        switch (selection) {
            case 1: {
                Product product = inputInfoProduct();
                productList.add(product);
                break;
            }
            case 2: {
                Product product = inputInfoProduct();
                productLinkedList.add(product);
                break;
            }
        }
    }

    private Product inputInfoProduct() {
        sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập id sản phẩm: ");
        String id = sc.nextLine();
        System.out.println("Nhập giá tiền: ");
        double price = sc.nextDouble();
        Product product = new Product(name, id, price);
        return product;
    }


}
