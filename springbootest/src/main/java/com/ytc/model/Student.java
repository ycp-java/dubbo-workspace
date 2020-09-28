package com.ytc.model;

public class Student {
    private Integer sid;

    private String sname;

    private Integer ssex;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getSsex() {
        return ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", ssex=" + ssex +
                '}';
    }
}