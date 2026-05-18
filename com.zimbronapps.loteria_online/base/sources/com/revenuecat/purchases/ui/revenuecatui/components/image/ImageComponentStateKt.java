package com.revenuecat.purchases.ui.revenuecatui.components.image;

import A.q;
import P0.p0;
import Qa.a;
import Y.b;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import n1.d;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class ImageComponentStateKt {
    public static final /* synthetic */ ImageComponentState rememberUpdatedImageComponentState(ImageComponentStyle style, PaywallState.Loaded.Components paywallState, m mVar, int i) {
        t.g(style, "style");
        t.g(paywallState, "paywallState");
        mVar.V(-2056019880);
        if (w.L()) {
            w.U(-2056019880, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.rememberUpdatedImageComponentState (ImageComponentState.kt:51)");
        }
        mVar.V(1344446010);
        int i2 = (i & 112) ^ 48;
        boolean z = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new ImageComponentStateKt$rememberUpdatedImageComponentState$1$1(paywallState);
            mVar.t(C);
        }
        a aVar = (a) C;
        mVar.P();
        mVar.V(1344447911);
        boolean z2 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C2 = mVar.C();
        if (z2 || C2 == m.a.a()) {
            C2 = new ImageComponentStateKt$rememberUpdatedImageComponentState$2$1(paywallState);
            mVar.t(C2);
        }
        a aVar2 = (a) C2;
        mVar.P();
        mVar.V(1344450116);
        boolean z3 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C3 = mVar.C();
        if (z3 || C3 == m.a.a()) {
            C3 = new ImageComponentStateKt$rememberUpdatedImageComponentState$3$1(paywallState);
            mVar.t(C3);
        }
        a aVar3 = (a) C3;
        mVar.P();
        mVar.V(1344452492);
        boolean z4 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C4 = mVar.C();
        if (z4 || C4 == m.a.a()) {
            C4 = new ImageComponentStateKt$rememberUpdatedImageComponentState$4$1(paywallState);
            mVar.t(C4);
        }
        a aVar4 = (a) C4;
        mVar.P();
        mVar.V(1344454825);
        boolean z5 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C5 = mVar.C();
        if (z5 || C5 == m.a.a()) {
            C5 = new ImageComponentStateKt$rememberUpdatedImageComponentState$5$1(paywallState);
            mVar.t(C5);
        }
        mVar.P();
        ImageComponentState rememberUpdatedImageComponentState = rememberUpdatedImageComponentState(style, aVar, aVar2, aVar3, aVar4, (a) C5, mVar, i & 14);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return rememberUpdatedImageComponentState;
    }

    private static final /* synthetic */ ImageComponentState rememberUpdatedImageComponentState(ImageComponentStyle imageComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, m mVar, int i) {
        n1.t tVar;
        mVar.V(1153101790);
        if (w.L()) {
            w.U(1153101790, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.rememberUpdatedImageComponentState (ImageComponentState.kt:71)");
        }
        c b = b.b(mVar, 0).a().b();
        d dVar = (d) mVar.x(p0.e());
        boolean a = q.a(mVar, 0);
        n1.t tVar2 = (n1.t) mVar.x(p0.k());
        mVar.V(1344479185);
        boolean z = (((i & 14) ^ 6) > 4 && mVar.U(imageComponentStyle)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            tVar = tVar2;
            C = new ImageComponentState(b, dVar, a, tVar2, imageComponentStyle, aVar, aVar2, aVar3, aVar4, aVar5);
            mVar.t(C);
        } else {
            tVar = tVar2;
        }
        ImageComponentState imageComponentState = (ImageComponentState) C;
        mVar.P();
        imageComponentState.update(b, dVar, Boolean.valueOf(a), tVar);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return imageComponentState;
    }
}
