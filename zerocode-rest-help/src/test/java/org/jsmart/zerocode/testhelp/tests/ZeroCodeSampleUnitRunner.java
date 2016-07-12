package org.jsmart.zerocode.testhelp.tests;

import org.jsmart.smarttester.core.domain.JsonTestCase;
import org.jsmart.smarttester.core.domain.TargetEnv;
import org.jsmart.smarttester.core.runner.ZeroCodeJUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("config_hosts_sample.properties")
@RunWith(ZeroCodeJUnitRunner.class)
public class ZeroCodeSampleUnitRunner{
    /*
     * NOTE:
     *
     * Run the below REST server first, before running any tests.
     *
     * ---> org.jsmart.zerocode.testhelp.tests.RunMeFirstToStartSampleRESTServer
     *
     * Right click --> Run
     *
     * Once finish testing: To stop this REST server, simply press Ctrl+c or Stop button on your IDE
     */

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/01_sample_scenario_get.json")
    public void willRunScenarioBasic_Get() throws Exception {

    }

    @Test
    @JsonTestCase("tests/01_vanila_placeholders/01_create_ids_and_share_among_steps.json")
    public void willCreateIdsAndShareFor_steps() throws Exception {

    }

    /*
     * NOTE:
     *
     * Run the below REST server first, before running any tests.
     *
     * ---> org.jsmart.zerocode.testhelp.tests.RunMeFirstToStartSampleRESTServer
     *
     * Right click --> Run
     *
     * Once finish testing: To stop this REST server, simply press Ctrl+c or Stop button on your IDE
     */

}
