package com.psspl.unittestexample;

import java.util.List;

/**
 * Created by haresh on 1/6/2017.
 */

public class DasBoardEntity {


    /**
     * code : 200
     * status : success
     * data : [{"module_id":1,"module_name":"Driver Ticket","badge_count":8}]
     */

    private String code;
    private String status;
    private List<DashboardDataBean> data;

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

    public List<DashboardDataBean> getData() {
        return data;
    }

    public void setData(List<DashboardDataBean> data) {
        this.data = data;
    }

    public static class DashboardDataBean {
        /**
         * module_id : 1
         * module_name : Driver Ticket
         * badge_count : 8
         */

        private int module_id;
        private String module_name;
        private int badge_count;

        public int getModule_id() {
            return module_id;
        }

        public void setModule_id(int module_id) {
            this.module_id = module_id;
        }

        public String getModule_name() {
            return module_name;
        }

        public void setModule_name(String module_name) {
            this.module_name = module_name;
        }

        public int getBadge_count() {
            return badge_count;
        }

        public void setBadge_count(int badge_count) {
            this.badge_count = badge_count;
        }
    }
}
