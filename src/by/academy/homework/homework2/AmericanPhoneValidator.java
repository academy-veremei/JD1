package by.academy.homework.homework2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
    private Pattern patternAmericanPhone = Pattern.compile("^\\+1[\\d]{11}$");

    @Override
    public boolean validate(String string) {
        Matcher matcherAmericanPhone = patternAmericanPhone.matcher(string);
        return matcherAmericanPhone.find();
    }
}
