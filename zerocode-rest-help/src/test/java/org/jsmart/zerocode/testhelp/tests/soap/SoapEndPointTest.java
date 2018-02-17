package org.jsmart.zerocode.testhelp.tests.soap;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.UseHttpClient;
import org.jsmart.zerocode.core.httpclient.ssl.SslTrustHttpClient;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@UseHttpClient(SslTrustHttpClient.class) //Needed only for https connections
@TargetEnv("soap_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class SoapEndPointTest {

    /**
     * Visit HelloWorld:
     * http://secure.smartbearsoftware.com/samples/testcomplete12/webservices/Service.asmx?op=HelloWorld
     *
     * All samples:
     * http://secure.smartbearsoftware.com/samples/testcomplete12/webservices/Service.asmx#_ga=2.74525649.2109787819.1518852706-497778140.1518852706
     */
    @Test
    @JsonTestCase("soap/soap_endpoint_hello_world_post_200.json")
    public void testSoapHelloWorldWith_SOAPAction() throws Exception {

    }

    @Test
    @JsonTestCase("soap/soap_endpoint_soap_action_post_200.json")
    public void testSoapEndPointWith_SOAPAction() throws Exception {

    }

    @Test
    @JsonTestCase("soap/soap_endpoint_xml_node_type_response_200.json")
    public void testSoapXmlResponse_SOAPAction() throws Exception {

    }

    @Test
    @JsonTestCase("soap/soap1.2_endpoint_xml_type_response_200.json")
    public void testSoap12With_contentTypeOnly() throws Exception {

    }

    @Test
    @JsonTestCase("soap/soap1.2_endpoint_object_type_response_500.json")
    public void testSoap12With_ObjectTypeResturn() throws Exception {

    }
}

