package ub;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class f0 {
    public static final Object a(tb.b json, tb.i element, ob.a deserializer) {
        c k;
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(element, "element");
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        if (element instanceof tb.C) {
            k = new O(json, (tb.C) element, null, null, 12, null);
        } else if (element instanceof tb.c) {
            k = new Q(json, (tb.c) element);
        } else {
            if (!(element instanceof tb.v) && !kotlin.jvm.internal.t.c(element, tb.z.INSTANCE)) {
                throw new Ca.o();
            }
            k = new K(json, (tb.E) element, null, 4, null);
        }
        return k.p(deserializer);
    }

    public static final Object b(tb.b bVar, String discriminator, tb.C element, ob.a deserializer) {
        kotlin.jvm.internal.t.g(bVar, "<this>");
        kotlin.jvm.internal.t.g(discriminator, "discriminator");
        kotlin.jvm.internal.t.g(element, "element");
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        return new O(bVar, element, discriminator, deserializer.getDescriptor()).p(deserializer);
    }
}
