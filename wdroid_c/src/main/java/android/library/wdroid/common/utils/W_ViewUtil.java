package android.library.wdroid.common.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.IdRes;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import static android.content.Context.INPUT_METHOD_SERVICE;
import static android.view.View.GONE;
import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;


public class W_ViewUtil {


    public static View getRootView(Window w) {
        return w.findViewById(android.R.id.content).getRootView();
    }

    public static <T extends View> T findViewById(Activity activity, @IdRes int id) {
        T v = (T) activity.findViewById(id);
        return v;
    }

    public static void setIsInvisible(boolean invisible, View... views) {
        for (View view : views) {
            view.setVisibility(invisible ? INVISIBLE : VISIBLE);
        }
    }

    public static void setIsGone(boolean gone, View... views) {
        for (View view : views) {
            view.setVisibility(gone ? GONE : VISIBLE);
        }
    }

    public static void setIsEnabled(boolean enabled, View... views) {
        for (View view : views) {
            view.setEnabled(enabled);
        }
    }

    public static void setClickListener(View.OnClickListener l, View... views) {
        for (View view : views) {
            view.setOnClickListener(l);
        }
    }

    public static void setClickListener(View.OnClickListener l, View parent, @IdRes int... viewId) {
        for (int id : viewId) {
            findViewById(parent, id).setOnClickListener(l);
        }
    }

    public static <T extends View> T findViewById(View parent, int id) {
        T v = (T) parent.findViewById(id);
        return v;
    }

    public static void setEditTextNull(EditText... editTexts) {
        for (EditText eds : editTexts) {
            eds.setText(null);
        }
    }

    public static void showKeyboard(final View view) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                setKeyboardVisible(view, true);
            }
        }, 200);
    }

    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    public static void setKeyboardVisible(View view, boolean visible) {
        InputMethodManager imm = (InputMethodManager) view.getContext().getSystemService(INPUT_METHOD_SERVICE);
        if (visible) {
            imm.showSoftInput(view, 0);
        } else {
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }


    /**
     * scollow -> listview hegiht
     *
     * @param listView
     */
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }
        int totalHeight = 0;
        for (int i = 0, len = listAdapter.getCount(); i < len; i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight
            + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }

}