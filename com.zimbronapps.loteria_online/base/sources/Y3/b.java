package y3;

import M2.x;
import P2.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import s7.e;
import x3.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends c {
    public static x c(y yVar) {
        yVar.r(12);
        int d = (yVar.d() + yVar.h(12)) - 4;
        yVar.r(44);
        yVar.s(yVar.h(12));
        yVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (yVar.d() >= d) {
                break;
            }
            yVar.r(48);
            int h = yVar.h(8);
            yVar.r(4);
            int d2 = yVar.d() + yVar.h(12);
            String str2 = null;
            while (yVar.d() < d2) {
                int h2 = yVar.h(8);
                int h3 = yVar.h(8);
                int d3 = yVar.d() + h3;
                if (h2 == 2) {
                    int h4 = yVar.h(16);
                    yVar.r(8);
                    if (h4 == 3) {
                        while (yVar.d() < d3) {
                            str = yVar.l(yVar.h(8), e.a);
                            int h5 = yVar.h(8);
                            for (int i = 0; i < h5; i++) {
                                yVar.s(yVar.h(8));
                            }
                        }
                    }
                } else if (h2 == 21) {
                    str2 = yVar.l(h3, e.a);
                }
                yVar.p(d3 * 8);
            }
            yVar.p(d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new a(h, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x((List) arrayList);
    }

    public x b(x3.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new y(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
