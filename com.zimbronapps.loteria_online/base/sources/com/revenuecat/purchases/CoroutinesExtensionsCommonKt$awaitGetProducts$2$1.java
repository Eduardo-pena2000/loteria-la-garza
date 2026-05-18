package com.revenuecat.purchases;

import Ca.I;
import Ca.s;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public /* synthetic */ class CoroutinesExtensionsCommonKt$awaitGetProducts$2$1 extends q implements Qa.l {
    public CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(Object obj) {
        super(1, obj, Ga.g.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return I.a;
    }

    public final void invoke(List list) {
        t.g(list, "p0");
        ((Ga.e) ((kotlin.jvm.internal.f) this).receiver).resumeWith(s.b(list));
    }
}
