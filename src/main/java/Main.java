public class Main {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0){
            return true;
        }
        if (year % 4 == 0){
            if (year % 300 != 0){
                return true;
            }
        }
        return false;
    }
}
