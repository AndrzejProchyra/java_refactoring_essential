package com.codemanship.refactoring.legacycode;

import java.io.IOException;

public interface OrderClient {
    Order getOrder(int orderId) throws IOException, InterruptedException;
}
