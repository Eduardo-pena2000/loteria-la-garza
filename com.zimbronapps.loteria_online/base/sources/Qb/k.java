package qb;

import Ca.I;
import Da.r;
import Za.E;
import kotlin.jvm.internal.t;
import qb.m;
import sb.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class k {
    public static /* synthetic */ I a(a aVar) {
        return f(aVar);
    }

    public static final e b(String serialName, d kind) {
        t.g(serialName, "serialName");
        t.g(kind, "kind");
        if (E.h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return r0.a(serialName, kind);
    }

    public static final e c(String serialName, e[] typeParameters, Qa.l builderAction) {
        t.g(serialName, "serialName");
        t.g(typeParameters, "typeParameters");
        t.g(builderAction, "builderAction");
        if (E.h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(serialName);
        builderAction.invoke(aVar);
        return new h(serialName, m.a.a, aVar.f().size(), r.S0(typeParameters), aVar);
    }

    public static final e d(String serialName, l kind, e[] typeParameters, Qa.l builder) {
        t.g(serialName, "serialName");
        t.g(kind, "kind");
        t.g(typeParameters, "typeParameters");
        t.g(builder, "builder");
        if (E.h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (t.c(kind, m.a.a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new h(serialName, kind, aVar.f().size(), r.S0(typeParameters), aVar);
    }

    public static /* synthetic */ e e(String str, l lVar, e[] eVarArr, Qa.l lVar2, int i, Object obj) {
        if ((i & 8) != 0) {
            lVar2 = new j();
        }
        return d(str, lVar, eVarArr, lVar2);
    }

    public static final I f(a aVar) {
        t.g(aVar, "<this>");
        return I.a;
    }
}
