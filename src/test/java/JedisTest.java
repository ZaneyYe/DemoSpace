import org.junit.Before;
import org.junit.Test;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Created by yzy on 2018/6/28.
 * email: mia5121@163.com
 */
public class JedisTest {

	private RedisTemplate redisTemplate = new RedisTemplate();

	@Before
	public void init() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setHostName("47.98.179.66");
		factory.setPort(6379);
		factory.setPassword("yzyjy2018");
		redisTemplate.setConnectionFactory(factory);
	}

	@Test
	public void test1() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setHostName("47.98.179.66");
		factory.setPort(6379);
		factory.setPassword("yzyjy2018");
		redisTemplate.setConnectionFactory(factory);
		redisTemplate.setStringSerializer(new StringRedisSerializer());
		redisTemplate.opsForValue().set("wanghuamei", "shazi");
	}


}
