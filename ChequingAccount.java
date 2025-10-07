

public class ChequingAccount extends Account implements NickNameable {
    private double overdraftLimit;
    private double monthlyFee;
    private String nickname;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean processCheque(String chequeNumber, double amount) {
        // Dummy implementation
        return true;
    }
}
