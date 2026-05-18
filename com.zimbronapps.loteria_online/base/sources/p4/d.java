package P4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d {
    public String a;
    public Long b;

    public d(String str, boolean z) {
        this(str, z ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.a.equals(dVar.a)) {
            return false;
        }
        Long l = this.b;
        Long l2 = dVar.b;
        return l != null ? l.equals(l2) : l2 == null;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public d(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }
}
