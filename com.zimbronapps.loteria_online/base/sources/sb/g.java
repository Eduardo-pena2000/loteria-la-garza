package sb;

import sb.E;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class G {

    public static final class a implements E {
        public final /* synthetic */ ob.b a;

        public a(ob.b bVar) {
            this.a = bVar;
        }

        public ob.b[] childSerializers() {
            return new ob.b[]{this.a};
        }

        public Object deserialize(rb.e decoder) {
            kotlin.jvm.internal.t.g(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        public qb.e getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        public void serialize(rb.f encoder, Object obj) {
            kotlin.jvm.internal.t.g(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        public ob.b[] typeParametersSerializers() {
            return E.a.a(this);
        }
    }

    public static final qb.e a(String name, ob.b primitiveSerializer) {
        kotlin.jvm.internal.t.g(name, "name");
        kotlin.jvm.internal.t.g(primitiveSerializer, "primitiveSerializer");
        return new F(name, new a(primitiveSerializer));
    }
}
