

import java.util.ArrayList;

public class LoyaltyAccount {
    private int loyaltyID;
    private int points;
    private String status;

    private ArrayList<Reward> rewards = new ArrayList<>();
    private ArrayList<Redemption> redemptions = new ArrayList<>();

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

    // Association management for Reward
    public boolean addReward(Reward reward) {
        if (rewards.contains(reward)) {
            System.err.println("Error: Reward already exists in this loyalty account.");
            return false;
        }
        rewards.add(reward);
        return true;
    }

    public boolean removeReward(Reward reward) {
        if (!rewards.contains(reward)) {
            System.err.println("Error: Reward does not exist in this loyalty account.");
            return false;
        }
        rewards.remove(reward);
        return true;
    }

    public ArrayList<Reward> listRewards() {
        return new ArrayList<>(rewards);
    }

    // Association management for Redemption
    public boolean addRedemption(Redemption redemption) {
        if (redemptions.contains(redemption)) {
            System.err.println("Error: Redemption already exists in this loyalty account.");
            return false;
        }
        redemptions.add(redemption);
        return true;
    }

    public boolean removeRedemption(Redemption redemption) {
        if (!redemptions.contains(redemption)) {
            System.err.println("Error: Redemption does not exist in this loyalty account.");
            return false;
        }
        redemptions.remove(redemption);
        return true;
    }

    public ArrayList<Redemption> listRedemptions() {
        return new ArrayList<>(redemptions);
    }
}
