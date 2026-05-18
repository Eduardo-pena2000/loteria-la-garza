package x1;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d extends b {
    public static ArrayList g;

    static {
        ArrayList arrayList = new ArrayList();
        g = arrayList;
        arrayList.add("ConstraintSets");
        g.add("Variables");
        g.add("Generate");
        g.add("Transitions");
        g.add("KeyFrames");
        g.add("KeyAttributes");
        g.add("KeyPositions");
        g.add("KeyCycles");
    }

    public d(char[] cArr) {
        super(cArr);
    }

    public static c I(String str, c cVar) {
        d dVar = new d(str.toCharArray());
        dVar.k(0L);
        dVar.j(str.length() - 1);
        dVar.L(cVar);
        return dVar;
    }

    public String J() {
        return b();
    }

    public c K() {
        if (this.f.size() > 0) {
            return (c) this.f.get(0);
        }
        return null;
    }

    public void L(c cVar) {
        if (this.f.size() > 0) {
            this.f.set(0, cVar);
        } else {
            this.f.add(cVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d) || Objects.equals(J(), ((d) obj).J())) {
            return super.equals(obj);
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
