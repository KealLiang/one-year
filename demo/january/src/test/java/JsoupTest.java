import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;

/**
 * @author lsr
 * 能用Jsoup实现什么？
 *
 * 1.从URL，文件或字符串中刮取并解析HTML
 * 2.查找和提取数据，使用DOM遍历或CSS选择器
 * 3.操纵HTML元素，属性和文本
 * 4.根据安全的白名单清理用户提交的内容，以防止XSS攻击
 * 5.输出整洁的HTML
 *
 * @Date 2018-08-08
 * @Desc jsoup的测试
 */
public class JsoupTest {

    @Test
    public void test(){
        System.out.println("HELLO WORLD");
    }

    @Test
    public void testJsoupGet() throws IOException {
        Document doc = Jsoup.connect("https://www.csdn.net/").get();
        String title = doc.title();
        System.out.println(title);
        System.out.println(doc.charset());
    }

    @Test
    public void testStream(){
        Arrays.asList("Hello","Java8","Java7").stream()
                .map(s -> {
                    System.out.println("map: "+ s);
                    return s.toUpperCase();})
                .filter(s -> {
                    System.out.println("filter:"+ s);
                    return s.startsWith("J");})
                .forEach(s -> System.out.println(s));
    }
}
