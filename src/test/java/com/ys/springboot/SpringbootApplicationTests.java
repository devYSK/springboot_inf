package com.ys.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;


@TestPropertySource(properties = "youngsoo.name=youngsoo1")
@SpringBootTest(properties = "youngsoo.name=youngsoo2")
class SpringbootApplicationTests {

    @Autowired
    Environment environment;

    @Test
    void contextLoads() {
        assertThat(environment.getProperty("youngsoo.name"))
                .isEqualTo("youngsoo");
    }

}
