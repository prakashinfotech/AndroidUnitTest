package com.psspl.unittestexample;

import java.util.List;

/**
 * Created by Ami Govani on 13-01-2017.
 */

public class ULDTypeEntity {
    /**
     * code : 200
     * status : success
     * data : [{"id":1,"display_text":"Container","is_default":false,"is_deleted":false,"modified_date":"2017-01-03 07:37:00.000"},{"id":2,"display_text":"GC","is_default":false,"is_deleted":false,"modified_date":"2017-01-03 07:37:00.000"},{"id":3,"display_text":"Pellate","is_default":false,"is_deleted":false,"modified_date":"2017-01-03 07:37:00.000"},{"id":4,"display_text":"Nett","is_default":false,"is_deleted":false,"modified_date":"2017-01-03 07:37:00.000"},{"id":5,"display_text":"HorseStall","is_default":false,"is_deleted":false,"modified_date":"2017-01-03 07:37:00.000"},{"id":6,"display_text":"Galley Cart","is_default":false,"is_deleted":false,"modified_date":"2017-01-03 09:23:00.000"}]
     */

    private String code;
    private String status;
    /**
     * id : 1
     * display_text : Container
     * is_default : false
     * is_deleted : false
     * modified_date : 2017-01-03 07:37:00.000
     */

    private List<DataBean> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private int id;
        private String display_text;
        private boolean is_default;
        private boolean is_deleted;
        private String modified_date;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDisplay_text() {
            return display_text;
        }

        public void setDisplay_text(String display_text) {
            this.display_text = display_text;
        }

        public boolean isIs_default() {
            return is_default;
        }

        public void setIs_default(boolean is_default) {
            this.is_default = is_default;
        }

        public boolean isIs_deleted() {
            return is_deleted;
        }

        public void setIs_deleted(boolean is_deleted) {
            this.is_deleted = is_deleted;
        }

        public String getModified_date() {
            return modified_date;
        }

        public void setModified_date(String modified_date) {
            this.modified_date = modified_date;
        }
    }
}
