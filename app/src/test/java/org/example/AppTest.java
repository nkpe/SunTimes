/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

import org.app.App;
import org.app.UserInput;

class AppTest {
    @Test void testMain() {
        App classUnderTest = new App();

        InputStream input = provideInput("51.515972", "-0.174943");
        UserInput.userInput(input);

        // assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    InputStream provideInput(String x, String y){
        String inputString = x + "\n" + y;
        InputStream input = new ByteArrayInputStream(inputString.getBytes());

        return input;

        // InputStream xBytes = new ByteArrayInputStream(x.getBytes());
        // InputStream yBytes = new ByteArrayInputStream(y.getBytes());

        // return new SequenceInputStream(xBytes, yBytes);

    }
}
