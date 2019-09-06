package com.jason.log.logservice.impl;

import com.jason.log.dao.LogDao;
import com.jason.log.logservice.LogService;
import com.jason.log.model.Log;
import com.jason.log.vo.LogShowVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/3 11:06
 * @Modify 2019/9/3 11:06
 * @Version 1.0
 */
@Service
public class LogServiceImpl implements LogService {

    @Resource
    private LogDao logDao;

    @Override
    public Integer addLog(LogShowVO logShowVO) {

        Log log = new Log();
        BeanUtils.copyProperties(logShowVO, log);
        return logDao.addLog(log);
    }

    @Override
    public List<LogShowVO> getByUsername(String username) {
        List<Log> logs = logDao.getLogsByUsername(username);

        return convert(logs);
    }

    @Override
    public List<LogShowVO> getByType(String type) {
        List<Log> logs = logDao.getLogsByType(type);
        return convert(logs);
    }

    @Override
    public List<LogShowVO> getByTypeAndAction(String type, String action) {
        List<Log> logs = logDao.getLogsByTypeAndAction(type, action);
        return convert(logs);
    }

    /**
     * 查询结果从po到vo的转换
     *
     * @param logs
     * @return
     */
    private List<LogShowVO> convert(List<Log> logs) {
        List<LogShowVO> result = new ArrayList<>();
        for (Log log : logs) {
            LogShowVO show = new LogShowVO();
            BeanUtils.copyProperties(log, show);
            result.add(show);
        }
        return result;
    }
}
