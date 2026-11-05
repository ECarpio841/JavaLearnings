package atributoStatic;

public class MainClassroom {

    static void main(String[] args) {
        Classroom student1 = new Classroom("Aurelio");
        Classroom student2 = new Classroom("María");
        Classroom student3 = new Classroom("Juan");


        student1.showInfo();
        student2.showInfo();
        student3.showInfo();

        Classroom.setSchoolName("Escuela 2");

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();

    }

}
