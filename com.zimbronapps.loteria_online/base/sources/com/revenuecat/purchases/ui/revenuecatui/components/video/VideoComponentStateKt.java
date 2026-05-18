package com.revenuecat.purchases.ui.revenuecatui.components.video;

import A.q;
import P0.p0;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentStateKt {
    public static final /* synthetic */ VideoComponentState rememberUpdatedVideoComponentState(VideoComponentStyle style, PaywallState.Loaded.Components paywallState, m mVar, int i) {
        t.g(style, "style");
        t.g(paywallState, "paywallState");
        mVar.V(-374173384);
        if (w.L()) {
            w.U(-374173384, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.video.rememberUpdatedVideoComponentState (VideoComponentState.kt:304)");
        }
        mVar.V(-904430054);
        int i2 = (i & 112) ^ 48;
        boolean z = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new VideoComponentStateKt$rememberUpdatedVideoComponentState$1$1(paywallState);
            mVar.t(C);
        }
        Qa.a aVar = (Qa.a) C;
        mVar.P();
        mVar.V(-904428153);
        boolean z2 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C2 = mVar.C();
        if (z2 || C2 == m.a.a()) {
            C2 = new VideoComponentStateKt$rememberUpdatedVideoComponentState$2$1(paywallState);
            mVar.t(C2);
        }
        Qa.a aVar2 = (Qa.a) C2;
        mVar.P();
        mVar.V(-904425948);
        boolean z3 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C3 = mVar.C();
        if (z3 || C3 == m.a.a()) {
            C3 = new VideoComponentStateKt$rememberUpdatedVideoComponentState$3$1(paywallState);
            mVar.t(C3);
        }
        Qa.a aVar3 = (Qa.a) C3;
        mVar.P();
        mVar.V(-904423572);
        boolean z4 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C4 = mVar.C();
        if (z4 || C4 == m.a.a()) {
            C4 = new VideoComponentStateKt$rememberUpdatedVideoComponentState$4$1(paywallState);
            mVar.t(C4);
        }
        Qa.a aVar4 = (Qa.a) C4;
        mVar.P();
        mVar.V(-904421239);
        boolean z5 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C5 = mVar.C();
        if (z5 || C5 == m.a.a()) {
            C5 = new VideoComponentStateKt$rememberUpdatedVideoComponentState$5$1(paywallState);
            mVar.t(C5);
        }
        mVar.P();
        VideoComponentState rememberUpdatedVideoComponentState = rememberUpdatedVideoComponentState(style, aVar, aVar2, aVar3, aVar4, (Qa.a) C5, mVar, i & 14);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return rememberUpdatedVideoComponentState;
    }

    private static final /* synthetic */ VideoComponentState rememberUpdatedVideoComponentState(VideoComponentStyle videoComponentStyle, Qa.a aVar, Qa.a aVar2, Qa.a aVar3, Qa.a aVar4, Qa.a aVar5, m mVar, int i) {
        n1.t tVar;
        mVar.V(-673938114);
        if (w.L()) {
            w.U(-673938114, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.video.rememberUpdatedVideoComponentState (VideoComponentState.kt:324)");
        }
        x4.c b = Y.b.b(mVar, 0).a().b();
        n1.d dVar = (n1.d) mVar.x(p0.e());
        boolean a = q.a(mVar, 0);
        n1.t tVar2 = (n1.t) mVar.x(p0.k());
        mVar.V(-904396879);
        boolean z = (((i & 14) ^ 6) > 4 && mVar.U(videoComponentStyle)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            tVar = tVar2;
            C = new VideoComponentState(b, dVar, a, tVar2, videoComponentStyle, aVar, aVar2, aVar3, aVar4, aVar5);
            mVar.t(C);
        } else {
            tVar = tVar2;
        }
        VideoComponentState videoComponentState = (VideoComponentState) C;
        mVar.P();
        videoComponentState.update(b, dVar, Boolean.valueOf(a), tVar);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return videoComponentState;
    }
}
