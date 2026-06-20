public class Main {
    public static final int BASE_GRID = 8;

    enum OrderStatus {
        DRAFT,
        PROCESSING,
        DELIVERED
    }

    public static void main(String[] args) {
        OrderStatus currentStatus = OrderStatus.DRAFT;

       getStatusColor(currentStatus);
    }

    public static void getStatusColor(OrderStatus status) {
        switch (status) {
            case DRAFT -> U.pl("Пользователь начал оформление, плашка серая");
            case PROCESSING -> U.pl("Заказ улетел на склад, плашка желтая");
            case DELIVERED -> {
                U.pl("Заказ успешно дошел до клиента");
                U.pl("Красим плашку в зеленый и шлем пуш");
            }
        }
    }

}