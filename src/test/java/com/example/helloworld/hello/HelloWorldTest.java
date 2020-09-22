package com.example.helloworld.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
    HelloWorld helloWorld = new HelloWorld();

    @Test
    void testHello() {
        String result = helloWorld.hello();
        Assertions.assertEquals("Hello world", result);
    }
}
