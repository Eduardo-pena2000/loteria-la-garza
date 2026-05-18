package Y4;

import V4.q;
import Y4.i;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements i {
    public final ByteBuffer a;
    public final e5.m b;

    public static final class a implements i.a {
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(ByteBuffer byteBuffer, e5.m mVar, T4.d dVar) {
            return new c(byteBuffer, mVar);
        }
    }

    public c(ByteBuffer byteBuffer, e5.m mVar) {
        this.a = byteBuffer;
        this.b = mVar;
    }

    public Object a(Ga.e eVar) {
        try {
            xb.e eVar2 = new xb.e();
            eVar2.write(this.a);
            this.a.position(0);
            return new m(q.a(eVar2, this.b.g()), null, V4.f.b);
        } catch (Throwable th) {
            this.a.position(0);
            throw th;
        }
    }
}
