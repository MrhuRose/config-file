package com.melo.springboot;

import com.melo.springboot.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PERSIST_STORE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigFileApplicationTests {


    @Autowired
    Person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }


}
