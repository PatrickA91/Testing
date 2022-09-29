public class Main {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0){
            return true;
        }
        if (year % 4 == 0){
            if (year % 200 != 0){
                return true;
            }
        }
        return false;
    }
}
