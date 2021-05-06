package abstracts;

import Entities.Campaign;

public interface CampaignService {
	void start(Campaign campaign);
	void finish(Campaign campaign);

}
