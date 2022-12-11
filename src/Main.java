//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//	“Введите цифру, соответствующую необходимому критерию:
//	1 - ОЗУ
//	2 - Объем ЖД
//	3 - Операционная система
//	4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Laptop> list = Arrays.asList(
                new Laptop("TGHCN112", "Sony", "I286", 256, 256, "Windows 7", "pink"),
                new Laptop("TGHCN113", "Sony", "I586", 512, 256, "Windows 8", "grey"),
                new Laptop("TGHCN114", "Panasonic", "I486", 512, 512, "Windows 9", "pink"),
                new Laptop("TGHCN115", "Asus", "I586", 1024, 512, "Windows 10", "black"),
                new Laptop("TGHCN117", "Asus", "I586", 1024, 1024, "Windows 11", "gold"),
                new Laptop("TGHCN118", "Sony", "I586", 512, 1024, "Linux", "silver")
        );

        System.out.println("В случае, если критерий не учитывается, оставьте поле пустым");
        Scanner scanner = new Scanner(System.in, "cp866");
        String answer = getParam("Введите размер ОЗУ : ", scanner);

        Integer memory = answer.isEmpty() ? 0 : Integer.parseInt(answer);
        answer = getParam("Введите размер жёсткого диска : ", scanner);
        Integer hddSize = answer.isEmpty() ? 0 : Integer.parseInt(answer);
        String os = getParam("Введите наименование операционной системы : ", scanner);
        String color = getParam("Введите цвет : ", scanner);
        scanner.close();
        for (Laptop laptop : list
        ) {
            if (memory > 0 && laptop.getMemory() < memory) {
                continue;
            }
            if (hddSize > 0 && laptop.getHddSize() < hddSize) {
                continue;
            }
            if (!os.isEmpty() && !laptop.getOs().equals(os)) {
                continue;
            }
            if (!color.isEmpty() && !laptop.getColor().equals(color)) {
                continue;
            }
            System.out.println(laptop);
        }

    }

    private static String getParam(String question, Scanner scanner) {


        System.out.printf(question);

        String answer = scanner.nextLine().trim();

        return answer;
    }
}
