package com.jason.log.logservice;

import com.jason.log.vo.LogShowVO;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/3 11:03
 * @Modify 2019/9/3 11:03
 * @Version 1.0
 */
public interface LogService {

    Integer addLog(LogShowVO logShowVO);

    List<LogShowVO> getByUsername(String username);

    List<LogShowVO> getByType(String type);

    List<LogShowVO> getByTypeAndAction(String type, String action);
}
