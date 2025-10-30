package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class NameTest {
    private final Name name = new Name();

    @Test
    void testName() {
        assertEquals("Kim Wonjong", name.name());
    }
}