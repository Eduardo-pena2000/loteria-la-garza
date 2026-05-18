package h8;

import h8.d;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f implements e8.f {
    public static final Charset f = Charset.forName("UTF-8");
    public static final e8.d g = e8.d.a("key").b(h8.a.b().c(1).a()).a();
    public static final e8.d h = e8.d.a("value").b(h8.a.b().c(2).a()).a();
    public static final e8.e i = new e();
    public OutputStream a;
    public final Map b;
    public final Map c;
    public final e8.e d;
    public final i e = new i(this);

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.a.values().length];
            a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(OutputStream outputStream, Map map, Map map2, e8.e eVar) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = eVar;
    }

    public static /* synthetic */ void a(Map.Entry entry, e8.f fVar) {
        w(entry, fVar);
    }

    public static ByteBuffer p(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static d u(e8.d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2;
        }
        throw new e8.c("Field has no @Protobuf config");
    }

    public static int v(e8.d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2.tag();
        }
        throw new e8.c("Field has no @Protobuf config");
    }

    public static /* synthetic */ void w(Map.Entry entry, e8.f fVar) {
        fVar.b(g, entry.getKey());
        fVar.b(h, entry.getValue());
    }

    public e8.f b(e8.d dVar, Object obj) {
        return i(dVar, obj, true);
    }

    public e8.f c(e8.d dVar, double d) {
        return g(dVar, d, true);
    }

    public e8.f g(e8.d dVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        x((v(dVar) << 3) | 1);
        this.a.write(p(8).putDouble(d).array());
        return this;
    }

    public e8.f h(e8.d dVar, float f2, boolean z) {
        if (z && f2 == 0.0f) {
            return this;
        }
        x((v(dVar) << 3) | 5);
        this.a.write(p(4).putFloat(f2).array());
        return this;
    }

    public e8.f i(e8.d dVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            x((v(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            x(bytes.length);
            this.a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(dVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                r(i, dVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return g(dVar, ((Double) obj).doubleValue(), z);
        }
        if (obj instanceof Float) {
            return h(dVar, ((Float) obj).floatValue(), z);
        }
        if (obj instanceof Number) {
            return m(dVar, ((Number) obj).longValue(), z);
        }
        if (obj instanceof Boolean) {
            return o(dVar, ((Boolean) obj).booleanValue(), z);
        }
        if (!(obj instanceof byte[])) {
            e8.e eVar = (e8.e) this.b.get(obj.getClass());
            if (eVar != null) {
                return r(eVar, dVar, obj, z);
            }
            e8.g gVar = (e8.g) this.c.get(obj.getClass());
            return gVar != null ? s(gVar, dVar, obj, z) : obj instanceof c ? d(dVar, ((c) obj).getNumber()) : obj instanceof Enum ? d(dVar, ((Enum) obj).ordinal()) : r(this.d, dVar, obj, z);
        }
        byte[] bArr = (byte[]) obj;
        if (z && bArr.length == 0) {
            return this;
        }
        x((v(dVar) << 3) | 2);
        x(bArr.length);
        this.a.write(bArr);
        return this;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f d(e8.d dVar, int i2) {
        return k(dVar, i2, true);
    }

    public f k(e8.d dVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return this;
        }
        d u = u(dVar);
        int i3 = a.a[u.intEncoding().ordinal()];
        if (i3 == 1) {
            x(u.tag() << 3);
            x(i2);
        } else if (i3 == 2) {
            x(u.tag() << 3);
            x((i2 << 1) ^ (i2 >> 31));
        } else if (i3 == 3) {
            x((u.tag() << 3) | 5);
            this.a.write(p(4).putInt(i2).array());
        }
        return this;
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f e(e8.d dVar, long j) {
        return m(dVar, j, true);
    }

    public f m(e8.d dVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        d u = u(dVar);
        int i2 = a.a[u.intEncoding().ordinal()];
        if (i2 == 1) {
            x(u.tag() << 3);
            y(j);
        } else if (i2 == 2) {
            x(u.tag() << 3);
            y((j >> 63) ^ (j << 1));
        } else if (i2 == 3) {
            x((u.tag() << 3) | 1);
            this.a.write(p(8).putLong(j).array());
        }
        return this;
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f f(e8.d dVar, boolean z) {
        return o(dVar, z, true);
    }

    public f o(e8.d dVar, boolean z, boolean z2) {
        return k(dVar, z ? 1 : 0, z2);
    }

    public final long q(e8.e eVar, Object obj) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.a;
            this.a = bVar;
            try {
                eVar.a(obj, this);
                this.a = outputStream;
                long a2 = bVar.a();
                bVar.close();
                return a2;
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final f r(e8.e eVar, e8.d dVar, Object obj, boolean z) {
        long q = q(eVar, obj);
        if (z && q == 0) {
            return this;
        }
        x((v(dVar) << 3) | 2);
        y(q);
        eVar.a(obj, this);
        return this;
    }

    public final f s(e8.g gVar, e8.d dVar, Object obj, boolean z) {
        this.e.c(dVar, z);
        gVar.a(obj, this.e);
        return this;
    }

    public f t(Object obj) {
        if (obj == null) {
            return this;
        }
        e8.e eVar = (e8.e) this.b.get(obj.getClass());
        if (eVar != null) {
            eVar.a(obj, this);
            return this;
        }
        throw new e8.c("No encoder for " + obj.getClass());
    }

    public final void x(int i2) {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void y(long j) {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
