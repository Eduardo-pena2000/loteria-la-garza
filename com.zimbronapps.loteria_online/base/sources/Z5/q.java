package z5;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q implements w5.j {
    public final Set a;
    public final p b;
    public final t c;

    public q(Set set, p pVar, t tVar) {
        this.a = set;
        this.b = pVar;
        this.c = tVar;
    }

    public w5.i a(String str, Class cls, w5.c cVar, w5.h hVar) {
        if (this.a.contains(cVar)) {
            return new s(this.b, str, cVar, hVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{cVar, this.a}));
    }
}
