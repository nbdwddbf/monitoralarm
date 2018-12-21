package com.cloume.monitoralarm.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @program: monitoralarm
 * @description: TODO
 * @author: dabuff
 * @create: 2018-12-20 15:21
 */
public class AlarmService implements IAlarmService {
    @Override
    public void onFaceSnaped(String ip, byte[] bytes, int length, long time) {
        //System.out.println(ip);
        /**
         * 下面是接受到图片之后你要写的部分，我给出例子，你参考一下
         * 还需要将lib文件夹下面的所有东西放到C:\Windows\System32下
         */
        try {
            FileOutputStream small = new FileOutputStream(System.getProperty("user.dir") + "\\pictures\\" + ip + time + "small.jpg");

            if (length > 0) {
                try {
                    small.write(bytes, 0, length);
                    small.close();
                } catch (IOException ex) {
                    Logger.getLogger(AlarmService.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}