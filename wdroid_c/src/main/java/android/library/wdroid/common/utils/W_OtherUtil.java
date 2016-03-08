package android.library.wdroid.common.utils;

public class W_OtherUtil {

    /**
     * Get the currentThread StackTrace
     * <p>VMStack.getThreadStackTrace<p/>
     *
     * @return
     */
    public static StackTraceElement getCallerStackTraceElement() {
        return Thread.currentThread().getStackTrace()[4];
    }


}
