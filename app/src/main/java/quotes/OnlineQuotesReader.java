package quotes;

public class OnlineQuotesReader {
    private String quoteText;
    private String quoteAuthor;
    private String senderName;
    private String senderLink;
    private String quoteLink;

    public OnlineQuotesReader(String quoteText, String quoteAuthor) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    @Override
    public String toString() {
        return "OnlineQuotesReader{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                '}';
    }
}
