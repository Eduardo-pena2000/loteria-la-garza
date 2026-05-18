package Y1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k {
    public static final a e = new a(null);
    public final Context a;
    public boolean b;
    public j c;
    public j d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public k(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        this.a = context;
    }

    public static /* synthetic */ j d(k kVar, Object obj, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        return kVar.b(obj, z);
    }

    public final List a(Context context) {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            kotlin.jvm.internal.t.d(serviceInfoArr);
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        return Da.D.L0(arrayList);
    }

    public final j b(Object obj, boolean z) {
        kotlin.jvm.internal.t.g(obj, "request");
        if (kotlin.jvm.internal.t.c(obj, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return g();
        }
        if (obj instanceof J) {
            for (i iVar : ((J) obj).a()) {
            }
        }
        return c(z);
    }

    public final j c(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            j f = f();
            return (f == null && z) ? g() : f;
        }
        if (i <= 33) {
            return g();
        }
        return null;
    }

    public final j e(List list, Context context) {
        Iterator it = list.iterator();
        j jVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
                kotlin.jvm.internal.t.e(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                j jVar2 = (j) newInstance;
                if (!jVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (jVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    jVar = jVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return jVar;
    }

    public final j f() {
        if (!this.b) {
            D d = new D(this.a);
            if (d.isAvailableOnDevice()) {
                return d;
            }
            return null;
        }
        j jVar = this.c;
        if (jVar == null) {
            return null;
        }
        kotlin.jvm.internal.t.d(jVar);
        if (jVar.isAvailableOnDevice()) {
            return this.c;
        }
        return null;
    }

    public final j g() {
        if (!this.b) {
            List a2 = a(this.a);
            if (a2.isEmpty()) {
                return null;
            }
            return e(a2, this.a);
        }
        j jVar = this.d;
        if (jVar == null) {
            return null;
        }
        kotlin.jvm.internal.t.d(jVar);
        if (jVar.isAvailableOnDevice()) {
            return this.d;
        }
        return null;
    }
}
