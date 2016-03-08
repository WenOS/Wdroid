package android.library.wdroid.common.log;

public interface W_Printer {

    W_Printer t(String tag, int methodCount);

    W_Settings init(String tag);

    W_Settings getSettings();

    void d(String message, Object... args);

    void e(String message, Object... args);

    void e(Throwable throwable, String message, Object... args);

    void w(String message, Object... args);

    void i(String message, Object... args);

    void v(String message, Object... args);

    void wtf(String message, Object... args);

    void json(String json);

    void xml(String xml);

    void clear();
}
