import com.yintai.test.elasticsearch.Application;
import com.yintai.test.elasticsearch.repositories.SpuIndexRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by syx11 on 2017/2/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class SpuIndexRepositoryTest {
    @Autowired
    private SpuIndexRepository spuIndexRepository;

    @Test
    public void test(){
        System.out.println("hhhhhhh");
    }
}
