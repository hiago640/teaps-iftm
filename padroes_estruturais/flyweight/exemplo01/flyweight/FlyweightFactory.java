package flyweight.exemplo01.flyweight;

import java.util.ArrayList;
import java.util.List;

import flyweight.exemplo01.object.Sprites;

public class FlyweightFactory {

	public List<Flyweight> flyweights;

	public FlyweightFactory() {
		flyweights = new ArrayList<>();
		flyweights.add(new FlyweightConcreto("jogador.png"));
		flyweights.add(new FlyweightConcreto("inimigo1.png"));
		flyweights.add(new FlyweightConcreto("inimigo2.png"));
		flyweights.add(new FlyweightConcreto("inimigo3.png"));
		flyweights.add(new FlyweightConcreto("cenario1.png"));
		flyweights.add(new FlyweightConcreto("cenario2.png"));
	}

	public Flyweight getFlyweight(Sprites sprite) {

		switch (sprite) {
		case JOGADOR:
			return flyweights.get(0);
		case INIMIGO_1:
			return flyweights.get(1);
		case INIMIGO_2:
			return flyweights.get(2);
		case INIMIGO_3:
			return flyweights.get(3);
		case CENARIO_1:
			return flyweights.get(4);
		case CENARIO_2:
			return flyweights.get(5);
		default:
			return null;
		}
	}
}
