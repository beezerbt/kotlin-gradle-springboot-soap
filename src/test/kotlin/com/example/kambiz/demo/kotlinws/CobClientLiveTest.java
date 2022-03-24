package com.example.kambiz.demo.kotlinws;

import com.proximus.cloudfusionplus.service.connector.cob.CobClient;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CobClient.class, loader = AnnotationConfigContextLoader.class)
public class CobClientLiveTest {

    @Autowired
    CobClient client;

    @Test
    public void givenCobClient_whenInstantiatingTheClient_thenItSuccessfullyInstantiateIt() {
        Assert.assertNotNull(client);
    }
}
