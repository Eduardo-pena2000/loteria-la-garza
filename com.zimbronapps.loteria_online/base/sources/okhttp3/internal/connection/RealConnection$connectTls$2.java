package okhttp3.internal.connection;

import Da.w;
import Qa.a;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import okhttp3.Handshake;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealConnection$connectTls$2 extends u implements a {
    public final /* synthetic */ RealConnection a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.a = realConnection;
    }

    public final List invoke() {
        Handshake c = RealConnection.c(this.a);
        t.d(c);
        List d = c.d();
        ArrayList arrayList = new ArrayList(w.y(d, 10));
        Iterator it = d.iterator();
        while (it.hasNext()) {
            arrayList.add((Certificate) it.next());
        }
        return arrayList;
    }
}
