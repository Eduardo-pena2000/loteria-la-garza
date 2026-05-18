// default package

import da.o;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class i extends o {
    public Object g(byte b, ByteBuffer byteBuffer) {
        t.g(byteBuffer, "buffer");
        if (b == -127) {
            Object f = f(byteBuffer);
            List list = f instanceof List ? (List) f : null;
            if (list != null) {
                return d.b.a(list);
            }
            return null;
        }
        if (b != -126) {
            return super.g(b, byteBuffer);
        }
        Object f2 = f(byteBuffer);
        List list2 = f2 instanceof List ? (List) f2 : null;
        if (list2 != null) {
            return c.b.a(list2);
        }
        return null;
    }

    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        t.g(byteArrayOutputStream, "stream");
        if (obj instanceof d) {
            byteArrayOutputStream.write(129);
            p(byteArrayOutputStream, ((d) obj).b());
        } else if (!(obj instanceof c)) {
            super.p(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(130);
            p(byteArrayOutputStream, ((c) obj).a());
        }
    }
}
