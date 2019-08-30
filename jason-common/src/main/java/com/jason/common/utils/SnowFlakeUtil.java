package com.jason.common.utils;

/**
 * 分布式唯一ID生成算法(抄的)
 */
public class SnowFlakeUtil {

    private static final long START_TEM = 1480166465631L;    //开始的时间戳
    private static final long SEQUENCE_BIT = 12;     //序列号所占用的位数
    private static final long MACHINE_BIT = 5;        //机器标识所占用的位数
    private static final long DATAENTER_BIT = 5;        //数据中心所占用的位数

    private final static long MAX_DATAENTER_NUM = -1L ^ (-1L << DATAENTER_BIT);
    private final static long MAX_MACHINE_NUM = -1L ^ (-1L << MACHINE_BIT);
    private final static long MAX_SEQUENCE_NUM = -1L ^ (-1L << SEQUENCE_BIT);

    private final static long MACHINE_LEFT = SEQUENCE_BIT;
    private final static long DATAENTER_LEFT = SEQUENCE_BIT + MACHINE_BIT;
    private final static long TIMESTEMP_LEFT = DATAENTER_LEFT + DATAENTER_BIT;

    private long dataId;
    private long machineId;
    private long sequence = 0L;
    private long lastStmp = -1L;

    public SnowFlakeUtil(long dataId, long machineId) {
        if (dataId > MAX_DATAENTER_NUM || dataId < 0) {
            throw new IllegalArgumentException("dataCenter can`t greater than MAX_DATAENTER_NUM or less than 0");
        }
        if (machineId > MAX_MACHINE_NUM || machineId < 0) {
            throw new IllegalArgumentException("machineId can`t greater than MAX_MACHINE_NUM or less than 0");
        }
        this.dataId = dataId;
        this.machineId = machineId;
    }

    public synchronized long nextId() {
        long currStmp = getNewStmp();
        //若当前时间小于上一次ID生成时间，说明系统时间回退过，这个时候需抛出异常
        if (currStmp < lastStmp) {
            throw new RuntimeException("Clock moved backwards, Refusing to generate id");
        }

        if (currStmp == lastStmp) {
            sequence = (sequence + 1) & MAX_SEQUENCE_NUM;
            if (sequence == 0L) {
                currStmp = getNextMill();
            }
        } else {
            sequence = 0L;
        }
        lastStmp = currStmp;
        return (currStmp - START_TEM) << TIMESTEMP_LEFT
                | dataId << DATAENTER_LEFT
                | machineId << MACHINE_LEFT
                | sequence;
    }

    private long getNextMill() {
        long mill = getNewStmp();

        while (mill <= lastStmp) {
            mill = getNewStmp();
        }
        return mill;
    }

    private long getNewStmp() {
        return System.currentTimeMillis();
    }
}
