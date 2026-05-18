package okhttp3.internal.connection;

import xb.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealCall$timeout$1 extends c {
    public final /* synthetic */ RealCall o;

    public RealCall$timeout$1(RealCall realCall) {
        this.o = realCall;
    }

    public void C() {
        this.o.cancel();
    }
}
