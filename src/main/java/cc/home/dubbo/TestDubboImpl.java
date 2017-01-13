package cc.home.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reomte.dubbo.ScheduleTest;
import reomte.dubbo.UserService;

/**
 * Created by cheng on 2017/1/12 0012.
 */
@RestController
@RequestMapping("dubbo")
public class TestDubboImpl {

    @Autowired
    UserService userService;

    @Autowired
    ScheduleTest scheduleTest;

    @RequestMapping("users")
    public String getUser() {
        return userService.getUsers();
    }

    @RequestMapping("schedule")
    public String scheduleTest(String name) {
        String result=scheduleTest.schedule(name);
        return "success".equalsIgnoreCase(result) ? result : "error";
    }


}
