package com.unity3d.services.ads.operation.show;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ ShowOperationState a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(ShowOperationState showOperationState, String str) {
        this.a = showOperationState;
        this.b = str;
    }

    public final void run() {
        ShowOperationState.b(this.a, this.b);
    }
}
