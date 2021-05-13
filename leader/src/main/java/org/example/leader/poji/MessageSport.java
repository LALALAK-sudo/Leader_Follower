package org.example.leader.poji;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class MessageSport implements Serializable {
    @Id
    private Integer id;

    private double leader_x;
    private double leader_y;
    private double leader_theta;
    private double leader_v;
    private double leader_w;
    private String flag1;
    private String flag2;

    public String getFlag1() {
        return flag1;
    }

    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }

    public String getFlag2() {
        return flag2;
    }

    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getLeader_x() {
        return leader_x;
    }

    public void setLeader_x(double leader_x) {
        this.leader_x = leader_x;
    }

    public double getLeader_y() {
        return leader_y;
    }

    public void setLeader_y(double leader_y) {
        this.leader_y = leader_y;
    }

    public double getLeader_theta() {
        return leader_theta;
    }

    public void setLeader_theta(double leader_theta) {
        this.leader_theta = leader_theta;
    }

    public double getLeader_v() {
        return leader_v;
    }

    public void setLeader_v(double leader_v) {
        this.leader_v = leader_v;
    }

    public double getLeader_w() {
        return leader_w;
    }

    public void setLeader_w(double leader_w) {
        this.leader_w = leader_w;
    }

}
