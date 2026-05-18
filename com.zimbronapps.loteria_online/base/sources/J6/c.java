package j6;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c implements a.d {
    public static final c b = new c(new Bundle(), null);
    public final Bundle a;

    public /* synthetic */ c(Bundle bundle, i iVar) {
        this.a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return r.a(this.a, ((c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return r.c(this.a);
    }
}
