public class string_test {
    public static void main(String[] args) {
        //3.2.1 задание
        String str1 = "Sometimes";

        String name1 = "иван иванов";
        String name2 = "Иван Иванов";
        String name = "Иван";

        System.out.println(str1.charAt(2));
        //3.2.2 задание
        System.out.println(name1.equals(name2));
        //3.2.3 задание
        System.out.println(name1.equalsIgnoreCase(name2));
        //3.2.4 задание
        if (name1.equalsIgnoreCase(name2) == true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
        //3.2.5 задание
        checkUserName(name1, name2);
        //3.2.6 задание
        System.out.println("Ваше имя имеет длину "+ name.length() + " символов");

    }

    private static void checkUserName(String name1, String name2) {
        if (name1.equalsIgnoreCase(name2) == true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
        //3.2.7 задание
        System.out.println("Ваше полное имя без пробелов занимает "+ name2.replace(" ","").length() + " символов");
    }
}
