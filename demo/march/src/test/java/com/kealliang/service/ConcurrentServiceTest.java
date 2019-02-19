package com.kealliang.service;

import com.meicloud.sahara.test.HrmsContextTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConcurrentServiceTest extends HrmsContextTests {

    @Autowired
    private ConcurrentService concurrentService;

    @Test
    public void add() {
        concurrentService.add();
    }
}