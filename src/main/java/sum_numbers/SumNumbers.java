package sum_numbers;

public class SumNumbers {

	public String sumLargeNumber(String num1, String num2){

		// Определяем максимальную длину одного из чисел
		int lengthOfNumber;
		if (num1.length()>num2.length()){
			lengthOfNumber = num1.length();
		}else {
			lengthOfNumber = num2.length();
		}

		// Создаём и заполняем массивы.
		// Массивы делаю с одинаковыми размерами по максимальной длине числа
		int[] number1 = new int[lengthOfNumber];
		int[] number2 = new int[lengthOfNumber];

		//48 - unicode = "0" charAt() - Returns the value at the specified index
		// Заполняю масивы числами, но в обратном порядке, для удобства
		for (int i = 0; i < num1.length(); i++) {
			number1[i] = num1.charAt(num1.length()-1-i)-48;
		}
		for (int i = 0; i < num2.length(); i++) {
			number2[i] = num2.charAt(num2.length()-1-i)-48;
		}

		// Складываем два числа
		int inMemory = 0; // То что будем держать "в уме" :)
		int[] sumNumber = new int[lengthOfNumber + 1]; // итоговый массив
		for (int i = 0; i < lengthOfNumber; i++) {
			sumNumber[i] = (number1[i] + number2[i] + inMemory)%10;
			if ((number1[i]+number2[i]+inMemory)>=10){
				inMemory = 1;
			}else {
				inMemory = 0;
			}
		}

		//Если, что осталось "в уме" записываем в последнюю ячейку массива
		sumNumber[lengthOfNumber] = inMemory;

		//Участок кода нужен, для избавлении нуля(если ничего не осталось "в уме"...) и перевода в стороку
		StringBuilder resultNumbers = new StringBuilder(); // дешевле конкатинировать, если цифр много
		if (sumNumber[sumNumber.length-1] == 0){
			for (int i = 0; i < sumNumber.length-1; i++){
				resultNumbers.append(sumNumber[i]);
			}
		}else{
			for (int i = 0; i < sumNumber.length; i++) {
				resultNumbers.append(sumNumber[i]);
			}
		}

		return new StringBuilder(resultNumbers).reverse().toString(); // Разворот стороки
	}
}
