public class Apple extends Fruit {


    private String name;

    public Apple(final String name, final boolean fresh) {
        setFresh(fresh);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple {" + name + "}" ;
    }
}
