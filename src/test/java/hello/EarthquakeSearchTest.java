package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@WebMvcTest(WebController.class)
@AutoConfigureMockMvc
public class EarthquakeSearchTest {

    @Test
    public void getEarthquakeSearch() throws Exception {
        // mvc.perform(MockMvcRequestBuilders.get("/earthquakes/search").accept(MediaType.TEXT_HTML))
        //         .andExpect(status().isOk())
        //         .andExpect(xpath("//title").exists())
        //         .andExpect(xpath("//title").string("Earthquake Search"));
    }           
}
