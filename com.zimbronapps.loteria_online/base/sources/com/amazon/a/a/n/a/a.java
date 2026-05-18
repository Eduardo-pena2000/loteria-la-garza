package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.d.a.c;
import com.amazon.d.a.j;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a extends com.amazon.a.a.n.c.a {
    private static final com.amazon.a.a.o.c b = new com.amazon.a.a.o.c("AbstractCommandTask");

    @com.amazon.a.a.k.a
    protected com.amazon.a.a.l.b a;

    @com.amazon.a.a.k.a
    private Application c;

    @com.amazon.a.a.k.a
    private d d;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e e;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c f;

    @com.amazon.a.a.k.a
    private b g;

    public class 1 extends c.a {
        public 1() {
        }

        public String a() throws RemoteException {
            return a.this.c();
        }

        public String b() throws RemoteException {
            return a.this.a_();
        }

        public Map c() throws RemoteException {
            return a.this.b();
        }

        public String d() throws RemoteException {
            return a.a(a.this).getPackageName();
        }
    }

    public static /* synthetic */ Application a(a aVar) {
        return aVar.c;
    }

    private void b(j jVar) throws RemoteException, com.amazon.a.a.d.b {
        if (com.amazon.a.a.o.c.a) {
            b.a("Command executed successfully");
        }
        a(jVar);
    }

    private com.amazon.d.a.c i() {
        return new 1();
    }

    private void j() {
        if (m()) {
            return;
        }
        this.d.b();
    }

    public abstract void a(com.amazon.d.a.h hVar) throws RemoteException, com.amazon.a.a.d.b;

    public abstract void a(j jVar) throws RemoteException, com.amazon.a.a.d.b;

    public abstract String a_();

    public abstract Map b();

    public abstract String c();

    public abstract boolean d();

    public void e() throws com.amazon.a.a.d.b {
    }

    public boolean f() {
        return true;
    }

    public String g() {
        return a_() + "_failure";
    }

    public String h() {
        return a_() + "_success";
    }

    public final void a() {
        try {
            if (com.amazon.a.a.o.c.a) {
                com.amazon.a.a.o.c cVar = b;
                cVar.a("----------------------------------------------");
                cVar.a("Executing: " + a_());
                cVar.a("----------------------------------------------");
            }
            e();
        } catch (Throwable th) {
            try {
                a(th);
                if (com.amazon.a.a.o.c.a) {
                }
            } finally {
                if (com.amazon.a.a.o.c.a) {
                    b.a("Task finished");
                }
                j();
            }
        }
        if (!d()) {
            if (com.amazon.a.a.o.c.a) {
                b.a("Execution not needed, quitting");
            }
            return;
        }
        if (com.amazon.a.a.o.c.a) {
            b.a("Executing Command: " + a_());
        }
        a(this.d.a(i()));
        if (com.amazon.a.a.o.c.a) {
            b.a("Task finished");
        }
        j();
    }

    private void b(com.amazon.d.a.h hVar) throws RemoteException, com.amazon.a.a.d.b {
        if (com.amazon.a.a.o.c.a) {
            b.a("Command failed execution: " + hVar.b());
        }
        a(hVar);
    }

    private com.amazon.a.a.d.b b(Throwable th) {
        if (th instanceof com.amazon.a.a.d.b) {
            return (com.amazon.a.a.d.b) th;
        }
        if (th instanceof RemoteException) {
            return new com.amazon.a.a.n.a.a.d((RemoteException) th);
        }
        return new com.amazon.a.a.n.a.a.h(th);
    }

    public void b(com.amazon.a.a.d.b bVar) {
        b.b("On Exception!!!!: " + bVar);
    }

    private void a(c cVar) throws com.amazon.a.a.d.b, RemoteException {
        if (com.amazon.a.a.o.c.a) {
            b.a("Received result from CommandService: " + cVar);
        }
        if (cVar == null) {
            if (com.amazon.a.a.o.c.a) {
                b.a("Received null result from command service, exiting task");
            }
        } else {
            if (cVar.e() != null) {
                a(cVar.e());
                return;
            }
            this.g.a(cVar.a(), this.d.a());
            if (cVar.b() != null) {
                b(cVar.b());
            } else if (cVar.c() != null) {
                b(cVar.c());
            } else if (f()) {
                a(cVar.d());
            }
        }
    }

    private void a(com.amazon.d.a.g gVar) throws RemoteException, com.amazon.a.a.d.b {
        throw new com.amazon.a.a.n.a.a.f(gVar);
    }

    private void a(com.amazon.d.a.f fVar) throws RemoteException, com.amazon.a.a.d.b {
        if (com.amazon.a.a.o.c.a) {
            b.a("Handling Decision");
        }
        try {
            f fVar2 = new f(fVar);
            this.e.a((com.amazon.a.a.i.b) fVar2);
            com.amazon.d.a.a i = fVar2.i();
            if (i == null) {
                if (com.amazon.a.a.o.c.a) {
                    b.a("DecisionChooser returned null!!, expiring");
                }
                a(fVar, e.a);
                return;
            }
            a(fVar, i);
        } catch (com.amazon.a.a.n.a.a.e e) {
            a(fVar, e.a());
        }
    }

    private void a(com.amazon.d.a.f fVar, com.amazon.d.a.a aVar) throws RemoteException, com.amazon.a.a.d.b {
        if (com.amazon.a.a.o.c.a) {
            b.a("Handling customer choice: " + aVar);
        }
        Intent b2 = aVar.b();
        if (b2 != null) {
            if (com.amazon.a.a.o.c.a) {
                b.a("Choice has intent, scheduling it to be fired!!");
            }
            com.amazon.a.a.l.a a = this.a.a(b2);
            if (a == null) {
                if (com.amazon.a.a.o.c.a) {
                    b.a("No result recived, expiring decision");
                }
                a(fVar, e.a);
                return;
            } else if (a.d() == 0) {
                if (com.amazon.a.a.o.c.a) {
                    b.a("Result canceled, expiring decision");
                }
                a(fVar, e.c);
                return;
            } else {
                if (com.amazon.a.a.o.c.a) {
                    b.a("Result received!!!, notifying service");
                }
                a(this.d.a(aVar));
                return;
            }
        }
        if (com.amazon.a.a.o.c.a) {
            b.a("No intent given, choosing now");
        }
        a(this.d.a(aVar));
    }

    private void a(com.amazon.d.a.f fVar, e eVar) throws RemoteException, com.amazon.a.a.d.b {
        if (com.amazon.a.a.o.c.a) {
            b.a("Expiring Decision: " + fVar + ", reason: " + eVar);
        }
        a(this.d.a(fVar, eVar));
    }

    private void a(Throwable th) {
        if (com.amazon.a.a.o.c.a) {
            b.a("Exception occurred while processing task: " + th, th);
        }
        com.amazon.a.a.d.b b2 = b(th);
        b(b2);
        this.f.a(a(b2));
    }

    public com.amazon.a.a.h.a a(com.amazon.a.a.d.b bVar) {
        com.amazon.a.a.h.a aVar = new com.amazon.a.a.h.a(g());
        aVar.a("subType", bVar.a()).a("reason", bVar.b()).a("context", bVar.c());
        return aVar;
    }
}
