package ua.voytovych.syntax.package01;

public enum GameLevel {

	BEGINNER(0, "Початківець"), PROFESSIONAL(1, "Професіонад"), HARD(2, "Дуже важкий");

	private int index;
	private String name;

	private GameLevel(int index, String name) {
		this.index = index;
		this.name = name;
	}

}
