package androidx.work.impl.foreground;

import G4.f;
import G4.m;
import H4.i;
import L4.c;
import L4.d;
import P4.p;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a implements c, H4.b {
    public static final String k = m.f("SystemFgDispatcher");
    public Context a;
    public i b;
    public final S4.a c;
    public final Object d = new Object();
    public String e;
    public final Map f;
    public final Map g;
    public final Set h;
    public final d i;
    public b j;

    public class a implements Runnable {
        public final /* synthetic */ WorkDatabase a;
        public final /* synthetic */ String b;

        public a(WorkDatabase workDatabase, String str) {
            this.a = workDatabase;
            this.b = str;
        }

        public void run() {
            p h = this.a.B().h(this.b);
            if (h == null || !h.b()) {
                return;
            }
            synchronized (a.this.d) {
                a.this.g.put(this.b, h);
                a.this.h.add(h);
                a aVar = a.this;
                aVar.i.d(aVar.h);
            }
        }
    }

    public interface b {
        void a(int i, Notification notification);

        void c(int i, int i2, Notification notification);

        void d(int i);

        void stop();
    }

    public a(Context context) {
        this.a = context;
        i k2 = i.k(context);
        this.b = k2;
        S4.a p = k2.p();
        this.c = p;
        this.e = null;
        this.f = new LinkedHashMap();
        this.h = new HashSet();
        this.g = new HashMap();
        this.i = new d(this.a, p, this);
        this.b.m().c(this);
    }

    public static Intent a(Context context, String str, f fVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", fVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", fVar.a());
        intent.putExtra("KEY_NOTIFICATION", fVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, f fVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", fVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", fVar.a());
        intent.putExtra("KEY_NOTIFICATION", fVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    public void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m.c().a(k, String.format("Constraints unmet for WorkSpec %s", new Object[]{str}), new Throwable[0]);
            this.b.w(str);
        }
    }

    public void e(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.d) {
            try {
                p pVar = (p) this.g.remove(str);
                if (pVar != null ? this.h.remove(pVar) : false) {
                    this.i.d(this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar = (f) this.f.remove(str);
        if (str.equals(this.e) && this.f.size() > 0) {
            Iterator it = this.f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.e = (String) entry.getKey();
            if (this.j != null) {
                f fVar2 = (f) entry.getValue();
                this.j.c(fVar2.c(), fVar2.a(), fVar2.b());
                this.j.d(fVar2.c());
            }
        }
        b bVar = this.j;
        if (fVar == null || bVar == null) {
            return;
        }
        m.c().a(k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(fVar.c()), str, Integer.valueOf(fVar.a())}), new Throwable[0]);
        bVar.d(fVar.c());
    }

    public void f(List list) {
    }

    public final void g(Intent intent) {
        m.c().d(k, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.b.f(UUID.fromString(stringExtra));
    }

    public final void h(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification parcelableExtra = intent.getParcelableExtra("KEY_NOTIFICATION");
        m.c().a(k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (parcelableExtra == null || this.j == null) {
            return;
        }
        this.f.put(stringExtra, new f(intExtra, parcelableExtra, intExtra2));
        if (TextUtils.isEmpty(this.e)) {
            this.e = stringExtra;
            this.j.c(intExtra, intExtra2, parcelableExtra);
            return;
        }
        this.j.a(intExtra, parcelableExtra);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((f) ((Map.Entry) it.next()).getValue()).a();
        }
        f fVar = (f) this.f.get(this.e);
        if (fVar != null) {
            this.j.c(fVar.c(), i, fVar.b());
        }
    }

    public final void i(Intent intent) {
        m.c().d(k, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.c.b(new a(this.b.o(), stringExtra));
    }

    public void j(Intent intent) {
        m.c().d(k, "Stopping foreground service", new Throwable[0]);
        b bVar = this.j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public void k() {
        this.j = null;
        synchronized (this.d) {
            this.i.e();
        }
        this.b.m().i(this);
    }

    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    public void m(b bVar) {
        if (this.j != null) {
            m.c().b(k, "A callback already exists.", new Throwable[0]);
        } else {
            this.j = bVar;
        }
    }
}
