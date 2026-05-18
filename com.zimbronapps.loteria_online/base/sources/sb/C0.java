package sb;

import java.lang.annotation.Annotation;
import java.util.List;
import qb.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class c0 implements ob.b {
    public final Object a;
    public List b;
    public final Ca.l c;

    public c0(String serialName, Object objectInstance) {
        kotlin.jvm.internal.t.g(serialName, "serialName");
        kotlin.jvm.internal.t.g(objectInstance, "objectInstance");
        this.a = objectInstance;
        this.b = Da.v.n();
        this.c = Ca.m.a(Ca.n.b, new a0(serialName, this));
    }

    public static /* synthetic */ Ca.I a(c0 c0Var, qb.a aVar) {
        return d(c0Var, aVar);
    }

    public static /* synthetic */ qb.e b(String str, c0 c0Var) {
        return c(str, c0Var);
    }

    public static final qb.e c(String str, c0 c0Var) {
        return qb.k.d(str, m.d.a, new qb.e[0], new b0(c0Var));
    }

    public static final Ca.I d(c0 c0Var, qb.a buildSerialDescriptor) {
        kotlin.jvm.internal.t.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.h(c0Var.b);
        return Ca.I.a;
    }

    public Object deserialize(rb.e decoder) {
        int v;
        kotlin.jvm.internal.t.g(decoder, "decoder");
        qb.e descriptor = getDescriptor();
        rb.c b = decoder.b(descriptor);
        if (b.m() || (v = b.v(getDescriptor())) == -1) {
            Ca.I i = Ca.I.a;
            b.c(descriptor);
            return this.a;
        }
        throw new ob.j("Unexpected index " + v);
    }

    public qb.e getDescriptor() {
        return (qb.e) this.c.getValue();
    }

    public void serialize(rb.f encoder, Object value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c0(String serialName, Object objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        kotlin.jvm.internal.t.g(serialName, "serialName");
        kotlin.jvm.internal.t.g(objectInstance, "objectInstance");
        kotlin.jvm.internal.t.g(classAnnotations, "classAnnotations");
        this.b = Da.p.c(classAnnotations);
    }
}
