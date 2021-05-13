package org.example.leader.dao;

import org.example.leader.poji.MessageSport;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface LeaderMapper extends Mapper<MessageSport> {
}
