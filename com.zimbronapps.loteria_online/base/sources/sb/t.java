package sb;

import java.util.Iterator;
import java.util.Map;
import rb.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class T extends a {
    public final ob.b a;
    public final ob.b b;

    public /* synthetic */ T(ob.b bVar, ob.b bVar2, kotlin.jvm.internal.k kVar) {
        this(bVar, bVar2);
    }

    public abstract qb.e getDescriptor();

    public final ob.b m() {
        return this.a;
    }

    public final ob.b n() {
        return this.b;
    }

    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(rb.c decoder, Map builder, int i, int i2) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        if (i2 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        Wa.g v = Wa.n.v(Wa.n.w(0, i2 * 2), 2);
        int f = v.f();
        int g = v.g();
        int h = v.h();
        if ((h <= 0 || f > g) && (h >= 0 || g > f)) {
            return;
        }
        while (true) {
            h(decoder, i + f, builder, false);
            if (f == g) {
                return;
            } else {
                f += h;
            }
        }
    }

    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(rb.c decoder, int i, Map builder, boolean z) {
        int i2;
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        Object c = c.a.c(decoder, getDescriptor(), i, this.a, null, 8, null);
        if (z) {
            i2 = decoder.v(getDescriptor());
            if (i2 != i + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        int i3 = i2;
        builder.put(c, (!builder.containsKey(c) || (this.b.getDescriptor().getKind() instanceof qb.d)) ? c.a.c(decoder, getDescriptor(), i3, this.b, null, 8, null) : decoder.e(getDescriptor(), i3, this.b, Da.S.i(builder, c)));
    }

    public void serialize(rb.f encoder, Object obj) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        int e = e(obj);
        qb.e descriptor = getDescriptor();
        rb.d C = encoder.C(descriptor, e);
        Iterator d = d(obj);
        int i = 0;
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            C.k(getDescriptor(), i, m(), key);
            i += 2;
            C.k(getDescriptor(), i2, n(), value);
        }
        C.c(descriptor);
    }

    public T(ob.b bVar, ob.b bVar2) {
        super(null);
        this.a = bVar;
        this.b = bVar2;
    }
}
