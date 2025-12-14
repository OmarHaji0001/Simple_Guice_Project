package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.modules.HelloWorldMod;
import org.example.services.HelloWorldService;

public class Main {
    public static void main(String[] args) {
        //pure di
//        System.out.println("pure di");
//        HelloWorldService service1 = new HelloWorldServiceImp();
//        service1.helloWorld();
//        System.out.println("with gice container");
        Injector injector = Guice.createInjector(new HelloWorldMod());
        HelloWorldService service2 = injector.getInstance(HelloWorldService.class);
        service2.helloWorld();
    }
}