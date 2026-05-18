package com.revenuecat.purchases.ui.revenuecatui.composables;

import Qa.a;
import Qa.p;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.d;
import b0.b0;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import n1.t;
import u0.l;
import v0.E1;
import v0.i1;
import v0.j0;
import v0.j1;
import v0.k1;
import v0.r0;
import v0.t1;
import x0.f;
import x0.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PlaceholderKt {
    public static final /* synthetic */ i1 access$drawPlaceholder-hpmOzss(f fVar, E1 e1, long j, PlaceholderHighlight placeholderHighlight, float f, i1 i1Var, t tVar, l lVar) {
        return drawPlaceholder-hpmOzss(fVar, e1, j, placeholderHighlight, f, i1Var, tVar, lVar);
    }

    private static final i1 drawPlaceholder-hpmOzss(f fVar, E1 e1, long j, PlaceholderHighlight placeholderHighlight, float f, i1 i1Var, t tVar, l lVar) {
        i1 i1Var2 = null;
        if (e1 == t1.a()) {
            f.s1(fVar, j, 0L, 0L, 0.0f, (g) null, (d) null, 0, 126, (Object) null);
            if (placeholderHighlight != null) {
                f.G0(fVar, placeholderHighlight.brush-d16Qtg0(f, fVar.e()), 0L, 0L, placeholderHighlight.alpha(f), (g) null, (d) null, 0, 118, (Object) null);
            }
            return null;
        }
        if (l.e(fVar.e(), lVar) && fVar.getLayoutDirection() == tVar) {
            i1Var2 = i1Var;
        }
        if (i1Var2 == null) {
            i1Var2 = e1.createOutline-Pq9zytI(fVar.e(), fVar.getLayoutDirection(), fVar);
        }
        j1.e(fVar, i1Var2, j, 0.0f, (g) null, (d) null, 0, 60, (Object) null);
        if (placeholderHighlight != null) {
            j1.c(fVar, i1Var2, placeholderHighlight.brush-d16Qtg0(f, fVar.e()), placeholderHighlight.alpha(f), (g) null, (d) null, 0, 56, (Object) null);
        }
        return i1Var2;
    }

    public static final e placeholder-TgFrcIs(e placeholder, boolean z, long j, E1 e1, PlaceholderHighlight placeholderHighlight, a aVar, a aVar2, m mVar, int i, int i2) {
        kotlin.jvm.internal.t.g(placeholder, "$this$placeholder");
        mVar.V(828411458);
        E1 a = (i2 & 4) != 0 ? t1.a() : e1;
        PlaceholderHighlight placeholderHighlight2 = (i2 & 8) != 0 ? null : placeholderHighlight;
        a aVar3 = (i2 & 16) != 0 ? PlaceholderKt$placeholder$1.INSTANCE : aVar;
        a aVar4 = (i2 & 32) != 0 ? PlaceholderKt$placeholder$2.INSTANCE : aVar2;
        if (w.L()) {
            w.U(828411458, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.placeholder (Placeholder.kt:68)");
        }
        e then = placeholder.then(new PlaceholderElement(rememberPlaceholder-OadGlvw(z, j, a, placeholderHighlight2, aVar3, aVar4, mVar, (i >> 3) & 524286, 0)));
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return then;
    }

    public static final Placeholder rememberPlaceholder-OadGlvw(boolean z, long j, E1 e1, PlaceholderHighlight placeholderHighlight, a aVar, a aVar2, m mVar, int i, int i2) {
        int i3;
        int i4;
        mVar.V(1627318888);
        E1 a = (i2 & 4) != 0 ? t1.a() : e1;
        PlaceholderHighlight placeholderHighlight2 = (i2 & 8) != 0 ? null : placeholderHighlight;
        a aVar3 = (i2 & 16) != 0 ? PlaceholderKt$rememberPlaceholder$1.INSTANCE : aVar;
        a aVar4 = (i2 & 32) != 0 ? PlaceholderKt$rememberPlaceholder$2.INSTANCE : aVar2;
        if (w.L()) {
            w.U(1627318888, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.rememberPlaceholder (Placeholder.kt:102)");
        }
        Object[] objArr = {Boolean.valueOf(z), r0.m(j), a, placeholderHighlight2, aVar3, aVar4};
        boolean z2 = false;
        for (int i5 = 0; i5 < 6; i5++) {
            z2 |= mVar.U(objArr[i5]);
        }
        Object C = mVar.C();
        if (z2 || C == m.a.a()) {
            PlaceholderHighlight placeholderHighlight3 = placeholderHighlight2;
            i3 = 6;
            a aVar5 = aVar3;
            i4 = 0;
            Placeholder placeholder = new Placeholder(z, j, a, placeholderHighlight3, aVar5, aVar4, null);
            mVar.t(placeholder);
            C = placeholder;
        } else {
            i3 = 6;
            i4 = 0;
        }
        Placeholder placeholder2 = (Placeholder) C;
        boolean isInPreviewMode = HelperFunctionsKt.isInPreviewMode(mVar, i4);
        mVar.V(653949553);
        int i6 = (mVar.a(isInPreviewMode) ? 1 : 0) | (((((i & 14) ^ i3) <= 4 || !mVar.a(z)) && (i & 6) != 4) ? i4 : 1) | (mVar.U(placeholder2) ? 1 : 0);
        Object C2 = mVar.C();
        if (i6 != 0 || C2 == m.a.a()) {
            C2 = new PlaceholderKt$rememberPlaceholder$3$1(z, isInPreviewMode, placeholder2, null);
            mVar.t(C2);
        }
        mVar.P();
        b0.d(placeholder2, (p) C2, mVar, i4);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return placeholder2;
    }

    private static final void withLayer(f fVar, k1 k1Var, Qa.l lVar) {
        j0 f = fVar.m1().f();
        f.w(u0.m.c(fVar.e()), k1Var);
        lVar.invoke(fVar);
        f.k();
    }
}
