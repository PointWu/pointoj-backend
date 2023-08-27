package com.point.pointoj.judge.codesandbox.impl;


import com.point.pointoj.judge.codesandbox.CodeSandbox;
import com.point.pointoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.point.pointoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的代ß码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
