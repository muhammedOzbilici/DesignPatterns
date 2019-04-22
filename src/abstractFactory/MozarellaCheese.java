package abstractFactory;

public class MozarellaCheese implements Cheese {

    public MozarellaCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozarella cheese.");
    }
}
