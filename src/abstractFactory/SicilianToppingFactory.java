package abstractFactory;

public class SicilianToppingFactory extends BaseToppingFactory {

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
