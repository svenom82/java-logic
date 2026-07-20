package user;
@FunctionalInterface
public interface Clickable {
    void onClick();
    default void onDoubleClick() {
        System.out.println("Двойной клик по умолчанию: Действие не назначено");
    }
    static void printRules() {
        System.out.println("Правило: Кликабельный элемент должен менять курсор на Pointer");
    }
}
