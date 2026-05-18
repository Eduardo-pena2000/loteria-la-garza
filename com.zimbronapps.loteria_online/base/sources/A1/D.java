package a1;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ int[] a(Layout layout, RectF rectF, SegmentFinder segmentFinder, Layout.TextInclusionStrategy textInclusionStrategy) {
        return layout.getRangeForRect(rectF, segmentFinder, textInclusionStrategy);
    }
}
