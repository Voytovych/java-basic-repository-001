package ua.voytovych.syntax.package01;

public class Start {

	public static void main(String[] args) {

		Start start = new Start();

		// Виклик мутоду і передача заначення як параметра
		start.printString(start.getNewValue(start.getString()));

		// Виклик методу і поверння результату в якості return для іншого методу
		// (типи повинні співпадати)
		start.printString(start.returnMethod());

		// Виклик методу, який в кінці знову викликає сам себе, до тих пір доки
		// не виконається умова
		// ("рекурсія")
		start.recursive(0);

	}

	private String getNewValue(String string) {
		return string += "and new value!";
	}

	public String getString() {
		return "new string";
	}

	public void printString(String value) {
		System.out.println("value = " + value);
	}

	public String returnMethod() {
		return getNewValue("new value");
	}

	public int recursive(int value) {
		value += 1;
		if (value == 10) {
			return value;
		}
		System.out.println(value);

		return recursive(value);// рекурсія
	}

	public String returnExample(int count) {

		if (count == 0) {
			return "error";
		}
		// тіло методу
		if (count < 0) {
			return "negative";
		} else {
			return "unknown";
		}
	}

	public void returnExampleVoid(int count) {

		if (count == 0) {
			return; // достроковий вихід з мутоду
		}
		// тіло методу

	}

}
