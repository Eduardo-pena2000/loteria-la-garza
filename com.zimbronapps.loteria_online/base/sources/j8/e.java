package J8;

import G8.p;
import G8.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e implements q {
    public final I8.c a;

    public e(I8.c cVar) {
        this.a = cVar;
    }

    public p a(G8.d dVar, N8.a aVar) {
        H8.b bVar = (H8.b) aVar.c().getAnnotation(H8.b.class);
        if (bVar == null) {
            return null;
        }
        return b(this.a, dVar, aVar, bVar);
    }

    public p b(I8.c cVar, G8.d dVar, N8.a aVar, H8.b bVar) {
        p a;
        Object a2 = cVar.b(N8.a.a(bVar.value())).a();
        boolean nullSafe = bVar.nullSafe();
        if (a2 instanceof p) {
            a = (p) a2;
        } else {
            if (!(a2 instanceof q)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a2.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a = ((q) a2).a(dVar, aVar);
        }
        return (a == null || !nullSafe) ? a : a.a();
    }
}
