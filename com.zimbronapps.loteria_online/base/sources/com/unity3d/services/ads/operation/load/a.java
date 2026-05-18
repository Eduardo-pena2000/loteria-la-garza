package com.unity3d.services.ads.operation.load;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ LoadOperationState a;

    public /* synthetic */ a(LoadOperationState loadOperationState) {
        this.a = loadOperationState;
    }

    public final void run() {
        LoadModuleDecoratorTimeout.a(this.a);
    }
}
