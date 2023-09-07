public class TeacherMain {

    public static void main(String[] args) {
        Teacher math = new Math();
        math.startClass();

        System.out.println("----------------------");

        Teacher english = new English();
        english.startClass();
    }
}
