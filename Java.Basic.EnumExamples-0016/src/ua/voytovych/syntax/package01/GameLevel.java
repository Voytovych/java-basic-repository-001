package ua.voytovych.syntax.package01;

public enum GameLevel {

	BEGINNER(0, "����������"), PROFESSIONAL(1, "����������"), HARD(2, "���� ������");

	private int index;
	private String name;

	private GameLevel(int index, String name) {
		this.index = index;
		this.name = name;
	}

}
