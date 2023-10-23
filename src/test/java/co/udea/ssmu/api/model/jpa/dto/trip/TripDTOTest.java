package co.udea.ssmu.api.model.jpa.dto.trip;

import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;


class TripDTOTest {

    @Test
    void getId() {
        TripDTO element = new TripDTO();
        element.setId(2);
        Integer expected = element.getId();

        assertEquals(expected, 2);

    }
}