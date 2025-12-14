package org.example.modules;

import com.google.inject.AbstractModule;
import org.example.services.HelloWorldService;
import org.example.services.HelloWorldServiceImp;

public class HelloWorldMod extends AbstractModule {
    @Override
    protected void configure() {
        bind(HelloWorldService.class).to(HelloWorldServiceImp.class);
    }
}
