package Entities;

public class Campaign {
	
	private int id;
	private String campaignName;
	private int discountPercent;
	private String campaignDetail;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignName, int discountPercent, String campaignDetail) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountPercent = discountPercent;
		this.campaignDetail = campaignDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getCampaignDetail() {
		return campaignDetail;
	}

	public void setCampaignDetail(String campaignDetail) {
		this.campaignDetail = campaignDetail;
	}
	
	

}
