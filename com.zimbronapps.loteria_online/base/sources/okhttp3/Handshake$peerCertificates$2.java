package okhttp3;

import Da.v;
import Qa.a;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Handshake$peerCertificates$2 extends u implements a {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Handshake$peerCertificates$2(a aVar) {
        super(0);
        this.a = aVar;
    }

    public final List invoke() {
        try {
            return (List) this.a.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return v.n();
        }
    }
}
