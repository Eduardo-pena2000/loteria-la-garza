package G8;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class p {

    public class a extends p {
        public a() {
        }

        public void c(O8.a aVar, Object obj) {
            if (obj == null) {
                aVar.u();
            } else {
                p.this.c(aVar, obj);
            }
        }
    }

    public final p a() {
        return new a();
    }

    public final f b(Object obj) {
        try {
            J8.f fVar = new J8.f();
            c(fVar, obj);
            return fVar.T();
        } catch (IOException e) {
            throw new g((Throwable) e);
        }
    }

    public abstract void c(O8.a aVar, Object obj);
}
