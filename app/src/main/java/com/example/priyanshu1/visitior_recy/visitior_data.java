package com.example.priyanshu1.visitior_recy;

public class visitior_data {
    String v_name;
    String v_mobile;
    String v_date;
    String v_entry;
String v_no_of_visi;
String v_vehi_no;
    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public String getV_mobile() {
        return v_mobile;
    }

    public void setV_mobile(String v_mobile) {
        this.v_mobile = v_mobile;
    }

    public String getV_date() {
        return v_date;
    }

    public void setV_date(String v_date) {
        this.v_date = v_date;
    }

    public String getV_entry() {
        return v_entry;
    }

    public void setV_entry(String v_entry) {
        this.v_entry = v_entry;
    }

    public String getV_exit() {
        return v_exit;
    }

    public void setV_exit(String v_exit) {
        this.v_exit = v_exit;
    }

    public String getV_flat() {
        return v_flat;
    }

    public void setV_flat(String v_flat) {
        this.v_flat = v_flat;
    }

    public String getV_no_of_visi() {
        return v_no_of_visi;
    }

    public void setV_no_of_visi(String v_no_of_visi) {
        this.v_no_of_visi = v_no_of_visi;
    }

    public String getV_vehi_no() {
        return v_vehi_no;
    }

    public void setV_vehi_no(String v_vehi_no) {
        this.v_vehi_no = v_vehi_no;
    }

    String v_exit;
    String v_flat;

    public visitior_data(String v_name, String v_mobile, String v_date, String v_entry, String v_exit, String v_flat,String v_no_of_visi,String v_vehi_no) {
        this.v_name = v_name;
        this.v_mobile = v_mobile;
        this.v_date = v_date;
        this.v_entry = v_entry;
        this.v_exit = v_exit;
        this.v_flat = v_flat;
        this.v_no_of_visi=v_no_of_visi;
        this.v_vehi_no=v_vehi_no;
    }


}
