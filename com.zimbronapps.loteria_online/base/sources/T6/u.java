package T6;

import com.google.android.gms.internal.games_v2.zzam;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class u {
    public final String a;

    public u(String str) {
        this.a = str;
    }

    public static u a(zzam zzamVar) {
        return new u(zzamVar.zza());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return Objects.equals(this.a, ((u) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }
}
