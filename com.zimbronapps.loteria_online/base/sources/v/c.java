package v;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public final b.b a;
    public final ComponentName b;
    public final Context c;

    public class a extends a.a {
        public Handler a = new Handler(Looper.getMainLooper());
        public final /* synthetic */ v.b b;

        public class a implements Runnable {
            public final /* synthetic */ Bundle a;

            public a(Bundle bundle) {
                this.a = bundle;
            }

            public void run() {
                a.this.b.onUnminimized(this.a);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ Bundle b;

            public b(int i, Bundle bundle) {
                this.a = i;
                this.b = bundle;
            }

            public void run() {
                a.this.b.onNavigationEvent(this.a, this.b);
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ Bundle b;

            public c(String str, Bundle bundle) {
                this.a = str;
                this.b = bundle;
            }

            public void run() {
                a.this.b.extraCallback(this.a, this.b);
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ Bundle a;

            public d(Bundle bundle) {
                this.a = bundle;
            }

            public void run() {
                a.this.b.onMessageChannelReady(this.a);
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ Bundle b;

            public e(String str, Bundle bundle) {
                this.a = str;
                this.b = bundle;
            }

            public void run() {
                a.this.b.onPostMessage(this.a, this.b);
            }
        }

        public class f implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ Uri b;
            public final /* synthetic */ boolean c;
            public final /* synthetic */ Bundle d;

            public f(int i, Uri uri, boolean z, Bundle bundle) {
                this.a = i;
                this.b = uri;
                this.c = z;
                this.d = bundle;
            }

            public void run() {
                a.this.b.onRelationshipValidationResult(this.a, this.b, this.c, this.d);
            }
        }

        public class g implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ Bundle c;

            public g(int i, int i2, Bundle bundle) {
                this.a = i;
                this.b = i2;
                this.c = bundle;
            }

            public void run() {
                a.this.b.onActivityResized(this.a, this.b, this.c);
            }
        }

        public class h implements Runnable {
            public final /* synthetic */ Bundle a;

            public h(Bundle bundle) {
                this.a = bundle;
            }

            public void run() {
                a.this.b.onWarmupCompleted(this.a);
            }
        }

        public class i implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;
            public final /* synthetic */ Bundle f;

            public i(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
                this.e = i5;
                this.f = bundle;
            }

            public void run() {
                a.this.b.onActivityLayout(this.a, this.b, this.c, this.d, this.e, this.f);
            }
        }

        public class j implements Runnable {
            public final /* synthetic */ Bundle a;

            public j(Bundle bundle) {
                this.a = bundle;
            }

            public void run() {
                a.this.b.onMinimized(this.a);
            }
        }

        public a(v.b bVar) {
            this.b = bVar;
        }

        public void J0(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new j(bundle));
        }

        public void M(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new c(str, bundle));
        }

        public void N0(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new a(bundle));
        }

        public void Q(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new h(bundle));
        }

        public void R0(int i2, int i3, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new g(i2, i3, bundle));
        }

        public void d1(int i2, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new b(i2, bundle));
        }

        public void j1(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new e(str, bundle));
        }

        public void k1(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new d(bundle));
        }

        public void l1(int i2, Uri uri, boolean z, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new f(i2, uri, z, bundle));
        }

        public void n(int i2, int i3, int i4, int i5, int i6, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new i(i2, i3, i4, i5, i6, bundle));
        }

        public Bundle x(String str, Bundle bundle) {
            v.b bVar = this.b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }
    }

    public c(b.b bVar, ComponentName componentName, Context context) {
        this.a = bVar;
        this.b = componentName;
        this.c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static String c(Context context, List list) {
        return d(context, list, false);
    }

    public static String d(Context context, List list, boolean z) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            List arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final a.a b(b bVar) {
        return new a(bVar);
    }

    public f e(b bVar) {
        return f(bVar, null);
    }

    public final f f(b bVar, PendingIntent pendingIntent) {
        boolean L0;
        a.a b = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                L0 = this.a.P(b, bundle);
            } else {
                L0 = this.a.L0(b);
            }
            if (L0) {
                return new f(this.a, b, this.b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean g(long j) {
        try {
            return this.a.F0(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
