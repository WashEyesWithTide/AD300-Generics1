public class StringProcessor implements Processor<String> {
    // reverses the input string
    @Override
    public String process(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}