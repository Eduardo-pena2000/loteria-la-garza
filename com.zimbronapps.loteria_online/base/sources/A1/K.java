package a1;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k {
    public static final k a = new k();

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2) {
        if (!(i >= 0)) {
            g1.a.a("negative width");
        }
        if (!(i2 >= 0)) {
            g1.a.a("negative ellipsized width");
        }
        return Build.VERSION.SDK_INT >= 33 ? j.a(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, z2, truncateAt, i2) : l.a(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
    }

    public final boolean b(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return j.c(boringLayout);
        }
        return false;
    }

    public final BoringLayout.Metrics c(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? j.b(charSequence, textPaint, textDirectionHeuristic) : l.b(charSequence, textPaint, textDirectionHeuristic);
    }
}
