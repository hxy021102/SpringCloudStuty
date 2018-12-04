package consumere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: hxy
 * @Date: 2018/11/30 16:29
 */
@EnableEurekaClient
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    /**
     * 必须加上，不然启动不了
     * @return
     */
    @Bean    //加入bean容器中
    @LoadBalanced
    //支持负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
