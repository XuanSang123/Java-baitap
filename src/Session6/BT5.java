package Session6;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productStatusDisplay;
        String productId = "";
        String productName = "";
        float price = 0.0f;
        int productStatus;
        LocalDate date;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.println("Input productId");
            productId = sc.nextLine();
            boolean checkProductId = Pattern.matches("^[CSA][0-9]*$", productId);
            if (!checkProductId) {
                System.out.println("gồm 4 ký tự bắt đầu là một trong 3 ký tự (C: các đồ uống là café, S: các đồ uống là sinh tố, A: các đồ ăn nhanh)");
            } else break;
        }
        while (true) {
            System.out.println("Input productName");
            productName = sc.nextLine();
            if (productName.length() < 10 || productName.length() > 50) {
                System.out.println("tên sản phẩm đồ uống có từ 10-50 ký tự.");
            } else break;
        }
        while (true) {
            System.out.println("Input price");
            price = sc.nextFloat();
            if (price < 0) {
                System.out.println("Price >0");
            } else break;
        }

        System.out.println("Input proct catalog");
        String catalogName = sc.nextLine();

//        while (true) {
//            System.out.println("Input date (dd/mm/yyyy)");
//            String inputDate = sc.nextLine().trim();
//            try{
//                date=LocalDate.parse(inputDate, formatter);
//                break;
//            }catch(DateTimeParseException e){
//                System.out.println("invalid date format");
//            }
//        }
        while (true) {
            System.out.println("Input date (dd/mm/yyyy): ");
            String inputDate = sc.nextLine().trim();
            try {
                date = LocalDate.parse(inputDate, formatter);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter date in dd/mm/yyyy format.");
            }
        }

        while (true) {
            System.out.println("Input productStatus (0: Đang bán – 1: Hết hàng – 2: Không bán): ");
            String productStatusInput = sc.nextLine();
            if (Pattern.matches("[012]", productStatusInput)) {
                productStatus = Integer.parseInt(productStatusInput);
                switch (productStatus) {
                    case 0:
                        productStatusDisplay = "Đang bán";
                        break;
                    case 1:
                        productStatusDisplay = "Hết hàng";
                        break;
                    case 2:
                        productStatusDisplay = "Không bán";
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        continue;
                }
                break;
            } else {
                System.out.println("Invalid input. Please enter 0, 1, or 2.");
            }
        }
        System.out.printf("Product details:\n");
        System.out.printf("ProductId: %s\n", productId);
        System.out.printf("ProductName: %s\n", productName);
        System.out.printf("Price: %.2f\n", price);
        System.out.printf("CatalogName: %s\n", catalogName);
        System.out.printf("Date: %s\n", date.format(formatter));
        System.out.printf("ProductStatus: %d - %s\n", productStatus, productStatusDisplay);
    }
}
