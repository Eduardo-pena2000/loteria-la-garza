package okhttp3.internal.connection;

import Qa.a;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealConnection$connectTls$1 extends u implements a {
    public final /* synthetic */ CertificatePinner a;
    public final /* synthetic */ Handshake b;
    public final /* synthetic */ Address c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.a = certificatePinner;
        this.b = handshake;
        this.c = address;
    }

    public final List invoke() {
        CertificateChainCleaner d = this.a.d();
        t.d(d);
        return d.a(this.b.d(), this.c.l().h());
    }
}
