package com.entity;

import java.util.Date;

/**
 * Created by arvin on 2018/3/26.
 */
public class Suser {
    public Suser(int userid, String username, Date userbirthday, double usersalary) {
        this.userid = userid;
        this.username = username;
        this.userbirthday = userbirthday;
        this.usersalary = usersalary;
    }

    private int userid;
    private String username;
    private Date userbirthday;
    private double usersalary;

    public Suser() {
    }

    @Override
    public String toString() {
        return "Suser{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userbirthday=" + userbirthday +
                ", usersalary=" + usersalary +
                '}';
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(Date userbirthday) {
        this.userbirthday = userbirthday;
    }

    public double getUsersalary() {
        return usersalary;
    }

    public void setUsersalary(double usersalary) {
        this.usersalary = usersalary;
    }
}
