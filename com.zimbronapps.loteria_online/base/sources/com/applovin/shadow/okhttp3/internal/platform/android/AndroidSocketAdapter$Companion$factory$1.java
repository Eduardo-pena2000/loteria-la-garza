package com.applovin.shadow.okhttp3.internal.platform.android;

import Za.B;
import com.applovin.shadow.okhttp3.internal.platform.android.AndroidSocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.DeferredSocketAdapter;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    final /* synthetic */ String $packageName;

    public AndroidSocketAdapter$Companion$factory$1(String str) {
        this.$packageName = str;
    }

    public SocketAdapter create(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        return AndroidSocketAdapter.Companion.access$build(AndroidSocketAdapter.Companion, sSLSocket.getClass());
    }

    public boolean matchesSocket(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        t.f(name, "sslSocket.javaClass.name");
        return B.N(name, this.$packageName + '.', false, 2, (Object) null);
    }
}
