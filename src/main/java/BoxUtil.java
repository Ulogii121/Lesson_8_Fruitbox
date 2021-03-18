public class BoxUtil {


    public static <Apple> void copyFromBoxToBox(Box<? extends Apple> src, Box<? super Apple> dest) {
        dest.put(src.get());
        System.out.println(dest);
    }

    public static <Apple> void copyFreshFruitFromBoxToBox(Box<? extends Apple> src, Box<? super Apple> dest) {
        dest.put(src.getIfFresh);
        System.out.println(dest);
    }

}
