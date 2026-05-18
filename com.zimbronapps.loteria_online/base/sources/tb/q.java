package tb;

import Ca.I;
import qb.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class q implements ob.b {
    public static final q a = new q();
    public static final qb.e b = qb.k.d("kotlinx.serialization.json.JsonElement", c.a.a, new qb.e[0], new k());

    public static /* synthetic */ I a(qb.a aVar) {
        return g(aVar);
    }

    public static /* synthetic */ qb.e b() {
        return h();
    }

    public static /* synthetic */ qb.e c() {
        return i();
    }

    public static /* synthetic */ qb.e d() {
        return j();
    }

    public static /* synthetic */ qb.e e() {
        return k();
    }

    public static /* synthetic */ qb.e f() {
        return l();
    }

    public static final I g(qb.a buildSerialDescriptor) {
        kotlin.jvm.internal.t.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
        qb.a.b(buildSerialDescriptor, "JsonPrimitive", r.a(new l()), null, false, 12, null);
        qb.a.b(buildSerialDescriptor, "JsonNull", r.a(new m()), null, false, 12, null);
        qb.a.b(buildSerialDescriptor, "JsonLiteral", r.a(new n()), null, false, 12, null);
        qb.a.b(buildSerialDescriptor, "JsonObject", r.a(new o()), null, false, 12, null);
        qb.a.b(buildSerialDescriptor, "JsonArray", r.a(new p()), null, false, 12, null);
        return I.a;
    }

    public static final qb.e h() {
        return F.a.getDescriptor();
    }

    public static final qb.e i() {
        return A.a.getDescriptor();
    }

    public static final qb.e j() {
        return w.a.getDescriptor();
    }

    public static final qb.e k() {
        return D.a.getDescriptor();
    }

    public static final qb.e l() {
        return d.a.getDescriptor();
    }

    public qb.e getDescriptor() {
        return b;
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public i deserialize(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return r.d(decoder).i();
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void serialize(rb.f encoder, i value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        r.c(encoder);
        if (value instanceof E) {
            encoder.l(F.a, value);
        } else if (value instanceof C) {
            encoder.l(D.a, value);
        } else {
            if (!(value instanceof c)) {
                throw new Ca.o();
            }
            encoder.l(d.a, value);
        }
    }
}
