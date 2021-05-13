package org.example.canal.listener;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.xpand.starter.canal.annotation.CanalEventListener;
import com.xpand.starter.canal.annotation.ListenPoint;
import org.example.canal.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@CanalEventListener
public class LeaderListener {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @ListenPoint(schema = "leader_follower", table = {"leader_follower_table"}, eventType = CanalEntry.EventType.UPDATE)
    public void leaderUpdate(CanalEntry.EventType eventType, CanalEntry.RowData rowData) {
        //修改前数据 放到oldMap
        Map oldMap=new HashMap<>();
        for(CanalEntry.Column column: rowData.getBeforeColumnsList()) {
            oldMap.put(column.getName(),column.getValue());
        }

        //修改后数据 放到newMap
        Map newMap=new HashMap<>();
        for(CanalEntry.Column column: rowData.getAfterColumnsList()) {
            newMap.put(column.getName(),column.getValue());
        }


        // flag1 从0->1表示该数据已经被follow获取
        if("0".equals(oldMap.get("flag1")) && "1".equals(newMap.get("flag1")) &&
          "0".equals(oldMap.get("flag2")) && "1".equals(newMap.get("flag2"))) {
            rabbitTemplate.convertAndSend(RabbitMQConfig.SPORT_SENT_EXCHANGE,"",newMap);
        }

    }

}
