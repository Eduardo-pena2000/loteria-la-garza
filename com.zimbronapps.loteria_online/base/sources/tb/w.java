package tb;

import Za.I;
import kotlin.jvm.internal.P;
import qb.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class w implements ob.b {
    public static final w a = new w();
    public static final qb.e b = qb.k.b("kotlinx.serialization.json.JsonLiteral", d.i.a);

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public v deserialize(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        i i = r.d(decoder).i();
        if (i instanceof v) {
            return (v) i;
        }
        throw ub.G.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + P.b(i.getClass()), i.toString());
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(rb.f encoder, v value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        r.c(encoder);
        if (value.b()) {
            encoder.F(value.a());
            return;
        }
        if (value.e() != null) {
            encoder.f(value.e()).F(value.a());
            return;
        }
        Long r = Za.A.r(value.a());
        if (r != null) {
            encoder.p(r.longValue());
            return;
        }
        Ca.C h = I.h(value.a());
        if (h != null) {
            encoder.f(pb.a.s(Ca.C.b).getDescriptor()).p(h.g());
            return;
        }
        Double m = Za.z.m(value.a());
        if (m != null) {
            encoder.g(m.doubleValue());
            return;
        }
        Boolean i1 = Za.E.i1(value.a());
        if (i1 != null) {
            encoder.u(i1.booleanValue());
        } else {
            encoder.F(value.a());
        }
    }

    public qb.e getDescriptor() {
        return b;
    }
}
