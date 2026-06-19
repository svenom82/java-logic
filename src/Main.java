public class Main {
    public static void main(String[] args) {
       String fileName = "Avatar.SVG";
       String url = " MY-FIGMA-LINK.COM/PROJECT1 ";
       String link ="https://www.figma.com/design/6u8tWHfm6jHnuO3YT0xTCT";
       U.pl("Исправленная строка " + cleanUrl(url));
       U.pl("Это верная ссылка на фигму " + isFigmaLink(link));

    }

    public static boolean isPngFile(String fileName) {
        if (fileName.endsWith(".png")) {
            U.pl("Файл правильного формата! ");
        } else {
            U.pl(" Не верный формат");
        }return fileName.endsWith(".png");

    }

    public static String cleanUrl (String url) {
        url = url.trim();
        url = url.toLowerCase();
        return url;
    }
    public static boolean isFigmaLink (String link) { boolean result = link.contains("figma.com"); return result; }



}