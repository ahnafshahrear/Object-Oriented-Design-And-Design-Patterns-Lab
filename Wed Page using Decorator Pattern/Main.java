public class Main {
    public static void main(String[] args) {
        WebPage basicPage = new BasicWebPage("HTML Content", "Stylesheet Content", "Script Content");

        WebPage decoratedPage = new AdditionalContentDecorator(
            new AnalyticsDecorator(basicPage, "Analytics Script"), "Additional Content");

        decoratedPage.display();
    }
}