package by.academy.homework.homework2.deal;

/*
 * Метод fillCheck() добавляет в StringBuilder номер сделки по значению переменной counter и данные по сделкам(Информация
 * о покупателе и продавце,список товаров,сумма по сделке)
 *
 * Метод getCheck() возвращает итоговый чек по всем проведенным сделкам(Номер сделки,информация о покупателе и продавце,
 * список товаров,сумма по сделке).
 */
public class Check {
    StringBuilder stringBuilder = new StringBuilder();
    private int counter = 1;

    public void fillCheck(String string) {
        stringBuilder.append("\nСделка № ").append(counter).append(":\n").append(string);
        counter++;
    }

    public String getCheck() {
        String check = stringBuilder.toString();
        return check;
    }
}
