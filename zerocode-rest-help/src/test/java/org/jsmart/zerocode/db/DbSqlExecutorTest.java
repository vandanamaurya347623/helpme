package org.jsmart.zerocode.db;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsmart.zerocode.core.di.ObjectMapperProvider;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DbSqlExecutorTest {

    @Test
    public void testSampleQuery() throws Exception {
        DbSqlExecutor dbSqlExecutor = new DbSqlExecutor();
        final ResultSets resultSets = dbSqlExecutor.executeSelect("select ID, NAME from CUSTOMERS where ORDER_ITEMS < 3");

        ObjectMapper objectMapper = new ObjectMapperProvider().get();
        final String resultJson = objectMapper.writeValueAsString(resultSets);

        assertThat(resultJson, is("{\"resultSets\":[{\"ID\":\"cust-001\",\"NAME\":\"Steve\"}]}"));
    }


}