package com.example.alibou;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("custom-file-2.properies")
})

public class MyFirstService {

    private final MyFirstClass myFirstClass;

    @Value("${my.custom.property}")
    private String customProperties;
    @Value("${my.custom.property.int}")
    private int customPropertiesInt;

    public MyFirstService(@Qualifier("bean2") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }


    public String tellAStory(){
        return "the dependency is saying: " + myFirstClass.sayHello();
    }


    public String getCustomProperties(){
        return customProperties;
    }
    public int getCustomPropertiesInt(){
        return customPropertiesInt;
    }



}
