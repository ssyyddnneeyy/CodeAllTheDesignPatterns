package creational.prototype;

/**
 * Created by ssyyddnneeyy on 10/22/14.
 */
public class PrototypeFactory {
    // receives a creational.prototype,
    // makes a copy of it,

    public Prototype getClone(Prototype proto) {
        return proto.clone();
    }
}
