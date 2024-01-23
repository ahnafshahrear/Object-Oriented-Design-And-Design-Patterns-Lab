public class AuthorizedWebPage extends WebPageDecorator {
    AuthorizedWebPage(WebPage webPage) {
        super(webPage);
    }

    public void authorizeWebPage() {
        System.out.println("Authorizing user");
    }

    public void display() {
        this.authorizeWebPage();
        super.display();
    }
}