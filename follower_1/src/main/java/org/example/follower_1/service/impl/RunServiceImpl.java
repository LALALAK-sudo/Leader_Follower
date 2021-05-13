package org.example.follower_1.service.impl;

import org.example.follower_1.dao.Follower1Mapper;
import org.example.follower_1.poji.MessageSport;
import org.example.follower_1.service.RunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
public class RunServiceImpl implements RunService {
    @Autowired
    private Follower1Mapper follower1Mapper;

    @Override
    public void run(Map map) {
        double leader_x = Double.parseDouble((String) map.get("leader_x")) ;
        double leader_y = Double.parseDouble((String) map.get("leader_y")) ;
        double leader_theta = Double.parseDouble((String) map.get("leader_theta")) ;
        double leader_v = Double.parseDouble((String) map.get("leader_v")) ;
        System.out.println(map.get("leader_w"));
        double leader_w = Double.parseDouble((String) map.get("leader_w")) ;
        this.outPutRun(map);

        MessageSport messageSport = new MessageSport(1,leader_x,leader_y,leader_theta,leader_v,leader_w,"1", (String) map.get("flag2"));

        follower1Mapper.updateByPrimaryKey(messageSport);

    }

    private void outPutRun(Map map) {
        // 写输出
    }
}
