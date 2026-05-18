package k7;

import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f5 implements Runnable {
    public final URL a;
    public final byte[] b;
    public final d5 c;
    public final String d;
    public final Map e;
    public final /* synthetic */ g5 f;

    public f5(g5 g5Var, String str, URL url, byte[] bArr, Map map, d5 d5Var) {
        Objects.requireNonNull(g5Var);
        this.f = g5Var;
        com.google.android.gms.common.internal.t.f(str);
        com.google.android.gms.common.internal.t.l(url);
        com.google.android.gms.common.internal.t.l(d5Var);
        this.a = url;
        this.b = bArr;
        this.c = d5Var;
        this.d = str;
        this.e = map;
    }

    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.c.a(this.d, i, exc, bArr, map);
    }

    public final void b(int i, Exception exc, byte[] bArr, Map map) {
        this.f.a.b().t(new e5(this, i, exc, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.f5.run():void");
    }
}
