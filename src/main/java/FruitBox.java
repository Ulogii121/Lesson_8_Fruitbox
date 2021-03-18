public class FruitBox<T extends Fruit> extends Box<T> {

    public T getIfFresh() {
        if (element != null && element.fresh) {
            return element;
        } else {
            return null;
        }
    }
}
