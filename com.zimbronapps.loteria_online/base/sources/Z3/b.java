package z3;

import M2.x;
import P2.z;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends x3.c {
    public x b(x3.b bVar, ByteBuffer byteBuffer) {
        return new x(c(new z(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(z zVar) {
        return new a((String) P2.a.e(zVar.A()), (String) P2.a.e(zVar.A()), zVar.z(), zVar.z(), Arrays.copyOfRange(zVar.e(), zVar.f(), zVar.g()));
    }
}
