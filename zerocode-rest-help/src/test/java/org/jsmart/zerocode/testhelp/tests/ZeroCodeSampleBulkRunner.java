package org.jsmart.zerocode.testhelp.tests;

import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.TestPackageRoot;
import org.jsmart.zerocode.core.runner.ZeroCodePackageRunner;
import org.junit.runner.RunWith;

@TargetEnv("config_hosts_sample.properties")
@RunWith(ZeroCodePackageRunner.class)
@TestPackageRoot("tests")
public class ZeroCodeSampleBulkRunner {

}
