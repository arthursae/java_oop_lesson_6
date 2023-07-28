package work3;

public class Greeter {
    private Greeting formality;

    public Greeter(Greeting formality) {
        this.formality = formality;
    }

    public String greet() {
        return this.formality.phrase;
    }

    public void setFormality(Greeting formality) {
        this.formality = formality;
    }
}
