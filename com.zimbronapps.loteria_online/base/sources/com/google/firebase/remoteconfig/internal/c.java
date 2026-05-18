package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.e;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m8.h;
import m8.m;
import w8.p;
import w8.q;
import w8.r;
import w8.t;
import x8.g;
import x8.i;
import x8.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class c {
    public static final long j = TimeUnit.HOURS.toSeconds(12);
    public static final int[] k = {2, 4, 8, 16, 32, 64, 128, 256};
    public final h a;
    public final l8.b b;
    public final Executor c;
    public final E6.f d;
    public final Random e;
    public final x8.e f;
    public final ConfigFetchHttpClient g;
    public final e h;
    public final Map i;

    public static class a {
        public final Date a;
        public final int b;
        public final com.google.firebase.remoteconfig.internal.b c;
        public final String d;

        public a(Date date, int i, com.google.firebase.remoteconfig.internal.b bVar, String str) {
            this.a = date;
            this.b = i;
            this.c = bVar;
            this.d = str;
        }

        public static a a(Date date, com.google.firebase.remoteconfig.internal.b bVar) {
            return new a(date, 1, bVar, null);
        }

        public static a b(com.google.firebase.remoteconfig.internal.b bVar, String str) {
            return new a(bVar.h(), 0, bVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public com.google.firebase.remoteconfig.internal.b d() {
            return this.c;
        }

        public String e() {
            return this.d;
        }

        public int f() {
            return this.b;
        }
    }

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");

        public final String a;

        b(String str) {
            this.a = str;
        }

        public String b() {
            return this.a;
        }
    }

    public c(h hVar, l8.b bVar, Executor executor, E6.f fVar, Random random, x8.e eVar, ConfigFetchHttpClient configFetchHttpClient, e eVar2, Map map) {
        this.a = hVar;
        this.b = bVar;
        this.c = executor;
        this.d = fVar;
        this.e = random;
        this.f = eVar;
        this.g = configFetchHttpClient;
        this.h = eVar2;
        this.i = map;
    }

    public static /* synthetic */ Task a(c cVar, Task task, Task task2, Date date, Map map, Task task3) {
        return cVar.w(task, task2, date, map, task3);
    }

    public static /* synthetic */ Task b(a aVar, com.google.firebase.remoteconfig.internal.b bVar) {
        return v(aVar, bVar);
    }

    public static /* synthetic */ Task c(c cVar, Date date, Task task) {
        return cVar.x(date, task);
    }

    public static /* synthetic */ Task d(c cVar, Map map, Task task) {
        return cVar.y(map, task);
    }

    public static /* synthetic */ Task e(c cVar, long j2, Map map, Task task) {
        return cVar.u(j2, map, task);
    }

    public static /* synthetic */ Task v(a aVar, com.google.firebase.remoteconfig.internal.b bVar) {
        return Tasks.forResult(aVar);
    }

    public final e.a A(int i, Date date) {
        if (t(i)) {
            B(date);
        }
        return this.h.a();
    }

    public final void B(Date date) {
        int b2 = this.h.a().b() + 1;
        this.h.l(b2, new Date(date.getTime() + q(b2)));
    }

    public final void C(Task task, Date date) {
        if (task.isSuccessful()) {
            this.h.t(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof r) {
            this.h.u();
        } else {
            this.h.s();
        }
    }

    public final boolean f(long j2, Date date) {
        Date f = this.h.f();
        if (f.equals(e.f)) {
            return false;
        }
        return date.before(new Date(f.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    public final t g(t tVar) {
        String str;
        int a2 = tVar.a();
        if (a2 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a2 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (a2 == 429) {
                throw new p("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (a2 != 500) {
                switch (a2) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new t(tVar.a(), "Fetch failed: " + str, (Throwable) tVar);
    }

    public final String h(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2))});
    }

    public Task i() {
        return j(this.h.h());
    }

    public Task j(long j2) {
        HashMap hashMap = new HashMap(this.i);
        hashMap.put("X-Firebase-RC-Fetch-Type", b.BASE.b() + "/1");
        return this.f.e().continueWithTask(this.c, new g(this, j2, hashMap));
    }

    public final a k(String str, String str2, Date date, Map map) {
        try {
            a fetch = this.g.fetch(this.g.d(), str, str2, s(), this.h.e(), map, p(), date, this.h.b());
            if (fetch.d() != null) {
                this.h.p(fetch.d().k());
            }
            if (fetch.e() != null) {
                this.h.o(fetch.e());
            }
            this.h.j();
            return fetch;
        } catch (t e) {
            e.a A = A(e.a(), date);
            if (z(A, e.a())) {
                throw new r(A.a().getTime());
            }
            throw g(e);
        }
    }

    public final Task l(String str, String str2, Date date, Map map) {
        try {
            a k2 = k(str, str2, date, map);
            return k2.f() != 0 ? Tasks.forResult(k2) : this.f.k(k2.d()).onSuccessTask(this.c, new j(k2));
        } catch (q e) {
            return Tasks.forException(e);
        }
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Task u(Task task, long j2, Map map) {
        Task continueWithTask;
        Date date = new Date(this.d.a());
        if (task.isSuccessful() && f(j2, date)) {
            return Tasks.forResult(a.c(date));
        }
        Date o = o(date);
        if (o != null) {
            continueWithTask = Tasks.forException(new r(h(o.getTime() - date.getTime()), o.getTime()));
        } else {
            Task id = this.a.getId();
            Task a2 = this.a.a(false);
            continueWithTask = Tasks.whenAllComplete(id, a2).continueWithTask(this.c, new x8.h(this, id, a2, date, map));
        }
        return continueWithTask.continueWithTask(this.c, new i(this, date));
    }

    public Task n(b bVar, int i) {
        HashMap hashMap = new HashMap(this.i);
        hashMap.put("X-Firebase-RC-Fetch-Type", bVar.b() + "/" + i);
        return this.f.e().continueWithTask(this.c, new x8.f(this, hashMap));
    }

    public final Date o(Date date) {
        Date a2 = this.h.a().a();
        if (date.before(a2)) {
            return a2;
        }
        return null;
    }

    public final Long p() {
        F7.a aVar = (F7.a) this.b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.d(true).get("_fot");
    }

    public final long q(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = k;
        return (timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]) / 2) + this.e.nextInt((int) r0);
    }

    public long r() {
        return this.h.g();
    }

    public final Map s() {
        HashMap hashMap = new HashMap();
        F7.a aVar = (F7.a) this.b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry entry : aVar.d(false).entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    public final boolean t(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    public final /* synthetic */ Task w(Task task, Task task2, Date date, Map map, Task task3) {
        return !task.isSuccessful() ? Tasks.forException(new p("Firebase Installations failed to get installation ID for fetch.", (Throwable) task.getException())) : !task2.isSuccessful() ? Tasks.forException(new p("Firebase Installations failed to get installation auth token for fetch.", (Throwable) task2.getException())) : l((String) task.getResult(), ((m) task2.getResult()).b(), date, map);
    }

    public final /* synthetic */ Task x(Date date, Task task) {
        C(task, date);
        return task;
    }

    public final /* synthetic */ Task y(Map map, Task task) {
        return u(task, 0L, map);
    }

    public final boolean z(e.a aVar, int i) {
        return aVar.b() > 1 || i == 429;
    }
}
