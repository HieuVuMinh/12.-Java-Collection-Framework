import java.util.*;

public class ProductManament {
    public static final String inputIdProduct = "Nhập id sản phẩm: ";
    public static final String addArrayList = "1. Thêm vào Array List";
    public static final String addLinkedList = "2. Thêm vào Linked List";
    public static final String inputNameProduct = "Nhập tên sản phẩm: ";
    public static final String inputPriceProduct = "Nhập giá tiền: ";
    public static final String removeProductInArrayList = "1. Xóa product trong Array List";
    public static final String removeProductInLinkedList = "2. Xóa product trong Linked List";
    public static final String notFoundProduct = "Không tìm thấy sản phẩm tương ứng";
    public static final String fixInfoProductInArrayList = "1. Sửa thông tin sản phẩm mảng Array List";
    public static final String fixInfoProductInLinkedList = "2. Sửa thông tin sản phẩm mảng Linked List";
    public static final String fixNameProduct = "1. Sửa tên sản phẩm";
    public static final String fixIdProduct = "2. Sửa mã sản phẩm";
    public static final String fixPricrProduct = "3. Sửa giá sản phẩm";
    public static final String inputNameAgain = "Nhập lại tên: ";
    public static final String inputIdAgain = "Nhập lại mã: ";
    public static final String inputPriceAgain = "Nhập lại giá: ";
    public static final String sortProductInArrayList = "1. Sắp xếp mảng Array List giảm dần theo giá";
    public static final String sortProductInLinkedList = "2. Sắp xếp mảng Linked List tăng dần theo giá";
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

    // Nhập ID sản phẩm
    private static String inputID(Scanner sc) {
        sc.nextLine();
        System.out.println(inputIdProduct);
        return sc.nextLine();
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
        System.out.println(addArrayList);
        System.out.println(addLinkedList);
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
        System.out.println(inputNameProduct);
        String name = sc.nextLine();
        System.out.println(inputIdProduct);
        String id = sc.nextLine();
        System.out.println(inputPriceProduct);
        double price = sc.nextDouble();
        Product product = new Product(name, id, price);
        return product;
    }

    // Xóa product trong array
    public void removeProduct() {
        System.out.println(removeProductInArrayList);
        System.out.println(removeProductInLinkedList);
        int selection = sc.nextInt();
        switch (selection) {
            case 1: {
                String id = inputID(sc);
                removeProductArrayList(id);
                break;
            }
            case 2: {
                String id = inputID(sc);
                removeProductLinkedList(id);
                break;
            }
        }
    }

    // Xóa phần tử mảng Array List theo id
    public void removeProductArrayList(String id) {
        Product product = findElementArrayListById(id);
        if (product == null) {
            System.out.println(notFoundProduct);
        } else {
            productList.remove(product);
        }
    }

    public Product findElementArrayListById(String id) {
        int count = -1;
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if ((product.getId()).equals(id)) {
                count = i;
                break;
            }
        }
        if (count == -1) {
            return null;
        } else {
            return productList.get(count);
        }
    }

    // Xóa phần tử mảng Linked List theo id
    public void removeProductLinkedList(String id) {
        Product product = findElementLinkedListById(id);
        if (product == null) {
            System.out.println(notFoundProduct);
        } else {
            productList.remove(product);
        }
    }

    public Product findElementLinkedListById(String id) {
        int count = -1;
        for (int i = 0; i < productLinkedList.size(); i++) {
            Product product = productLinkedList.get(i);
            if ((product.getId()).equals(id)) {
                count = i;
                break;
            }
        }
        if (count == -1) {
            return null;
        } else {
            return productLinkedList.get(count);
        }
    }

    // Sửa thông tin sản phẩm
    public void fixProduct() {
        System.out.println(fixInfoProductInArrayList);
        System.out.println(fixInfoProductInLinkedList);
        int selection = sc.nextInt();
        switch (selection) {
            case 1: {
                String id = inputID(sc);
                fixProductArrayList(id);
                break;
            }
            case 2: {
                String id = inputID(sc);
                fixProductLinkedList(id);
                break;
            }
        }
    }

    // Sửa thông tin sản phẩm mảng Array List
    public void fixProductArrayList(String id) {
        Product product = findElementArrayListById(id);
        fixProductById(product);
    }

    // Sửa thông tin sản phẩm mảng Array List
    public void fixProductLinkedList(String id) {
        Product product = findElementLinkedListById(id);
        fixProductById(product);
    }

    private void fixProductById(Product product) {
        if (product == null) {
            System.out.println(notFoundProduct);
        } else {
            System.out.println(fixNameProduct);
            System.out.println(fixIdProduct);
            System.out.println(fixPricrProduct);
            int selection = sc.nextInt();
            switch (selection) {
                case 1: {
                    sc.nextLine();
                    System.out.println(inputNameAgain);
                    String name = sc.nextLine();
                    product.setName(name);
                    break;
                }
                case 2: {
                    sc.nextLine();
                    System.out.println(inputIdAgain);
                    String code = sc.nextLine();
                    product.setId(code);
                    break;
                }
                case 3: {
                    sc.nextLine();
                    System.out.println(inputPriceAgain);
                    double price = sc.nextDouble();
                    product.setPrice(price);
                }
            }
        }
    }
    // Sắp xếp mảng
    public void sortArray(){
        System.out.println(sortProductInArrayList);
        System.out.println(sortProductInLinkedList);
        int selection = sc.nextInt();
        switch (selection){
            case 1:{
                sortArrayList();
                break;
            }
            case 2:{
                sortLinkedList();
                break;
            }
        }
    }

    // Sắp xếp mảng Array List dần theo giá
    public void sortArrayList(){
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()){
                    return 1;
                } else {
                    if (o1.getPrice() == o2.getPrice()){
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        displayProductList();
    }
    // Sắp xếp mảng Linked List giảm dần
    public void sortLinkedList(){
        Collections.sort(productLinkedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()){
                    return -1;
                } else {
                    if (o1.getPrice() == o2.getPrice()){
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });
        displayProductLinkedList();
    }
}
