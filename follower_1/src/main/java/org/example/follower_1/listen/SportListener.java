package org.example.follower_1.listen;

import com.alibaba.fastjson.JSON;
import org.example.follower_1.config.RabbitMQConfig;
import org.example.follower_1.service.RunService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SportListener {
    @Autowired
    private RunService runService;

    @RabbitListener(queues = RabbitMQConfig.SPORT_SENT_1_QUEUE)
    public void receiveMessage(Map message) {
        System.out.println("接收到的消息"+message);

        //Map map = JSON.parseObject(message, Map.class);

        runService.run(message);
    }
}

