package g8;

import android.util.Base64;
import android.util.JsonWriter;
import e8.g;
import e8.h;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e implements e8.f, h {
    public e a = null;
    public boolean b = true;
    public final JsonWriter c;
    public final Map d;
    public final Map e;
    public final e8.e f;
    public final boolean g;

    public e(Writer writer, Map map, Map map2, e8.e eVar, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = eVar;
        this.g = z;
    }

    public e8.f b(e8.d dVar, Object obj) {
        return p(dVar.b(), obj);
    }

    public e8.f c(e8.d dVar, double d) {
        return m(dVar.b(), d);
    }

    public e8.f d(e8.d dVar, int i) {
        return n(dVar.b(), i);
    }

    public e8.f e(e8.d dVar, long j) {
        return o(dVar.b(), j);
    }

    public e8.f f(e8.d dVar, boolean z) {
        return q(dVar.b(), z);
    }

    public e h(double d) {
        y();
        this.c.value(d);
        return this;
    }

    public e i(int i) {
        y();
        this.c.value(i);
        return this;
    }

    public e j(long j) {
        y();
        this.c.value(j);
        return this;
    }

    public e k(Object obj, boolean z) {
        if (z && t(obj)) {
            throw new e8.c(String.format("%s cannot be encoded inline", new Object[]{obj == null ? null : obj.getClass()}));
        }
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new e8.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                    }
                }
                this.c.endObject();
                return this;
            }
            e8.e eVar = (e8.e) this.d.get(obj.getClass());
            if (eVar != null) {
                return v(eVar, obj, z);
            }
            g gVar = (g) this.e.get(obj.getClass());
            if (gVar != null) {
                gVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f, obj, z);
            }
            if (obj instanceof f) {
                i(((f) obj).getNumber());
            } else {
                a(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                this.c.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                j(jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                this.c.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                this.c.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.c.endArray();
        return this;
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e a(String str) {
        y();
        this.c.value(str);
        return this;
    }

    public e m(String str, double d) {
        y();
        this.c.name(str);
        return h(d);
    }

    public e n(String str, int i) {
        y();
        this.c.name(str);
        return i(i);
    }

    public e o(String str, long j) {
        y();
        this.c.name(str);
        return j(j);
    }

    public e p(String str, Object obj) {
        return this.g ? x(str, obj) : w(str, obj);
    }

    public e q(String str, boolean z) {
        y();
        this.c.name(str);
        return g(z);
    }

    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e g(boolean z) {
        y();
        this.c.value(z);
        return this;
    }

    public e s(byte[] bArr) {
        y();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public final boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void u() {
        y();
        this.c.flush();
    }

    public e v(e8.e eVar, Object obj, boolean z) {
        if (!z) {
            this.c.beginObject();
        }
        eVar.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }

    public final e w(String str, Object obj) {
        y();
        this.c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.c.nullValue();
        return this;
    }

    public final e x(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        y();
        this.c.name(str);
        return k(obj, false);
    }

    public final void y() {
        if (!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.a;
        if (eVar != null) {
            eVar.y();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }
}
