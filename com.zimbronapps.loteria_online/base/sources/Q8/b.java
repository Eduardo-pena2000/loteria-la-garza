package q8;

import com.google.android.gms.common.internal.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class b {
    public String a;

    public b(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return r.b(this.a, ((b) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return r.c(new Object[]{this.a});
    }

    public String toString() {
        return r.d(this).a("token", this.a).toString();
    }
}
