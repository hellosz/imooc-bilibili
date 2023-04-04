package com.imooc.bilibili.api.controller;

import com.imooc.bilibili.dao.common.JsonResponse;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @ClassName: RestController
 * @description: restful 事例
 * @author: Neng.Tian
 * @create: 2023-03-27 21:47
 **/
@RestController
public class ObjectsController {
    private static Map<Integer, Map<String, Object>> objMap = new HashMap<>();

    public ObjectsController() {
        // 初始化
        for (int i = 1; i < 4; i++) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("id", i);
            hashMap.put("name", "name" + i);

            objMap.put(i, hashMap);
        }
    }

    @GetMapping("/objects")
    public JsonResponse<Map<Integer, Map<String, Object>>> getObjects() {
        return JsonResponse.success(objMap);
    }

    @GetMapping("/objects/{id}")
    public JsonResponse<Map<String, Object>> getObject(@PathVariable Integer id) {
        return JsonResponse.success(objMap.get(id));
    }


    @DeleteMapping("/objects/{id}")
    public JsonResponse<Object> delObject(@PathVariable Integer id) {
        objMap.remove(id);

        String msg = "delete key :" + id + " successful";
        return JsonResponse.success(msg, null);
    }

    @PostMapping("/objects")
    public JsonResponse<Object> postObject(@RequestBody Map<String, Object> reqMap) {
        // 取当前最大的 ID
        Optional<Integer> max = objMap.keySet().stream()
                .max(Comparator.comparing(Integer::intValue));

        if (max.isPresent()) {
            Integer nextId = max.get() + 1;

            objMap.put(nextId, reqMap);
        } else {
            objMap.put(1, reqMap);
        }

        return JsonResponse.success();
    }

    @PutMapping(value = "/objects")
    public String putObject(@RequestBody Map<Integer, Map<String , Object>> reqMap) {
        // 获取 key
        Set<Map.Entry<Integer, Map<String, Object>>> entries = reqMap.entrySet();

        if (entries.size() > 0) {
            Map.Entry<Integer, Map<String, Object>> firstEntry = entries.stream().findFirst().get();

            Integer key = firstEntry.getKey();
            Map<String, Object> value = firstEntry.getValue();

            if (objMap.containsKey(key)) {
                objMap.put(key, value);

                return "update successful:" + reqMap;
            }
        }

        return "update failed";
    }
}
