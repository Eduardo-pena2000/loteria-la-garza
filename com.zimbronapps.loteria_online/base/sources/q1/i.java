package Q1;

import Q1.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import w.i0;
import w.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final z a = new z(16);
    public static final ExecutorService b = m.a("fonts-androidx", 10, 10000);
    public static final Object c = new Object();
    public static final i0 d = new i0();

    public class a implements Callable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Q1.e c;
        public final /* synthetic */ int d;

        public a(String str, Context context, Q1.e eVar, int i) {
            this.a = str;
            this.b = context;
            this.c = eVar;
            this.d = i;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return i.c(this.a, this.b, h.a(this.c), this.d);
        }
    }

    public class b implements S1.b {
        public final /* synthetic */ Q1.a a;

        public b(Q1.a aVar) {
            this.a = aVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.a.b(eVar);
        }
    }

    public class c implements Callable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ List c;
        public final /* synthetic */ int d;

        public c(String str, Context context, List list, int i) {
            this.a = str;
            this.b = context;
            this.c = list;
            this.d = i;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return i.c(this.a, this.b, this.c, this.d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements S1.b {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (i.c) {
                try {
                    i0 i0Var = i.d;
                    ArrayList arrayList = (ArrayList) i0Var.get(this.a);
                    if (arrayList == null) {
                        return;
                    }
                    i0Var.remove(this.a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((S1.b) arrayList.get(i)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((Q1.e) list.get(i2)).d());
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static int b(l.a aVar) {
        int i = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        l.b[] c2 = aVar.c();
        if (c2 != null && c2.length != 0) {
            i = 0;
            for (l.b bVar : c2) {
                int b2 = bVar.b();
                if (b2 != 0) {
                    if (b2 < 0) {
                        return -3;
                    }
                    return b2;
                }
            }
        }
        return i;
    }

    public static e c(String str, Context context, List list, int i) {
        p4.a.c("getFontSync");
        try {
            z zVar = a;
            Typeface typeface = (Typeface) zVar.get(str);
            if (typeface != null) {
                return new e(typeface);
            }
            l.a e2 = Q1.d.e(context, list, null);
            int b2 = b(e2);
            if (b2 != 0) {
                return new e(b2);
            }
            Typeface b3 = (!e2.f() || Build.VERSION.SDK_INT < 29) ? K1.g.b(context, null, e2.c(), i) : K1.g.c(context, null, e2.d(), i);
            if (b3 == null) {
                return new e(-3);
            }
            zVar.put(str, b3);
            return new e(b3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            p4.a.f();
        }
    }

    public static Typeface d(Context context, List list, int i, Executor executor, Q1.a aVar) {
        String a2 = a(list, i);
        Typeface typeface = (Typeface) a.get(a2);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (c) {
            try {
                i0 i0Var = d;
                ArrayList arrayList = (ArrayList) i0Var.get(a2);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                i0Var.put(a2, arrayList2);
                c cVar = new c(a2, context, list, i);
                if (executor == null) {
                    executor = b;
                }
                m.c(executor, cVar, new d(a2));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, Q1.e eVar, Q1.a aVar, int i, int i2) {
        String a2 = a(f.a(eVar), i);
        Typeface typeface = (Typeface) a.get(a2);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i2 == -1) {
            e c2 = c(a2, context, g.a(eVar), i);
            aVar.b(c2);
            return c2.a;
        }
        try {
            e eVar2 = (e) m.d(b, new a(a2, context, eVar, i), i2);
            aVar.b(eVar2);
            return eVar2.a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    public static final class e {
        public final Typeface a;
        public final int b;

        public e(int i) {
            this.a = null;
            this.b = i;
        }

        public boolean a() {
            return this.b == 0;
        }

        public e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
