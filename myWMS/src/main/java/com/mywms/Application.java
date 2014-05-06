package com.mywms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.mywms.data.jpa.SampleDataJpaApplication;
import com.mywms.secure.SampleWebSecureApplication;
import com.mywms.ui.SampleWebUiApplication;

@Configuration
@Import(value={SampleDataJpaApplication.class, SampleWebUiApplication.class, SampleWebSecureApplication.class})
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
