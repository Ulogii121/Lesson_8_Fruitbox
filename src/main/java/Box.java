public class Box<T> {
    private T element;

    public T get() {
        return element;
    }

    public void put(final T myElement) {
        this.element = myElement;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}

