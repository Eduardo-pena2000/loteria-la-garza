package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import M0.f;
import Qa.l;
import Qa.p;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template1Kt$HeaderImage$1$1 extends u implements p {
    final /* synthetic */ boolean $landscapeLayout;
    final /* synthetic */ Uri $uri;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final e invoke(e conditional) {
            t.g(conditional, "$this$conditional");
            return b.b(conditional, 1.2f, false, 2, (Object) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template1Kt$HeaderImage$1$1(Uri uri, boolean z) {
        super(2);
        this.$uri = uri;
        this.$landscapeLayout = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        if ((i & 3) == 2 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(1134746342, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.HeaderImage.<anonymous>.<anonymous> (Template1.kt:142)");
        }
        int i2 = ((Configuration) mVar.x(AndroidCompositionLocals_androidKt.f())).screenHeightDp;
        String uri = this.$uri.toString();
        t.f(uri, "uri.toString()");
        e conditional = ModifierExtensionsKt.conditional(e.a, !this.$landscapeLayout, 1.INSTANCE);
        boolean z = this.$landscapeLayout;
        mVar.V(-910575415);
        boolean d = mVar.d(i2);
        Object C = mVar.C();
        if (d || C == m.a.a()) {
            C = new Template1Kt$HeaderImage$1$1$2$1(i2);
            mVar.t(C);
        }
        mVar.P();
        RemoteImageKt.RemoteImage(uri, ModifierExtensionsKt.conditional(conditional, z, (l) C), null, f.a.a(), null, null, 0.0f, null, mVar, 3072, 244);
        if (w.L()) {
            w.T();
        }
    }
}
