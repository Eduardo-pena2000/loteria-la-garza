package R2;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g extends IOException {
    public final int a;

    public g(int i) {
        this.a = i;
    }

    public static boolean a(IOException iOException) {
        while (iOException != null) {
            if ((iOException instanceof g) && ((g) iOException).a == 2008) {
                return true;
            }
            iOException = iOException.getCause();
        }
        return false;
    }

    public g(Throwable th, int i) {
        super(th);
        this.a = i;
    }

    public g(String str, int i) {
        super(str);
        this.a = i;
    }

    public g(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
    }
}
