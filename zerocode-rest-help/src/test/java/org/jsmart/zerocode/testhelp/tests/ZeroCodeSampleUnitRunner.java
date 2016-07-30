package org.jsmart.zerocode.testhelp.tests;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("config_hosts_sample.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class ZeroCodeSampleUnitRunner{
    /*
     * NOTE:
     *
     * Run the below REST server first, before running the following sample tests.
     *
     * ---> org.jsmart.zerocode.testhelp.tests.RunMeFirstRESTServer
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

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/02_using_step_loop.json")
    public void willExecuteStepUsing_loop() throws Exception {

    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/03_using_scenario_loop.json")
    public void willExecuteScenarioUsing_loop() throws Exception {

    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/04_asserting_null_or_notnull_fields.json")
    public void willAssertUsing_placeHolders() throws Exception {

    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/05_asserting_empty_array.json")
    public void willAssertUsing_emptyArray() throws Exception {

    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/06_asserting_null_or_notnull_json_content.json")
    public void willAssertNullNotNul_jsonBlock() throws Exception {

    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/07_asserting_greaterthan_lesserthan_number.json")
    public void willAssert_greaterOrLesser() throws Exception {

    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/09_asserting_string_messages.json")
    public void willAssert_containsString() throws Exception {

    }

    /*
     * NOTE:
     *
     * Run the below REST server first, before running any of the above sample tests.
     *
     * ---> org.jsmart.zerocode.testhelp.tests.RunMeFirstRESTServer
     *
     * Right click --> Run
     *
     * Once finish testing: To stop this REST server, simply press Ctrl+c or Stop button on your IDE
     */

}
