package com.amazon.a.b.a;

import com.amazon.a.a.d.b;
import com.amazon.a.a.o.d.c;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends b {
    private static final long a = 1;
    private final c b;

    public a(c cVar) {
        super("LICENSE_VERIFICATION_FAILURE", "VERIFICATION_ERRORS", a(cVar));
        com.amazon.a.a.o.a.a.a(cVar.a(), "Created a verification exception with a Verifier that has no errors");
        this.b = cVar;
    }

    private static String a(c cVar) {
        StringBuilder sb = new StringBuilder();
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            com.amazon.a.a.o.d.a aVar = (com.amazon.a.a.o.d.a) it.next();
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(aVar.a().a());
        }
        return sb.toString();
    }

    public c d() {
        return this.b;
    }

    public String toString() {
        return this.b.toString();
    }
}
