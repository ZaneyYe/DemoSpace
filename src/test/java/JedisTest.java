import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by yzy on 2018/6/28.
 * email: mia5121@163.com
 */
public class JedisTest {

	private Jedis jedis;

	@Before
	public void init() {
		jedis = new Jedis("192.168.137.3", 6379);
		jedis.auth("yzyjy2018");
	}

	@Test
	public void test1() {
		jedis.set("k2","yzy");
	}




}
