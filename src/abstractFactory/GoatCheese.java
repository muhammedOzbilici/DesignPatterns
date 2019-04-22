package abstractFactory;

public class GoatCheese implements Cheese {

    public GoatCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing goat cheese");
    }
}
