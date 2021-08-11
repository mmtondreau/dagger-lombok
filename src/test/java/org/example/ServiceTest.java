package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest
{
    Service service = new Service();

    @Test
    public void sayHello()
    {
        assertEquals("success", service.sendHello("Bob", "John"));
    }
}
