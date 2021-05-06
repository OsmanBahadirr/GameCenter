package concretes;

import Entities.Gamer;
import abstracts.GamerService;

public class GamerManager implements GamerService {

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getNick()+ " nickli oyunucu sisteme kay�t edildi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getNick()+" nickli oyunucunun bilgileri g�ncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getNick()+" nickli kullan�c� sistemden silindi");
		
	}
	
}
