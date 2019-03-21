package top.lrshuai.design.create.abstract_factory02.factory;

public class FactoryProducer {
    public static final String FruitsFactory = "fruits";
    public static final String VegetablesFactory = "vegetables";
    public static AbstractFactory getFactory(String factoryName){
        if("fruits".equalsIgnoreCase(factoryName)){
            return new FruitsFactory();
        }else if("vegetables".equalsIgnoreCase(factoryName)){
            return new VegetablesFactory();
        }
        return null;
    }
}
