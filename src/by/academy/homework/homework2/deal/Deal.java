package by.academy.homework.homework2.deal;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deal {
    private User seller;
    private User buyer;
    private double dealCost;
    Date deadlineDate;

    StringBuilder stringBuilder = new StringBuilder();
    Scanner scanner = new Scanner(System.in);

    public Deal() {
        super();
        deadlineDate = new Date();
    }

    public Deal(Date deadlineDate) {
        super();
        this.deadlineDate = deadlineDate;
    }

    public Date getDeadlineDate() {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(deadlineDate);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        return calendar.getTime();
    }

    /*
     * Начало новой сделки. Создаются объекты продавец и покупатель, метод inputUserData() класса User принимает
     * информацию о пользователе(Имя, дата рождения, номер телефона, адрес электронной почты) и проводит их валидацию.
     * Ввод продолжается пока не будет правильно заполнена вся информация о юзерах.
     *
     * Метод newProduct() запускает ввод товаров.
     */
    public void startDeal() {
        this.seller = new User();
        seller.inputUserData("продавца");

        this.buyer = new User();
        buyer.inputUserData("покупателя");

        newProduct();
    }

    /*
     * Метод осущесвляет ввод товаров. Сначала вводится имя товара, проверяется является ли товар одним из типов
     * продуктов на которые рассчитывается особая скидка(Apple, Huawei, Xiaomi) или же это обычный товар, создается
     * соответствующий объект. После каждого введенного товара нужно выбрать продолжать ввод товаров или завершить сделку.
     * При выборе варианта завершить сделку на консоль выводится информация о введенных продуктах(Название, количество,
     * цена, сумма) и общая сумма по сделке. Запускается метод productMenu() для редактирования сделки.
     */
    public void newProduct() {
        int isNextProduct;
        do {
            System.out.println("Введите название товара:");
            String productName = scanner.next();

            switch (productName) {
                case "Apple":
                    productApple(productName);
                    break;
                case "Huawei":
                    productHuawei(productName);
                    break;
                case "Xiaomi":
                    productXiaomi(productName);
                    break;
                default:
                    productDefault(productName);
                    break;
            }
            System.out.println("Введите:\n" + "1 - Для продолжения ввода товаров.\n" + "2 - Для окончания ввода.");
            isNextProduct = scanner.nextInt();

        } while (isNextProduct != 2);
        checkCart();
        productMenu();
    }

    /*
     * При выборе варианта "добавить товары" перезапускается метод newProduct(), новые продукты добавляются
     * к существующим.
     *
     * При выборе варианта "удалить товары" запускается метод deleteFromCart(), вводится название товара который нужно
     * удалить, товар удаляется, пересчитывается итоговая сумма по сделке и выводится новый список товаров.
     * Метод productMenu() перезапускается.
     *
     * При выборе варианта "завершить сделку" программа возвращается в метод startNewDeal() класса Main для ввода новой
     * сделки или вывода итогового чека.
     */
    public void productMenu() {
        System.out.println("Введите:\n" + "1 - Для того чтобы добавить товары\n" + "2 - Для того чтобы удалить товары\n"
                + "3 - Завершить сделку\n");

        int productMenu = scanner.nextInt();
        if (productMenu == 1) {
            newProduct();
        } else if (productMenu == 2) {
            deleteFromCart();
            checkCart();
            productMenu();
        }
        if (productMenu == 3) {
            return;
        }
    }

    /*
     * Объекты продуктов
     *
     * Методы для создания новых товаров разных типов и заполнения информации о них.
     */

    public void productApple(String productName) {
        Apple apple = new Apple();
        apple.setProductName(productName);

        System.out.println("Введите количество товара:");
        apple.setProductQuantity(scanner.nextInt());

        System.out.println("Введите цену товара:");
        apple.setProductPrice(scanner.nextInt());

        addToCart(apple.getProductName(), apple.getProductQuantity(), apple.getProductPrice(), apple.productsCost());
    }

    public void productHuawei(String productName) {
        Huawei huawei = new Huawei();
        huawei.setProductName(productName);

        System.out.println("Введите количество товара:");
        huawei.setProductQuantity(scanner.nextInt());

        System.out.println("Введите цену товара:");
        huawei.setProductPrice(scanner.nextInt());

        addToCart(huawei.getProductName(), huawei.getProductQuantity(), huawei.getProductPrice(), huawei.productsCost());
    }

    public void productXiaomi(String productName) {
        Xiaomi xiaomi = new Xiaomi();
        xiaomi.setProductName(productName);

        System.out.println("Введите количество товара:");
        xiaomi.setProductQuantity(scanner.nextInt());

        System.out.println("Введите цену товара:");
        xiaomi.setProductPrice(scanner.nextInt());

        addToCart(xiaomi.getProductName(), xiaomi.getProductQuantity(), xiaomi.getProductPrice(), xiaomi.productsCost());
    }

    public void productDefault(String productName) {
        Product product = new Product();
        product.setProductName(productName);

        System.out.println("Введите количество товара:");
        product.setProductQuantity(scanner.nextInt());

        System.out.println("Введите цену товара:");
        product.setProductPrice(scanner.nextInt());

        addToCart(product.getProductName(), product.getProductQuantity(), product.getProductPrice(), product.productsCost());
    }

    /*
     * Работа с корзиной товаров
     * (Попытка сделать ввод неограниченного числа товаров не используя коллекции :) )
     *
     * 1. Метод addToCart() добавляет информацию о товаре в StringBuilder.
     *
     * 2. Метод deleteFromCart(). Вводится название продукта который необходимо удалить, идет поиск товара по паттерну:
     *                 "Название:<введенное название> Колличество:* Цена:* Сумма:* "
     * находятся начало и конец строки с товаром и товар удаляется, выводится сообщение "Товар удален", если
     * продукт с таким названием не находится, выводится сообщение "Такого товара нет".
     *
     * 3. Метод checkCart(). При вызове метода происходит поиск товаров по паттерну:
     * "Название:<Название на русском или английском> Колличество:<число> Цена:<число с плав.точкой>
     * Сумма:<число с плав.точкой> "
     * Значение "Сумма:<число с плав.точкой>" парсится в double и подсчитывается итоговая сумма по сделке.
     */

    public void addToCart(String name, long quantity, double price, double productCost) {
        stringBuilder.append(" ").append("Название:").append(name).append(" ").append("Колличество:").append(quantity).append(" ")
                .append("Цена:").append(price).append(" ").append("Сумма:").append(productCost).append("\n");
    }

    public void deleteFromCart() {
        System.out.println("Введите название товара который хотите удалить:");
        String string = scanner.next();
        Pattern patternDelProduct = Pattern.compile("([а-яА-Я]+[:])" + string + " ([а-яА-Я]+[:])([\\d]+) " +
                "([а-яА-Я]+[:])([\\d]+[.][\\d]+) ([а-яА-Я]+[:])([\\d]+[.][\\d]+)");
        Matcher matcherDelProduct = patternDelProduct.matcher(stringBuilder);
        if (matcherDelProduct.find()) {
            stringBuilder.delete(matcherDelProduct.start(), matcherDelProduct.end());
            System.out.println("Товар удалён.");
        } else {
            System.out.println("Такого товара нет.");
        }
    }

    public void checkCart() {
        Pattern patternProduct = Pattern.compile("([а-яА-Я]+[:])([а-яА-Я]+|[a-zA-Z+]+) ([а-яА-Я]+[:])([\\d]+) " +
                "([а-яА-Я]+[:])([\\d]+[.][\\d]+) ([а-яА-Я]+[:])([\\d]+[.][\\d]+)");
        Matcher matcherProduct = patternProduct.matcher(stringBuilder);
        dealCost = 0;
        while (matcherProduct.find()) {
            System.out.println(matcherProduct.group(0));
            dealCost += Double.parseDouble(matcherProduct.group(8));
        }
        System.out.println("Итоговая сумма по сделке: " + dealCost);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Продавец:\n").append(seller.toString()).append("\nПокупатель:\n").append(buyer.toString())
                .append("\nСписок товаров:\n").append(this.stringBuilder).append("\nИтоговая цена: ").append(dealCost)
                .append("\nСделку необходимо завершить до: ").append(getDeadlineDate());
        return stringBuilder.toString();
    }

}
