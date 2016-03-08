package android.library.wdroid.common.log;


public final class W_Log {

    private static final String DEFAULT_TAG = "=>DFJK_LOG";
    private static W_Printer wPrinter;


    private W_Log() {
    }

    public static W_Settings init() {
        return init(DEFAULT_TAG);
    }

    public static W_Settings init(String tag) {
        wPrinter = new W_LogPrinter();
        return wPrinter.init(tag);
    }

    public static void clear() {
        wPrinter.clear();
        wPrinter = null;
    }

    public static W_Printer t(String tag) {
        return wPrinter.t(tag, wPrinter.getSettings().getMethodCount());
    }

    public static W_Printer t(int methodCount) {
        return wPrinter.t(null, methodCount);
    }

    public static W_Printer t(String tag, int methodCount) {
        return wPrinter.t(tag, methodCount);
    }

    public static void d(String message, Object... args) {
        wPrinter.d(message, args);
    }

    public static void e(String message, Object... args) {
        wPrinter.e(null, message, args);
    }

    public static void e(Throwable throwable, String message, Object... args) {
        wPrinter.e(throwable, message, args);
    }

    public static void i(String message, Object... args) {
        wPrinter.i(message, args);
    }

    public static void v(String message, Object... args) {
        wPrinter.v(message, args);
    }

    public static void w(String message, Object... args) {
        wPrinter.w(message, args);
    }

    public static void wtf(String message, Object... args) {
        wPrinter.wtf(message, args);
    }

    public static void json(String json) {
        wPrinter.json(json);
    }

    public static void xml(String xml) {
        wPrinter.xml(xml);
    }

}
