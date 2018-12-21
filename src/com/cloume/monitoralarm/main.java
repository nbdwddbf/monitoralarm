package com.cloume.monitoralarm;

import com.cloume.monitoralarm.service.AlarmService;
import com.cloume.monitoralarm.util.MonitorAlarmUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: monitoralarm
 * @description: TODO
 * @author: dabuff
 * @create: 2018-12-20 15:20
 */
public class main {
    public static void main(String[] args) throws InterruptedException {
        MonitorAlarmUtil monitorAlarmUtil= new MonitorAlarmUtil();
        AlarmService alarmService = new AlarmService();

        Map<String,Object> map = new HashMap<>();
        map.put("ip", "192.168.31.18");
        map.put("port", 8000);
        map.put("username", "admin");
        map.put("password", "pl,okm2018");

        monitorAlarmUtil.register(map,alarmService);
        Thread.sleep(60000);

    }
}