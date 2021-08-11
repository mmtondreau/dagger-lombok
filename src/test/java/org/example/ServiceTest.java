package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class ServiceTest extends MockitoTest
{
    @Mock
    DBClient dbClient;

    @InjectMocks
    Service service;

    @Test
    public void sayHello() {
        assertEquals("success", service.sendHello("Bob", "John"));
    }

    @Test
    public void sayHelloException() throws DBException {
        when(dbClient.insert(any(String.class))).thenThrow(new DBException("big bada boom"));
        assertEquals("failure", service.sendHello("john", "bob"));
    }
}
