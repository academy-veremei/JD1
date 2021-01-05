package by.academy.homework.homework2.deal;

import java.util.*;

public class Deal {
    private User seller;
    private User buyer;
    private double dealCost;
    Date deadlineDate;

    StringBuilder stringBuilder = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> shoppingCart = new ArrayList<>();
    ArrayList<String> productId = new ArrayList<>();

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
        printCart();
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
     * При выборе варианта "завершить сделку" запускается метод checkCart() для формирования чека по сделке и программа
     * возвращается в метод startNewDeal() класса Main для ввода новой сделки или вывода итогового чека.
     */
    public void productMenu() {
        System.out.println("Введите:\n" + "1 - Для того чтобы добавить товары\n" + "2 - Для того чтобы удалить товары\n"
                + "3 - Завершить сделку\n");

        int productMenu = scanner.nextInt();
        if (productMenu == 1) {
            newProduct();
        } else if (productMenu == 2) {
            deleteFromCart();
            productMenu();
        }
        if (productMenu == 3) {
            checkCart();
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

        addToCart(apple.getProductName(), apple);
    }

    public void productHuawei(String productName) {
        Huawei huawei = new Huawei();
        huawei.setProductName(productName);

        System.out.println("Введите количество товара:");
        huawei.setProductQuantity(scanner.nextInt());

        System.out.println("Введите цену товара:");
        huawei.setProductPrice(scanner.nextInt());

        addToCart(huawei.getProductName(), huawei);
    }

    public void productXiaomi(String productName) {
        Xiaomi xiaomi = new Xiaomi();
        xiaomi.setProductName(productName);

        System.out.println("Введите количество товара:");
        xiaomi.setProductQuantity(scanner.nextInt());

        System.out.println("Введите цену товара:");
        xiaomi.setProductPrice(scanner.nextInt());

        addToCart(xiaomi.getProductName(), xiaomi);
    }

    public void productDefault(String productName) {
        Product product = new Product();
        product.setProductName(productName);

        System.out.println("Введите количество товара:");
        product.setProductQuantity(scanner.nextInt());

        System.out.println("Введите цену товара:");
        product.setProductPrice(scanner.nextInt());

        addToCart(product.getProductName(), product);
    }

    /*
     * Работа с корзиной товаров (Через ArrayList)
     *
     * 1. Метод addToCart() добавляет имя товара в ArrayList productId и сам товар в ArrayList shoppingCart.
     *
     * 2. Метод deleteFromCart(). Вводится название продукта который необходимо удалить, при помощи метода contains
     * идет поиск товара по названию в листе productId, если товар с таким именем существует, товар удаляется из
     * shoppingCart по индексу из productId затем удаляется из самого productId, выводится сообщение "Товар удален".
     * Если продукт с таким названием не находится, выводится сообщение "Такого товара нет".
     * Метод printCart() выводит список товаров и итоговую сумму по сделке.
     *
     * 3. Метод checkCart(). При вызове метода происходит формирование итогового чека по сделке.
     */

    public void addToCart(String name, Product product) {
        productId.add(name);
        shoppingCart.add(product);
    }

    public void deleteFromCart() {
        System.out.println("Введите название товара который хотите удалить:");
        String string = scanner.next();
        if (productId.contains(string)) {
            shoppingCart.remove(productId.indexOf(string));
            productId.remove(string);
            System.out.println("Товар удалён.");
        } else {
            System.out.println("Такого товара нет.");
        }
        printCart();
    }

    public void printCart() {
        dealCost = 0;
        for (int i = 0; i < productId.size(); i++) {
            System.out.println("Название: "+shoppingCart.get(i).productName+" Количество: "
                    +shoppingCart.get(i).productQuantity+" Цена: "+shoppingCart.get(i).productPrice+" Сумма: "
                    +shoppingCart.get(i).productsCost());
            dealCost += shoppingCart.get(i).productsCost();
        }
        System.out.println("Итоговая сумма по сделке: " + dealCost);
    }

    public void checkCart(){
        dealCost = 0;
        for (int i = 0; i < productId.size(); i++) {
            stringBuilder.append(" ").append("Название:").append(shoppingCart.get(i).productName)
                    .append(" ").append(" Количество:").append(shoppingCart.get(i).productQuantity)
                    .append(" ").append(" Цена:").append(shoppingCart.get(i).productPrice)
                    .append(" ").append(" Сумма:").append(shoppingCart.get(i).productsCost()).append("\n");
            dealCost += shoppingCart.get(i).productsCost();
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
