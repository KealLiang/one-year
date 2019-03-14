package com.kealliang.service;

import com.kealliang.base.KealTransactionalTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PropagationServiceTest extends KealTransactionalTests {

    @Autowired
    private PropagationService propagationService;

    @Test
    public void aa() {
        propagationService.aa();
    }

    @Test
    public void bb() {
        propagationService.bb();
    }
}