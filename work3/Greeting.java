package work3;

public enum Greeting {
    FORMAL("Good evening, sir."),
    CASUAL("Sup bro?"),
    INTIMATE("Hello Darling!"),
    DEFAULT("Hello");

    public final String phrase;

    private Greeting(String phrase) {
        this.phrase = phrase;
    }

}
