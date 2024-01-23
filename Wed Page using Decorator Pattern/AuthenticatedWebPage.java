public class AuthenticatedWebPage extends WebPageDecorator {
    AuthenticatedWebPage(WebPage webPage) {
        super(webPage);
    }

    public void authorizeWebPage() {
        System.out.println("Authenticating user");
    }

    public void display() {
        this.authorizeWebPage();
        super.display();
    }
}