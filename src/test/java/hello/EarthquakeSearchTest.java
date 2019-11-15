package hello;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;


@RunWith(SpringRunner.class)
@WebMvcTest(WebController.class)
@AutoConfigureMockMvc
public class EarthquakeSearchTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getEarthquakeSearch() throws Exception {
        // mvc.perform(MockMvcRequestBuilders.get("/earthquakes/search").accept(MediaType.TEXT_HTML))
        //         .andExpect(status().isOk())
        //         .andExpect(xpath("//title").exists())
        //         .andExpect(xpath("//title").string("Earthquake Search"));
    }           
}