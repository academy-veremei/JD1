/*
 * Lesson 5 ООП Задание 1
 *
 * 13.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.classwork.lesson5.task1_task2;

import java.util.Scanner;

public class Task1 {

    Scanner scanner = new Scanner(System.in);

    double totalPrice = 0;

    public static void main(String[] args) {
        Task1 task = new Task1();
        task.makeNewDeal();
    }

    /*
     * В методе создаются объекты продавец и покупатель, считываются и устанавливаются их имена,
     * для начала первой сделки запускается метод makeNewProduct().
     * По окончанию работы метода makeNewProduct() выводится вопрос начинать ли новую сделку.
     * Если выбран вариант ввести новую сделку, метод makeNewProduct() запускается снова.
     * Если выбран вариант вывода итоговой стоимости, на консоль выводится информация о продавце и
     * и покупателе а также итоговая сумма денег по всем сделкам.
     */
    private void makeNewDeal() {
        System.out.println("Введите имя продавца:");
        User seller = new User();
        seller.setUserName(scanner.nextLine());
        System.out.println("Введите имя покупателя:");
        User buyer = new User();
        buyer.setUserName(scanner.nextLine());
        boolean deal = true;
        int isNextDeal;
        do {
            makeNewProduct();
            System.out.println("Введите:");
            System.out.println("1 - Для ввода новой сделки.");
            System.out.println("2 - Для вывода итоговой стоимости всех сделок.");
            isNextDeal = scanner.nextInt();
            if (isNextDeal == 2) {
                break;
            }
        } while (deal);
        System.out.println("Покупатель: " + buyer.getUserName());
        System.out.println("Продавец: " + seller.getUserName());
        System.out.println("Итоговая стоимость всех сделок: " + totalPrice);
    }

    /*
     * В методе создается новый объект сделка. Название продукта заносится в строку productName
     * после чего идет проверка распространяется ли на продукт особая скидка.
     * Если на данный продукт есть особая скидка создается объект продукт(Apple, Huawei, Xiaomi) и рассчитывается
     * скидка для конкретного типа продукта.
     * Если на продукт не распространяется особая скидка создается стандартный объект продукт и
     * рассчитывается скидка для обычного товара.
     * Вводятся количество и цена продукта. По окончанию ввода продукта выводится вопрос будут ли еще продукты.
     * Если выбрано продолжение ввода, ввод товара начинается заново.
     * Если выбран вариант завершить сделку, на консоль выводится список товаров(Название, количество, цена) и
     * итоговая стоимость сделки.
     */
    private void makeNewProduct() {
        Deal deal = new Deal();
        int isNextProduct;
        String productName;
        do {
            System.out.println("Введите название товара:");
            productName = scanner.next();
            switch (productName) {
                case "Apple":
                    Apple apple = new Apple();
                    apple.setProductName(productName);
                    System.out.println("Введите количество товара:");
                    apple.setProductQuantity(scanner.nextInt());
                    System.out.println("Введите цену товара:");
                    apple.setProductPrice(scanner.nextInt());

                    deal.productListMaker(apple.getProductName(), apple.getProductQuantity(), apple.getProductPrice());
                    deal.setFinalCost(apple.productsCost());
                    break;
                case "Huawei":
                    Huawei huawei = new Huawei();
                    huawei.setProductName(productName);
                    System.out.println("Введите количество товара:");
                    huawei.setProductQuantity(scanner.nextInt());
                    System.out.println("Введите цену товара:");
                    huawei.setProductPrice(scanner.nextInt());

                    deal.productListMaker(huawei.getProductName(), huawei.getProductQuantity(), huawei.getProductPrice());
                    deal.setFinalCost(huawei.productsCost());
                    break;
                case "Xiaomi":
                    Xiaomi xiaomi = new Xiaomi();
                    xiaomi.setProductName(productName);
                    System.out.println("Введите количество товара:");
                    xiaomi.setProductQuantity(scanner.nextInt());
                    System.out.println("Введите цену товара:");
                    xiaomi.setProductPrice(scanner.nextInt());

                    deal.productListMaker(xiaomi.getProductName(), xiaomi.getProductQuantity(), xiaomi.getProductPrice());
                    deal.setFinalCost(xiaomi.productsCost());
                    break;
                default:
                    Product product = new Product();
                    product.setProductName(productName);
                    System.out.println("Введите количество товара:");
                    product.setProductQuantity(scanner.nextInt());
                    System.out.println("Введите цену товара:");
                    product.setProductPrice(scanner.nextInt());

                    deal.productListMaker(product.getProductName(), product.getProductQuantity(), product.getProductPrice());
                    deal.setFinalCost(product.productsCost());
                    break;
            }

            System.out.println("Введите:");
            System.out.println("1 - Для продолжения ввода товаров.");
            System.out.println("2 - Завершить сделку.");
            isNextProduct = scanner.nextInt();

        } while (isNextProduct != 2);
        totalPrice(deal.getFinalCost());
        for (int i = 0; i < deal.getProductList().size(); i++) {
            System.out.println(deal.getProductList().get(i));
        }
        System.out.println("Итоговая стоимость сделки:" + deal.getFinalCost());
    }

    private void totalPrice(double finalCost) {
        totalPrice = totalPrice + finalCost;
    }
}
