package vn.vnpay.fn_interface;

import java.util.UUID;

public class Dog implements Animal{

    private static final long  serial = Long.parseLong(UUID.randomUUID().toString());
    @Override
    public void run() {
        System.out.println("dog run");
    }

    String nam ;

    final void test(){}

    final void test(String a){

    }
}
