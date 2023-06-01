package Lesson6;

import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public class HomeWork {
    public static void main(String[] args) {
        var LaptopSet = Laptop();
        System.out.println("Все имеющиеся модели: ");
        for (var i : LaptopSet) {
            System.out.println(i);
        }
        criterionOfFilterLaptop(LaptopSet);
    }

    private static void criterionOfFilterLaptop(Set<Laptop> LaptopSet) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("\nУкажите критерии для фильтрации ноутбуков через пробел: ");

        int inputMinValueForFilter;
        ArrayList<Integer> criterion = new ArrayList<>();
        ArrayList<String> inputStr = new ArrayList<>();
        Map<Integer, ArrayList<String>> descriptionOfFilterCriteria = new HashMap<>();
        ArrayList<String> companyOfLaptop = new ArrayList<>(Arrays.asList("MSI", "Samsung", "Lenovo", "Apple"));
        descriptionOfFilterCriteria.put(1, companyOfLaptop);
        ArrayList<String> cpuCompany = new ArrayList<>(Arrays.asList("Intel", "AMD", "M1"));
        descriptionOfFilterCriteria.put(2, cpuCompany);
        ArrayList<String> nameOfOs = new ArrayList<>(Arrays.asList("Windows", "MacOS", "Linux"));
        descriptionOfFilterCriteria.put(3, nameOfOs);
        Map<Integer, Integer> numberOfCriterion = new HashMap<>();
        numberOfCriterion.put(4, 0);
        numberOfCriterion.put(5, 0);
        numberOfCriterion.put(6, 0);
        String[] nameOfCriterion = new String[]{"фирм", "процессоров", "операционных систем", "SSD", "DRAM", "цены"};

        System.out.println("1 - Фирма");
        System.out.println("2 - Процессоры");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Размер твердотельного накопителя");
        System.out.println("5 - Размер оперативной памяти");
        System.out.println("6 - Цена");
        System.out.print("-> ");

        for (String item : myScanner.nextLine().split(" ")) {
            criterion.add(Integer.parseInt(item));
        }
        for (int i : criterion) {

            if (i <= 3) {
                System.out.printf("Введите названия %s через пробел ", nameOfCriterion[i - 1]);
                for (String item : myScanner.nextLine().split(" ")) {
                    inputStr.add(item);
                }
                descriptionOfFilterCriteria.put(i, inputStr);
            } else {
                System.out.printf("Введите минимальный размер %s ", nameOfCriterion[i - 1]);
                inputMinValueForFilter = Integer.parseInt(myScanner.nextLine());
                numberOfCriterion.put(i, inputMinValueForFilter);
            }

        }

        System.out.println("\nМодели ноутбуков по вашему запросу: ");
        for (Laptop model : LaptopSet) {
            if (descriptionOfFilterCriteria.get(1).contains(model.getName()) && descriptionOfFilterCriteria.get(2).contains(model.getCpu()) && descriptionOfFilterCriteria.get(3).contains(model.getOs()) &&
                    numberOfCriterion.get(4) <= model.getSsd() && numberOfCriterion.get(5) <= model.getDram() && numberOfCriterion.get(6) <= model.getprice()) {
                System.out.println(model);
            }
        }
    }

    private static Set Laptop() {
        Laptop MsiVega = new Laptop("MSI", "Intel", "Windows", 256, 8, 75000);
        Laptop MsiDragon = new Laptop("MSI", "Intel", "Windows", 1024, 16, 75000);
        Laptop MsiCreator = new Laptop("MSI", "Intel", "Windows", 512, 16, 90000);
        Laptop MacBookAir = new Laptop("Apple", "M1", "MacOS", 1024, 16, 10000);
        Laptop MacBookPro = new Laptop("Apple", "M1", "MacOS", 2048, 64, 90000);
        Laptop MacBookPro2016 = new Laptop("Apple", "M1", "MacOS", 512, 16, 10000);
        Laptop SamsungS23 = new Laptop("Samsung", "Intel", "Windows", 512, 16, 75000);
        Laptop SamsungEdge1 = new Laptop("Samsung", "Intel", "Windows", 512, 16, 10000);
        Laptop SamsungEdge2 = new Laptop("Samsung", "Intel", "Windows", 512, 8, 75000);
        Laptop LenovoYoga = new Laptop("Lenovo", "Intel", "Linux", 1024, 16, 60000);
        Laptop LenovoThinkPad = new Laptop("Lenovo", "Intel", "Windows", 2048, 64, 10000);
        Laptop LenovoIdeaPad = new Laptop("Lenovo", "AMD", "Windows", 2048, 64, 60000);

        Set<Laptop> LaptopSet = new HashSet<>();
        LaptopSet.add(MsiVega);
        LaptopSet.add(MsiDragon);
        LaptopSet.add(MsiCreator);
        LaptopSet.add(MacBookAir);
        LaptopSet.add(MacBookPro);
        LaptopSet.add(MacBookPro2016);
        LaptopSet.add(SamsungS23);
        LaptopSet.add(SamsungEdge1);
        LaptopSet.add(SamsungEdge2);
        LaptopSet.add(LenovoYoga);
        LaptopSet.add(LenovoThinkPad);
        LaptopSet.add(LenovoIdeaPad);
        return LaptopSet;
    }
}
