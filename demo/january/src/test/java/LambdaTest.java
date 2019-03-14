import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lsr
 * @ClassName LambdaTest
 * @Date 2018-12-21
 * @Desc
 * @Vertion 1.0
 */
public class LambdaTest {

    @Test
    public void testCollector() {
        ArrayList<Integer> list = Lists.newArrayList(3, 5, 7, 9, 2, 1);
        Integer collect = list.stream().collect(() -> new Integer(1), Math::addExact, Math::addExact);
        System.out.println(collect);
    }

    @Test
    public void testCollector2() {
        final Integer[] integers = Lists.newArrayList(1, 2, 3, 4, 5)
                .stream()
                .collect(() -> new Integer[]{0}, (a, x) -> a[0] += x, (a1, a2) -> a1[0] += a2[0]);
        System.out.println(Arrays.toString(integers));
    }

}
