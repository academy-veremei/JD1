package by.academy.homework.homework2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

    private Pattern patternEmail = Pattern.compile("^[A-Z0-9a-z._%+-]+@[A-Za-z0-9\\.-]+\\.[A-Za-z]{2,64}$");

    @Override
    public boolean validate(String string) {
        Matcher matcherEmail = patternEmail.matcher(string);
        return matcherEmail.find();
    }

}
