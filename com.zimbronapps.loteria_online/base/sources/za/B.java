package za;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b extends da.o {
    public Object g(byte b, ByteBuffer buffer) {
        kotlin.jvm.internal.t.g(buffer, "buffer");
        if (b == -127) {
            Long l = (Long) f(buffer);
            if (l == null) {
                return null;
            }
            return d0.b.a((int) l.longValue());
        }
        if (b == -126) {
            Long l2 = (Long) f(buffer);
            if (l2 == null) {
                return null;
            }
            return U.b.a((int) l2.longValue());
        }
        if (b == -125) {
            Long l3 = (Long) f(buffer);
            if (l3 == null) {
                return null;
            }
            return q0.b.a((int) l3.longValue());
        }
        if (b == -124) {
            Long l4 = (Long) f(buffer);
            if (l4 == null) {
                return null;
            }
            return Z3.b.a((int) l4.longValue());
        }
        if (b != -123) {
            return super.g(b, buffer);
        }
        Long l5 = (Long) f(buffer);
        if (l5 == null) {
            return null;
        }
        return p0.b.a((int) l5.longValue());
    }

    public void p(ByteArrayOutputStream stream, Object obj) {
        kotlin.jvm.internal.t.g(stream, "stream");
        if (obj instanceof d0) {
            stream.write(129);
            p(stream, Long.valueOf(((d0) obj).b()));
            return;
        }
        if (obj instanceof U) {
            stream.write(130);
            p(stream, Long.valueOf(((U) obj).b()));
            return;
        }
        if (obj instanceof q0) {
            stream.write(131);
            p(stream, Long.valueOf(((q0) obj).b()));
        } else if (obj instanceof Z3) {
            stream.write(132);
            p(stream, Long.valueOf(((Z3) obj).b()));
        } else if (!(obj instanceof p0)) {
            super.p(stream, obj);
        } else {
            stream.write(133);
            p(stream, Long.valueOf(((p0) obj).b()));
        }
    }
}
