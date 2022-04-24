//18050111043 Halit Burak Yeşildal
public class BarFactory extends AbstractFactory {

    public BarFactory() {
    }

    @Override
    Bar getBar(String name, int value, String category) {
        return new Bar(name, value, category);
    }
}
