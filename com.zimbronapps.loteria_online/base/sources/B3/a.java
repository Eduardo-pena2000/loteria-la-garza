package b3;

import M2.q;
import M2.y;
import M2.z;
import P2.K;
import S2.h;
import T2.X0;
import android.graphics.Bitmap;
import b3.c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends h implements b3.c {
    public final b o;

    public class a extends f {
        public a() {
        }

        public void o() {
            a.y(a.this, this);
        }
    }

    public interface b {
        Bitmap a(byte[] bArr, int i);
    }

    public static final class c implements c.a {
        public final b b = new b3.b();

        public static /* synthetic */ Bitmap c(byte[] bArr, int i) {
            return e(bArr, i);
        }

        public static /* synthetic */ Bitmap e(byte[] bArr, int i) {
            return a.x(bArr, i);
        }

        public int a(q qVar) {
            String str = qVar.n;
            return (str == null || !y.p(str)) ? X0.t(0) : K.y0(qVar.n) ? X0.t(4) : X0.t(1);
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a(this.b, null);
        }
    }

    public /* synthetic */ a(b bVar, a aVar) {
        this(bVar);
    }

    public static Bitmap B(byte[] bArr, int i) {
        try {
            return R2.c.a(bArr, i, null);
        } catch (z e) {
            throw new d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new d((Throwable) e2);
        }
    }

    public static /* synthetic */ Bitmap x(byte[] bArr, int i) {
        return B(bArr, i);
    }

    public static /* synthetic */ void y(a aVar, S2.g gVar) {
        aVar.t(gVar);
    }

    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public d k(Throwable th) {
        return new d("Unexpected decode error", th);
    }

    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public d l(S2.f fVar, f fVar2, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) P2.a.e(fVar.d);
            P2.a.f(byteBuffer.hasArray());
            P2.a.a(byteBuffer.arrayOffset() == 0);
            fVar2.e = this.o.a(byteBuffer.array(), byteBuffer.remaining());
            fVar2.b = fVar.f;
            return null;
        } catch (d e) {
            return e;
        }
    }

    public /* bridge */ /* synthetic */ f a() {
        return (f) super.a();
    }

    public S2.f i() {
        return new S2.f(1);
    }

    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public f j() {
        return new a();
    }

    public a(b bVar) {
        super(new S2.f[1], new f[1]);
        this.o = bVar;
    }
}
