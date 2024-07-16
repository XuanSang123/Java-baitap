package Session6;

public class BT1 {
    public static void main(String[] args) {
        String str = "  Hello World ";
        String str2 = "Hello Java World";
        String str3 = "Java";

        System.out.println(("isEmpty" + str.isEmpty()));

        String trimmedStr = str.trim();
        System.out.println("trimmedStr" + trimmedStr.trim());

        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str3));

        String[] words = trimmedStr.split(" ");
        System.out.print("split: ");
        for (String word : words) {
            System.out.print("'" + word + "'");
        }
        System.out.println();

        String concatStr = trimmedStr.concat("let's code!");
        System.out.println("concatStr: " + concatStr);
        System.out.println(trimmedStr + " !lets's code! 2");

        System.out.println("contain: " + trimmedStr.contains(str3)); // thg dung lam filter

        String upperStr = trimmedStr.toUpperCase();
        System.out.println("upperStr: " + upperStr);
        String lowerStr = trimmedStr.toLowerCase();
        System.out.println("lowerStr: " + lowerStr);

        String replaceStr = trimmedStr.replace("Java", "Python");
        System.out.println("replaceStr: " + replaceStr);

        System.out.println("length: " + trimmedStr.length());
    }
}
