package model;

public class LoyaltyAccount {
    private int loyaltyID;
    private int points;
    private String status;

    public boolean earn(int points) {
        this.points += points;
        return true;
    }

    public boolean redeem(Reward reward) {
        if (points >= reward.getCostInPoints()) {
            points -= reward.getCostInPoints();
            return true;
        }
        return false;
    }

    public int getPointsBalance() {
        return points;
    }
}
