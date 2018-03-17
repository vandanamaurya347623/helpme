package org.jsmart.zerocode.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DbSqlExecutor {

    public ResultSets executeSelect(String selectSqlQuery){

        List<HashMap<String, Object>> resultSets = new ArrayList<>();

        HashMap<String, Object> resultMap;
        // Your DB execution code goes here by doing a JDBC connection.
        // Populate the result and add the rows to resultSets list.
        // e.g. the below one is demo only i.e. what you have after the SQL execution.
        resultMap = new HashMap<>();
        resultMap.put("ID", "cust-001");
        resultMap.put("NAME", "Steve");
        //resultMap.put("NAME", customJavaType); //<--- For custom JavaType, please add customJavaType.toString()
        resultSets.add(resultMap);

        return new ResultSets(resultSets);
    }
}

/**
 * --------------------------------sample-step--------------------------------
        {
            "name": "fetch_db_resultset",
            "url": "org.jsmart.zerocode.db.DbSqlExecutor",  //<----- java class name
            "operation": "executeSelect",  //<----- public method name
            "request": "select ID, NAME from CUSTOMERS where ORDER_ITEMS < 3",  //<----- SQL select query
            "assertions": {
                "resultSets":[
                    {
                        "ID": "cust-001",
                        "NAME": "Steve"
                    },
                    {
                        "ID": "cust-002",
                        "NAME": "Peter"
                    }
                ]
            }
        }
 * ---------------------------------------------------------------------------
 */