public class Main {
    public static void main(String[] args) {
        // Generic Class
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");

        // Using generic method to print values
        Box.printBox(intBox);
        Box.printBox(strBox);

        // Bounded Type Parameters
        NumberBox<Integer> intNumberBox = new NumberBox<>();
        intNumberBox.set(456);
        NumberBox<Double> doubleNumberBox = new NumberBox<>();
        doubleNumberBox.set(78.9);

        // Using generic method to print NumberBox values
        Box.printBox(intNumberBox);
        Box.printBox(doubleNumberBox);

        // NumberBox<String> stringNumberBox = new NumberBox<>(); (compile-time error)

        // Generic Interfaces
        StringProcessor stringProcessor = new StringProcessor();
        String reversed = stringProcessor.process("Generics are powerful!");
        System.out.println("Reversed string: " + reversed);

        // Practical Application
        Library<String> library = new Library<>();
        library.addItem("The Great Gatsby");
        library.addItem("1984");
        library.addItem("To Kill a Mockingbird");

        System.out.println("Library items: " + library.getItems());
        library.removeItem("1984");
        System.out.println("Library after removal: " + library.getItems());
        System.out.println("Finding item: " + library.findItem("The Great Gatsby"));
    }
}