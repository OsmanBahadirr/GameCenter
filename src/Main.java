import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import concretes.SellManager;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1,"Bahadýr","Avcý","Koixo","123","2001");
		Game game1 = new Game(2,"GTA5",60.0);
		SellManager sellManager = new SellManager(new Campaign(0, "Yýl baþý indirimleri", 0));
		sellManager.sell(gamer1, game1);

	}

}
