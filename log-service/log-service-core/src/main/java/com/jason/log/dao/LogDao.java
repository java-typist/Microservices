package com.jason.log.dao;

import com.jason.log.model.Log;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/3 10:51
 * @Modify 2019/9/3 10:51
 * @Version 1.0
 */
@Repository
public interface LogDao {

    Integer addLog(Log log);

    List<Log> getLogsByUsername(String username);

    List<Log> getLogsByType(String type);

    List<Log> getLogsByTypeAndAction(String type, String action);

}
