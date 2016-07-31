package org.jsmart.zerocode.testhelp.zcmore;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

//import org.jsmart.zerocode.core.httpclient.CustomRuntimeTestHttpClient;

//@UseHttpClient(CustomRuntimeTestHttpClient.class)
@TargetEnv("config_hosts.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class ZeroCodeUnitRunnerWithCustomHttpClient {

    @Test
    @JsonTestCase("01_verification_test_cases/04_custom_runtime_http_client.json")
    public void testASmartTestCase_createUpdate() throws Exception {

    }
}

