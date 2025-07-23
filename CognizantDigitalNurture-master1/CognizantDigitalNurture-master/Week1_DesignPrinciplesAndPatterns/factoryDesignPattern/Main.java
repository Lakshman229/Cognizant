<<<<<<< HEAD
package factoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        Transport t1 = TransportFactory.getTransport("car");
        Transport t2 = TransportFactory.getTransport("bike");
        Transport t3 = TransportFactory.getTransport("truck");

        t1.deliver();
        t2.deliver();
        t3.deliver();
    }
}
=======
package factoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        Transport t1 = TransportFactory.getTransport("car");
        Transport t2 = TransportFactory.getTransport("bike");
        Transport t3 = TransportFactory.getTransport("truck");

        t1.deliver();
        t2.deliver();
        t3.deliver();
    }
}
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
