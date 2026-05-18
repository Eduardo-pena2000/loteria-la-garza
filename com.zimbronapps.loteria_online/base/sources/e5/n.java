package e5;

import Ca.x;
import Da.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n implements Iterable, Ra.a {
    public static final b b = new b(null);
    public static final n c = new n();
    public final Map a;

    public static final class a {
        public final Map a;

        public a(n nVar) {
            this.a = S.C(n.a(nVar));
        }

        public final n a() {
            return new n(j5.c.b(this.a), null);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ n(Map map, kotlin.jvm.internal.k kVar) {
        this(map);
    }

    public static final /* synthetic */ Map a(n nVar) {
        return nVar.a;
    }

    public final Map b() {
        if (isEmpty()) {
            return S.h();
        }
        Map map = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return linkedHashMap;
        }
        android.support.v4.media.session.b.a(((Map.Entry) it.next()).getValue());
        throw null;
    }

    public final a e() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && t.c(this.a, ((n) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public Iterator iterator() {
        Map map = this.a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            android.support.v4.media.session.b.a(entry.getValue());
            arrayList.add(x.a(str, (Object) null));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(entries=" + this.a + ')';
    }

    public n(Map map) {
        this.a = map;
    }

    public n() {
        this(S.h());
    }
}
