import com.demo.api.po.BlogArticle;
import com.demo.service.ArticleService;
import com.demo.vo.BlogArticleVo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

/**
 * Created by yezhangyuan on 2017-12-14.
 *
 * @author yezhangyuan
 */
public class ServiceTest extends BaseTest {

	@Autowired
	private ArticleService articleService;


	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void queryShowBlogTest(){
		List<BlogArticleVo> articleVoList = articleService.queryShowFour(0, 3);
		System.out.println(articleVoList.size());
	}

	@Test
	public void test(){
		try {
			objectMapper.readValue("\"{\\\"id\\\":4,\\\"title\\\":\\\"\\xe6\\xb9\\x96\\xe5\\xb7\\x9e\\xe7\\x9b\\x9b\\xe4\\xbc\\x9a\\\",\\\"summary\\\":\\\"hello world\\\",\\\"articleType\\\":2,\\\"article\\\":\\\"&lt;p&gt;\\xe7\\xa5\\x9e\\xe5\\xa5\\x87\\xe7\\x9a\\x84\\xe4\\xba\\x8b\\xe6\\x83\\x85\\xef\\xbc\\x8cbug\\xe8\\xa7\\xa3\\xe5\\x86\\xb3\\xe4\\xba\\x86&lt;/p&gt;&lt;p&gt;&lt;img src=&quot;http://localhost/1512722103037_7.\\xe5\\xbe\\xae\\xe4\\xbf\\xa1\\xe5\\x9b\\xbe\\xe7\\x89\\x87_20170912084710.jpg&quot; title=&quot;&quot; alt=&quot;1512722103037_7.\\xe5\\xbe\\xae\\xe4\\xbf\\xa1\\xe5\\x9b\\xbe\\xe7\\x89\\x87_20170912084710.jpg&quot;/&gt;&lt;/p&gt;\\\",\\\"support\\\":0,\\\"secret\\\":0,\\\"creattime\\\":1512722110000,\\\"updatetime\\\":1512722110000}\"", BlogArticle.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
