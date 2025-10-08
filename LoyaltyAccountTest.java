import java.util.Date;

public class LoyaltyAccountTest {
    public static void main(String[] args) {
        LoyaltyAccount loyalty = new LoyaltyAccount();
        Reward reward1 = new Reward();
        Reward reward2 = new Reward();
        Redemption redemption1 = new Redemption();
        Redemption redemption2 = new Redemption();

        // Add rewards
        System.out.println("Adding reward1: " + loyalty.addReward(reward1));
        System.out.println("Adding reward2: " + loyalty.addReward(reward2));
        System.out.println("Adding reward1 again (should fail): " + loyalty.addReward(reward1));

        // List rewards
        System.out.println("Rewards in loyalty account: " + loyalty.listRewards().size());

        // Remove reward
        System.out.println("Removing reward1: " + loyalty.removeReward(reward1));
        System.out.println("Removing reward1 again (should fail): " + loyalty.removeReward(reward1));

        // Add redemptions
        System.out.println("Adding redemption1: " + loyalty.addRedemption(redemption1));
        System.out.println("Adding redemption2: " + loyalty.addRedemption(redemption2));
        System.out.println("Adding redemption1 again (should fail): " + loyalty.addRedemption(redemption1));

        // List redemptions
        System.out.println("Redemptions in loyalty account: " + loyalty.listRedemptions().size());

        // Remove redemption
        System.out.println("Removing redemption2: " + loyalty.removeRedemption(redemption2));
        System.out.println("Removing redemption2 again (should fail): " + loyalty.removeRedemption(redemption2));
    }
}
