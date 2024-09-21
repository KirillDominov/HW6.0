public class Main {
    public static void main(String[] args) {
        System.out.println("Задание № 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника —  " + fullName);
        System.out.println();
        System.out.println("Задание № 2");
        System.out.println();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("Задание № 3");
        System.out.println();
        String fullsName = "Иванов Семён Семёнович";
        String fullNameTrue = fullsName.replace("ё", "е");
        System.out.println(fullNameTrue);
    }
}