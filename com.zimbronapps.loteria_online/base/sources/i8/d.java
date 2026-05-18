package I8;

import G8.p;
import G8.q;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d implements q, Cloneable {
    public static final d g = new d();
    public boolean d;
    public double a = -1.0d;
    public int b = 136;
    public boolean c = true;
    public List e = Collections.emptyList();
    public List f = Collections.emptyList();

    public class a extends p {
        public p a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ G8.d d;
        public final /* synthetic */ N8.a e;

        public a(boolean z, boolean z2, G8.d dVar, N8.a aVar) {
            this.b = z;
            this.c = z2;
            this.d = dVar;
            this.e = aVar;
        }

        public void c(O8.a aVar, Object obj) {
            if (this.c) {
                aVar.u();
            } else {
                d().c(aVar, obj);
            }
        }

        public final p d() {
            p pVar = this.a;
            if (pVar != null) {
                return pVar;
            }
            p h = this.d.h(d.this, this.e);
            this.a = h;
            return h;
        }
    }

    public p a(G8.d dVar, N8.a aVar) {
        Class c = aVar.c();
        boolean d = d(c);
        boolean z = d || e(c, true);
        boolean z2 = d || e(c, false);
        if (z || z2) {
            return new a(z2, z, dVar, aVar);
        }
        return null;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean c(Class cls, boolean z) {
        return d(cls) || e(cls, z);
    }

    public final boolean d(Class cls) {
        if (this.a != -1.0d && !l((H8.d) cls.getAnnotation(H8.d.class), (H8.e) cls.getAnnotation(H8.e.class))) {
            return true;
        }
        if (this.c || !h(cls)) {
            return g(cls);
        }
        return true;
    }

    public final boolean e(Class cls, boolean z) {
        Iterator it = (z ? this.e : this.f).iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public boolean f(Field field, boolean z) {
        H8.a aVar;
        if ((this.b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.a != -1.0d && !l((H8.d) field.getAnnotation(H8.d.class), (H8.e) field.getAnnotation(H8.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.d && ((aVar = (H8.a) field.getAnnotation(H8.a.class)) == null || (!z ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.c && h(field.getType())) || g(field.getType())) {
            return true;
        }
        List list = z ? this.e : this.f;
        if (list.isEmpty()) {
            return false;
        }
        new G8.a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public final boolean g(Class cls) {
        return (Enum.class.isAssignableFrom(cls) || i(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    public final boolean h(Class cls) {
        return cls.isMemberClass() && !i(cls);
    }

    public final boolean i(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean j(H8.d dVar) {
        if (dVar != null) {
            return this.a >= dVar.value();
        }
        return true;
    }

    public final boolean k(H8.e eVar) {
        if (eVar != null) {
            return this.a < eVar.value();
        }
        return true;
    }

    public final boolean l(H8.d dVar, H8.e eVar) {
        return j(dVar) && k(eVar);
    }
}
