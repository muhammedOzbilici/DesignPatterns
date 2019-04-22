package factory;

import org.junit.Test;

public class PizzaFactoryTest {

    @Test
    public void testMakePizzas(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");


    }
}
