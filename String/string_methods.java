public class string_methods {

    public static void main(String[] args) {
        String name = "Debanjan";

        // To print the string
        System.out.println(name);

        // To print the length of the string
        System.out.println(name.length());

        // To print the first character of the string
        System.out.println(name.charAt(0));

        // To print the last character of the string
        System.out.println(name.charAt(name.length() - 1));

        // To print the substring of the string
        System.out.println(name.substring(0, 4));

        // To print the substring of the string
        System.out.println(name.substring(4));

        // To print string in lower case
        System.out.println(name.toLowerCase());

        // To print string in upper case
        System.out.println(name.toUpperCase());

        // To print string in reverse
        System.out.println(new StringBuilder(name).reverse().toString());
        // or
        // To print string in reverse
        System.out.println(new String(name).replace('a', 'b'));

        // To trim it
        String name2 = "    Debanjan    ";
        System.out.println(name2);// Comes with spaces at the start and end
        System.out.println(name2.trim());// Removes the spaces

        // To check if the string is empty or not
        String name3 = "";
        System.out.println(name3.isEmpty());

        // to replace a character
        String name4 = "Debanjan";
        System.out.println(name4.replace('a', 'b'));

        // starts with
        System.out.println(name.startsWith("Deb"));

        // Ends with
        System.out.println(name.endsWith("jan"));

        // index of
        System.out.println(name.indexOf("ja"));

        // last index of
        System.out.println(name.lastIndexOf("ja"));

        // last index of
        // last index of "ja" starting from index 5
        System.out.println(name.lastIndexOf("ja", 5));

        // contains
        System.out.println(name.contains("ja"));

        // equals
        System.out.println(name.equals("Debanjan"));

        // equals ignore case
        System.out.println(name.equalsIgnoreCase("debanjan"));

    }
}
