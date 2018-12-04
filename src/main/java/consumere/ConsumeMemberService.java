package consumere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: hxy
 * @Date: 2018/11/30 16:27
 */
@SuppressWarnings("unchecked")
@Service
public class ConsumeMemberService {

    @Autowired
    RestTemplate restTemplate;

    public List<String> getOrderByUserList() {
        return restTemplate.getForObject("http://provider-member-service/getUserList", List.class);
    }
}
