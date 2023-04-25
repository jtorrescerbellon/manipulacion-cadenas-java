public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hola ", "  Mundo ");
        System.out.println(str);

        char letter = 'n';
        int a = manipulator.getIndexOrNull("Coding", letter);
        System.out.println(a);

        String subString = "la";
        int b = manipulator.getIndexOrNull("Hola", subString);
        System.out.println(b);

        String word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(word);

    }
}