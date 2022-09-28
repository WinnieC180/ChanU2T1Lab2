public class ChatBotRunner {
    public static void main(String[] arg) {

        ChatBot bot1 = new ChatBot("Debbie", 5, "purple");

        System.out.println();
        System.out.println("Today's date is " + bot1.date());

        System.out.println();
        bot1.greeting("Winnie");

        System.out.println();
        bot1.weather();

        System.out.println();
        System.out.println ("15 feet into meters is " + bot1.convertFeetToMeters(15));

        System.out.println();
        bot1.favoriteNumber(8);

        System.out.println();
        bot1.favColor("Blue");

        System.out.println();
        System.out.println("The sum of 8, 2 and 4 is " + bot1.addNumbers(8, 2, 4));

        System.out.println();
        System.out.println(bot1.goodbye());
    }
}
