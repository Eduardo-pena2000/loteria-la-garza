package G8;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class i extends f {
    public final I8.g a = new I8.g(false);

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(String str, f fVar) {
        I8.g gVar = this.a;
        if (fVar == null) {
            fVar = h.a;
        }
        gVar.put(str, fVar);
    }

    public Set j() {
        return this.a.entrySet();
    }
}
