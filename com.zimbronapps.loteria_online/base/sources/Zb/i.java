package zb;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class i extends a {
    public final Serializable a;

    public i(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.a = serializable;
    }

    public static boolean b(Throwable th, Object obj) {
        return obj != null && (th instanceof i) && obj.equals(((i) th).a);
    }

    public static void c(Throwable th, Object obj) {
        if (b(th, obj)) {
            throw ((i) th).getCause();
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized IOException getCause() {
        return super/*java.lang.Throwable*/.getCause();
    }
}
