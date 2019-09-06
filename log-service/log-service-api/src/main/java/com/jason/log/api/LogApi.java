package com.jason.log.api;

import com.jason.common.model.Response;
import com.jason.log.vo.LogShowVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Jason
 * @CreateTime 2019/9/3 10:28
 * @Modify 2019/9/3 10:28
 * @Version 1.0
 */
@FeignClient(value = "log-service")
public interface LogApi {

    @RequestMapping(value = "/log", method = RequestMethod.POST)
    Response log(@RequestBody LogShowVO logShowVO);

    @RequestMapping(value = "/log/type", method = RequestMethod.GET)
    Response type(@RequestParam(value = "type") String type);

    @RequestMapping(value = "/log/action", method = RequestMethod.GET)
    Response action(@RequestParam(value = "type") String type, @RequestParam(value = "action") String action);

    @RequestMapping(value = "/log/username", method = RequestMethod.GET)
    Response username(@RequestParam(value = "username") String username);
}
