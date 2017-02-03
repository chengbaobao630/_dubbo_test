package cc.home.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reomte.dubbo.ScheduleTest;

/**
 * Created by cheng on 2017/1/12 0012.
 */
@RestController
@RequestMapping("dubbo")
public class TestDubboImpl {

/*    @Autowired
    UserService userService;*/

    @Reference(version = "1.0.0")
    ScheduleTest scheduleTest;

    @RequestMapping("schedule")
    public String scheduleTest(String name) {
        String result=scheduleTest.schedule(name);
        return "success".equalsIgnoreCase(result) ? result : "error";
    }


}
