package ru.job4j;


/**
 * Class Calculate решение задачи части 001 урок1
 * @author Vadim Semenov
 * @since 11.04.2019
 */
public class Calculate{


	/**
	 *Метод для тестирования
	 * @param value строка для вывода в консоль
	 * @return String value
	 */
	public String echo (String value){
	return String.format("%s %s %s", value, value, value);		
	}

	/**
	 * Main
	 * @param args -args
	 */
	public static void main (String[] args){
		Calculate calc = new Calculate();
		System.out.println(calc.echo("aah"));
	}
	
}