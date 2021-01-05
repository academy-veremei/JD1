package by.academy.classwork.lesson6;

import java.util.Scanner;

public class StringSolver {
    private String[] stringsArray;
    private int k;

    Scanner scanner = new Scanner(System.in);

    public void input() {
        System.out.println("Количество строк");
        int arraySize = scanner.nextInt();
        this.stringsArray = new String[arraySize];
        for (int i = 0; i < arraySize; i++) {
            stringsArray[i] = scanner.next();
        }
        scanner.close();
    }

    public void output(String[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        System.out.println();
    }

    public void output(String args) {
        System.out.println(args);
        System.out.println();
    }

    public void Task1() {
        String longest = "";
        String shortest = stringsArray[0];
        for (String s : stringsArray) {
            if (shortest.length() > s.length()) {
                shortest = s;
            }
            if (longest.length() < s.length()) {
                longest = s;
            }
        }
        output("Самая короткая строка " + shortest + " длинной " + shortest.length());
        output("Самая длинная строка " + longest + " длинной " + longest.length());
    }

    public void Task2() {
        String bubbleSort;
        System.out.println("Сортировка по возрастанию");
        for (int i = stringsArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (stringsArray[j].length() > stringsArray[j + 1].length()) {
                    bubbleSort = stringsArray[j];
                    stringsArray[j] = stringsArray[j + 1];
                    stringsArray[j + 1] = bubbleSort;
                }
            }
        }
        output(stringsArray);

        System.out.println("Сортировка по убыванию");
        for (int i = stringsArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (stringsArray[j].length() < stringsArray[j + 1].length()) {
                    bubbleSort = stringsArray[j];
                    stringsArray[j] = stringsArray[j + 1];
                    stringsArray[j + 1] = bubbleSort;

                }
            }
        }
        output(stringsArray);
    }

    public void Task3() {
        int mean = 0;
        for (int i = 0; i < stringsArray.length; i++) {
            mean += stringsArray[i].length();
        }
        mean = mean / stringsArray.length;

        output("Строки с длинной больше средней:");
        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i].length() > mean) {
                output("строка: " + stringsArray[i] + " длинной: " + stringsArray[i].length());
            }
        }
        output("Строки с длинной меньше средней:");
        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i].length() < mean) {
                output("строка: " + stringsArray[i] + " длинной: " + stringsArray[i].length());
            }
        }
    }

    public void Task4() {
        int indexMinUnique = -1;
        int minUniqueChars = Integer.MAX_VALUE;

        for (int i = 0; i < stringsArray.length; i++) {
            int currentUniqueCounter = 0;
            char[] cArr = new char[65538];
            for (char c : stringsArray[i].toCharArray()) {
                cArr[c]++;
            }
            for (char c : cArr) {
                if (c > 0) {
                    currentUniqueCounter++;
                }
            }
            if (currentUniqueCounter < minUniqueChars) {
                minUniqueChars = currentUniqueCounter;
                indexMinUnique = i;
            }
        }
        System.out.println(stringsArray[indexMinUnique]);
    }

    public int similarSymbolsCounter(String string) {
        int similarCount = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    similarCount++;
                }
            }
        }
        return similarCount - string.length();
    }

    private boolean isLat(String string) {
        return string.matches("[a-zA-Z]+");
    }

    private boolean isConcide(String string) {
        int vocal = 0;
        int consonant = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.matches("[aeiouy]")) {
                vocal++;
            }
            if (string.matches("[bcdfghjklmnpqrstvwxz]")) {
                consonant++;
            }
        }
        if (vocal == consonant) {
            return true;
        } else {
            return false;
        }
    }

    public void Task5() {
        int concide = 0;
        for (int i = 0; i < stringsArray.length; i++) {
            if (isLat(stringsArray[i]) & isConcide(stringsArray[i].toLowerCase())) {
                concide++;
            }
        }
        System.out.println("Количество слов введенных латиницей в которых число гласных и согласных совпадает: " + concide);
    }

    private boolean vozrostanie(String string) {
        int count = 1;
        boolean rastet = false;
        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            if (Character.getNumericValue(ch[i]) < Character.getNumericValue(ch[i + 1])) {
                count++;
            }
        }
        if (count == string.length()) {
            rastet = true;
        } else {
            rastet = false;
        }
        return rastet;
    }

    public void Task6() {
        for (int i = 0; i < stringsArray.length; i++) {
            if (vozrostanie(stringsArray[i])) {
                System.out.println(stringsArray[i]);
                return;
            }
        }
        System.out.println("Слова, символы в котором идут в строгом порядке возрастания их кодов не обнаружено.");
    }

    private boolean Task7(String string) {
        boolean raznye = false;
        int counter = 0;
        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    counter++;
                }
            }
        }
        System.out.println("финал щелк" + counter);
        return false;
    }

    public void Task7() {
        for (int i = 0; i < stringsArray.length; i++) {
            if (Task7(stringsArray[i])) {
                System.out.println("Слово " + stringsArray[i]);
                return;
            }
            System.out.println("Слов состоящих только из различных символов не обнаружено");

        }
    }

    public void Task8() {
        String word = "there were not such words";
        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i].matches("[0-9]+")) {
                boolean temp = true;
                for (int j = 0; j < stringsArray[i].length() / 2; j++) {
                    if (stringsArray[i].charAt(j) != stringsArray[i].charAt(stringsArray[i].length() - j - 1)) {
                        temp = false;
                        break;
                    }
                }
                if (temp) {
                    word = stringsArray[i];
                    break;
                }
            }
        }
    }

    public void Task10() {
        int count = 0;
        if (-10000 > k & k < 0) {
            count++;
        }
        if (k > 0 & k < 5) {
            count = count + 2;
        }
        if (k > 5 & k < 10) {
            count = count + 3;
        }
        if (k > 10 & k < 10000) {
            count = count + 4;
        }
        switch (count) {
            case 1:
                System.out.println("Число в диапазоне [-10к,0]");
                break;
            case 2:
                System.out.println("Число в диапазоне [0,5]");
                break;
            case 3:
                System.out.println("Число в диапазоне [5,10]");
                break;
            case 4:
                System.out.println("Число в диапазоне [10,10к]");
                break;
            default:
                System.out.println("Число не соответстует ни одному из диапазонов");
                break;
        }

    }

    public void Task11() {
        int count = 0;
        if (k > -10000 && k < 5) {
            count++;
        }
        if (k > 0 && k < 10) {
            count += 2;
        }
        if (k > 5 && k < 15) {
            count += 3;
        }
        if (k > 10 && k < 10000) {
            count += 4;
        }
        switch (count) {
            case 1:
                System.out.println("Число в диапазоне [-10,5]");
                break;
            case 2:
                System.out.println("Число в диапазоне [0,10]");
                break;
            case 3:
                System.out.println("Число в диапазоне [5,15]");
                break;
            case 4:
                System.out.println("Число в диапазоне [10,10k]");
                break;
            default:
                System.out.println("Число не соответствует ни одному из диапазонов");
                break;

        }
    }

    public void Task12(){
        int k = 1;
        for (int i = 0; i < 5;i++){
            for (int j = 0; j < 5;j++){
                System.out.print(" "+k+" ");
                k++;
            }
            System.out.println();
        }
    }

    public void Task13(){
        System.out.println("Введите А:");
        double a = scanner.nextDouble();

        System.out.println("Введите В:");
        double b = scanner.nextDouble();

        System.out.println("Введите С");
        double c = scanner.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("x= " + (-c / b));
        } else if (d < 0) {
                System.out.println("В уравнении нет корней.");
            } else if (d == 0) {
                System.out.println((-1 * b) / (2 * a));
            } else {
                System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2 * a)));
                System.out.println("x2 = " + ((-b - Math.sqrt(d)) / (2 * a)));
            }
        }

    public void Task14(){
        String[] month = {"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        System.out.println("Введите номер месяца:");
        String monthNumber = scanner.nextLine();
        if (monthNumber.matches("[1-9][0-2]")){
            System.out.println(month[Integer.parseInt(monthNumber)]);
        }else{
            System.out.println("Номером месяца может быть число от 1 до 12 а не "+monthNumber);
        }
    }

    public void Task15(){
        System.out.println("Введите два слова с четным числом букв");

        StringBuilder firstWord = new StringBuilder(scanner.nextLine());
        StringBuilder secondWord = new StringBuilder(scanner.nextLine());

        firstWord.delete(firstWord.length() / 2, firstWord.length());
        secondWord.delete(0, secondWord.length() / 2);

        if (firstWord.length() % secondWord.length() == 0) {
            System.out.println(firstWord.append(secondWord));
        } else {
            System.out.println("Оба слова должны быть с четным числом букв");
        }
    }

}
