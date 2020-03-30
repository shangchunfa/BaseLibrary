package com.android.module.baselibrary.common;

/**
 * 配置类
 * Created by fa on 2020/3/30.
 */
public class ConstantsConfig {

    // 是否debug模式=======》打包上线改为 false
    boolean isDebug = true;
    // 是否显示日志=======》打包上线改为 false
    boolean isShowLog = true;
    // 是否保存日志到本地
    boolean isSaveLog = false;
    // Activity是否支持矢量图
    boolean isCompatVectorSupport = false;

    // 网络连接的超时时间（秒）
    int CONNECT_TIMEOUT = 15;
    // 网络数据读取的超时时间（秒）
    int READ_TIMEOUT = 100;
    // 网络数据写入的超时时间（秒）
    int WRITE_TIMEOUT = 100;
    // 请求超时的提示错误码
    String CODE_ERROR_REQUEST = "timeOut";
    // 网络无连接的错误码
    String CODE_NETWORK_CONNECTIONLESS = "unConnect";
    // 崩溃后要启动的Activity的全类名
    String RESTART_ACTIVITY_NAME = "com.ydxf.user.ui.activity.SplashActivity";
    // 存放加密密钥的Header的Key
    String ENCRYPT_REQUEST_HEADER_KEY = "encrypt-key";
}
