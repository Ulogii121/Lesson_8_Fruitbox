public class BoxUtil {


    public static <T> void copyFromBoxToBox(final Box<? extends T> src, final Box<? super T> dest) {
        dest.put(src.get());
        System.out.println(dest);
    }

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<? extends T> src, final Box<? super Fruit> dest) {
        try {
            dest.put(src.get().getIfFresh());
            System.out.println(dest);
        } catch (NullPointerException e) {
            System.out.println("Лучше не есть этот фрукт!");
        }
    }

    public static <T> void printElementFromTwoBoxes(final Box<Box<T>> box) {
        System.out.println(box.get());
    }

    public static void printElementFromBoxes(final Box<?> box) {
        System.out.println(box.get());
    }
}
