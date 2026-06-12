package com.codemanship.refactoring.longparameterlist;

public class ShippingNoteGenerator {

    public String generateShippingNote(
            String customerFirstName,
            String customerLastName,

            String addressLine1,
            String addressLine2,
            String city,
            String postcode,
            String country,

            String orderId,
            String itemDescription,
            int quantity
    ) {

        String fullName = customerFirstName + " " + customerLastName;

        String address = addressLine1 + ", "
                + (addressLine2 != null ? addressLine2 + ", " : "")
                + city + ", "
                + postcode + ", "
                + country;

        return "SHIPPING NOTE\n"
                + "Order: " + orderId + "\n"
                + "Customer: " + fullName + "\n"
                + "Ship To: " + address + "\n"
                + "Item: " + itemDescription + "\n"
                + "Quantity: " + quantity;
    }
}
