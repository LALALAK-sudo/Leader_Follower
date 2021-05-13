package org.example.leader.service.impl;

import org.example.leader.dao.LeaderMapper;
import org.example.leader.poji.MessageSport;
import org.example.leader.service.RunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RunServiceImpl implements RunService {

    @Autowired
    private LeaderMapper leaderMapper;

    @Override
    public void run(MessageSport messageSport1) {

        MessageSport messageSport = new MessageSport();
        messageSport.setId(1);
        messageSport.setLeader_x(1.0);
        messageSport.setLeader_y(1.0);
        messageSport.setLeader_theta(1.0);
        messageSport.setLeader_v(1.0);
        messageSport.setLeader_w(1.0);
        messageSport.setFlag1("0");
        messageSport.setFlag2("0");

        leaderMapper.updateByPrimaryKey(messageSport);
    }
}
