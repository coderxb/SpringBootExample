package indi.xuebing.example;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BootupTest {

    @Autowired
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testContextLoads() {
        assertThat(this.ctx).isNotNull();
        assertThat(this.ctx.containsBean("sampleCtrl")).isTrue();
        assertThat(this.ctx.containsBean("noSampleCtrl")).isFalse();
    }

}
