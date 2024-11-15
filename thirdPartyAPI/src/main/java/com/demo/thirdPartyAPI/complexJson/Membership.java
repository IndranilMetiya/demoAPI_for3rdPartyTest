package com.demo.thirdPartyAPI.complexJson;

import java.util.List;

public class Membership {
    private String level;
    private String validUntil;
    private List<Reward> rewards;
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getValidUntil() {
		return validUntil;
	}
	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}
	public List<Reward> getRewards() {
		return rewards;
	}
	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}
    
    

}
