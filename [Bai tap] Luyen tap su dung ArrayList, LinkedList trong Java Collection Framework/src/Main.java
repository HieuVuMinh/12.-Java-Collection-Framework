import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            ProductManament productManament = new ProductManament();
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm mảng Array List");
            System.out.println("3. Hiển thị sản phẩm mảng Linked List");
            int selection = sc.nextInt();
            switch (selection) {
                case 1: {
                    productManament.addProduct();
                    break;
                }
                case 2: {
                    productManament.displayProductList();
                    break;
                }
                case 3: {
                    productManament.displayProductLinkedList();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
        } while (true);


    }
}
