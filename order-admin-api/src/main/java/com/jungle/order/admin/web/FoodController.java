package com.jungle.order.admin.web;

import com.jungle.order.core.storage.AliyunStorage;
import com.jungle.order.core.util.JacksonUtil;
import com.jungle.order.core.util.ResponseUtil;
import com.jungle.order.db.pojo.Food;
import com.jungle.order.db.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 商品controller层
 * @author: jungle
 * @create: 2020-02-08 09:17
 */
@RestController
@RequestMapping("/admin/goods")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private AliyunStorage aliyunStorage;

    /**
     * 创建商品
     */
    @PostMapping("/create")
    public Object createGoods(@RequestBody String body){
        Food food = new Food();
        String name = JacksonUtil.parseString(body, "name");
        String describle = JacksonUtil.parseString(body, "describle");
        BigDecimal price = new BigDecimal(JacksonUtil.parseString(body, "price"));
        String url = JacksonUtil.parseString(body, "url");
        Integer dayStock = Integer.parseInt(JacksonUtil.parseString(body, "dayStock"));
//        Byte pack = Byte.parseByte(JacksonUtil.parseString(body, "pack"));
        food.setFoodId(10002);
        food.setShopId(10001);
        food.setName(name);
        food.setFoodDescrible(describle);
        food.setPrice(price);
        food.setPictureUrl(url);
        food.setDayStock(dayStock);
//        food.setPack(pack);
        int result = foodService.createFood(food);

        ResponseUtil.ok(result);

        return ResponseUtil.ok(result);
    }

    /**
     * 商品列表
     */
    @PostMapping("/list")
    public Object listGoods(@RequestBody String body){
        Integer shopId = Integer.parseInt(JacksonUtil.parseString(body, "shopId"));
        List<Food> listGoods = foodService.listGoods(shopId);
        return ResponseUtil.ok(listGoods);
    }
    /**
     * 图片存储
     * keyName: /bucketName/keyName.png
     */
    @PostMapping("/file")
    public Object create(@RequestParam("file") MultipartFile file) throws IOException {
        String key = Long.toString(stringRedisTemplate.opsForValue().increment("file",1));
        String originalFilename = file.getOriginalFilename();
        aliyunStorage.store(file.getInputStream(), file.getSize(),
                file.getContentType(), key);
        return ResponseUtil.ok();
    }
}
