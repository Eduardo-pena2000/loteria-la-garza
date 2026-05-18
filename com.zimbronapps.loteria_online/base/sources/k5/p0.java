package k5;

import T6.v;
import android.util.Log;
import c7.g;
import com.abedalkareem.games_services.models.SavedGame;
import com.google.android.gms.tasks.Task;
import da.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p0 {
    public Z9.c a;
    public final String b;

    public p0(Z9.c cVar) {
        kotlin.jvm.internal.t.g(cVar, "activityPluginBinding");
        this.a = cVar;
        this.b = "SaveGame";
    }

    public static final void C(p0 p0Var, String str, j.d dVar, Exception exc) {
        kotlin.jvm.internal.t.g(exc, "it");
        Log.d(p0Var.b, "[LoadGame] Failed to open a game with name " + str + ", error " + exc.getLocalizedMessage());
        String a = m5.d.a(m5.c.m);
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        dVar.b(a, localizedMessage, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:3:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Ca.I D(k5.p0 r4, da.j.d r5, com.google.android.gms.tasks.Task r6) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.t.g(r6, r0)
            java.lang.Object r6 = r6.getResult()
            T6.v$a r6 = (T6.v.a) r6
            java.lang.Object r6 = r6.a()
            c7.a r6 = (c7.a) r6
            java.lang.String r0 = r4.b
            java.lang.String r1 = "[LoadGame] Got the result"
            android.util.Log.d(r0, r1)
            r0 = 0
            if (r6 == 0) goto L28
            c7.b r1 = r6.I1()     // Catch: java.lang.Exception -> L26
            if (r1 == 0) goto L28
            byte[] r1 = r1.A()     // Catch: java.lang.Exception -> L26
            goto L29
        L26:
            r6 = move-exception
            goto L61
        L28:
            r1 = r0
        L29:
            if (r1 == 0) goto L3d
            java.lang.String r6 = r4.b     // Catch: java.lang.Exception -> L26
            java.lang.String r2 = "[LoadGame] Loaded game successfully"
            android.util.Log.d(r6, r2)     // Catch: java.lang.Exception -> L26
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L26
            java.nio.charset.Charset r2 = Za.c.b     // Catch: java.lang.Exception -> L26
            r6.<init>(r1, r2)     // Catch: java.lang.Exception -> L26
            r5.a(r6)     // Catch: java.lang.Exception -> L26
            goto L8c
        L3d:
            java.lang.String r1 = r4.b     // Catch: java.lang.Exception -> L26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
            r2.<init>()     // Catch: java.lang.Exception -> L26
            java.lang.String r3 = "[LoadGame] Failed to read fully "
            r2.append(r3)     // Catch: java.lang.Exception -> L26
            r2.append(r6)     // Catch: java.lang.Exception -> L26
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L26
            android.util.Log.d(r1, r6)     // Catch: java.lang.Exception -> L26
            m5.c r6 = m5.c.m     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = m5.d.a(r6)     // Catch: java.lang.Exception -> L26
            java.lang.String r6 = m5.d.b(r6)     // Catch: java.lang.Exception -> L26
            r5.b(r1, r6, r0)     // Catch: java.lang.Exception -> L26
            goto L8c
        L61:
            java.lang.String r4 = r4.b
            java.lang.String r1 = r6.getLocalizedMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[LoadGame] Something went wrong "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.d(r4, r1)
            m5.c r4 = m5.c.m
            java.lang.String r4 = m5.d.a(r4)
            java.lang.String r6 = r6.getLocalizedMessage()
            if (r6 != 0) goto L89
            java.lang.String r6 = ""
        L89:
            r5.b(r4, r6, r0)
        L8c:
            Ca.I r4 = Ca.I.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.p0.D(k5.p0, da.j$d, com.google.android.gms.tasks.Task):Ca.I");
    }

    public static final Ca.I F(String str, p0 p0Var, c7.g gVar, j.d dVar, v.a aVar) {
        c7.a aVar2 = (c7.a) aVar.a();
        if (aVar2 != null) {
            c7.b I1 = aVar2.I1();
            byte[] bytes = str.getBytes(Za.c.b);
            kotlin.jvm.internal.t.f(bytes, "this as java.lang.String).getBytes(charset)");
            I1.L(bytes);
            Log.d(p0Var.b, "[SaveGame] Start commit");
            p0Var.A().commitAndClose(aVar2, gVar).addOnSuccessListener(new b0(new a0(p0Var, dVar))).addOnFailureListener(new c0(p0Var, dVar));
        } else {
            Log.d(p0Var.b, "[SaveGame] Something went wrong snapshot is null " + aVar);
            m5.c cVar = m5.c.l;
            dVar.b(m5.d.a(cVar), m5.d.b(cVar), (Object) null);
        }
        return Ca.I.a;
    }

    public static final Ca.I G(p0 p0Var, j.d dVar, c7.e eVar) {
        Log.d(p0Var.b, "[SaveGame] Saved successfully");
        dVar.a((Object) null);
        return Ca.I.a;
    }

    public static final void H(Qa.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void I(p0 p0Var, j.d dVar, Exception exc) {
        kotlin.jvm.internal.t.g(exc, "it");
        Log.d(p0Var.b, "[SaveGame] Something went wrong while commit " + exc.getLocalizedMessage());
        dVar.b(m5.d.a(m5.c.l), exc.getLocalizedMessage(), (Object) null);
    }

    public static final void J(Qa.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void K(p0 p0Var, j.d dVar, Exception exc) {
        kotlin.jvm.internal.t.g(exc, "it");
        Log.d(p0Var.b, "[SaveGame] Failed with error " + exc.getLocalizedMessage());
        dVar.b(m5.d.a(m5.c.l), exc.getLocalizedMessage(), (Object) null);
    }

    public static /* synthetic */ Ca.I a(p0 p0Var, j.d dVar, Task task) {
        return s(p0Var, dVar, task);
    }

    public static /* synthetic */ void b(p0 p0Var, String str, j.d dVar, Exception exc) {
        C(p0Var, str, dVar, exc);
    }

    public static /* synthetic */ void c(p0 p0Var, j.d dVar, Exception exc) {
        v(p0Var, dVar, exc);
    }

    public static /* synthetic */ Ca.I d(p0 p0Var, j.d dVar, Task task) {
        return D(p0Var, dVar, task);
    }

    public static /* synthetic */ Ca.I e(p0 p0Var, j.d dVar, T6.b bVar) {
        return x(p0Var, dVar, bVar);
    }

    public static /* synthetic */ void f(p0 p0Var, j.d dVar, Exception exc) {
        K(p0Var, dVar, exc);
    }

    public static /* synthetic */ void g(p0 p0Var, j.d dVar, Exception exc) {
        r(p0Var, dVar, exc);
    }

    public static /* synthetic */ void h(Qa.l lVar, Object obj) {
        y(lVar, obj);
    }

    public static /* synthetic */ void i(Qa.l lVar, Object obj) {
        J(lVar, obj);
    }

    public static /* synthetic */ void j(Qa.l lVar, Object obj) {
        u(lVar, obj);
    }

    public static /* synthetic */ Ca.I k(p0 p0Var, j.d dVar, String str) {
        return t(p0Var, dVar, str);
    }

    public static /* synthetic */ void l(Qa.l lVar, Object obj) {
        H(lVar, obj);
    }

    public static /* synthetic */ void m(p0 p0Var, j.d dVar, Exception exc) {
        z(p0Var, dVar, exc);
    }

    public static /* synthetic */ Ca.I n(String str, p0 p0Var, c7.g gVar, j.d dVar, v.a aVar) {
        return F(str, p0Var, gVar, dVar, aVar);
    }

    public static /* synthetic */ void o(p0 p0Var, j.d dVar, Exception exc) {
        I(p0Var, dVar, exc);
    }

    public static /* synthetic */ Ca.I p(p0 p0Var, j.d dVar, c7.e eVar) {
        return G(p0Var, dVar, eVar);
    }

    public static final void r(p0 p0Var, j.d dVar, Exception exc) {
        kotlin.jvm.internal.t.g(exc, "it");
        Log.d(p0Var.b, "[DeleteGame] Open failed with error " + exc.getLocalizedMessage());
        String a = m5.d.a(m5.c.p);
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        dVar.b(a, localizedMessage, (Object) null);
    }

    public static final Ca.I s(p0 p0Var, j.d dVar, Task task) {
        kotlin.jvm.internal.t.g(task, "snapshotOrConflict");
        c7.a aVar = (c7.a) ((v.a) task.getResult()).a();
        Log.d(p0Var.b, "[DeleteGame] Got result");
        if ((aVar != null ? aVar.e() : null) != null) {
            Log.d(p0Var.b, "[DeleteGame] Start deleting snapshot");
            p0Var.A().delete(aVar.e()).addOnSuccessListener(new e0(new d0(p0Var, dVar))).addOnFailureListener(new f0(p0Var, dVar));
            return Ca.I.a;
        }
        Log.d(p0Var.b, "[DeleteGame] Meta data is null " + aVar);
        m5.c cVar = m5.c.p;
        dVar.b(m5.d.a(cVar), m5.d.b(cVar), (Object) null);
        return Ca.I.a;
    }

    public static final Ca.I t(p0 p0Var, j.d dVar, String str) {
        Log.d(p0Var.b, "[DeleteGame] Deleted successfully");
        dVar.a(str);
        return Ca.I.a;
    }

    public static final void u(Qa.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void v(p0 p0Var, j.d dVar, Exception exc) {
        kotlin.jvm.internal.t.g(exc, "it");
        Log.d(p0Var.b, "[DeleteGame] Something went wrong deleting snapshot " + exc.getLocalizedMessage());
        String a = m5.d.a(m5.c.p);
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        dVar.b(a, localizedMessage, (Object) null);
    }

    public static final Ca.I x(p0 p0Var, j.d dVar, T6.b bVar) {
        G8.d dVar2 = new G8.d();
        c7.f fVar = (c7.f) bVar.a();
        if (fVar == null) {
            Log.d(p0Var.b, "[GetSavedGames] Something went wrong data is null");
            m5.c cVar = m5.c.n;
            dVar.b(m5.d.a(cVar), m5.d.b(cVar), (Object) null);
            return Ca.I.a;
        }
        List<c7.e> L0 = Da.D.L0(fVar);
        ArrayList arrayList = new ArrayList(Da.w.y(L0, 10));
        for (c7.e eVar : L0) {
            arrayList.add(new SavedGame(eVar.w0(), Long.valueOf(eVar.y()), eVar.getDeviceName()));
        }
        Log.d(p0Var.b, "[GetSavedGames] Loaded successfully");
        String l = dVar2.l(arrayList);
        if (l == null) {
            l = "";
        }
        dVar.a(l);
        fVar.release();
        return Ca.I.a;
    }

    public static final void y(Qa.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void z(p0 p0Var, j.d dVar, Exception exc) {
        kotlin.jvm.internal.t.g(exc, "it");
        Log.d(p0Var.b, "[GetSavedGames] Something went wrong " + exc.getLocalizedMessage());
        dVar.b(m5.d.a(m5.c.n), exc.getLocalizedMessage(), (Object) null);
    }

    public final T6.v A() {
        T6.v e = T6.m.e(this.a.getActivity());
        kotlin.jvm.internal.t.f(e, "getSnapshotsClient(...)");
        return e;
    }

    public final void B(String str, j.d dVar) {
        kotlin.jvm.internal.t.g(str, "name");
        kotlin.jvm.internal.t.g(dVar, "result");
        Log.d(this.b, "[LoadGame] Load game started");
        A().open(str, false, 3).addOnFailureListener(new k0(this, str, dVar)).continueWith(new l0(this, dVar));
    }

    public final void E(String str, String str2, String str3, j.d dVar) {
        kotlin.jvm.internal.t.g(str, "data");
        kotlin.jvm.internal.t.g(str2, "desc");
        kotlin.jvm.internal.t.g(str3, "name");
        kotlin.jvm.internal.t.g(dVar, "result");
        Log.d(this.b, "[SaveGame] Start saving game");
        c7.g a = new g.a().c(str2).a();
        kotlin.jvm.internal.t.f(a, "build(...)");
        A().open(str3, true, 3).addOnSuccessListener(new n0(new m0(str, this, a, dVar))).addOnFailureListener(new o0(this, dVar));
    }

    public final void q(String str, j.d dVar) {
        kotlin.jvm.internal.t.g(str, "name");
        kotlin.jvm.internal.t.g(dVar, "result");
        Log.d(this.b, "[DeleteGame] Start delete game");
        A().open(str, false, 3).addOnFailureListener(new i0(this, dVar)).continueWith(new j0(this, dVar));
    }

    public final void w(boolean z, j.d dVar) {
        kotlin.jvm.internal.t.g(dVar, "result");
        Log.d(this.b, "[GetSavedGames] Start loading all saved games");
        A().load(z).addOnSuccessListener(new g0(new Z(this, dVar))).addOnFailureListener(new h0(this, dVar));
    }
}
