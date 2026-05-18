package E8;

import Ca.I;
import Za.B;
import java.io.InputStream;
import java.io.OutputStream;
import o2.E;
import tb.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class i implements E {
    public static final i a = new i();
    public static final h b = new h(null, null, null, null, null);

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public h getDefaultValue() {
        return b;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(h hVar, OutputStream outputStream, Ga.e eVar) {
        outputStream.write(B.w(tb.b.d.b(h.Companion.serializer(), hVar)));
        return I.a;
    }

    public Object readFrom(InputStream inputStream, Ga.e eVar) {
        try {
            b.a aVar = tb.b.d;
            String v = B.v(Na.b.c(inputStream));
            aVar.a();
            return (h) aVar.d(h.Companion.serializer(), v);
        } catch (Exception e) {
            throw new o2.d("Cannot parse session configs", e);
        }
    }
}
