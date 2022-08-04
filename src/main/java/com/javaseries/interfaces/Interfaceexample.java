package com.javaseries.interfaces;

import org.junit.Test;

public class Interfaceexample {
    interface SampleInterface {
        int SAMPLE_INTERFACE_CONSTANT = 5;

        enum ClientType{
            PRIVATE, BUSINESS
        }

        void method1ToExpose(ClientType clientType);
        void method2ToExpose();
    }

    class SampleInterfaceImpl implements SampleInterface {

        @Override
        public void method1ToExpose(ClientType clientType) {
            // Do something.
        }

        @Override
        public void method2ToExpose() {
            // Do something else.
        }
    }
    @Test
    public void testInterface() {

        // Type of an variable
        SampleInterface sampleInterface = new SampleInterfaceImpl();
    }
}