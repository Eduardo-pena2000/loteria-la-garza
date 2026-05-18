package x3;

import M2.x;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c implements a {
    public final x a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) P2.a.e(bVar.d);
        P2.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    public abstract x b(b bVar, ByteBuffer byteBuffer);
}
