package com.example.springboot1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import com.example.springboot1.Repository.SpidRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@Test
class SpidServiceTest {

    @Mock
    SpidService spidService;

    @Mock 
    SpidRepository spidRepository;

    @BeforeAll
    public void setup() {
        Spid spid = new Spid();
        spid.setId(1);
        spid.setStatus(Status.READY_FOR_REVIEW);

        when(spidService.changeStatus(spid)).thenReturn(spid);
    }

    @Test
    public void testSpid() {
        Spid spid = new Spid();
        spid.setId(1);
        spid.setStatus(Status.READY_FOR_REVIEW);
        spidService.createSpid(spid);
        verify(spidRepository.atLeast(1));
        assertTrue(spidService.retreiveAllSpids.size(1));
        assertEquals(spid, spidService.changeStatus(spid));
    }

}