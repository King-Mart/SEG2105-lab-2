import java.io.FileWriter;
import java.io.IOException;

public class LoyaltyAccountAppTest {
    public static void main(String[] args) {
        StringBuilder log = new StringBuilder();
        LoyaltyAccount loyalty = new LoyaltyAccount();
        Reward reward1 = new Reward();
        Reward reward2 = new Reward();
        Redemption redemption1 = new Redemption();
        Redemption redemption2 = new Redemption();

        // Add rewards
        log.append("Adding reward1: ").append(loyalty.addReward(reward1)).append("\n");
        log.append("Adding reward2: ").append(loyalty.addReward(reward2)).append("\n");
        log.append("Adding reward1 again (should fail): ").append(loyalty.addReward(reward1)).append("\n");

        // List rewards
        log.append("Rewards in loyalty account: ").append(loyalty.listRewards().size()).append("\n");

        // Remove reward
        log.append("Removing reward1: ").append(loyalty.removeReward(reward1)).append("\n");
        log.append("Removing reward1 again (should fail): ").append(loyalty.removeReward(reward1)).append("\n");

        // Add redemptions
        log.append("Adding redemption1: ").append(loyalty.addRedemption(redemption1)).append("\n");
        log.append("Adding redemption2: ").append(loyalty.addRedemption(redemption2)).append("\n");
        log.append("Adding redemption1 again (should fail): ").append(loyalty.addRedemption(redemption1)).append("\n");

        // List redemptions
        log.append("Redemptions in loyalty account: ").append(loyalty.listRedemptions().size()).append("\n");

        // Remove redemption
        log.append("Removing redemption2: ").append(loyalty.removeRedemption(redemption2)).append("\n");
        log.append("Removing redemption2 again (should fail): ").append(loyalty.removeRedemption(redemption2)).append("\n");

        // Write log to file
        try (FileWriter writer = new FileWriter("LoyaltyAccountAppTestLog.txt")) {
            writer.write(log.toString());
            System.out.println("Test log written to LoyaltyAccountAppTestLog.txt");
        } catch (IOException e) {
            System.err.println("Failed to write log: " + e.getMessage());
        }
    }
}
