public class BasicWebPage implements WebPage {
    private String html;
    private String styleSheet;
    private String script;

    public BasicWebPage(String html, String styleSheet, String script) {
        this.html = html;
        this.styleSheet = styleSheet;
        this.script = script;
    }

    public void display() {
        System.out.println("Basic Web Page:");
        System.out.println("HTML: " + html);
        System.out.println("Stylesheet: " + styleSheet);
        System.out.println("Script: " + script);
    }
}