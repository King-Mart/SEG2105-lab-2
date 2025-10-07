

import java.util.ArrayList;

public class Reward {
    private int rewardID;
    private String name;
    private int costInPoints;
    private ArrayList<Redemption> redemptions = new ArrayList<>();

    public boolean isRedeemableWith(int points) {
        return points >= costInPoints;
    }

    public int getCostInPoints() {
        return costInPoints;
    }

    // Association management for Redemption
    public boolean addRedemption(Redemption redemption) {
        if (redemptions.contains(redemption)) {
            System.err.println("Error: Redemption already exists for this reward.");
            return false;
        }
        redemptions.add(redemption);
        return true;
    }

    public boolean removeRedemption(Redemption redemption) {
        if (!redemptions.contains(redemption)) {
            System.err.println("Error: Redemption does not exist for this reward.");
            return false;
        }
        redemptions.remove(redemption);
        return true;
    }

    public ArrayList<Redemption> listRedemptions() {
        return new ArrayList<>(redemptions);
    }
}
