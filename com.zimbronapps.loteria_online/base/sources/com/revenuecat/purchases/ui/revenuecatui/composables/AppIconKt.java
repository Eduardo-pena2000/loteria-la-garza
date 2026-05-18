package com.revenuecat.purchases.ui.revenuecatui.composables;

import A.L;
import Ca.I;
import L1.b;
import M0.f;
import Qa.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AppIconKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(e eVar, int i, int i2) {
            super(2);
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            AppIconKt.AppIcon(this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final void AppIcon(e eVar, m mVar, int i, int i2) {
        int i3;
        m i4 = mVar.i(-960707246);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i4.U(eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && i4.j()) {
            i4.M();
        } else {
            if (i5 != 0) {
                eVar = e.a;
            }
            if (w.L()) {
                w.U(-960707246, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.AppIcon (AppIcon.kt:14)");
            }
            Context context = (Context) i4.x(AndroidCompositionLocals_androidKt.g());
            i4.V(831081126);
            Object C = i4.C();
            if (C == m.a.a()) {
                C = context.getApplicationInfo().loadIcon(context.getPackageManager());
                i4.t(C);
            }
            Drawable appIconResId = (Drawable) C;
            i4.P();
            t.f(appIconResId, "appIconResId");
            L.b(O.c(b.b(appIconResId, 0, 0, Bitmap.Config.ARGB_8888, 3, (Object) null)), (String) null, eVar, (o0.e) null, f.a.a(), 0.0f, (d) null, 0, i4, ((i3 << 6) & 896) | 24624, 232);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i4.l();
        if (l != null) {
            l.a(new 1(eVar, i, i2));
        }
    }
}
