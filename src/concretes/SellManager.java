package concretes;


import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import abstracts.SellService;

public class SellManager implements SellService {

	private Campaign _campaign;
	
	public SellManager() {
		
	}
	
	public SellManager(Campaign _campaign) {
		this._campaign = _campaign;
	}
	
	@Override
	public void sell(Gamer gamer, Game game) {
			if(_campaign.getName()!=null) {
			System.out.println(gamer.getNick()+ " nickli oyuncu " +game.getName()+" adl� oyunu"+_campaign.getName()+" kampanyas�n� kullanarak sat�n ald�");
		}
			else {
				System.out.println(gamer.getNick()+ " nickli oyuncu " +game.getName()+" adl� oyunu sat�n ald�");
			}
	}

	@Override
	public void rebate(Gamer gamer, Game game) {
		System.out.println(gamer.getNick()+ " nickli oyuncu " +game.getName()+" adl� oyunu idae etti");
		
	}
	
}
