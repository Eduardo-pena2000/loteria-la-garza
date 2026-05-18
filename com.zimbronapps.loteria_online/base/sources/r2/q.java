package R2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class q extends g {
    public final j b;
    public final int c;

    public q(j jVar, int i, int i2) {
        super(b(i, i2));
        this.b = jVar;
        this.c = i2;
    }

    public static int b(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static q c(IOException iOException, j jVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !s7.c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new p(iOException, jVar) : new q(iOException, jVar, i2, i);
    }

    public q(String str, j jVar, int i, int i2) {
        super(str, b(i, i2));
        this.b = jVar;
        this.c = i2;
    }

    public q(IOException iOException, j jVar, int i, int i2) {
        super((Throwable) iOException, b(i, i2));
        this.b = jVar;
        this.c = i2;
    }

    public q(String str, IOException iOException, j jVar, int i, int i2) {
        super(str, iOException, b(i, i2));
        this.b = jVar;
        this.c = i2;
    }
}
