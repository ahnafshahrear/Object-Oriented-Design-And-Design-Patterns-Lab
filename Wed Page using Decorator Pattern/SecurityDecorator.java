public class SecurityDecorator extends WebPageDecorator {
    private String securityScript;

    public SecurityDecorator(WebPage webpage, String securityScript) {
        super(webpage);
        this.securityScript = securityScript;
    }

    public void display() {
        super.display();
        System.out.println("Security Script: " + securityScript);
    }
}