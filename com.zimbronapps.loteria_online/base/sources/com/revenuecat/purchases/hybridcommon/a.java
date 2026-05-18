package com.revenuecat.purchases.hybridcommon;

import Qa.l;
import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a implements DebugEventListener {
    public final /* synthetic */ l a;

    public /* synthetic */ a(l lVar) {
        this.a = lVar;
    }

    public final void onDebugEventReceived(DebugEvent debugEvent) {
        CommonKt.b(this.a, debugEvent);
    }
}
