package com.ys.springboot;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter @Setter
@ConfigurationProperties("holoman")
public class HolomanProperties {

    private String name;

    private int howLong;
}
