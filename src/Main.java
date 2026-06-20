public class Main {
    public static final int BASE_GRID = 8;

    enum OrderStatus {
        DRAFT,
        PROCESSING,
        DELIVERED
    }

    public static void main(String[] args) {
        OrderStatus currentStatus = OrderStatus.DRAFT;

        U.pl(getStatusColor(OrderStatus.DRAFT));
    }

    public static  String getStatusColor(OrderStatus status) {
        return switch (status) {
            case DRAFT -> "Серый";
            case PROCESSING -> "Желтый";
            case DELIVERED -> "Зеленый";
        };
    }

}