package model;

public class Reward {
    private int rewardID;
    private String name;
    private int costInPoints;

    public boolean isRedeemableWith(int points) {
        return points >= costInPoints;
    }

    public int getCostInPoints() {
        return costInPoints;
    }
}
