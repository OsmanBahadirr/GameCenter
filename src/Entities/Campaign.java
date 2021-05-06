package Entities;

import abstracts.Entitiy;

public class Campaign implements Entitiy{
	
	private int id;
	private String name;
	private int campaignPeriot;
	
	public Campaign(int id, String name, int campaignPeriot) {
		super();
		this.id = id;
		this.name = name;
		this.campaignPeriot = campaignPeriot;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCampaignPeriot() {
		return campaignPeriot;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCampaignPeriot(int campaignPeriot) {
		this.campaignPeriot = campaignPeriot;
	}
}
