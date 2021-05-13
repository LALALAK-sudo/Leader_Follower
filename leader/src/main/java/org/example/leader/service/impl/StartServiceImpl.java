package org.example.leader.service.impl;

import org.example.leader.dao.LeaderMapper;
import org.example.leader.poji.MessageSport;
import org.example.leader.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StartServiceImpl implements StartService {

    @Autowired
    private LeaderMapper leaderMapper;

    @Override
    public void start() {
        MessageSport messageSport = new MessageSport();
        messageSport.setId(1);
        messageSport.setLeader_x(0.0);
        messageSport.setLeader_y(0.0);
        messageSport.setLeader_theta(0.0);
        messageSport.setLeader_v(0.0);
        messageSport.setLeader_w(0.0);
        messageSport.setFlag1("1");
        messageSport.setFlag2("1");

        leaderMapper.insert(messageSport);
    }
}
