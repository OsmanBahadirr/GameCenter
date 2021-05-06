package concretes;

import Entities.Gamer;
import abstracts.GamerService;

public class GamerManager implements GamerService {

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getNick()+ " nickli oyunucu sisteme kayýt edildi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getNick()+" nickli oyunucunun bilgileri güncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getNick()+" nickli kullanýcý sistemden silindi");
		
	}
	
}
