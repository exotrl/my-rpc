package com.trl.example.consumer;

import com.trl.example.common.model.User;
import com.trl.example.common.service.UserService;
import com.trl.yurpc.config.RpcConfig;
import com.trl.yurpc.proxy.ServiceProxyFactory;
import com.trl.yurpc.utils.ConfigUtils;

/**
 * 简易服务消费者示例
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @learn <a href="https://codefather.cn">编程宝典</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public class ConsumerExample {

    public static void main(String[] args) {
        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);

        User user = new User();
        user.setName("yupi");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }

        long number = userService.getNumber();
        System.out.println(number);
    }
}
