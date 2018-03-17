package org.jsmart.zerocode.db;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResultSets {
    private List<HashMap<String, Object>> resultSets = new ArrayList<>();

    public ResultSets(@JsonProperty("resultSets") List<HashMap<String, Object>> resultSets) {
        this.resultSets = resultSets;
    }

    public List<HashMap<String, Object>> getResultSets() {
        return resultSets;
    }

    @Override
    public String toString() {
        return "ResultSets{" +
                "resultSets=" + resultSets +
                '}';
    }
}