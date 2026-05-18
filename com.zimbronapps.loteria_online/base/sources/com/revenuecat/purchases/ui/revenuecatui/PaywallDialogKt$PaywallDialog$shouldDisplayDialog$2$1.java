package com.revenuecat.purchases.ui.revenuecatui;

import Qa.a;
import Qa.l;
import b0.C0;
import b0.T1;
import b0.U1;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallDialogKt$PaywallDialog$shouldDisplayDialog$2$1 extends u implements a {
    final /* synthetic */ l $shouldDisplayBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallDialogKt$PaywallDialog$shouldDisplayDialog$2$1(l lVar) {
        super(0);
        this.$shouldDisplayBlock = lVar;
    }

    public final C0 invoke() {
        return U1.i(Boolean.valueOf(this.$shouldDisplayBlock == null), (T1) null, 2, (Object) null);
    }
}
