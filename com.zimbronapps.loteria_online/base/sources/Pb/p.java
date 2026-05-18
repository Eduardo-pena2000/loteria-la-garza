package Pb;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class p {
    public final Map a = new LinkedHashMap();

    public void a(Sb.p pVar) {
        String b = Rb.c.b(pVar.o());
        if (this.a.containsKey(b)) {
            return;
        }
        this.a.put(b, pVar);
    }

    public Sb.p b(String str) {
        return (Sb.p) this.a.get(Rb.c.b(str));
    }
}
