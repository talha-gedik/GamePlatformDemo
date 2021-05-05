import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Gamer gamer1= new Gamer(1, "Talha", "Gedik", 1996, "5546686732");
		Gamer gamer2 = new Gamer(2, "R�za", "Baba", 1970, "4456557848");
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.add(gamer1);
		gamerManager.delete(gamer2);
	
		System.out.println("-------------");
		
		Game game1 = new Game(1, "GTA 5", 200);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		System.out.println("-------------");
		
		Game game2 = new Game(2, "Cyberpunk", 350);
		gameManager.delete(game2);
		
		System.out.println("-------------");
		
		Campaign campaign1 = new Campaign(1, "Y�lba�� indirimi", 35, "T�m oyunlarda %35 indirimi ka��rma!");
		Campaign campaign2 = new Campaign(2, "Cad�lar Bayram� indirimi", 40, "T�m oyunlarda %40 indirim");
		Campaign campaign3 = new Campaign(3, "Hafta Sonu �ndirimi", 15, "Hafta sonlar� ge�erli indirim");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.delete(campaign2);
		campaignManager.add(campaign1);
		campaignManager.update(campaign3);
	
}

}