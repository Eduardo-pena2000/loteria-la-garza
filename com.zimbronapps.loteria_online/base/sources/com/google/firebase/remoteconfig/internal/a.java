package com.google.firebase.remoteconfig.internal;

import E6.i;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import w8.p;
import w8.q;
import w8.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class a {
    public final Set a;
    public final HttpURLConnection b;
    public final c c;
    public final x8.e d;
    public final w8.c e;
    public final ScheduledExecutorService f;
    public final e i;
    public final Random g = new Random();
    public boolean j = false;
    public final E6.f h = i.c();

    public class a implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public void run() {
            a.this.d(this.a, this.b);
        }
    }

    public a(HttpURLConnection httpURLConnection, c cVar, x8.e eVar, Set set, w8.c cVar2, ScheduledExecutorService scheduledExecutorService, e eVar2) {
        this.b = httpURLConnection;
        this.c = cVar;
        this.d = eVar;
        this.a = set;
        this.e = cVar2;
        this.f = scheduledExecutorService;
        this.i = eVar2;
    }

    public static /* synthetic */ Task a(a aVar, Task task, Task task2, long j, int i, Task task3) {
        return aVar.h(task, task2, j, i, task3);
    }

    public static Boolean e(c.a aVar, long j) {
        if (aVar.d() != null) {
            return Boolean.valueOf(aVar.d().k() >= j);
        }
        return Boolean.valueOf(aVar.f() == 1);
    }

    public final void b(int i, long j) {
        if (i == 0) {
            k(new t("Unable to fetch the latest version of the template.", q.a.e));
        } else {
            this.f.schedule(new a(i, j), this.g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    public final synchronized void c(w8.b bVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((w8.c) it.next()).a(bVar);
        }
    }

    public synchronized Task d(int i, long j) {
        int i2;
        Task n;
        Task e;
        i2 = i - 1;
        n = this.c.n(c.b.c, 3 - i2);
        e = this.d.e();
        return Tasks.whenAllComplete(n, e).continueWithTask(this.f, new x8.a(this, n, e, j, i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r5.has("featureDisabled") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r5.getBoolean("featureDisabled") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        r10.e.b(new w8.t("The server is temporarily unavailable. Try again in a few minutes.", w8.q.a.f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (g() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r5.has("latestTemplateVersionNumber") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r6 = r10.c.r();
        r8 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r8 <= r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        b(3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r5.has("retryIntervalSeconds") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        m(r5.getInt("retryIntervalSeconds"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.io.InputStream r11) {
        /*
            r10 = this;
            java.lang.String r0 = "retryIntervalSeconds"
            java.lang.String r1 = "latestTemplateVersionNumber"
            java.lang.String r2 = "featureDisabled"
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            java.lang.String r5 = "utf-8"
            r4.<init>(r11, r5)
            r3.<init>(r4)
            java.lang.String r11 = ""
        L14:
            r4 = r11
        L15:
            java.lang.String r5 = r3.readLine()
            if (r5 == 0) goto La5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L15
            java.lang.String r4 = r10.j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3d
            goto L15
        L3d:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5d
            r5.<init>(r4)     // Catch: org.json.JSONException -> L5d
            boolean r4 = r5.has(r2)     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L5f
            boolean r4 = r5.getBoolean(r2)     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L5f
            w8.c r4 = r10.e     // Catch: org.json.JSONException -> L5d
            w8.t r5 = new w8.t     // Catch: org.json.JSONException -> L5d
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            w8.q$a r7 = w8.q.a.f     // Catch: org.json.JSONException -> L5d
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L5d
            r4.b(r5)     // Catch: org.json.JSONException -> L5d
            goto La5
        L5d:
            r4 = move-exception
            goto L8c
        L5f:
            boolean r4 = r10.g()     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L66
            goto La5
        L66:
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L7e
            com.google.firebase.remoteconfig.internal.c r4 = r10.c     // Catch: org.json.JSONException -> L5d
            long r6 = r4.r()     // Catch: org.json.JSONException -> L5d
            long r8 = r5.getLong(r1)     // Catch: org.json.JSONException -> L5d
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 <= 0) goto L7e
            r4 = 3
            r10.b(r4, r8)     // Catch: org.json.JSONException -> L5d
        L7e:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L14
            int r4 = r5.getInt(r0)     // Catch: org.json.JSONException -> L5d
            r10.m(r4)     // Catch: org.json.JSONException -> L5d
            goto L14
        L8c:
            w8.p r5 = new w8.p
            java.lang.Throwable r6 = r4.getCause()
            w8.q$a r7 = w8.q.a.d
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r10.k(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L14
        La5:
            r3.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.a.f(java.io.InputStream):void");
    }

    public final synchronized boolean g() {
        return this.a.isEmpty();
    }

    public final /* synthetic */ Task h(Task task, Task task2, long j, int i, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new p("Failed to auto-fetch config update.", (Throwable) task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new p("Failed to get activated config for auto-fetch", (Throwable) task2.getException()));
        }
        c.a aVar = (c.a) task.getResult();
        b bVar = (b) task2.getResult();
        if (!e(aVar, j).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            b(i, j);
            return Tasks.forResult(null);
        }
        if (aVar.d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return Tasks.forResult(null);
        }
        if (bVar == null) {
            bVar = b.l().a();
        }
        Set f = bVar.f(aVar.d());
        if (f.isEmpty()) {
            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return Tasks.forResult(null);
        }
        c(w8.b.a(f));
        return Tasks.forResult(null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0018 -> B:11:0x002d). Please report as a decompilation issue!!! */
    public void i() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    f(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e);
                }
            } catch (IOException e2) {
                if (!this.j) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e2);
                }
                if (inputStream == null) {
                } else {
                    inputStream.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e3);
                }
            }
            throw th;
        }
    }

    public final String j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        return (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? "" : str.substring(indexOf, lastIndexOf + 1);
    }

    public final synchronized void k(q qVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((w8.c) it.next()).b(qVar);
        }
    }

    public void l(boolean z) {
        this.j = z;
    }

    public final synchronized void m(int i) {
        this.i.q(new Date(new Date(this.h.a()).getTime() + (i * 1000)));
    }
}
