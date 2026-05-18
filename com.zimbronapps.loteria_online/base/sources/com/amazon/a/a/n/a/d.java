package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.RemoteException;
import com.amazon.d.a.d;
import com.amazon.d.a.e;
import com.amazon.d.a.i;
import com.amazon.d.a.j;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d {
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("CommandServiceClient");
    private static final String b = "com.amazon.venezia.service.command.CommandServiceImpl";
    private static final String c = "com.amazon.venezia.CommandService";
    private com.amazon.d.a.d d;
    private String e;

    @com.amazon.a.a.k.a
    private Application h;

    @com.amazon.a.a.k.a
    private b i;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c j;
    private final BlockingQueue f = new LinkedBlockingQueue();
    private final BlockingQueue g = new LinkedBlockingQueue();
    private final ServiceConnection k = new 1();
    private final com.amazon.d.a.i l = new 2();

    public class 1 implements ServiceConnection {
        public 1() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.c().a("onServiceConnected");
            d.a(d.this).add(d.a.a(iBinder));
        }

        public void onServiceDisconnected(ComponentName componentName) {
            d.c().a("onServiceDisconnected!!!");
        }
    }

    public class 2 extends i.a {
        public 2() {
        }

        public void a(j jVar) throws RemoteException {
            d.b(d.this).add(new c(jVar));
        }

        public void a(com.amazon.d.a.h hVar) throws RemoteException {
            d.b(d.this).add(new c(hVar));
        }

        public void a(com.amazon.d.a.f fVar) throws RemoteException {
            d.b(d.this).add(new c(fVar));
        }

        public void a(com.amazon.d.a.g gVar) throws RemoteException {
            d.b(d.this).add(new c(gVar));
        }
    }

    public class 3 extends e.a {
        final /* synthetic */ e a;

        public 3(e eVar) {
            this.a = eVar;
        }

        public String a() throws RemoteException {
            return this.a.name();
        }

        public Map b() throws RemoteException {
            return null;
        }
    }

    public static class a {
        int a;
        boolean b;
        long c;
    }

    public static /* synthetic */ BlockingQueue a(d dVar) {
        return dVar.g;
    }

    public static /* synthetic */ BlockingQueue b(d dVar) {
        return dVar.f;
    }

    public static /* synthetic */ com.amazon.a.a.o.c c() {
        return a;
    }

    private boolean d() {
        return this.d != null;
    }

    private void e() throws com.amazon.a.a.n.a.a.b, com.amazon.a.a.n.a.a.c {
        long currentTimeMillis = System.currentTimeMillis();
        com.amazon.a.a.o.c cVar = a;
        cVar.a("Binding Service!!!");
        Intent f = f();
        if (!a((Context) this.h, f)) {
            throw new com.amazon.a.a.n.a.a.c();
        }
        cVar.a("Found service on one or more packages");
        Intent a2 = a(f);
        String packageName = a2.getComponent().getPackageName();
        cVar.a("Attempting to bind to service on " + packageName);
        if (!this.h.bindService(a2, this.k, 1)) {
            throw new com.amazon.a.a.n.a.a.b();
        }
        try {
            cVar.a("Blocking while service is being bound!!");
            this.d = (com.amazon.d.a.d) this.g.take();
            cVar.a("service bound, returning!!");
            if (com.amazon.a.a.o.c.a) {
                cVar.a("Kiwi.BindService Time: " + (System.currentTimeMillis() - currentTimeMillis));
            }
            this.j.a("PACKAGE", packageName);
            this.e = packageName;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new com.amazon.a.a.n.a.a.b();
        }
    }

    private Intent f() {
        Intent intent = new Intent();
        intent.setAction("com.amazon.venezia.CommandService");
        a.a("Created intent with  action  com.amazon.venezia.CommandService");
        return intent;
    }

    private c g() throws RemoteException {
        try {
            com.amazon.a.a.o.c cVar = a;
            cVar.a("Blocking for result from service");
            c cVar2 = (c) this.f.take();
            cVar.a("Received result from service");
            return cVar2;
        } catch (InterruptedException unused) {
            a.a("TaskThread interrupted, returning null result");
            return null;
        }
    }

    private c b(com.amazon.d.a.c cVar) throws RemoteException {
        this.j.a("COMMAND", cVar.b());
        this.d.a(cVar, this.l);
        return g();
    }

    public c a(com.amazon.d.a.c cVar) throws com.amazon.a.a.n.a.a.c, com.amazon.a.a.n.a.a.b, RemoteException {
        a aVar = new a();
        aVar.a = 6;
        aVar.c = 100L;
        while (true) {
            try {
                if (!d()) {
                    e();
                }
                return b(cVar);
            } catch (com.amazon.a.a.n.a.a.b e) {
                a(e, aVar);
                if (!aVar.b) {
                    throw e;
                }
            } catch (com.amazon.a.a.n.a.a.c e2) {
                a(e2, aVar);
                if (!aVar.b) {
                    throw e2;
                }
            }
        }
    }

    public void b() {
        com.amazon.a.a.o.c cVar = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Finishing CommandServiceClient, unbinding service: ");
        sb.append(this.d != null);
        cVar.a(sb.toString());
        if (this.d != null) {
            this.h.unbindService(this.k);
            this.d = null;
        }
    }

    private boolean b(String str) {
        a.a("isPackageSignatureTrusted " + str);
        return this.i.a(str, i.a);
    }

    public static void a(com.amazon.a.a.d.b bVar, a aVar) {
        com.amazon.a.a.o.c cVar = a;
        cVar.b("CommandServiceException happened, retriesLeft=" + aVar.a, bVar);
        int i = aVar.a;
        if (i == 0) {
            aVar.b = false;
            return;
        }
        aVar.a = i - 1;
        aVar.b = true;
        try {
            cVar.a("Sleeping for " + aVar.c + " ms");
            Thread.sleep(aVar.c);
        } catch (InterruptedException unused) {
            aVar.b = false;
        }
        aVar.c *= 2;
    }

    public String a() {
        return this.e;
    }

    private boolean a(Context context, Intent intent) {
        return context.getPackageManager().resolveService(intent, 64) != null;
    }

    private Intent a(String str) {
        Intent intent = new Intent();
        intent.setAction("com.amazon.venezia.CommandService");
        intent.setClassName(str, "com.amazon.venezia.service.command.CommandServiceImpl");
        return intent;
    }

    private Intent a(Intent intent) throws com.amazon.a.a.n.a.a.c {
        if (this.e != null) {
            a.a("Using previously determined package " + this.e);
            return a(this.e);
        }
        com.amazon.a.a.o.c cVar = a;
        cVar.a("No previously determined package found, checking for suitable package.");
        Intent a2 = a(this.h.getPackageManager().queryIntentServices(intent, 64));
        if (a2 != null) {
            return a2;
        }
        cVar.a("No app with valid signature was providing our service.");
        throw new com.amazon.a.a.n.a.a.c();
    }

    private Intent a(List list) {
        int i = 0;
        String str = null;
        while (true) {
            try {
                if (i >= list.size()) {
                    i = -1;
                    break;
                }
                ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
                String str2 = resolveInfo.serviceInfo.applicationInfo.packageName;
                com.amazon.a.a.o.c cVar = a;
                cVar.a("Examining package " + str2);
                cVar.a("Priority is " + resolveInfo.filter.getPriority());
                cVar.a("Checking signature of package " + str2);
                if (b(str2)) {
                    cVar.a("Signature of package " + str2 + " is okay");
                    str = str2;
                    break;
                }
                cVar.a("Signature of package " + str2 + " is bad");
                i++;
                str = str2;
            } catch (Exception e) {
                a.a("Caught exception " + e);
            }
        }
        if (i > -1) {
            return a(str);
        }
        return null;
    }

    public c a(com.amazon.d.a.a aVar) throws RemoteException {
        aVar.a(null);
        return g();
    }

    public c a(com.amazon.d.a.f fVar, e eVar) throws RemoteException {
        fVar.a(new 3(eVar));
        return g();
    }
}
