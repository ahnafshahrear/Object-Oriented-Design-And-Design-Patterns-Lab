public class WebPageDecorator implements WebPage {
    WebPage webPage;

    WebPageDecorator(WebPage webPage) {
        this.webPage = webPage;
    }

    @Override
    public void display() {
        this.webPage.display();
    }
}