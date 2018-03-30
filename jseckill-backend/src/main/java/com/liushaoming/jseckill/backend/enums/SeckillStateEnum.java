package com.liushaoming.jseckill.backend.enums;

/**
 * 使用枚举表述常量数据字段
 * Created by liushaoming on 2019-01-14.
 */
public enum SeckillStateEnum {
    SUCCESS(1,"秒杀成功"),
    END(0,"秒杀结束"),
    REPEAT_KILL(-1,"重复秒杀"),
    /**
     * 运行时才能检测到的所有异常
     */
    INNER_ERROR(-2,"系统内部异常"),
    /**
     * md5错误的数据篡改
     */
    DATA_REWRITE(-3,"数据篡改"),
    CONCURRENCY_ERROR(-4, "数据库并发错误");

    private int state;
    private String stateInfo;

    SeckillStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static SeckillStateEnum stateOf(int index) {
        for (SeckillStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
