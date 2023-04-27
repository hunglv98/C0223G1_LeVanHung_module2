package case_study.validate;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class ValidateEmployee {
    private static final String REGEX_ID = "^(NV-)[0-9]{4}$";
    private static final String REGEX_NAME = "^([A-Z][a-z]*\\s)*[A-Z][a-z]*$";
    private static final String REGEX_IDENTIFY = "^([0-9]{9}|[0-9]{12})$";
    private static final String REGEX_PHONE_NUMBER = "^(0)\\d{9}$";
    private static final String REGEX_WAGE = "^(0-9)+$";
    private static final String REGEX_DATE_OF_BIRTH = "^([0-9]{4}[-/]?((0[13-9]|1[012])[-/]?(0[1-9]|[12][0-9]|30)|(0[13578]|1[02])[-/]?31|02[-/]?(0[1-9]|1[0-9]|2[0-8]))|([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00)[-/]?02[-/]?29)$";

    public static boolean validateId(String id) {
        return Pattern.matches(REGEX_ID, id);
    }

    public static boolean validateName(String name) {
        return Pattern.matches(REGEX_NAME, name);
    }

    public static boolean validateIdentify(String identify) {
        return Pattern.matches(REGEX_IDENTIFY, identify);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        return Pattern.matches(REGEX_PHONE_NUMBER, phoneNumber);
    }

    public static boolean validateWage(String wage) {
        return Pattern.matches(REGEX_WAGE, wage);
    }

    public static boolean validDate(String date) {
        if (Pattern.matches(REGEX_DATE_OF_BIRTH, date)) {
            LocalDate date1 = LocalDate.parse(date);
            LocalDate currenDate = LocalDate.now();
            return Period.between(date1, currenDate).getYears() >= 18;
        }
        return false;
    }
}
