<<<<<<< HEAD
package com.example;

public class DatabaseConnector {
    private boolean connected = false;

    public void connect() {
        connected = true;
        System.out.println("Connected to database.");
    }

    public void disconnect() {
        connected = false;
        System.out.println("Disconnected from database.");
    }

    public boolean isConnected() {
        return connected;
    }
}
=======
package com.example;

public class DatabaseConnector {
    private boolean connected = false;

    public void connect() {
        connected = true;
        System.out.println("Connected to database.");
    }

    public void disconnect() {
        connected = false;
        System.out.println("Disconnected from database.");
    }

    public boolean isConnected() {
        return connected;
    }
}
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
