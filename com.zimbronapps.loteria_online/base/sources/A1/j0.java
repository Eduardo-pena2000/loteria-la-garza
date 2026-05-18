package a1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j0 {
    public static final j0 a = new j0();
    public static final k0 b = new V();
    public static final int c = 8;

    public static /* synthetic */ StaticLayout b(j0 j0Var, CharSequence charSequence, TextPaint textPaint, int i, int i2, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2, int i11, Object obj) {
        return j0Var.a(charSequence, textPaint, i, (i11 & 8) != 0 ? 0 : i2, (i11 & 16) != 0 ? charSequence.length() : i3, (i11 & 32) != 0 ? K.a.b() : textDirectionHeuristic, (i11 & 64) != 0 ? K.a.a() : alignment, (i11 & 128) != 0 ? Integer.MAX_VALUE : i4, (i11 & 256) != 0 ? null : truncateAt, (i11 & 512) != 0 ? i : i5, (i11 & 1024) != 0 ? 1.0f : f, (i11 & 2048) != 0 ? 0.0f : f2, (i11 & 4096) != 0 ? 0 : i6, (i11 & 8192) != 0 ? false : z, (i11 & 16384) != 0 ? true : z2, (32768 & i11) != 0 ? 0 : i7, (65536 & i11) != 0 ? 0 : i8, (131072 & i11) != 0 ? 0 : i9, (262144 & i11) != 0 ? 0 : i10, (524288 & i11) != 0 ? null : iArr, (i11 & 1048576) != 0 ? null : iArr2);
    }

    public final StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, int i2, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        return b.a(new l0(charSequence, i2, i3, textPaint, i, textDirectionHeuristic, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, i9, i10, iArr, iArr2));
    }

    public final boolean c(StaticLayout staticLayout, boolean z) {
        return b.b(staticLayout, z);
    }
}
