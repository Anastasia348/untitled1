public class Main {
    public static void main(String[]args) {
        Student student = new Student("Anastasia", "Zubkovskaya","PKS-320",5);
        Aspirant aspirant = new Aspirant("Nadya","Ezhkova","PKS-320",4,"E88");
        Student sweet = new Aspirant("Vlad","Kornilov","PKS-320",5,"Candy");
                Student[] students  = {student, aspirant, sweet};

        System.out.println("Имя" + student.firstName + " " + student.lastName + ", группа: " + student.group + ", средняя оценка: " + student.averageMark + ", степуха: " + student.getscolarship());
        System.out.println("Имя" + aspirant.firstName + " " + aspirant.lastName + ", группа: " + aspirant.group + ", средняя оценка: " + aspirant.averageMark + ", научная работа: " + aspirant.nauchnayaRabota + ", степуха: " + aspirant.getscolarship());
        System.out.println("Имя" + sweet.firstName + " " + sweet.lastName + ", группа: " + sweet.group + ", средняя оценка: " + sweet.averageMark + ", степуха: " + sweet.getscolarship());

    }
}

