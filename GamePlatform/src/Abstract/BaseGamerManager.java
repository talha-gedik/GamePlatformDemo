package Abstract;

import Entities.Gamer;

public abstract class BaseGamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		
		System.out.println("Oyuncu kaydedildi: " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Oyuncu silindi: " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Oyuncu bilgileri güncellendi: " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

}
