package com.duckrace;

import com.duckrace.enumeration.Reward;

import java.util.ArrayList;
import java.util.List;

public class DuckRacer {
    private int id;
    private String name;
    List<Reward> rewards;

    public DuckRacer(int id, String name, List<Reward> rewards) {
        this.id = id;
        this.name = name;
        this.rewards = rewards;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Reward> getRewards() {
        return List.copyOf(rewards); // Prevents user from adding rewards without calling "win" method
    }

    public void win(Reward reward) {
        rewards.add(reward);
    }

    public int getWins() {
        return rewards.size();
    }

    @Override
    public String toString() {
        return "DuckRacer{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", wins=" + getWins() +
                ", rewards=" + getRewards() +
                '}';
    }
}