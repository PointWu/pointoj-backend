package com.point.pointoj.judge;

import com.point.pointoj.judge.strategy.DefaultJudgeStrategy;
import com.point.pointoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.point.pointoj.judge.strategy.JudgeContext;
import com.point.pointoj.judge.strategy.JudgeStrategy;
import com.point.pointoj.judge.codesandbox.model.JudgeInfo;
import com.point.pointoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
