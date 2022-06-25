package com.example.springboot1;

import com.example.springboot1.Service.SpidService;
import com.example.springboot1.entities.Spid;
import com.example.springboot1.entities.Status;
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

@SpringBootTest(classes = {SpringBoot1Application.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SpidServiceTest {

    @Mock
    SpidService spidService;

    @BeforeAll
    public void setup() throws Exception {
        Spid spid = new Spid();
        spid.setId(1);
        spid.setStatus(Status.READY_FOR_REVIEW);

        when(spidService.changeStatus(1)).thenReturn(spid);
    }

    @Test
    public void testDatabaseRetrievalForSpids() throws Exception {
        Spid spid = new Spid();
        spid.setId(1);
        spid.setStatus(Status.READY_FOR_REVIEW);
        assertEquals(spid, spidService.changeStatus(1));
    }

}