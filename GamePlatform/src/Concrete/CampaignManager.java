package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " eklendi: "+  " " + campaign.getCampaignDetail());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignDetail() + " " + "olan" + " " + campaign.getCampaignName() + " sona erdi.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " " + "%" + campaign.getDiscountPercent() + " " + "olarak güncellendi.");
	}

}
