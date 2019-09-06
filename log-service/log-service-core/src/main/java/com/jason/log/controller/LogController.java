package com.jason.log.controller;

import com.jason.common.model.Response;
import com.jason.log.logservice.LogService;
import com.jason.log.vo.LogShowVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/3 11:21
 * @Modify 2019/9/3 11:21
 * @Version 1.0
 */
@RestController
public class LogController {

    @Resource
    private LogService logService;

    @PostMapping(value = "/log")
    public Response log(@RequestBody LogShowVO logShowVO) {
        logShowVO.setTime(new Date());
        Response response = new Response();
        if (logService.addLog(logShowVO) > 0) {
            response.success(1, "操作成功", null);
        } else {
            response.error(-1, "操作失败");
        }
        return response;
    }

    @GetMapping(value = "/log/type")
    public Response type(@RequestParam(value = "type") String type) {
        Response response = new Response();
        List<LogShowVO> logs = logService.getByType(type);
        if (logs == null) {
            response.error(-1, "操作失败");
        } else {
            response.success(1, "操作成功", logs);
        }
        return response;
    }

    @GetMapping(value = "/log/username")
    public Response username(@RequestParam(value = "username") String username) {
        Response response = new Response();
        List<LogShowVO> logs = logService.getByUsername(username);
        if (logs == null) {
            response.error(-1, "操作失败");
        } else {
            response.success(1, "操作成功", logs);
        }
        return response;
    }

    @GetMapping(value = "/log/action")
    public Response action(@RequestParam(value = "type") String type, @RequestParam(value = "action") String action) {
        Response response = new Response();
        List<LogShowVO> logs = new ArrayList<>();
        if (logs == null) {
            response.error(-1, "操作失败");
        } else {
            response.success(1, "操作成功", logs);
        }
        return response;
    }
}
