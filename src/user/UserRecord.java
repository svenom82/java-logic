package user;

public record UserRecord (String name, int age){
    public UserRecord {
     if (age < 0) {
         throw new IllegalArgumentException("Возраст не может быть отрицательным");
     }
    }

}
