package sb;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class r0 {
    public static final Map a = d0.a();

    public static final qb.e a(String serialName, qb.d kind) {
        kotlin.jvm.internal.t.g(serialName, "serialName");
        kotlin.jvm.internal.t.g(kind, "kind");
        b(serialName);
        return new q0(serialName, kind);
    }

    public static final void b(String str) {
        for (ob.b bVar : a.values()) {
            if (kotlin.jvm.internal.t.c(str, bVar.getDescriptor().h())) {
                throw new IllegalArgumentException(Za.u.j("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + kotlin.jvm.internal.P.b(bVar.getClass()).e() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
