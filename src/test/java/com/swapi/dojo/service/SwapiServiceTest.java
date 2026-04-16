package com.swapi.dojo.service;

import com.swapi.dojo.client.SwapiClient;
import com.swapi.dojo.dto.PeopleResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SwapiServiceTest {
    @InjectMocks
   private SwapiService swapiservice;

    @Mock
    private SwapiClient swapiClient;

   private PeopleResponse peopleResponse;

    @BeforeEach
    public void setup(){
        peopleResponse = new PeopleResponse("Luke", "172", "77");
    }
    @Test
    void shouldReturnPeopleWhenCLientReturnData(){
        when(swapiClient.findPeople()).thenReturn(new PeopleResponse[]{peopleResponse});
        PeopleResponse[] result = swapiservice.getPeople();
        assertEquals(1,result.length);
        assertEquals("Luke", result[0].getName());
    }

}
