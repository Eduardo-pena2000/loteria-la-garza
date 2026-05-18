package sb;

import rb.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class b implements ob.b {
    public static final /* synthetic */ Object a(b bVar, rb.c cVar) {
        return bVar.b(cVar);
    }

    public final Object b(rb.c cVar) {
        return c.a.c(cVar, getDescriptor(), 1, ob.d.a(this, cVar, cVar.o(getDescriptor(), 0)), null, 8, null);
    }

    public ob.a c(rb.c decoder, String str) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return decoder.a().d(e(), str);
    }

    public ob.k d(rb.f encoder, Object value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        return encoder.a().e(e(), value);
    }

    public final Object deserialize(rb.e decoder) {
        Object obj;
        kotlin.jvm.internal.t.g(decoder, "decoder");
        qb.e descriptor = getDescriptor();
        rb.c b = decoder.b(descriptor);
        kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
        if (b.m()) {
            obj = a(this, b);
        } else {
            obj = null;
            while (true) {
                int v = b.v(getDescriptor());
                if (v != -1) {
                    if (v == 0) {
                        o.a = b.o(getDescriptor(), v);
                    } else {
                        if (v != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) o.a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(v);
                            throw new ob.j(sb.toString());
                        }
                        Object obj2 = o.a;
                        if (obj2 == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        o.a = obj2;
                        obj = c.a.c(b, getDescriptor(), v, ob.d.a(this, b, (String) obj2), null, 8, null);
                    }
                } else {
                    if (obj == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) o.a)).toString());
                    }
                    kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                }
            }
        }
        b.c(descriptor);
        return obj;
    }

    public abstract Xa.c e();

    public final void serialize(rb.f encoder, Object value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        ob.k b = ob.d.b(this, encoder, value);
        qb.e descriptor = getDescriptor();
        rb.d b2 = encoder.b(descriptor);
        b2.v(getDescriptor(), 0, b.getDescriptor().h());
        qb.e descriptor2 = getDescriptor();
        kotlin.jvm.internal.t.e(b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        b2.k(descriptor2, 1, b, value);
        b2.c(descriptor);
    }
}
