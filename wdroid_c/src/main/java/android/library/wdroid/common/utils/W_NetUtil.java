package android.library.wdroid.common.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


public class W_NetUtil {

    /**
     * 判断当前是否有可用的网络以及网络类型
     *
     * @param context
     * @return 0：无网络 1：WIFI 2：CMWAP 3：CMNET
     */
    public static int isNetworkAvailable(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context
            .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity == null) {
            return 0;
        } else {
            NetworkInfo[] infos = connectivity.getAllNetworkInfo();
            if (infos != null) {
                for (NetworkInfo info : infos) {
                    if (info.getState() == NetworkInfo.State.CONNECTED) {
                        if (info.getType() == ConnectivityManager.TYPE_WIFI) {
                            return 1;
                        } else if (info.getType() == ConnectivityManager.TYPE_MOBILE) {
                            String extraInfo = info.getExtraInfo();
                            if ("cmwap".equalsIgnoreCase(extraInfo)
                                || "cmwap:gsm".equalsIgnoreCase(extraInfo))
                                return 2;
                            return 3;
                        }
                    }
                }
            }
        }
        return 0;
    }
}
