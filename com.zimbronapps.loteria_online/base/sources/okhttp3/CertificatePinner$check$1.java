package okhttp3;

import Da.w;
import Qa.a;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u;
import okhttp3.internal.tls.CertificateChainCleaner;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CertificatePinner$check$1 extends u implements a {
    public final /* synthetic */ CertificatePinner a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List list, String str) {
        super(0);
        this.a = certificatePinner;
        this.b = list;
        this.c = str;
    }

    public final List invoke() {
        CertificateChainCleaner d = this.a.d();
        Iterable a = d == null ? null : d.a(this.b, this.c);
        if (a == null) {
            a = this.b;
        }
        ArrayList arrayList = new ArrayList(w.y(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add((Certificate) it.next());
        }
        return arrayList;
    }
}
