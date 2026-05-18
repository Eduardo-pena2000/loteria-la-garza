package x6;

import android.net.Uri;
import com.google.android.gms.common.internal.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b {
    public final Uri a;

    public b(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return r.b(((b) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return r.c(this.a);
    }
}
