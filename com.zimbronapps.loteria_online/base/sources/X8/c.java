package x8;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ e a;
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.b b;

    public /* synthetic */ c(e eVar, com.google.firebase.remoteconfig.internal.b bVar) {
        this.a = eVar;
        this.b = bVar;
    }

    public final Object call() {
        return e.b(this.a, this.b);
    }
}
