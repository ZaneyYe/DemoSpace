import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yezhangyuan on 2017-12-14.
 *
 * @author yezhangyuan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-context.xml","classpath*:spring/spring-mybatis.xml"})
public class BaseTest {
}
