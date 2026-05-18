package o3;

import L3.s;
import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l implements u {
    public static final int[] r = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final a s = new a(new j());
    public static final a t = new a(new k());
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int l;
    public t7.r m;
    public int q;
    public int k = 1;
    public int n = 112800;
    public s.a p = new L3.h();
    public boolean o = true;

    public static final class a {
        public final a a;
        public final AtomicBoolean b = new AtomicBoolean(false);
        public Constructor c;

        public interface a {
            Constructor a();
        }

        public a(a aVar) {
            this.a = aVar;
        }

        public p a(Object... objArr) {
            Constructor b = b();
            if (b == null) {
                return null;
            }
            try {
                return (p) b.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }

        public final Constructor b() {
            synchronized (this.b) {
                if (this.b.get()) {
                    return this.c;
                }
                try {
                    return this.a.a();
                } catch (ClassNotFoundException unused) {
                    this.b.set(true);
                    return this.c;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }

    public static /* synthetic */ Constructor e() {
        return h();
    }

    public static /* synthetic */ Constructor f() {
        return i();
    }

    public static Constructor h() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", (Class[]) null).invoke((Object) null, (Object[]) null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(p.class).getConstructor(new Class[]{Integer.TYPE});
        }
        return null;
    }

    public static Constructor i() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(p.class).getConstructor((Class[]) null);
    }

    public synchronized p[] b(Uri uri, Map map) {
        p[] pVarArr;
        try {
            int[] iArr = r;
            ArrayList arrayList = new ArrayList(iArr.length);
            int b = M2.o.b(map);
            if (b != -1) {
                g(b, arrayList);
            }
            int c = M2.o.c(uri);
            if (c != -1 && c != b) {
                g(c, arrayList);
            }
            for (int i : iArr) {
                if (i != b && i != c) {
                    g(i, arrayList);
                }
            }
            pVarArr = new p[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                p pVar = (p) arrayList.get(i2);
                if (this.o && !(pVar.g() instanceof I3.h) && !(pVar.g() instanceof I3.m) && !(pVar.g() instanceof U3.J) && !(pVar.g() instanceof q3.b) && !(pVar.g() instanceof G3.e)) {
                    pVar = new L3.t(pVar, this.p);
                }
                pVarArr[i2] = pVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return pVarArr;
    }

    public synchronized p[] d() {
        return b(Uri.EMPTY, new HashMap());
    }

    public final void g(int i, List list) {
        switch (i) {
            case 0:
                list.add(new U3.b());
                break;
            case 1:
                list.add(new U3.e());
                break;
            case 2:
                list.add(new U3.h((this.c ? 2 : 0) | this.d | (this.b ? 1 : 0)));
                break;
            case 3:
                list.add(new p3.b((this.c ? 2 : 0) | this.e | (this.b ? 1 : 0)));
                break;
            case 4:
                p a2 = s.a(Integer.valueOf(this.f));
                if (a2 == null) {
                    list.add(new t3.d(this.f));
                    break;
                } else {
                    list.add(a2);
                    break;
                }
            case 5:
                list.add(new u3.c());
                break;
            case 6:
                list.add(new G3.e(this.p, (this.o ? 0 : 2) | this.g));
                break;
            case 7:
                list.add(new H3.f((this.c ? 2 : 0) | this.j | (this.b ? 1 : 0)));
                break;
            case 8:
                list.add(new I3.h(this.p, this.i | (this.o ? 0 : 32)));
                list.add(new I3.m(this.p, (this.o ? 0 : 16) | this.h));
                break;
            case 9:
                list.add(new J3.d());
                break;
            case 10:
                list.add(new U3.C());
                break;
            case 11:
                if (this.m == null) {
                    this.m = t7.r.s();
                }
                list.add(new U3.J(this.k, !this.o ? 1 : 0, this.p, new P2.E(0L), new U3.j(this.l, this.m), this.n));
                break;
            case 12:
                list.add(new V3.b());
                break;
            case 14:
                list.add(new w3.a(this.q));
                break;
            case 15:
                p a3 = t.a(new Object[0]);
                if (a3 != null) {
                    list.add(a3);
                    break;
                }
                break;
            case 16:
                list.add(new q3.b(!this.o ? 1 : 0, this.p));
                break;
            case 17:
                list.add(new K3.a());
                break;
            case 18:
                list.add(new W3.a());
                break;
            case 19:
                list.add(new s3.a());
                break;
            case 20:
                int i2 = this.h;
                if ((i2 & 2) == 0 && (i2 & 4) == 0) {
                    list.add(new v3.a());
                    break;
                }
                break;
            case 21:
                list.add(new r3.a());
                break;
        }
    }

    public synchronized l j(boolean z) {
        this.c = z;
        return this;
    }

    public synchronized l k(boolean z) {
        this.b = z;
        return this;
    }

    public synchronized l l(int i) {
        this.j = i;
        return this;
    }
}
