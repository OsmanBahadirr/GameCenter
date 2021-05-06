package abstracts;

import Entities.Game;
import Entities.Gamer;

public interface SellService {
	void sell(Gamer gamer, Game game);
	void rebate(Gamer gamer, Game game);
}
