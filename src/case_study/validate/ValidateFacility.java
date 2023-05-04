package case_study.validate;

import java.util.regex.Pattern;

public class ValidateFacility {
    private static final String REGEX_VILLA = "^SVVL-\\d{4}$";
    private static final String REGEX_HOUSE = "^SVHO-\\d{4}$";
    private static final String REGEX_ROOM = "^SVRO-\\d{4}$";
    private static final String REGEX_NAME = "^([A-Z][a-z]*\\s)*[A-Z][a-z]*$";
    private static final String REGEX_TYPEOFRENT = "^([A-Z][a-z]*\\s)*[A-Z][a-z]*$";
    private static final String REGEX_STANDARD = "^([A-Z][a-z]*\\s)*[A-Z][a-z]*$";

    public static boolean validateVilla(String id) {
        return Pattern.matches(REGEX_VILLA, id);
    }

    public static boolean validateHouse(String id) {
        return Pattern.matches(REGEX_HOUSE, id);
    }

    public static boolean validateRoom(String id) {
        return Pattern.matches(REGEX_ROOM, id);
    }

    public static boolean validateName(String id) {
        return Pattern.matches(REGEX_NAME, id);
    }

    public static boolean validateUsedArea(double area) {
        return area > 30;
    }
    public static boolean validateRentCost(double rentCost){
        return rentCost>0;
    }
    public static boolean validatePeople(int number){
        return (number>0 && number<20);
    }
    public static boolean validateFloor(int number){
        return number>0;
    }
    public static boolean validateTypeOfRent(String str){
        return Pattern.matches(REGEX_TYPEOFRENT,str);
    }
    public static boolean validateStandard(String str){
        return Pattern.matches(REGEX_STANDARD,str);
    }
}
