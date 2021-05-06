package concretes;

import Entities.Gamer;
import abstracts.VerificationService;

public class VerificationManager implements VerificationService{

	@Override
	public void verification(Gamer gamer) {
		System.out.println("Doðrulama baþarýlý");
		
	}

}
