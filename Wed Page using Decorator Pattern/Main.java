public class Main {
    public static void main(String[] args) {
        WebPage myWebPage = new BasicWebPage("HTML", "CSS", "JS");
        myWebPage = new AuthenticatedWebPage(myWebPage);
        myWebPage = new AuthorizedWebPage(myWebPage);
        myWebPage.display();
    }
}