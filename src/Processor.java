public interface Processor<T> {
    // returns variable of type T after processing the input
    T process(T input);
}