package org.jsmart.zerocode.testhelp.tests;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("hello_world_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class HelloWorldTest {


    @Test
    @JsonTestCase("hello_world/hello_world_get.json")
    public void testHelloWorld_onlineRestApi() throws Exception {

    }


}


