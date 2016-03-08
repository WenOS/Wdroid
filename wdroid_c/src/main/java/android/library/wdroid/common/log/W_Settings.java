package android.library.wdroid.common.log;

public final class W_Settings {

    private int methodCount = 2;
    private boolean showThreadInfo = true;
    private int methodOffset = 0;
    private W_LogCallBack wLogCallBack;


    private W_LogLevel logLevel = W_LogLevel.FULL;

    public W_Settings hideThreadInfo() {
        showThreadInfo = false;
        return this;
    }

    public W_Settings logTool(W_LogCallBack wLogCallBack) {
        this.wLogCallBack = wLogCallBack;
        return this;
    }

    public int getMethodCount() {
        return methodCount;
    }

    /**
     * Use {@link #methodCount}
     */
    @Deprecated
    public W_Settings setMethodCount(int methodCount) {
        return methodCount(methodCount);
    }

    public W_Settings methodCount(int methodCount) {
        if (methodCount < 0) {
            methodCount = 0;
        }
        this.methodCount = methodCount;
        return this;
    }

    public boolean isShowThreadInfo() {
        return showThreadInfo;
    }

    public W_LogLevel getLogLevel() {
        return logLevel;
    }

    /**
     * Use {@link #logLevel}
     */
    @Deprecated
    public W_Settings setLogLevel(W_LogLevel logLevel) {
        return logLevel(logLevel);
    }

    public W_Settings logLevel(W_LogLevel logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    public int getMethodOffset() {
        return methodOffset;
    }

    /**
     * Use {@link #methodOffset}
     */
    @Deprecated
    public W_Settings setMethodOffset(int offset) {
        return methodOffset(offset);
    }

    public W_Settings methodOffset(int offset) {
        this.methodOffset = offset;
        return this;
    }

    public W_LogCallBack getwLogCallBack() {
        if (wLogCallBack == null) {
            wLogCallBack = new W_LogTool();
        }
        return wLogCallBack;
    }
}
