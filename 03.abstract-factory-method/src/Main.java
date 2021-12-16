import factoryMethod.AbstractClient;
import factoryMethod.AbstractCreator;
import factoryMethod.ConcreteCreator;
import factory.Car;
import factory.FordMustangGT;
import factory.LexusIS300;
import factory.PontiacGTO;

public class Main {
    public static void main(String[] args) {
        AbstractCreator c = new ConcreteCreator();

        // Abstract factory #1
        Car fordMustangGT = FordMustangGT.getInstance();
        AbstractClient c1 = c.build(fordMustangGT);
        c1.run();

        // Abstract factory #2
        Car lexusIS300 = LexusIS300.getInstance();
        AbstractClient c2 = c.build(lexusIS300);
        c2.run();

        // Abstract factory #3
        Car pontiacGTO = PontiacGTO.getInstance();
        AbstractClient c3 = c.build(pontiacGTO);
        c3.run();
    }
}
