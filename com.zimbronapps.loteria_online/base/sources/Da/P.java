package da;

import da.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class p implements k {
    public static final p b = new p(o.a);
    public final o a;

    public p(o oVar) {
        this.a = oVar;
    }

    public i a(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f = this.a.f(byteBuffer);
        Object f2 = this.a.f(byteBuffer);
        if (!(f instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new i((String) f, f2);
    }

    public ByteBuffer b(i iVar) {
        o.a aVar = new o.a();
        this.a.p(aVar, iVar.a);
        this.a.p(aVar, iVar.b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public ByteBuffer c(Object obj) {
        o.a aVar = new o.a();
        aVar.write(0);
        this.a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public Object d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        if (b2 != 0) {
            if (b2 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object f = this.a.f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return f;
        }
        Object f2 = this.a.f(byteBuffer);
        Object f3 = this.a.f(byteBuffer);
        Object f4 = this.a.f(byteBuffer);
        if ((f2 instanceof String) && ((f3 == null || (f3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new d((String) f2, (String) f3, f4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    public ByteBuffer e(String str, String str2, Object obj, String str3) {
        o.a aVar = new o.a();
        aVar.write(1);
        this.a.p(aVar, str);
        this.a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.a.p(aVar, Q9.b.d((Throwable) obj));
        } else {
            this.a.p(aVar, obj);
        }
        this.a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public ByteBuffer f(String str, String str2, Object obj) {
        o.a aVar = new o.a();
        aVar.write(1);
        this.a.p(aVar, str);
        this.a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.a.p(aVar, Q9.b.d((Throwable) obj));
        } else {
            this.a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }
}
