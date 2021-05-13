package org.example.canal.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    // 定义交换机名称
    public static final String SPORT_SENT_EXCHANGE = "sport_sent_exchange";

    // 定义队列名称
    public static final String SPORT_SENT_1_QUEUE = "sport_sent_1_queue";
    public static final String SPORT_SENT_2_QUEUE = "sport_sent_2_queue";

    // 声明队列
    @Bean(SPORT_SENT_1_QUEUE)
    public Queue queue1() {
        return new Queue(SPORT_SENT_1_QUEUE);
    }

    @Bean(SPORT_SENT_2_QUEUE)
    public Queue queue2() {
        return new Queue(SPORT_SENT_2_QUEUE);
    }

    @Bean(SPORT_SENT_EXCHANGE)
    // 声明交换机
    public Exchange exchange() {
        return ExchangeBuilder.fanoutExchange(SPORT_SENT_EXCHANGE).durable(true).build();
    }

    // 队列和交换机绑定
    @Bean
    public Binding SPORT_SENT_EXCHANGE_BINDING1(@Qualifier(SPORT_SENT_1_QUEUE)Queue queue, @Qualifier(SPORT_SENT_EXCHANGE)Exchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("").noargs();
    }

    @Bean
    public Binding SPORT_SENT_EXCHANGE_BINDING2(@Qualifier(SPORT_SENT_2_QUEUE)Queue queue, @Qualifier(SPORT_SENT_EXCHANGE)Exchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("").noargs();
    }
}