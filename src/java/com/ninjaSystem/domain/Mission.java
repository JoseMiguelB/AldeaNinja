package src.java.com.ninjaSystem.domain;

public class Mission {
    // Atributos

    private String rank;
    private String reward;

    public Mission(String rank, String reward) {
        this.rank = rank;
        this.reward = reward;
    }

    // Getters
    public String getRank() {
        return rank;
    }

    public String getReward() {
        return reward;
    }
}
