public class Fruit {
    private boolean fresh = true;

    public void setFresh(final boolean fresh) {
        this.fresh = fresh;
    }


    public Fruit getIfFresh() {
        if (this != null && this.fresh) { //IDEa сказала, что this != null всегда true, поэтому убрал этот блок
            return this;
        } else {
            return null;
        }
    }
}
