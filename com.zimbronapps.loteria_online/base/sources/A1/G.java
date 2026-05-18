package a1;

import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class g {
    public static /* bridge */ /* synthetic */ BoringLayout.Metrics a(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, boolean z, BoringLayout.Metrics metrics) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, z, metrics);
    }
}
