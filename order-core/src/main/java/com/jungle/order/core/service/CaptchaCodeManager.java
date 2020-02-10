package com.jungle.order.core.service;

import com.jungle.order.core.dto.CaptchaItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * 缓存系统中的验证码
 */
@Component
public class CaptchaCodeManager {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 添加到缓存
     * @param phoneNumber 电话号码
     * @param code        验证码
     */
    public boolean addToCache(String phoneNumber, String code) {
        if(stringRedisTemplate.opsForValue().get(phoneNumber) != null){
            return false;
        }
        stringRedisTemplate.opsForValue().set(phoneNumber, code, 60*1000, TimeUnit.MILLISECONDS);
        return true;
    }
    /**
     * 获取缓存的验证码
     *
     * @param phoneNumber 关联的电话号码
     * @return 验证码
     */
    public String getCachedCaptcha(String phoneNumber) {
        String result = stringRedisTemplate.opsForValue().get(phoneNumber);
        return result;
    }
    /*private static ConcurrentHashMap<String, CaptchaItem> captchaCodeCache = new ConcurrentHashMap<>();

    *//**
     * 添加到缓存
     *
     * @param phoneNumber 电话号码
     * @param code        验证码
     *//*
    public static boolean addToCache(String phoneNumber, String code) {
        checkCaptcha();
        //已经发过验证码且验证码还未过期
        if (captchaCodeCache.get(phoneNumber) != null) {
            if (captchaCodeCache.get(phoneNumber).getExpireTime().isAfter(LocalDateTime.now())) {
                return false;
            } else {
                //存在但是已过期，删掉
                captchaCodeCache.remove(phoneNumber);
            }
        }

        CaptchaItem captchaItem = new CaptchaItem();
        captchaItem.setPhoneNumber(phoneNumber);
        captchaItem.setCode(code);
        // 有效期为1分钟
        captchaItem.setExpireTime(LocalDateTime.now().plusMinutes(1));

        captchaCodeCache.put(phoneNumber, captchaItem);

        return true;
    }

    *//**
     * 获取缓存的验证码
     *
     * @param phoneNumber 关联的电话号码
     * @return 验证码
     *//*
    public static String getCachedCaptcha(String phoneNumber) {
        //没有这个电话记录
        if (captchaCodeCache.get(phoneNumber) == null)
            return null;

        //有电话记录但是已经过期
        if (captchaCodeCache.get(phoneNumber).getExpireTime().isBefore(LocalDateTime.now())) {
            return null;
        }

        return captchaCodeCache.get(phoneNumber).getCode();
    }

    *//**
     * 检测并清除过期缓存验证码
     *//*
    public static void checkCaptcha(){
        Iterator<Map.Entry<String, CaptchaItem>> entries = captchaCodeCache.entrySet().iterator();
        System.out.println("检测并清除过期缓存验证码");
        while (entries.hasNext()) {
            Map.Entry<String, CaptchaItem> entry = entries.next();
            if(captchaCodeCache.get(entry.getKey()).getExpireTime().isBefore(LocalDateTime.now())) {
                captchaCodeCache.remove(entry.getKey());
            }
        }
    }*/
}
