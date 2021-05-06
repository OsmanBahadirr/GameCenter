package concretes;

import Entities.Campaign;
import abstracts.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void start(Campaign campaign) {
		System.out.println(campaign.getName()+" adl� kampanya ba�lad�");
		
	}

	@Override
	public void finish(Campaign campaign) {
		System.out.println(campaign.getName()+" adl� kampanya son buldu");
		
	}

}
