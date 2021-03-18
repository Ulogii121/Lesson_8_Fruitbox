public class Apple extends Fruit {

    protected String name;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple(String name, boolean fresh) {
        super(fresh);
        this.name = name;
    }



}
