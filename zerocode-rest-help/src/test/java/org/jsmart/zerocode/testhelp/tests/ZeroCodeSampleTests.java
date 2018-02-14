package org.jsmart.zerocode.testhelp.tests;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("config_hosts_sample.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class ZeroCodeSampleTests {
    /*
     * NOTE:
     *
     * Run the below REST server first, before running the following sample tests.
     *
     * ---> org.jsmart.zerocode.testhelp.tests.RunMeFirstRESTServer
     *
     * Right click --> Run
     *
     * Once finished testing: To stop this REST server, simply press Ctrl+c or Stop button on your IDE
     */

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/01_sample_scenario_get.json")
    public void willRunScenarioBasic_Get() throws Exception {

    }

    @Test
    @JsonTestCase("tests/01_vanila_placeholders/01_generatinng_ids_and_sharing_among_steps.json")
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

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/10_externalizing_host_port_into_properties_file.json")
    public void willReadHostAndPortFrom_propertiesFile() throws Exception {

    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/11_execute_local_java_program.json")
    public void willExecuteExternal_javaProgram() throws Exception {

    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/12_chaining_multiple_steps_with_prev_response.json")
    public void willChainMoreStepsWith_previousResponse() throws Exception {

    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/13_random_and_static_string_number_place_holders.json")
    public void willGenerateStringsAndNumbers_randomStatic() throws Exception {

    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/14_bare_string_json.json")
    public void willTestBareString_json() throws Exception {

    }
    
    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/15_place_holders_of_request_response.json")
    public void testPlaceHolder_requestResponseJsonPath() throws Exception {
        
    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/16_passing_headers_to_rest_apis.json")
    public void testSend_headers() throws Exception {

    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/17_hello_world_headers_assert.json")
    public void testAssert_headers() throws Exception {

    }

    @Test
    @JsonTestCase("tests/00_sample_test_scenarios/18_date_and_datetime_today_generator.json")
    public void testGenerateTodayDateAndTime() throws Exception {

    }
    /*
     * NOTE:
     *
     * Run the below REST server first, before running the above sample tests.
     *
     * ---> org.jsmart.zerocode.testhelp.tests.RunMeFirstRESTServer
     *
     * Right click --> Run
     *
     * Once finished testing: To stop this REST server, simply press Ctrl+c or Stop button on your IDE
     */

}
