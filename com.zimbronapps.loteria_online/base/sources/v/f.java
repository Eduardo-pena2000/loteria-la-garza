package v;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f {
    public final Object a = new Object();
    public final b.b b;
    public final b.a c;
    public final ComponentName d;
    public final PendingIntent e;

    public f(b.b bVar, b.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = bVar;
        this.c = aVar;
        this.d = componentName;
        this.e = pendingIntent;
    }

    public final void a(Bundle bundle) {
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    public final Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public final Bundle c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    public IBinder d() {
        return this.c.asBinder();
    }

    public ComponentName e() {
        return this.d;
    }

    public PendingIntent f() {
        return this.e;
    }

    public boolean g(Uri uri, Bundle bundle, List list) {
        try {
            return this.b.y0(this.c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int h(String str, Bundle bundle) {
        int l;
        Bundle b = b(bundle);
        synchronized (this.a) {
            try {
                try {
                    l = this.b.l(this.c, str, b);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l;
    }

    public boolean i(Uri uri) {
        return j(uri, null, new Bundle());
    }

    public boolean j(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle c = c(uri2);
            if (c == null) {
                return this.b.Q0(this.c, uri);
            }
            bundle.putAll(c);
            return this.b.h(this.c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean k(int i, Uri uri, Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.b.Z0(this.c, i, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
