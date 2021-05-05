package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;
	
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if (gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Oyuncu ba�ar�yla eklendi: "+ " " + gamer.getFirstName() + " " + gamer.getLastName());
		} 
		else {
			System.out.println("Not a valid person.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu kayd� sistemden silindi: " + gamer.getFirstName() + " " + gamer.getLastName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgileri g�ncellendi: " + gamer.getFirstName() + " " + gamer.getLastName());
	}
	
}
