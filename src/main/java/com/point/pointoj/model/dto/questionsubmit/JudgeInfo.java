package com.point.pointoj.model.dto.questionsubmit;

import lombok.Data;

/**
 * 判题信息
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行的信息
     */
    private String message;

    /**
     * 消耗的内存
     */
    private Long memory;

    /**
     * 消耗时间
     */
    private Long time;
}
