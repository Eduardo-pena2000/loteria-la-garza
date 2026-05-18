package com.revenuecat.purchases;

import Ca.I;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ListenerConversionsCommonKt$ON_ERROR_STUB$1 extends u implements Qa.l {
    public static final ListenerConversionsCommonKt$ON_ERROR_STUB$1 INSTANCE = new ListenerConversionsCommonKt$ON_ERROR_STUB$1();

    public ListenerConversionsCommonKt$ON_ERROR_STUB$1() {
        super(1);
    }

    public final void invoke(PurchasesError purchasesError) {
        t.g(purchasesError, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return I.a;
    }
}
