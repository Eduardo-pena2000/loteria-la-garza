package androidx.work.impl.background.systemalarm;

import G4.m;
import P4.p;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b {
    public static final String e = m.f("ConstraintsCmdHandler");
    public final Context a;
    public final int b;
    public final d c;
    public final L4.d d;

    public b(Context context, int i, d dVar) {
        this.a = context;
        this.b = i;
        this.c = dVar;
        this.d = new L4.d(context, dVar.f(), null);
    }

    public void a() {
        Iterable<p> d = this.c.g().o().B().d();
        ConstraintProxy.a(this.a, d);
        this.d.d(d);
        ArrayList arrayList = new ArrayList(d.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (p pVar : d) {
            String str = pVar.a;
            if (currentTimeMillis >= pVar.a() && (!pVar.b() || this.d.c(str))) {
                arrayList.add(pVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((p) it.next()).a;
            Intent b = a.b(this.a, str2);
            m.c().a(e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            d dVar = this.c;
            dVar.k(new d.b(dVar, b, this.b));
        }
        this.d.e();
    }
}
