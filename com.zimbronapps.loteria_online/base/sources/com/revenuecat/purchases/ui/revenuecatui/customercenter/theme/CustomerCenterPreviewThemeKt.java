package com.revenuecat.purchases.ui.revenuecatui.customercenter.theme;

import A.q;
import Ca.I;
import Qa.a;
import Qa.p;
import X.F;
import X.X;
import X.l;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.B1;
import b0.b0;
import b0.g1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterPreviewThemeKt {
    private static final l DarkColorScheme;
    private static final l LightColorScheme;

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(p pVar, int i) {
            super(2);
            this.$content = pVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(this.$content, mVar, g1.a(this.$$changed | 1));
        }
    }

    static {
        long d = s0.d(4279199743L);
        r0.a aVar = r0.b;
        LightColorScheme = X.m.j(d, aVar.k(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, s0.d(4294967295L), s0.d(4280229663L), s0.d(4293981433L), s0.d(4280229663L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122884, 15, (Object) null);
        DarkColorScheme = X.m.e(s0.d(4286695300L), aVar.a(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, s0.d(4279374354L), s0.d(4292927712L), s0.d(4280953386L), s0.d(4292927712L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122884, 15, (Object) null);
    }

    public static final void CustomerCenterPreviewTheme(p content, m mVar, int i) {
        int i2;
        t.g(content, "content");
        m i3 = mVar.i(482903071);
        if ((i & 6) == 0) {
            i2 = (i3.E(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(482903071, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewTheme (CustomerCenterPreviewTheme.kt:36)");
            }
            boolean a = q.a(i3, 0);
            l lVar = a ? DarkColorScheme : LightColorScheme;
            View view = (View) i3.x(AndroidCompositionLocals_androidKt.k());
            i3.V(-1492930134);
            if (!view.isInEditMode()) {
                i3.V(-1492928745);
                boolean E = i3.E(view) | i3.a(a);
                Object C = i3.C();
                if (E || C == m.a.a()) {
                    C = new CustomerCenterPreviewThemeKt$CustomerCenterPreviewTheme$1$1(view, a);
                    i3.t(C);
                }
                i3.P();
                b0.g((a) C, i3, 0);
            }
            i3.P();
            F.a(lVar, (X) null, (X.r0) null, content, i3, (i2 << 9) & 7168, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(content, i));
        }
    }
}
