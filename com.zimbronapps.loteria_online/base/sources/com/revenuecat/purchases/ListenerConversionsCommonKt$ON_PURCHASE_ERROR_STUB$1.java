package com.revenuecat.purchases;

import Ca.I;
import Qa.p;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1 extends u implements p {
    public static final ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1 INSTANCE = new ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1();

    public ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1() {
        super(2);
    }

    public final void invoke(PurchasesError purchasesError, boolean z) {
        t.g(purchasesError, "<anonymous parameter 0>");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return I.a;
    }
}
