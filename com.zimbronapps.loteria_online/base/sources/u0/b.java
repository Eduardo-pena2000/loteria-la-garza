package U0;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public final HashMap a = new HashMap();

    public static final class a {
        public final B0.d a;
        public final int b;

        public a(B0.d dVar, int i) {
            this.a = dVar;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final B0.d b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.c(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ')';
        }
    }

    public static final class b {
        public final Resources.Theme a;
        public final int b;

        public b(Resources.Theme theme, int i) {
            this.a = theme;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.c(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "Key(theme=" + this.a + ", id=" + this.b + ')';
        }
    }

    public final void a() {
        this.a.clear();
    }

    public final a b(b bVar) {
        WeakReference weakReference = (WeakReference) this.a.get(bVar);
        if (weakReference != null) {
            return (a) weakReference.get();
        }
        return null;
    }

    public final void c(int i) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(i, aVar.a())) {
                it.remove();
            }
        }
    }

    public final void d(b bVar, a aVar) {
        this.a.put(bVar, new WeakReference(aVar));
    }
}
