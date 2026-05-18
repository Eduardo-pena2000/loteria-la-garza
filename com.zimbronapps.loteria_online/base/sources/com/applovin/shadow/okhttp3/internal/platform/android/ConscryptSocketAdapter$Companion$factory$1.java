package com.applovin.shadow.okhttp3.internal.platform.android;

import com.applovin.shadow.okhttp3.internal.platform.ConscryptPlatform;
import com.applovin.shadow.okhttp3.internal.platform.android.DeferredSocketAdapter;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;
import org.conscrypt.Conscrypt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class ConscryptSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    public SocketAdapter create(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        return new ConscryptSocketAdapter();
    }

    public boolean matchesSocket(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        return ConscryptPlatform.Companion.isSupported() && Conscrypt.isConscrypt(sSLSocket);
    }
}
