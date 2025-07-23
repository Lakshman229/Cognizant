<<<<<<< HEAD
package com.example;

public class OrderService {
    private final EmailService emailService;

    public OrderService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void placeOrder(String userEmail) {
        // business logic like saving order, etc.
        emailService.sendEmail(userEmail, "Order Placed", "Thank you for your order!");
    }
}
=======
package com.example;

public class OrderService {
    private final EmailService emailService;

    public OrderService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void placeOrder(String userEmail) {
        // business logic like saving order, etc.
        emailService.sendEmail(userEmail, "Order Placed", "Thank you for your order!");
    }
}
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
