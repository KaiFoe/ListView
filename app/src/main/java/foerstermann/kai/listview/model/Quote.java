package foerstermann.kai.listview.model;

public class Quote {

    private final String quoteText;
    private final String quoteAutor;

    public Quote(String quoteText, String quoteAutor) {
        this.quoteText = quoteText;
        this.quoteAutor = quoteAutor;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public String getQuoteAutor() {
        return quoteAutor;
    }

    @Override
    public String toString() {
        String output = quoteText + " - " + quoteAutor + " - ";
        return output;
    }
}
