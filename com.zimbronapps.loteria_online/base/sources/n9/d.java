package n9;

import Y9.a;
import Za.E;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.k;
import androidx.lifecycle.r;
import da.c;
import da.j;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d implements j.c, Y9.a, Z9.a {
    public static final a i = new a(null);
    public Z9.c a;
    public n9.c b;
    public Application c;
    public a.b d;
    public k e;
    public b f;
    public Activity g;
    public da.j h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static final /* synthetic */ String a(a aVar, String str) {
            return aVar.b(str);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:140)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:35)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:16)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:10)
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String b(java.lang.String r2) {
            /*
                r1 = this;
                int r0 = r2.hashCode()
                switch(r0) {
                    case -1349088399: goto L4c;
                    case 96748: goto L43;
                    case 99469: goto L38;
                    case 93166550: goto L2c;
                    case 100313435: goto L20;
                    case 103772132: goto L14;
                    case 112202875: goto L8;
                    default: goto L7;
                }
            L7:
                goto L54
            L8:
                java.lang.String r0 = "video"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L11
                goto L54
            L11:
                java.lang.String r2 = "video/*"
                goto L58
            L14:
                java.lang.String r0 = "media"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L1d
                goto L54
            L1d:
                java.lang.String r2 = "image/*,video/*"
                goto L58
            L20:
                java.lang.String r0 = "image"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L29
                goto L54
            L29:
                java.lang.String r2 = "image/*"
                goto L58
            L2c:
                java.lang.String r0 = "audio"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L35
                goto L54
            L35:
                java.lang.String r2 = "audio/*"
                goto L58
            L38:
                java.lang.String r0 = "dir"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L41
                goto L54
            L41:
                r2 = r0
                goto L58
            L43:
                java.lang.String r0 = "any"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L56
                goto L54
            L4c:
                java.lang.String r0 = "custom"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L56
            L54:
                r2 = 0
                goto L58
            L56:
            */
            //  java.lang.String r2 = "*/*"
            /*
            L58:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: n9.d.a.b(java.lang.String):java.lang.String");
        }

        public a() {
        }
    }

    public final class b implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
        public final Activity a;
        public final /* synthetic */ d b;

        public b(d dVar, Activity activity) {
            t.g(activity, "thisActivity");
            this.b = dVar;
            this.a = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            t.g(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            t.g(activity, "activity");
            if (this.a != activity || activity.getApplicationContext() == null) {
                return;
            }
            Application applicationContext = activity.getApplicationContext();
            t.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
            applicationContext.unregisterActivityLifecycleCallbacks(this);
        }

        public void onActivityPaused(Activity activity) {
            t.g(activity, "activity");
        }

        public void onActivityResumed(Activity activity) {
            t.g(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            t.g(activity, "activity");
            t.g(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            t.g(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            t.g(activity, "activity");
        }

        public void onCreate(r rVar) {
            t.g(rVar, "owner");
        }

        public void onDestroy(r rVar) {
            t.g(rVar, "owner");
            onActivityDestroyed(this.a);
        }

        public void onPause(r rVar) {
            t.g(rVar, "owner");
        }

        public void onResume(r rVar) {
            t.g(rVar, "owner");
        }

        public void onStart(r rVar) {
            t.g(rVar, "owner");
        }

        public void onStop(r rVar) {
            t.g(rVar, "owner");
            onActivityStopped(this.a);
        }
    }

    public static final class c implements c.d {
        public final /* synthetic */ n9.c a;

        public c(n9.c cVar) {
            this.a = cVar;
        }

        public void i(Object obj) {
            this.a.s(null);
        }

        public void k(Object obj, c.b bVar) {
            this.a.s(bVar);
        }
    }

    private final void b() {
        Z9.c cVar;
        n9.c cVar2 = this.b;
        if (cVar2 != null && (cVar = this.a) != null) {
            cVar.e(cVar2);
        }
        this.a = null;
        b bVar = this.f;
        if (bVar != null) {
            k kVar = this.e;
            if (kVar != null) {
                kVar.removeObserver(bVar);
            }
            Application application = this.c;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(bVar);
            }
        }
        this.e = null;
        n9.c cVar3 = this.b;
        if (cVar3 != null) {
            cVar3.s(null);
        }
        this.b = null;
        da.j jVar = this.h;
        if (jVar != null) {
            jVar.e((j.c) null);
        }
        this.h = null;
        this.c = null;
    }

    public final void a(da.b bVar, Application application, Activity activity, Z9.c cVar) {
        this.g = activity;
        this.c = application;
        this.b = new n9.c(activity, null, 2, null);
        da.j jVar = new da.j(bVar, "miguelruivo.flutter.plugins.filepicker");
        this.h = jVar;
        jVar.e(this);
        n9.c cVar2 = this.b;
        if (cVar2 != null) {
            new da.c(bVar, "miguelruivo.flutter.plugins.filepickerevent").d(new c(cVar2));
            this.f = new b(this, activity);
            cVar.f(cVar2);
            k a2 = aa.a.a(cVar);
            this.e = a2;
            b bVar2 = this.f;
            if (bVar2 == null || a2 == null) {
                return;
            }
            a2.addObserver(bVar2);
        }
    }

    public void onAttachedToActivity(Z9.c cVar) {
        t.g(cVar, "binding");
        this.a = cVar;
        a.b bVar = this.d;
        if (bVar != null) {
            da.b b2 = bVar.b();
            t.f(b2, "getBinaryMessenger(...)");
            Context a2 = bVar.a();
            t.e(a2, "null cannot be cast to non-null type android.app.Application");
            Z9.c cVar2 = this.a;
            t.d(cVar2);
            Activity activity = cVar2.getActivity();
            t.f(activity, "getActivity(...)");
            Z9.c cVar3 = this.a;
            t.d(cVar3);
            a(b2, (Application) a2, activity, cVar3);
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        t.g(bVar, "binding");
        this.d = bVar;
    }

    public void onDetachedFromActivity() {
        b();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        t.g(bVar, "binding");
        this.d = null;
    }

    public void onMethodCall(da.i iVar, j.d dVar) {
        Context applicationContext;
        t.g(iVar, "call");
        t.g(dVar, "rawResult");
        r1 = null;
        Boolean bool = null;
        if (this.g == null) {
            dVar.b("no_activity", "file picker plugin requires a foreground activity", (Object) null);
            return;
        }
        j jVar = new j(dVar);
        Object obj = iVar.b;
        HashMap hashMap = obj instanceof HashMap ? (HashMap) obj : null;
        String str = iVar.a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1349088399) {
                if (hashCode != 3522941) {
                    if (hashCode == 94746189 && str.equals("clear")) {
                        Activity activity = this.g;
                        if (activity != null && (applicationContext = activity.getApplicationContext()) != null) {
                            bool = Boolean.valueOf(f.f(applicationContext));
                        }
                        jVar.a(bool);
                        return;
                    }
                } else if (str.equals("save")) {
                    a aVar = i;
                    Object obj2 = hashMap != null ? hashMap.get("fileType") : null;
                    t.e(obj2, "null cannot be cast to non-null type kotlin.String");
                    String a2 = a.a(aVar, (String) obj2);
                    String str2 = (String) (hashMap != null ? hashMap.get("initialDirectory") : null);
                    byte[] bArr = (byte[]) (hashMap != null ? hashMap.get("bytes") : null);
                    String valueOf = String.valueOf(hashMap != null ? hashMap.get("fileName") : null);
                    if (valueOf.length() > 0 && !E.T(valueOf, ".", false, 2, (Object) null)) {
                        valueOf = valueOf + "." + f.a.m(bArr);
                    }
                    String str3 = valueOf;
                    n9.c cVar = this.b;
                    if (cVar != null) {
                        f.a.B(cVar, str3, a2, str2, bArr, jVar);
                        return;
                    }
                    return;
                }
            } else if (str.equals("custom")) {
                f fVar = f.a;
                ArrayList q = fVar.q((ArrayList) (hashMap != null ? hashMap.get("allowedExtensions") : null));
                n9.c cVar2 = this.b;
                if (cVar2 != null) {
                    fVar.D(cVar2, a.a(i, str), (Boolean) (hashMap != null ? hashMap.get("allowMultipleSelection") : null), (Boolean) (hashMap != null ? hashMap.get("withData") : null), q, (Integer) (hashMap != null ? hashMap.get("compressionQuality") : null), jVar);
                    return;
                }
                return;
            }
        }
        a aVar2 = i;
        t.d(str);
        String a3 = a.a(aVar2, str);
        if (a3 == null) {
            jVar.c();
            return;
        }
        n9.c cVar3 = this.b;
        if (cVar3 != null) {
            f fVar2 = f.a;
            fVar2.D(cVar3, a3, (Boolean) (hashMap != null ? hashMap.get("allowMultipleSelection") : null), (Boolean) (hashMap != null ? hashMap.get("withData") : null), fVar2.q((ArrayList) (hashMap != null ? hashMap.get("allowedExtensions") : null)), (Integer) (hashMap != null ? hashMap.get("compressionQuality") : null), jVar);
        }
    }

    public void onReattachedToActivityForConfigChanges(Z9.c cVar) {
        t.g(cVar, "binding");
        onAttachedToActivity(cVar);
    }
}
