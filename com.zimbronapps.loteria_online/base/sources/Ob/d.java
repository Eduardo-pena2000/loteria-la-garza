package ob;

import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class d {
    public static final a a(sb.b bVar, rb.c decoder, String str) {
        t.g(bVar, "<this>");
        t.g(decoder, "decoder");
        a c = bVar.c(decoder, str);
        if (c != null) {
            return c;
        }
        sb.c.b(str, bVar.e());
        throw new Ca.i();
    }

    public static final k b(sb.b bVar, rb.f encoder, Object value) {
        t.g(bVar, "<this>");
        t.g(encoder, "encoder");
        t.g(value, "value");
        k d = bVar.d(encoder, value);
        if (d != null) {
            return d;
        }
        sb.c.a(P.b(value.getClass()), bVar.e());
        throw new Ca.i();
    }
}
