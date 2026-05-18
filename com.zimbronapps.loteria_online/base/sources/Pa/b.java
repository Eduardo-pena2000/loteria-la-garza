package pa;

import L5.y;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import pa.E;
import pa.f;
import pa.j;
import pa.m;
import pa.n;
import pa.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b extends da.o {
    public Context d;
    public final n.a e = new n.a();
    public final D f;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[p.b.values().length];
            a = iArr;
            try {
                iArr[p.b.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[p.b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(Context context, D d) {
        this.d = context;
        this.f = d;
    }

    public static Boolean q(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Boolean) obj;
    }

    public Object g(byte b, ByteBuffer byteBuffer) {
        switch (b) {
            case Byte.MIN_VALUE:
                return new n(((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
            case -127:
                return new m.a().o((List) g(byteBuffer.get(), byteBuffer)).m((String) g(byteBuffer.get(), byteBuffer)).t(q(g(byteBuffer.get(), byteBuffer))).s((List) g(byteBuffer.get(), byteBuffer)).n((Integer) g(byteBuffer.get(), byteBuffer)).q((String) g(byteBuffer.get(), byteBuffer)).r(null).l((Map) g(byteBuffer.get(), byteBuffer)).u(this.f.a()).p((List) g(byteBuffer.get(), byteBuffer)).a();
            case -126:
                return new n.c();
            case -125:
            case -109:
            default:
                return super.g(b, byteBuffer);
            case -124:
                return new E.b((Integer) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer));
            case -123:
                return new f.c(((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (f.e) g(byteBuffer.get(), byteBuffer));
            case -122:
                j.b bVar = new j.b();
                bVar.o((List) g(byteBuffer.get(), byteBuffer));
                bVar.m((String) g(byteBuffer.get(), byteBuffer));
                bVar.w((Map) g(byteBuffer.get(), byteBuffer));
                bVar.x((Map) g(byteBuffer.get(), byteBuffer));
                bVar.t((Boolean) g(byteBuffer.get(), byteBuffer));
                bVar.s((List) g(byteBuffer.get(), byteBuffer));
                bVar.n((Integer) g(byteBuffer.get(), byteBuffer));
                bVar.y((String) g(byteBuffer.get(), byteBuffer));
                bVar.q((String) g(byteBuffer.get(), byteBuffer));
                bVar.r(null);
                bVar.l((Map) g(byteBuffer.get(), byteBuffer));
                bVar.u(this.f.a());
                bVar.p((List) g(byteBuffer.get(), byteBuffer));
                return bVar.v();
            case -121:
                String str = (String) g(byteBuffer.get(), byteBuffer);
                str.hashCode();
                if (str.equals("ready")) {
                    return p.b.b;
                }
                if (str.equals("notReady")) {
                    return p.b.a;
                }
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{str}));
            case -120:
                return new p((p.b) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (Number) g(byteBuffer.get(), byteBuffer));
            case -119:
                return new u((Map) g(byteBuffer.get(), byteBuffer));
            case -118:
                return new G((String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer));
            case -117:
                return new f.a(((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer));
            case -116:
                return new f.e((String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (List) g(byteBuffer.get(), byteBuffer), (f.b) g(byteBuffer.get(), byteBuffer), (Map) g(byteBuffer.get(), byteBuffer));
            case -115:
                return new f.b((String) g(byteBuffer.get(), byteBuffer), ((Long) g(byteBuffer.get(), byteBuffer)).longValue(), (String) g(byteBuffer.get(), byteBuffer), (Map) g(byteBuffer.get(), byteBuffer), (f.a) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer));
            case -114:
                return new n.b(this.d, this.e, (String) g(byteBuffer.get(), byteBuffer), ((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
            case -113:
                return new n.e();
            case -112:
                return new A((Integer) g(byteBuffer.get(), byteBuffer), (Integer) g(byteBuffer.get(), byteBuffer), (H) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer));
            case -111:
                return new H((Boolean) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer));
            case -110:
                Integer num = (Integer) g(byteBuffer.get(), byteBuffer);
                return new n.d(this.e, this.d, num.intValue(), (Integer) g(byteBuffer.get(), byteBuffer), (Integer) g(byteBuffer.get(), byteBuffer));
            case -108:
                y.a aVar = new y.a();
                aVar.b((String) g(byteBuffer.get(), byteBuffer));
                aVar.c(((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
                aVar.d(((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
                aVar.e((List) g(byteBuffer.get(), byteBuffer));
                return aVar.a();
            case -107:
                return new sa.b((sa.d) g(byteBuffer.get(), byteBuffer), (ColorDrawable) g(byteBuffer.get(), byteBuffer), (sa.c) g(byteBuffer.get(), byteBuffer), (sa.c) g(byteBuffer.get(), byteBuffer), (sa.c) g(byteBuffer.get(), byteBuffer), (sa.c) g(byteBuffer.get(), byteBuffer));
            case -106:
                return new sa.c((ColorDrawable) g(byteBuffer.get(), byteBuffer), (ColorDrawable) g(byteBuffer.get(), byteBuffer), (sa.a) g(byteBuffer.get(), byteBuffer), (Double) g(byteBuffer.get(), byteBuffer));
            case -105:
                return sa.a.b(((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
            case -104:
                return sa.d.b(((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
            case -103:
                return new ColorDrawable(Color.argb(((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer)).intValue()));
            case -102:
                String str2 = (String) g(byteBuffer.get(), byteBuffer);
                try {
                    android.support.v4.media.session.b.a(Class.forName(str2).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
                    throw null;
                } catch (NoSuchMethodException unused) {
                    Log.e("FlutterMediationExtras", "No such method found: " + str2 + ".getDeclaredConstructor()");
                    return null;
                } catch (IllegalAccessException unused2) {
                    Log.e("FlutterMediationExtras", "Illegal Access to " + str2);
                    return null;
                } catch (ClassNotFoundException unused3) {
                    Log.e("FlutterMediationExtras", "Class not found: " + str2);
                    return null;
                } catch (InstantiationException unused4) {
                    Log.e("FlutterMediationExtras", "Unable to instantiate class " + str2);
                    return null;
                } catch (InvocationTargetException unused5) {
                    Log.e("FlutterMediationExtras", "Invocation Target Exception for: " + str2);
                    return null;
                }
        }
    }

    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof n) {
            s(byteArrayOutputStream, (n) obj);
            return;
        }
        if (obj instanceof j) {
            byteArrayOutputStream.write(-122);
            j jVar = (j) obj;
            p(byteArrayOutputStream, jVar.f());
            p(byteArrayOutputStream, jVar.d());
            p(byteArrayOutputStream, jVar.m());
            p(byteArrayOutputStream, jVar.n());
            p(byteArrayOutputStream, jVar.j());
            p(byteArrayOutputStream, jVar.i());
            p(byteArrayOutputStream, jVar.e());
            p(byteArrayOutputStream, jVar.o());
            p(byteArrayOutputStream, jVar.h());
            p(byteArrayOutputStream, jVar.c());
            p(byteArrayOutputStream, jVar.g());
            return;
        }
        if (obj instanceof m) {
            byteArrayOutputStream.write(-127);
            m mVar = (m) obj;
            p(byteArrayOutputStream, mVar.f());
            p(byteArrayOutputStream, mVar.d());
            p(byteArrayOutputStream, mVar.j());
            p(byteArrayOutputStream, mVar.i());
            p(byteArrayOutputStream, mVar.e());
            p(byteArrayOutputStream, mVar.h());
            p(byteArrayOutputStream, mVar.c());
            p(byteArrayOutputStream, mVar.g());
            return;
        }
        if (obj instanceof E.b) {
            byteArrayOutputStream.write(-124);
            E.b bVar = (E.b) obj;
            p(byteArrayOutputStream, bVar.a);
            p(byteArrayOutputStream, bVar.b);
            return;
        }
        if (obj instanceof f.b) {
            byteArrayOutputStream.write(-115);
            f.b bVar2 = (f.b) obj;
            p(byteArrayOutputStream, bVar2.f());
            p(byteArrayOutputStream, Long.valueOf(bVar2.i()));
            p(byteArrayOutputStream, bVar2.g());
            p(byteArrayOutputStream, bVar2.e());
            p(byteArrayOutputStream, bVar2.h());
            p(byteArrayOutputStream, bVar2.d());
            p(byteArrayOutputStream, bVar2.a());
            p(byteArrayOutputStream, bVar2.c());
            p(byteArrayOutputStream, bVar2.b());
            return;
        }
        if (obj instanceof f.e) {
            byteArrayOutputStream.write(-116);
            f.e eVar = (f.e) obj;
            p(byteArrayOutputStream, eVar.e());
            p(byteArrayOutputStream, eVar.c());
            p(byteArrayOutputStream, eVar.a());
            p(byteArrayOutputStream, eVar.b());
            p(byteArrayOutputStream, eVar.d());
            return;
        }
        if (obj instanceof f.c) {
            byteArrayOutputStream.write(-123);
            f.c cVar = (f.c) obj;
            p(byteArrayOutputStream, Integer.valueOf(cVar.a));
            p(byteArrayOutputStream, cVar.b);
            p(byteArrayOutputStream, cVar.c);
            p(byteArrayOutputStream, cVar.d);
            return;
        }
        if (obj instanceof f.a) {
            byteArrayOutputStream.write(-117);
            f.a aVar = (f.a) obj;
            p(byteArrayOutputStream, Integer.valueOf(aVar.a));
            p(byteArrayOutputStream, aVar.b);
            p(byteArrayOutputStream, aVar.c);
            return;
        }
        if (obj instanceof p.b) {
            byteArrayOutputStream.write(-121);
            p.b bVar3 = (p.b) obj;
            int i = a.a[bVar3.ordinal()];
            if (i == 1) {
                p(byteArrayOutputStream, "notReady");
                return;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{bVar3}));
                }
                p(byteArrayOutputStream, "ready");
                return;
            }
        }
        if (obj instanceof p) {
            byteArrayOutputStream.write(-120);
            p pVar = (p) obj;
            p(byteArrayOutputStream, pVar.a);
            p(byteArrayOutputStream, pVar.b);
            p(byteArrayOutputStream, pVar.c);
            return;
        }
        if (obj instanceof u) {
            byteArrayOutputStream.write(-119);
            p(byteArrayOutputStream, ((u) obj).a);
            return;
        }
        if (obj instanceof G) {
            byteArrayOutputStream.write(-118);
            G g = (G) obj;
            p(byteArrayOutputStream, g.c());
            p(byteArrayOutputStream, g.b());
            return;
        }
        if (obj instanceof A) {
            byteArrayOutputStream.write(-112);
            A a2 = (A) obj;
            p(byteArrayOutputStream, a2.a);
            p(byteArrayOutputStream, a2.b);
            p(byteArrayOutputStream, a2.c);
            p(byteArrayOutputStream, a2.d);
            p(byteArrayOutputStream, a2.e);
            p(byteArrayOutputStream, a2.f);
            return;
        }
        if (obj instanceof L5.y) {
            byteArrayOutputStream.write(-108);
            L5.y yVar = (L5.y) obj;
            p(byteArrayOutputStream, yVar.a());
            p(byteArrayOutputStream, Integer.valueOf(yVar.c()));
            p(byteArrayOutputStream, Integer.valueOf(yVar.d()));
            p(byteArrayOutputStream, yVar.e());
            return;
        }
        if (obj instanceof H) {
            byteArrayOutputStream.write(-111);
            H h = (H) obj;
            p(byteArrayOutputStream, h.a);
            p(byteArrayOutputStream, h.b);
            p(byteArrayOutputStream, h.c);
            return;
        }
        if (obj instanceof sa.b) {
            byteArrayOutputStream.write(-107);
            sa.b bVar4 = (sa.b) obj;
            p(byteArrayOutputStream, bVar4.g());
            p(byteArrayOutputStream, bVar4.d());
            p(byteArrayOutputStream, bVar4.c());
            p(byteArrayOutputStream, bVar4.e());
            p(byteArrayOutputStream, bVar4.f());
            p(byteArrayOutputStream, bVar4.h());
            return;
        }
        if (obj instanceof sa.a) {
            byteArrayOutputStream.write(-105);
            p(byteArrayOutputStream, Integer.valueOf(((sa.a) obj).ordinal()));
            return;
        }
        if (obj instanceof sa.d) {
            byteArrayOutputStream.write(-104);
            p(byteArrayOutputStream, Integer.valueOf(((sa.d) obj).ordinal()));
            return;
        }
        if (obj instanceof sa.c) {
            byteArrayOutputStream.write(-106);
            sa.c cVar2 = (sa.c) obj;
            p(byteArrayOutputStream, cVar2.d());
            p(byteArrayOutputStream, cVar2.a());
            p(byteArrayOutputStream, cVar2.b());
            p(byteArrayOutputStream, cVar2.c());
            return;
        }
        if (!(obj instanceof ColorDrawable)) {
            super.p(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(-103);
        int color = ((ColorDrawable) obj).getColor();
        p(byteArrayOutputStream, Integer.valueOf(Color.alpha(color)));
        p(byteArrayOutputStream, Integer.valueOf(Color.red(color)));
        p(byteArrayOutputStream, Integer.valueOf(Color.green(color)));
        p(byteArrayOutputStream, Integer.valueOf(Color.blue(color)));
    }

    public void r(Context context) {
        this.d = context;
    }

    public void s(ByteArrayOutputStream byteArrayOutputStream, n nVar) {
        if (nVar instanceof n.d) {
            n.d dVar = (n.d) nVar;
            byteArrayOutputStream.write(-110);
            p(byteArrayOutputStream, Integer.valueOf(dVar.b));
            p(byteArrayOutputStream, dVar.e);
            p(byteArrayOutputStream, dVar.d);
            return;
        }
        if (nVar instanceof n.b) {
            byteArrayOutputStream.write(-114);
            n.b bVar = (n.b) nVar;
            p(byteArrayOutputStream, bVar.d);
            p(byteArrayOutputStream, Integer.valueOf(bVar.b));
            return;
        }
        if (nVar instanceof n.e) {
            byteArrayOutputStream.write(-113);
        } else {
            if (nVar instanceof n.c) {
                byteArrayOutputStream.write(-126);
                return;
            }
            byteArrayOutputStream.write(-128);
            p(byteArrayOutputStream, Integer.valueOf(nVar.b));
            p(byteArrayOutputStream, Integer.valueOf(nVar.c));
        }
    }
}
