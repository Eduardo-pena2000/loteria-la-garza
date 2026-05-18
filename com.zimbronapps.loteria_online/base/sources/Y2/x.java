package Y2;

import Y2.h;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class x {

    public static final class a {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return P2.K.W(P2.K.X(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    public static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int a(Throwable th, int i) {
        int i2 = P2.K.a;
        if (i2 >= 21 && a.a(th)) {
            return a.b(th);
        }
        if (i2 >= 23 && b.a(th)) {
            return 6006;
        }
        if ((th instanceof NotProvisionedException) || b(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return 6007;
        }
        if (th instanceof N) {
            return 6001;
        }
        if (th instanceof h.e) {
            return 6003;
        }
        if (th instanceof K) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    public static boolean b(Throwable th) {
        return P2.K.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean c(Throwable th) {
        return P2.K.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
