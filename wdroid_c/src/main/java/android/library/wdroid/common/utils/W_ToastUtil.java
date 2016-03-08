package android.library.wdroid.common.utils;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;


public class W_ToastUtil {//WenMark : not finish...20160308-->showImageToast(Context context, int ImageResId, String text, int times)

    private static Toast mToast;

    private static Handler mHandler = new Handler();

    private static Runnable run = new Runnable() {
        @Override
        public void run() {
            mToast.show();
        }
    };

    /**
     * show short toast
     *
     * @param context : context
     * @param text    : the msg you will show
     */
    public static void showShortToast(Context context, String text) {
        showImageToast(context, 0, text, Toast.LENGTH_SHORT);
    }

    /**
     * show toast with image
     *
     * @param context    :context
     * @param ImageResId :imgres id
     * @param text       :the msg you will show
     * @param times      :time
     */
    @SuppressWarnings("static-access")
    public static void showImageToast(Context context, int ImageResId, String text, int times) {
        if (context == null || text == null || "".equals(text))
            return;

//        LayoutInflater inflater = (LayoutInflater) context
//            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        View view = inflater.inflate(R.layout.dfjk_lay_custom_toast, null);
//        ImageView image = (ImageView) view.findViewById(R.id.dfjk_im_toast_image);
//        TextView textView = (TextView) view.findViewById(R.id.dfjk_tv_toast_message);
//
//        if (0 != ImageResId) {
//            image.setVisibility(view.VISIBLE);
//            image.setImageResource(ImageResId);
//        } else
//            image.setVisibility(view.GONE);
//        textView.setText(text);
//        mHandler.removeCallbacks(run);
//
//        if (mToast != null) {
//            mToast.cancel();
//            mToast = new Toast(context);
//            mToast.setDuration(times);
//            mToast.setGravity(Gravity.BOTTOM, 0, 150);
//            mToast.setView(view);
//            mHandler.postDelayed(run, 500);
//        } else {
//            mToast = new Toast(context);
//            mToast.setDuration(times);
//            mToast.setGravity(Gravity.BOTTOM, 0, 150);
//            mToast.setView(view);
//            mToast.show();
//        }

    }

    /**
     * show long toast
     * See{@link #showImageToast(Context, int, String, int)}
     *
     * @param context :context
     * @param text    :the msg you will show
     */
    public static void showLongToast(Context context, String text) {
        showImageToast(context, 0, text, Toast.LENGTH_LONG);
    }

    /**
     * show Short Image Toast
     * See{@link #showImageToast(Context, int, String, int)}
     *
     * @param context    :context
     * @param ImageResId : imageres id
     * @param text       : the msg you will show
     */

    public static void showShortImageToast(Context context, int ImageResId, String text) {
        showImageToast(context, ImageResId, text, Toast.LENGTH_SHORT);
    }

    /**
     * show long image toast
     * See{@link #showImageToast(Context, int, String, int)}
     *
     * @param context    :context
     * @param ImageResId :imageres id
     * @param text       :the msg you will show
     */

    public static void showLongImageToast(Context context, int ImageResId, String text) {
        showImageToast(context, ImageResId, text, Toast.LENGTH_LONG);
    }
}
