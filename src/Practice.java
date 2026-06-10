public class Practice
{
    public static void main(String[] args)
    {
       int age = 17;
       boolean hasPermission = false;

       if (age >= 18) {
           System.out.println(" Доступ разрешен");}
       else if (age > 18 && hasPermission == true) {
           System.out.println(" Доступ разрешен по записке от родителей");
       } else {
           System.out.println(" Доступ заблокирован ");
       }
    }
}
