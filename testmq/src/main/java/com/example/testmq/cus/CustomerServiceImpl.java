package com.example.testmq.cus;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public void custom() {
        rocketMQTemplate.convertAndSend("springboot-mq","hello springboot rocketmq");
    }
}
