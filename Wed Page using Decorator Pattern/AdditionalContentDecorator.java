public class AdditionalContentDecorator extends WebPageDecorator {
    private String additionalContent;

    public AdditionalContentDecorator(WebPage webpage, String additionalContent) {
        super(webpage);
        this.additionalContent = additionalContent;
    }

    public void display() {
        super.display();
        System.out.println("Additional Content: " + additionalContent);
    }
}