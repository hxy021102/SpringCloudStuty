package consumere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: hxy
 * @Date: 2018/11/30 16:29
 */
@RestController
public class ConsumeMemberController {
    @Autowired
    ConsumeMemberService memberService;
    @RequestMapping("/getOrderUserAll")
    public List<String> getOrderUserList(){
        return memberService.getOrderByUserList();
    }

}
