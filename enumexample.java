public class EnumString {

    public enum TextStyle {
        BOLD, ITALICS, UNDERLINE, STRIKETHROUGH
    }

    public static void main(String[] args) {

        String style = "italics";

        TextStyle textStyle = TextStyle.valueOf(style.toUpperCase());

        System.out.println(textStyle);
    }
}
