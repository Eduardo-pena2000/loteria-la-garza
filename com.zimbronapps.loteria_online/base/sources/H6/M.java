package H6;

import android.text.TextUtils;
import com.google.android.gms.internal.drive.zzaw;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class m {
    public final String a;
    public final boolean b;
    public final int c;

    public static class a {
        public String a;
        public boolean b;
        public int c = 0;

        public m a() {
            e();
            return new m(this.a, this.b, this.c);
        }

        public a b(int i) {
            if (i == 0 || i == 1) {
                this.c = i;
                return this;
            }
            StringBuilder sb = new StringBuilder(53);
            sb.append("Unrecognized value for conflict strategy: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public a c(boolean z) {
            this.b = z;
            return this;
        }

        public a d(String str) {
            if (TextUtils.isEmpty(str) || str.length() > 65536) {
                throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", new Object[]{65536}));
            }
            this.a = str;
            return this;
        }

        public final void e() {
            if (this.c == 1 && !this.b) {
                throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
            }
        }
    }

    public m(String str, boolean z, int i) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public static boolean c(int i) {
        return i == 1;
    }

    public final void a(com.google.android.gms.common.api.h hVar) {
        b((zzaw) hVar.d(d.a));
    }

    public final void b(zzaw zzawVar) {
        if (this.b && !zzawVar.zzah()) {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        }
    }

    public final String d() {
        return this.a;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (obj == this) {
                return true;
            }
            m mVar = (m) obj;
            if (com.google.android.gms.common.internal.r.b(this.a, mVar.a) && this.c == mVar.c && this.b == mVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.c;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, Integer.valueOf(this.c), Boolean.valueOf(this.b));
    }
}
