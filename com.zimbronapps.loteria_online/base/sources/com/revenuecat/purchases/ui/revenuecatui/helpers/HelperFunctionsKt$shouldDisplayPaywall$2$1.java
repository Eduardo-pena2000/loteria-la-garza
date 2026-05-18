package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Ca.I;
import Ca.s;
import Ga.e;
import Ga.g;
import Qa.l;
import kotlin.jvm.internal.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public /* synthetic */ class HelperFunctionsKt$shouldDisplayPaywall$2$1 extends q implements l {
    public HelperFunctionsKt$shouldDisplayPaywall$2$1(Object obj) {
        super(1, obj, g.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return I.a;
    }

    public final void invoke(boolean z) {
        ((e) this.receiver).resumeWith(s.b(Boolean.valueOf(z)));
    }
}
