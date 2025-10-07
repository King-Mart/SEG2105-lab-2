

import java.util.Date;

import java.util.ArrayList;

public class Redemption {
    private int redemptionID;
    private Date date;
    private int pointsUsed;
    private ArrayList<Reward> rewards = new ArrayList<>();

    // Association management for Reward
    public boolean addReward(Reward reward) {
        if (rewards.contains(reward)) {
            System.err.println("Error: Reward already exists in this redemption.");
            return false;
        }
        rewards.add(reward);
        return true;
    }

    public boolean removeReward(Reward reward) {
        if (!rewards.contains(reward)) {
            System.err.println("Error: Reward does not exist in this redemption.");
            return false;
        }
        rewards.remove(reward);
        return true;
    }

    public ArrayList<Reward> listRewards() {
        return new ArrayList<>(rewards);
    }
}
