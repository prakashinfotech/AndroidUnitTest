package com.psspl.unittestexample;

import java.util.List;

/**
 * Created by haresh on 1/13/2017.
 */

public class EquipmentTypeEntity {

    /**
     * code : 200
     * status : success
     * data : [{"id":1,"uld_type_id":1,"uld_type_name":"Container","display_text":"AKE","is_default":false,"is_deleted":false,"modified_date":"2017-01-04 12:29:00.000"}]
     */

    private String code;
    private String status;
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
        /**
         * id : 1
         * uld_type_id : 1
         * uld_type_name : Container
         * display_text : AKE
         * is_default : false
         * is_deleted : false
         * modified_date : 2017-01-04 12:29:00.000
         */

        private int id;
        private int uld_type_id;
        private String uld_type_name;
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

        public int getUld_type_id() {
            return uld_type_id;
        }

        public void setUld_type_id(int uld_type_id) {
            this.uld_type_id = uld_type_id;
        }

        public String getUld_type_name() {
            return uld_type_name;
        }

        public void setUld_type_name(String uld_type_name) {
            this.uld_type_name = uld_type_name;
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
