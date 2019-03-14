package com.kealliang.base;

import com.meicloud.sahara.test.HrmsDelegatingSmartContextLoader;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lsr
 * @ClassName KealTransactionalTests
 * @Date 2019-03-14
 * @Desc 事务测试基类，不回滚
 * @Vertion 1.0
 */
@Rollback(false)
@Transactional("framework_orm_dataSourceTransactionManager")
@ContextConfiguration(
        locations = {"classpath*:META-INF/conf/spring/*.xml"},
        loader = HrmsDelegatingSmartContextLoader.class
)
public class KealTransactionalTests extends AbstractTransactionalJUnit4SpringContextTests {
    public KealTransactionalTests() {
    }
}
