<<<<<<< HEAD
package factoryDesignPattern;

public class TransportFactory {
    public static Transport getTransport(String type) {
        if (type == null) return null;

        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                return null;
        }
    }
}
=======
package factoryDesignPattern;

public class TransportFactory {
    public static Transport getTransport(String type) {
        if (type == null) return null;

        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                return null;
        }
    }
}
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
