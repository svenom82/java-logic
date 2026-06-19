public class Main {
    public static void main(String[] args) {
        String name = "Евгений Селезнев";
        U.pl(getAvatarInitials(name));

    }

    public static String getAvatarInitials(String name) {
        int firstLetterOfLastName = name.indexOf(" ") + 1;
        String result = name.substring(0, 1) + name.substring(firstLetterOfLastName, firstLetterOfLastName + 1 );
        return result.toUpperCase();
    }





}