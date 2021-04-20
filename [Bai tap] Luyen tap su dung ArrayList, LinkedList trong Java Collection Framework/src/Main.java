import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManament productManament = new ProductManament();
        do {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm mảng Array List");
            System.out.println("3. Hiển thị sản phẩm mảng Linked List");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Sửa thông tin sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm");
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
                    productManament.removeProduct();
                    break;
                }
                case 5: {
                    productManament.fixProduct();
                    break;
                }
                case 6:{
                    productManament.sortArray();
                    break;
                }
            }
        } while (true);


    }


}
