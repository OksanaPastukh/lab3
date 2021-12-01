package lab3.task1;

public class ValidateException extends RuntimeException{
   public enum http {
        SUCCESS("200"),
        ERROR_400("400"),
        ERROR_500("500");
        public final String httpStatusCode;

        http(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
        }
    }

    public ValidateException(String message) {
        super("Код: " + message);
    }
    //Перевірка  юзера
    static String check(User user) throws ValidateException {

        boolean checkUser = checkStrings(user.surName) &&
                checkStrings(user.fistName) &&
                checkStrings(user.middleName) &&
                checkAge(user.age);

        if (checkUser)
            return http.SUCCESS.httpStatusCode;

        throw new ValidateException(http.ERROR_400.httpStatusCode);
    }

    //Перевірка стрічок
    private static boolean checkStrings(String name) { //Перевірка
        for (Character i : name.toCharArray()) {
            if (Character.isDigit(i) || Character.isSpaceChar(i)) return false;
        }
        return Character.isUpperCase(name.charAt(0));
    }

    //Перевірка віку
    private static boolean checkAge(int age) {
        return age > 18 && age < 150;
    }
}

