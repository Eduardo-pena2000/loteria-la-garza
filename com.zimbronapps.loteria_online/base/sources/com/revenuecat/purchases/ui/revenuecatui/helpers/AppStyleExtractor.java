package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Ca.I;
import Ca.t;
import Ca.w;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import L1.b;
import Qa.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import cb.K;
import cb.O;
import cb.e0;
import cb.i;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AppStyleExtractor {
    public static final int $stable = 0;
    public static final AppStyleExtractor INSTANCE = new AppStyleExtractor();

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor$getProminentColorsFromBitmap$2", f = "AppStyleExtractor.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ int $count;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Bitmap bitmap, int i, e eVar) {
            super(2, eVar);
            this.$bitmap = bitmap;
            this.$count = i;
        }

        public final e create(Object obj, e eVar) {
            return new 2(this.$bitmap, this.$count, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return AppStyleExtractor.INSTANCE.extractProminentColors$revenuecatui_defaultsBc8Release(this.$bitmap, this.$count);
        }
    }

    private AppStyleExtractor() {
    }

    private final w colorKeyToTuple(int i) {
        return new w(Double.valueOf(normalizedColorComponent(i, 16)), Double.valueOf(normalizedColorComponent(i, 8)), Double.valueOf((i & 255) / 255.0d));
    }

    public static /* synthetic */ Object getProminentColorsFromBitmap$default(AppStyleExtractor appStyleExtractor, Bitmap bitmap, int i, K k, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        if ((i2 & 4) != 0) {
            k = e0.a();
        }
        return appStyleExtractor.getProminentColorsFromBitmap(bitmap, i, k, eVar);
    }

    private final double normalizedColorComponent(int i, int i2) {
        return ((i >> i2) & 255) / 255.0d;
    }

    private final Integer quantizedColorKeyOrNull(int i) {
        if (((i >> 24) & 255) >= 128) {
            int i2 = (((i >> 16) & 255) / 16) * 16;
            int i3 = (((i >> 8) & 255) / 16) * 16;
            int i4 = ((i & 255) / 16) * 16;
            int i5 = i2 + i3 + i4;
            if (i5 >= 50 && i5 <= 700) {
                return Integer.valueOf(i4 | (i2 << 16) | (i3 << 8));
            }
        }
        return null;
    }

    private final long toColor-vNxB06k(w wVar) {
        return s0.e((float) ((Number) wVar.d()).doubleValue(), (float) ((Number) wVar.e()).doubleValue(), (float) ((Number) wVar.f()).doubleValue(), 0.0f, (w0.c) null, 24, (Object) null);
    }

    private final w toTriple-8_81llA(long j) {
        return new w(Double.valueOf(r0.x(j)), Double.valueOf(r0.w(j)), Double.valueOf(r0.u(j)));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0129 A[EDGE_INSN: B:39:0x0129->B:40:0x0129 BREAK  A[LOOP:1: B:23:0x00b5->B:42:0x00b5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List extractProminentColors$revenuecatui_defaultsBc8Release(android.graphics.Bitmap r13, int r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor.extractProminentColors$revenuecatui_defaultsBc8Release(android.graphics.Bitmap, int):java.util.List");
    }

    public final Bitmap getAppIconBitmap(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        try {
            Drawable drawable = context.getApplicationInfo().loadIcon(context.getPackageManager());
            kotlin.jvm.internal.t.f(drawable, "drawable");
            return b.b(drawable, 0, 0, Bitmap.Config.ARGB_8888, 3, (Object) null);
        } catch (Exception e) {
            Logger.INSTANCE.e("Failed to load app icon bitmap.", e);
            return null;
        }
    }

    public final String getAppName(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    public final Object getProminentColorsFromBitmap(Bitmap bitmap, int i, K k, e eVar) {
        return i.g(k, new 2(bitmap, i, null), eVar);
    }
}
