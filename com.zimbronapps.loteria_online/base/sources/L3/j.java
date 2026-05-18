package L3;

import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j extends S2.h implements l {
    public final String o;

    public class a extends q {
        public a() {
        }

        public void o() {
            j.x(j.this, this);
        }
    }

    public j(String str) {
        super(new p[2], new q[2]);
        this.o = str;
        w(1024);
    }

    public static /* synthetic */ void x(j jVar, S2.g gVar) {
        jVar.t(gVar);
    }

    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final m k(Throwable th) {
        return new m("Unexpected decode error", th);
    }

    public abstract k B(byte[] bArr, int i, boolean z);

    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final m l(p pVar, q qVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) P2.a.e(pVar.d);
            qVar.p(pVar.f, B(byteBuffer.array(), byteBuffer.limit(), z), pVar.j);
            qVar.d = false;
            return null;
        } catch (m e) {
            return e;
        }
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final p i() {
        return new p();
    }

    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final q j() {
        return new a();
    }

    public void b(long j) {
    }
}
