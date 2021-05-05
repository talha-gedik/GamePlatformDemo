package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: " + game.getGameName());
		System.out.println("Fiyat: " + game.getGamePrice());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun kaldýrýldý: " + game.getGameName());
		System.out.println("Fiyat: " + game.getGamePrice());		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi: " + game.getGameName());
		System.out.println("Yeni Fiyatý: " + game.getGamePrice());		
	}

}
