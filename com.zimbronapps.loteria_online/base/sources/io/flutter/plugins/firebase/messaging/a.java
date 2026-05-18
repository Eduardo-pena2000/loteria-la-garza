package io.flutter.plugins.firebase.messaging;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import na.D;
import na.E;
import na.F;
import na.G;
import na.H;
import na.I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a extends Service {
    public static final Object g = new Object();
    public static final HashMap h = new HashMap();
    public b a;
    public i b;
    public a c;
    public boolean d = false;
    public boolean e = false;
    public final ArrayList f = new ArrayList();

    public final class a {
        public final Executor a = Executors.newSingleThreadExecutor();
        public final Handler b = new Handler(Looper.getMainLooper());

        public class a implements Runnable {

            public class a implements Runnable {
                public a() {
                }

                public void run() {
                    a.this.i();
                }
            }

            public a() {
            }

            public void run() {
                while (true) {
                    f a2 = a.this.a();
                    if (a2 == null) {
                        a.a(a.this).post(new a());
                        return;
                    } else {
                        a.this.g(a2.getIntent());
                        a2.a();
                    }
                }
            }
        }

        public a() {
        }

        public static /* bridge */ /* synthetic */ Handler a(a aVar) {
            return aVar.b;
        }

        public void b() {
            a.this.i();
        }

        public void c() {
            this.a.execute(new a());
        }
    }

    public interface b {
        IBinder a();

        f b();
    }

    public static final class c extends i {
        public final Context d;
        public final PowerManager.WakeLock e;
        public final PowerManager.WakeLock f;
        public boolean g;
        public boolean h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.a);
            if (this.d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.g) {
                            this.g = true;
                            if (!this.h) {
                                this.e.acquire(60000L);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        public void c() {
            synchronized (this) {
                try {
                    if (this.h) {
                        if (this.g) {
                            this.e.acquire(60000L);
                        }
                        this.h = false;
                        this.f.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void d() {
            synchronized (this) {
                try {
                    if (!this.h) {
                        this.h = true;
                        this.f.acquire(600000L);
                        this.e.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void e() {
            synchronized (this) {
                this.g = false;
            }
        }
    }

    public final class d implements f {
        public final Intent a;
        public final int b;

        public d(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        public void a() {
            a.this.stopSelf(this.b);
        }

        public Intent getIntent() {
            return this.a;
        }
    }

    public static class e {
        public ComponentName a;
        public boolean b;

        public e(ComponentName componentName, boolean z) {
            this.a = componentName;
            this.b = z;
        }
    }

    public interface f {
        void a();

        Intent getIntent();
    }

    public static final class g extends JobServiceEngine implements b {
        public final a a;
        public final Object b;
        public JobParameters c;

        public final class a implements f {
            public final JobWorkItem a;

            public a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            public void a() {
                synchronized (g.this.b) {
                    JobParameters jobParameters = g.this.c;
                    if (jobParameters != null) {
                        try {
                            G.a(jobParameters, this.a);
                        } catch (IllegalArgumentException e) {
                            Log.e("JobServiceEngineImpl", "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", e);
                        } catch (SecurityException e2) {
                            Log.e("JobServiceEngineImpl", "SecurityException: Failed to run mParams.completeWork(mJobWork)!", e2);
                        }
                    }
                }
            }

            public Intent getIntent() {
                return F.a(this.a);
            }
        }

        public g(a aVar) {
            super(aVar);
            this.b = new Object();
            this.a = aVar;
        }

        public IBinder a() {
            return D.a(this);
        }

        public f b() {
            synchronized (this.b) {
                JobParameters jobParameters = this.c;
                if (jobParameters == null) {
                    return null;
                }
                try {
                    JobWorkItem a2 = E.a(jobParameters);
                    if (a2 == null) {
                        return null;
                    }
                    F.a(a2).setExtrasClassLoader(this.a.getClassLoader());
                    return new a(a2);
                } catch (SecurityException e) {
                    Log.e("JobServiceEngineImpl", "Failed to run mParams.dequeueWork()!", e);
                    return null;
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.a.b();
            synchronized (this.b) {
                this.c = null;
            }
            return b;
        }
    }

    public static final class h extends i {
        public final JobInfo d;
        public final JobScheduler e;

        public h(Context context, ComponentName componentName, int i) {
            super(componentName);
            b(i);
            this.d = new JobInfo.Builder(i, this.a).setOverrideDeadline(0L).build();
            this.e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        public void a(Intent intent) {
            H.a(this.e, this.d, I.a(intent));
        }
    }

    public static abstract class i {
        public final ComponentName a;
        public boolean b;
        public int c;

        public i(ComponentName componentName) {
            this.a = componentName;
        }

        public abstract void a(Intent intent);

        public void b(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else {
                if (this.c == i) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public static void c(Context context, ComponentName componentName, int i2, Intent intent, boolean z) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (g) {
            i f2 = f(context, componentName, true, i2, z);
            f2.b(i2);
            try {
                f2.a(intent);
            } catch (IllegalStateException e2) {
                if (!z) {
                    throw e2;
                }
                f(context, componentName, true, i2, false).a(intent);
            }
        }
    }

    public static void d(Context context, Class cls, int i2, Intent intent, boolean z) {
        c(context, new ComponentName(context, cls), i2, intent, z);
    }

    public static i f(Context context, ComponentName componentName, boolean z, int i2, boolean z2) {
        i cVar;
        e eVar = new e(componentName, z2);
        HashMap hashMap = h;
        i iVar = (i) hashMap.get(eVar);
        if (iVar == null) {
            if (Build.VERSION.SDK_INT < 26 || z2) {
                cVar = new c(context, componentName);
            } else {
                if (!z) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                cVar = new h(context, componentName, i2);
            }
            iVar = cVar;
            hashMap.put(eVar, iVar);
        }
        return iVar;
    }

    public f a() {
        f b2;
        b bVar = this.a;
        if (bVar != null && (b2 = bVar.b()) != null) {
            return b2;
        }
        synchronized (this.f) {
            try {
                if (this.f.size() > 0) {
                    return (f) this.f.remove(0);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.b();
        }
        this.d = true;
        return h();
    }

    public void e(boolean z) {
        if (this.c == null) {
            this.c = new a();
            i iVar = this.b;
            if (iVar != null && z) {
                iVar.d();
            }
            this.c.c();
        }
    }

    public abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    public void i() {
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.c = null;
                    ArrayList arrayList2 = this.f;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        e(false);
                    } else if (!this.e) {
                        this.b.c();
                    }
                } finally {
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new g(this);
            this.b = null;
        }
        this.b = f(this, new ComponentName(this, getClass()), false, 0, true);
    }

    public void onDestroy() {
        super.onDestroy();
        b();
        synchronized (this.f) {
            this.e = true;
            this.b.c();
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        this.b.e();
        synchronized (this.f) {
            ArrayList arrayList = this.f;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i3));
            e(true);
        }
        return 3;
    }
}
