package by.academy.homework.homework2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
    private Pattern patternBelarusPhone = Pattern.compile("^\\+375[\\d]{9}$");

    @Override
    public boolean validate(String string) {
        Matcher matcherBelarusPhone = patternBelarusPhone.matcher(string);
        return matcherBelarusPhone.find();
    }
}
