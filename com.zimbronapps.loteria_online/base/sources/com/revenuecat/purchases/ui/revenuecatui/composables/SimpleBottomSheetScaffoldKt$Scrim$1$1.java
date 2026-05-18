package com.revenuecat.purchases.ui.revenuecatui.composables;

import A.M;
import Ca.I;
import F.h;
import Qa.a;
import Qa.l;
import Qa.q;
import android.os.Build;
import androidx.compose.foundation.b;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.E1;
import v0.r0;
import y.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SimpleBottomSheetScaffoldKt$Scrim$1$1 extends u implements q {
    final /* synthetic */ a $onClick;
    final /* synthetic */ h $this_Box;

    public static final class 2 extends u implements l {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(1);
        }

        public final e invoke(e conditional) {
            t.g(conditional, "$this$conditional");
            return androidx.compose.foundation.a.d(conditional, r0.q(r0.b.a(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (E1) null, 2, (Object) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBottomSheetScaffoldKt$Scrim$1$1(h hVar, a aVar) {
        super(3);
        this.$this_Box = hVar;
        this.$onClick = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((f) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(f AnimatedVisibility, m mVar, int i) {
        t.g(AnimatedVisibility, "$this$AnimatedVisibility");
        if (w.L()) {
            w.U(996852834, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Scrim.<anonymous>.<anonymous> (SimpleBottomSheetScaffold.kt:125)");
        }
        e c = this.$this_Box.c(e.a);
        mVar.V(257503834);
        Object C = mVar.C();
        if (C == m.a.a()) {
            C = E.l.a();
            mVar.t(C);
        }
        mVar.P();
        F.f.a(ModifierExtensionsKt.conditional(b.b(c, (E.m) C, (M) null, false, (String) null, (W0.h) null, this.$onClick, 28, (Object) null), Build.VERSION.SDK_INT < 31, 2.INSTANCE), mVar, 0);
        if (w.L()) {
            w.T();
        }
    }
}
