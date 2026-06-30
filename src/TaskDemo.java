public class TaskDemo {


    public static void main(String[] args) {

        Status currentStatus = Status.DRAFT;
        System.out.println("Ваш лимит: " + printStatus(currentStatus));

    }

    public static int printStatus (Status status) {
        switch (status) {
            case APPROVED: return 0;
            case REVIEW: return 50;
            case  DRAFT: return 100;
        }
        return 0;
    }



}