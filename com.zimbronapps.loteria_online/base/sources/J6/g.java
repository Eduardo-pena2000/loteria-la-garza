package j6;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g implements a.d {
    public static final g d = new g(new f());
    public final String a = null;
    public final boolean b;
    public final String c;

    public g(f fVar) {
        this.b = fVar.a.booleanValue();
        this.c = fVar.b;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", (String) null);
        bundle.putBoolean("force_save_dialog", this.b);
        bundle.putString("log_session_id", this.c);
        return bundle;
    }

    public final /* synthetic */ boolean b() {
        return this.b;
    }

    public final /* synthetic */ String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.a;
        return r.b(null, null) && this.b == gVar.b && r.b(this.c, gVar.c);
    }

    public final int hashCode() {
        return r.c(null, Boolean.valueOf(this.b), this.c);
    }
}
