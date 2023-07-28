import work3.Greeter;
import work3.Greeting;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter(Greeting.FORMAL);
        System.out.println(greeter.greet());
        greeter.setFormality(Greeting.CASUAL);
        System.out.println(greeter.greet());
        greeter.setFormality(Greeting.INTIMATE);
        System.out.println(greeter.greet());
        greeter.setFormality(Greeting.DEFAULT);
        System.out.println(greeter.greet());
    }
}
