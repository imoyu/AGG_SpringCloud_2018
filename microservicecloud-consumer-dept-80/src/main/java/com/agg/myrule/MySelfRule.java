package com.agg.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
//        return new RandomRule(); // Ribbon默认是轮询，这里定义为随机
        return new RandomRule_ZY();  // 自定义为每个机器被访问5次
    }
}