public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String firstName = "Ivan";
        String middleName = " Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println( "ФИО сотрудника - " + fullName);

        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные сотрудника для заполнения отчета -" + upperCaseFullName);

        fullName = "Иванов Семён Семёнович";
        String replecedFullName = fullName.replace('ё','е');
        System.out.println("Данные ФИО сотрудника -" + replecedFullName);
    }
}