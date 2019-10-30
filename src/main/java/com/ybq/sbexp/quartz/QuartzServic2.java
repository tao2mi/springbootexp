package com.ybq.sbexp.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

//@Component
public class QuartzServic2 {

    /*@Scheduled(fixedRate = 5000)
    public void timerToZZP(){

        System.out.println("ZZP:" + new Random().nextLong() + new SimpleDateFormat("HH:mm:ss").format(new Date()));

    }*/

    @Scheduled(cron = "0/1 * * * * ?")
    public void timerToNow(){

        System.out.println("now time:");

    }
}
