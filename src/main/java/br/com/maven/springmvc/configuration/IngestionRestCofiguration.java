package br.com.maven.springmvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by felipe on 06/11/15.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "br.com.maven.springmvc")
public class IngestionRestCofiguration {

}
