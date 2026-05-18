package Q4;

import G4.p;
import G4.v;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a implements Runnable {
    public final H4.c a = new H4.c();

    public class a extends a {
        public final /* synthetic */ H4.i b;
        public final /* synthetic */ UUID c;

        public a(H4.i iVar, UUID uuid) {
            this.b = iVar;
            this.c = uuid;
        }

        public void h() {
            WorkDatabase o = this.b.o();
            o.c();
            try {
                a(this.b, this.c.toString());
                o.r();
                o.g();
                g(this.b);
            } catch (Throwable th) {
                o.g();
                throw th;
            }
        }
    }

    public class b extends a {
        public final /* synthetic */ H4.i b;
        public final /* synthetic */ String c;

        public b(H4.i iVar, String str) {
            this.b = iVar;
            this.c = str;
        }

        public void h() {
            WorkDatabase o = this.b.o();
            o.c();
            try {
                Iterator it = o.B().i(this.c).iterator();
                while (it.hasNext()) {
                    a(this.b, (String) it.next());
                }
                o.r();
                o.g();
                g(this.b);
            } catch (Throwable th) {
                o.g();
                throw th;
            }
        }
    }

    public class c extends a {
        public final /* synthetic */ H4.i b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;

        public c(H4.i iVar, String str, boolean z) {
            this.b = iVar;
            this.c = str;
            this.d = z;
        }

        public void h() {
            WorkDatabase o = this.b.o();
            o.c();
            try {
                Iterator it = o.B().e(this.c).iterator();
                while (it.hasNext()) {
                    a(this.b, (String) it.next());
                }
                o.r();
                o.g();
                if (this.d) {
                    g(this.b);
                }
            } catch (Throwable th) {
                o.g();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, H4.i iVar) {
        return new a(iVar, uuid);
    }

    public static a c(String str, H4.i iVar, boolean z) {
        return new c(iVar, str, z);
    }

    public static a d(String str, H4.i iVar) {
        return new b(iVar, str);
    }

    public void a(H4.i iVar, String str) {
        f(iVar.o(), str);
        iVar.m().l(str);
        Iterator it = iVar.n().iterator();
        while (it.hasNext()) {
            ((H4.e) it.next()).a(str);
        }
    }

    public G4.p e() {
        return this.a;
    }

    public final void f(WorkDatabase workDatabase, String str) {
        P4.q B = workDatabase.B();
        P4.b t = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            v g = B.g(str2);
            if (g != v.SUCCEEDED && g != v.FAILED) {
                B.f(v.CANCELLED, str2);
            }
            linkedList.addAll(t.a(str2));
        }
    }

    public void g(H4.i iVar) {
        H4.f.b(iVar.i(), iVar.o(), iVar.n());
    }

    public abstract void h();

    public void run() {
        try {
            h();
            this.a.a(G4.p.a);
        } catch (Throwable th) {
            this.a.a(new p.b.a(th));
        }
    }
}
