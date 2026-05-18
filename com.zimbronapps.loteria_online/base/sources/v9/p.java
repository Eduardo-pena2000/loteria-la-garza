package V9;

import V9.c;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class p {
    public int a;
    public int b;
    public int c;
    public String d;
    public int e;
    public int f;
    public int g;

    public static p a(ByteBuffer byteBuffer, c.a aVar) {
        p pVar = new p();
        byte[] b = n.b(byteBuffer);
        a.a(b, pVar);
        if (pVar.b()) {
            o.b(b, pVar);
            aVar.a(pVar.a, pVar.b);
            b.a(b, pVar);
        }
        return pVar;
    }

    public boolean b() {
        return "image/heif".equals(this.d);
    }
}
