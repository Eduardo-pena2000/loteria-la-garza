package com.unity3d.services.core.misc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.unity3d.services.core.log.DeviceLog;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ViewUtilities {
    public static float dpFromPx(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }

    public static float pxFromDp(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    public static void removeViewFromParent(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        try {
            view.getParent().removeView(view);
        } catch (Exception e) {
            DeviceLog.exception("Error while removing view from it's parent", e);
        }
    }

    public static void setBackground(View view, Drawable drawable) {
        try {
            View.class.getMethod("setBackground", new Class[]{Drawable.class}).invoke(view, new Object[]{drawable});
        } catch (Exception e) {
            DeviceLog.exception("Couldn't runsetBackground", e);
        }
    }
}
