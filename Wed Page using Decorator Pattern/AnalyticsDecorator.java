public class AnalyticsDecorator extends WebPageDecorator {
    private String analyticsScript;

    public AnalyticsDecorator(WebPage webpage, String analyticsScript) {
        super(webpage);
        this.analyticsScript = analyticsScript;
    }

    public void display() {
        super.display();
        System.out.println("Analytics Script: " + analyticsScript);
    }
}