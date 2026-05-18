package O2;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static void a(Spannable spannable, float f, int i, int i2, int i3) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i, i2, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i && spannable.getSpanEnd(relativeSizeSpan) >= i2) {
                f *= relativeSizeSpan.getSizeChange();
            }
            c(spannable, relativeSizeSpan, i, i2, i3);
        }
        spannable.setSpan(new RelativeSizeSpan(f), i, i2, i3);
    }

    public static void b(Spannable spannable, Object obj, int i, int i2, int i3) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            c(spannable, obj2, i, i2, i3);
        }
        spannable.setSpan(obj, i, i2, i3);
    }

    public static void c(Spannable spannable, Object obj, int i, int i2, int i3) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i2 && spannable.getSpanFlags(obj) == i3) {
            spannable.removeSpan(obj);
        }
    }
}
