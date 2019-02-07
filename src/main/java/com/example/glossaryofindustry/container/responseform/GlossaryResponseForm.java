package com.example.glossaryofindustry.container.responseform;

import java.util.ArrayList;
import java.util.List;

import com.example.glossaryofindustry.container.IndexRecord;
import com.example.glossaryofindustry.container.WebResponseForm;
import com.example.glossaryofindustry.container.record.GlossarysRecord;

public class GlossaryResponseForm extends WebResponseForm {

    /** 初期表示レコードリスト */
    private List<IndexRecord> indexRecordList = new ArrayList<>();

    /** レコードリスト */
    private List<GlossarysRecord> recordList = new ArrayList<>();

    public List<IndexRecord> getIndexRecordList() {
        return indexRecordList;
    }

    public void setIndexRecordList(List<IndexRecord> indexRecordList) {
        this.indexRecordList = indexRecordList;
    }

    public void addIndexRecordList(IndexRecord indexRecord) {
        this.indexRecordList.add(indexRecord);
    }

    public List<GlossarysRecord> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<GlossarysRecord> recordList) {
        this.recordList = recordList;
    }

    public void addRecordList(GlossarysRecord record) {
        this.recordList.add(record);
    }
}
