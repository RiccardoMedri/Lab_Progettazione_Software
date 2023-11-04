class TestStudent {

    public static void main(String[] args) {
        Student alex = new Student();
        Student angel = new Student();
        Student andrea = new Student();
        alex.build("Alex", "Balducci", 1015, 2019);
        alex.printStudentInfo();
        angel.build("Angel", "Bianchi", 1016, 2018);
        angel.printStudentInfo();
        andrea.build("Andrea", "Bracci", 1017, 2017);
        andrea.printStudentInfo();
    }
}
