package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		if(!gamer.getNationalityId().isEmpty() && !gamer.getFirstName().isEmpty() && !gamer.getLastName().isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

}
