public class Main {
    public static void main(String[] args) {
        String branch = getBranchName("java-touchBoard-main");
        System.out.println(" Результат работы метода: " + branch);

    }

    public static String getBranchName(String repo) {
        int lastSlash = repo.lastIndexOf("-");

        if (lastSlash != -1) {
            String result = repo.substring(lastSlash + 1);
            return result;

        }
        return repo;
    }

}