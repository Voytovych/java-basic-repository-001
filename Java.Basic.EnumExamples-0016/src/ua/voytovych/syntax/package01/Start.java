package ua.voytovych.syntax.package01;

public class Start {

	public static void main(String[] args) {

		// отримання всіх значень enum
		for (int i = 0; i < GameLevel.values().length; i++) {
			System.out.println(GameLevel.values()[i]);
		}

		// використання в обєктах
		Game game = new Game();
		game.setGameLevel(GameLevel.BEGINNER);

		System.out.println("game.getDefaultLevel() = " + game.getDefaultLevel());

		System.out.println("game.getGameLevel() = " + game.getGameLevel());

		if (game.getGameLevel() == GameLevel.BEGINNER) {
			System.out.println("beginner");
		}

	}

}
