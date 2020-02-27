import java.util.Scanner;

class Unicode 
{
	public static void main(String[] args) 
	{
		System.out.println("Таблица символов Unicode.\nВыберите режим работы:\n➀ ⚊ вывести все символы Unicode [0;65535];\n➁ ⚊ вывести символы таблицы ASCII [0;127];\n➂ ⚊ вывести символы из заданного диапазона.");
		Scanner userInput = new Scanner(System.in);
		if (!userInput.hasNextInt())
		{
			userInput.close();
			System.out.println("Ошибка входных данных! Перезапустите программу и введите корректные данные...");
			return;		
		}
		switch (userInput.nextInt())
		{
			case 1:
			{
				userInput.close();
				int temp = 0;
				while (temp <= 65535)
				{
					System.out.print((char)temp + "   ");
					temp++;
				}
				System.out.println();
				break;
			}
			case 2:
			{
				userInput.close();
				int temp = 0;
				while (temp <= 127)
				{
					System.out.print((char)temp + "   ");
					temp++;
				}
				System.out.println();
				break;
			}
			case 3:
			{
				System.out.print("Введите диапазон.\nНачало: ");
				if (!userInput.hasNextInt())
				{
					userInput.close();
					System.out.println("Ошибка входных данных! Перезапустите программу и введите корректные данные...");
					break;		
				}
				int beginValue = userInput.nextInt();
				if (beginValue < 0 || beginValue > 65535)
				{
					userInput.close();
					System.out.print("Ошибка входных данных! Перезапустите программу и введите корректные данные...");
					break;
				}
				System.out.print("Конец: ");
				if (!userInput.hasNextInt())
				{
					userInput.close();
					System.out.println("Ошибка входных данных! Перезапустите программу и введите корректные данные...");
					break;		
				}
				int endValue = userInput.nextInt();
				userInput.close();
				if (endValue < 0 || endValue > 65535 || beginValue > endValue)
				{
					System.out.print("Ошибка входных данных! Перезапустите программу и введите корректные данные...");
					break;
				}
				int temp = beginValue;
				while (temp <= endValue)
				{
					System.out.print((char)temp + "   ");
					temp++;
				}				
				System.out.println("\nИтого диапазон: [" + beginValue + ";" + endValue + "]\nКоличество символов: " + (endValue - beginValue + 1));
				break;
			}
			default:
			{
				userInput.close();
				System.out.println("Ошибка входных данных! Перезапустите программу и введите корректные данные...");
			}
		}
	}
}