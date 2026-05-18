package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Ca.w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ColorComputationHelpersKt {
    public static final double colorDistance(w color1, w color2) {
        t.g(color1, "color1");
        t.g(color2, "color2");
        double doubleValue = ((Number) color1.a()).doubleValue();
        double doubleValue2 = ((Number) color1.b()).doubleValue();
        double doubleValue3 = ((Number) color1.c()).doubleValue();
        double d = 2;
        return Math.sqrt(Math.pow(doubleValue - ((Number) color2.a()).doubleValue(), d) + Math.pow(doubleValue2 - ((Number) color2.b()).doubleValue(), d) + Math.pow(doubleValue3 - ((Number) color2.c()).doubleValue(), d));
    }

    public static final double contrastRatio--OWjLjI(long j, long j2) {
        double d = relativeLuminance-8_81llA(j);
        double d2 = relativeLuminance-8_81llA(j2);
        return (Math.max(d, d2) + 0.05d) / (Math.min(d, d2) + 0.05d);
    }

    public static final double relativeLuminance-8_81llA(long j) {
        return (relativeLuminance_8_81llA$adjust(r0.x(j)) * 0.2126d) + (relativeLuminance_8_81llA$adjust(r0.w(j)) * 0.7152d) + (relativeLuminance_8_81llA$adjust(r0.u(j)) * 0.0722d);
    }

    private static final double relativeLuminance_8_81llA$adjust(float f) {
        return f <= 0.03928f ? f / 12.92d : Math.pow((f + 0.055d) / 1.055d, 2.4d);
    }

    public static final r0 selectColorWithBestContrast-4WTKRHQ(List from, long j) {
        Object obj;
        t.g(from, "from");
        Iterator it = from.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double d = contrastRatio--OWjLjI(((r0) next).A(), j);
                do {
                    Object next2 = it.next();
                    double d2 = contrastRatio--OWjLjI(((r0) next2).A(), j);
                    if (Double.compare(d, d2) < 0) {
                        next = next2;
                        d = d2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (r0) obj;
    }
}
