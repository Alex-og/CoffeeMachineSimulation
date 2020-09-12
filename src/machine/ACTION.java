package machine;

public enum ACTION {
    BUY("buy"),
    FILL("fill"),
    TAKE("take"),
    REMAINING("remaining"),
    BACK("back"),
    EXIT("exit");

    String action;

    ACTION(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
