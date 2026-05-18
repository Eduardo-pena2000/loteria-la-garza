package com.google.firebase.remoteconfig.internal;

import B7.g;
import E6.i;
import E6.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m8.h;
import m8.m;
import org.json.JSONObject;
import w8.p;
import w8.q;
import x8.n;
import x8.o;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class d {
    public static final int[] t = {2, 4, 8, 16, 32, 64, 128, 256};
    public static final Pattern u = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Set a;
    public int c;
    public HttpURLConnection f;
    public com.google.firebase.remoteconfig.internal.a g;
    public final ScheduledExecutorService i;
    public final c j;
    public final g k;
    public final h l;
    public x8.e m;
    public final Context n;
    public final String o;
    public final e r;
    public final int h = 8;
    public boolean b = false;
    public final Random p = new Random();
    public final E6.f q = i.c();
    public boolean d = false;
    public boolean e = false;
    public final Object s = new Object();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            d.this.e();
        }
    }

    public d(g gVar, h hVar, c cVar, x8.e eVar, Context context, String str, Set set, e eVar2, ScheduledExecutorService scheduledExecutorService) {
        this.a = set;
        this.i = scheduledExecutorService;
        this.c = Math.max(8 - eVar2.i().b(), 1);
        this.k = gVar;
        this.j = cVar;
        this.l = hVar;
        this.m = eVar;
        this.n = context;
        this.o = str;
        this.r = eVar2;
    }

    public static /* synthetic */ Task a(d dVar, Task task, Task task2) {
        return dVar.s(task, task2);
    }

    public static /* synthetic */ Task b(d dVar, Task task, Task task2, Task task3) {
        return dVar.t(task, task2, task3);
    }

    public static /* synthetic */ void c(d dVar) {
        dVar.l();
    }

    public static /* synthetic */ void d(d dVar, q qVar) {
        dVar.w(qVar);
    }

    public static String m(String str) {
        Matcher matcher = u.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public final synchronized void A(boolean z) {
        this.b = z;
    }

    public void B(boolean z) {
        HttpURLConnection httpURLConnection;
        synchronized (this.s) {
            try {
                this.e = z;
                com.google.firebase.remoteconfig.internal.a aVar = this.g;
                if (aVar != null) {
                    aVar.l(z);
                }
                if (Build.VERSION.SDK_INT >= 26 && z && (httpURLConnection = this.f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void C(HttpURLConnection httpURLConnection, String str, String str2) {
        httpURLConnection.setRequestMethod("POST");
        z(httpURLConnection, str2);
        byte[] bytes = k(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public synchronized com.google.firebase.remoteconfig.internal.a D(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.a(httpURLConnection, this.j, this.m, this.a, new b(), this.i, this.r);
    }

    public void E() {
        u(0L);
    }

    public final void F(Date date) {
        int b2 = this.r.i().b() + 1;
        this.r.r(b2, new Date(date.getTime() + o(b2)));
    }

    public void e() {
        if (g()) {
            if (new Date(this.q.a()).before(this.r.i().a())) {
                y();
            } else {
                Task j = j();
                Tasks.whenAllComplete(j).continueWith(this.i, new n(this, j));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean f() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Set r0 = r1.a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.d.f():boolean");
    }

    public final synchronized boolean g() {
        boolean f;
        f = f();
        if (f) {
            A(true);
        }
        return f;
    }

    public final void h(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
    }

    public void i(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.e) {
            httpURLConnection.disconnect();
        }
        h(inputStream);
        h(inputStream2);
    }

    public Task j() {
        Task a2 = this.l.a(false);
        Task id = this.l.getId();
        return Tasks.whenAllComplete(a2, id).continueWithTask(this.i, new o(this, a2, id));
    }

    public final JSONObject k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", m(this.k.r().c()));
        hashMap.put("namespace", this.o);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.j.r()));
        hashMap.put("appId", this.k.r().c());
        hashMap.put("sdkVersion", "23.0.1");
        hashMap.put("appInstanceId", str);
        return new JSONObject(hashMap);
    }

    public final synchronized void l() {
        this.d = true;
    }

    public final String n() {
        try {
            Context context = this.n;
            byte[] a2 = E6.a.a(context, context.getPackageName());
            if (a2 != null) {
                return l.c(a2, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.n.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.n.getPackageName());
            return null;
        }
    }

    public final long o(int i) {
        int length = t.length;
        if (i >= length) {
            i = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i - 1]) / 2) + this.p.nextInt((int) r0);
    }

    public final String p(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", new Object[]{m(this.k.r().c()), str});
    }

    public final URL q() {
        try {
            return new URL(p(this.o));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    public final boolean r(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:30:0x002d, B:33:0x00ba, B:35:0x00be, B:51:0x00c2), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:30:0x002d, B:33:0x00ba, B:35:0x00be, B:51:0x00c2), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.tasks.Task s(com.google.android.gms.tasks.Task r11, com.google.android.gms.tasks.Task r12) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.d.s(com.google.android.gms.tasks.Task, com.google.android.gms.tasks.Task):com.google.android.gms.tasks.Task");
    }

    public final /* synthetic */ Task t(Task task, Task task2, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new p("Firebase Installations failed to get installation auth token for config update listener connection.", (Throwable) task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new p("Firebase Installations failed to get installation ID for config update listener connection.", (Throwable) task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) q().openConnection();
            C(httpURLConnection, (String) task2.getResult(), ((m) task.getResult()).b());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e) {
            return Tasks.forException(new p("Failed to open HTTP stream connection", (Throwable) e));
        }
    }

    public final synchronized void u(long j) {
        try {
            if (f()) {
                int i = this.c;
                if (i > 0) {
                    this.c = i - 1;
                    this.i.schedule(new a(), j, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    w(new p("Unable to connect to the server. Check your connection and try again.", q.a.c));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String v(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized void w(q qVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((w8.c) it.next()).b(qVar);
        }
    }

    public final synchronized void x() {
        this.c = 8;
    }

    public synchronized void y() {
        u(Math.max(0L, this.r.i().a().getTime() - new Date(this.q.a()).getTime()));
    }

    public final void z(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.k.r().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.n.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", n());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public class b implements w8.c {
        public b() {
        }

        public void b(q qVar) {
            d.c(d.this);
            d.d(d.this, qVar);
        }

        public void a(w8.b bVar) {
        }
    }
}
