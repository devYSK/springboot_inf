package com.ys.springboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter @Setter
@ConfigurationProperties("youngsoo")
public class YoungsooProperties {

    private String name;

    private int age;

    private String fullName;

}
