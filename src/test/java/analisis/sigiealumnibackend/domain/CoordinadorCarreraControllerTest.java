package analisis.sigiealumnibackend.domain;

import analisis.sigiealumnibackend.service.CoordinadorDeCarreraService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class CoordinadorCarreraControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CoordinadorDeCarreraService coordinadorDeCarreraService;

    @Test
    public void testGetCoordinadorCarreraById() throws Exception{
        CoordinadorDeCarrera coordinadorDeCarrera = new CoordinadorDeCarrera(1,"Rafael","Solano","RAFAEL.SOLANO@ucr.ac.cr");

        Mockito.when(coordinadorDeCarreraService.get(Mockito.anyInt())).thenReturn(coordinadorDeCarrera);

        String URI = "/api/coordinadores-de-carrera/1";
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                URI).accept(MediaType.APPLICATION_JSON);

        MvcResult result = null;
        result = mockMvc.perform(requestBuilder).andReturn();

        String expectedJson = this.mapToJson(coordinadorDeCarrera);
        String output = result.getResponse().getContentAsString();
        assertThat(output).isEqualTo(expectedJson);

    }

    private String mapToJson(Object object) throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }
}
