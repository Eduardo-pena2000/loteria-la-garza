package E6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class x {
    public static final int a = Process.myUid();
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Method g;
    public static final Method h;
    public static final Method i;
    public static Boolean j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            method = null;
        }
        b = method;
        try {
            method2 = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
        } catch (Exception unused2) {
            method2 = null;
        }
        c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", (Class[]) null);
        } catch (Exception unused3) {
            method3 = null;
        }
        d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused4) {
            method4 = null;
        }
        e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception unused5) {
            method5 = null;
        }
        f = method5;
        if (q.h()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", (Class[]) null);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
            }
        } else {
            method6 = null;
        }
        g = method6;
        if (q.h()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception e3) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e3);
            }
        } else {
            method7 = null;
        }
        h = method7;
        if (q.h()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", (Class[]) null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method8 = null;
        }
        i = method8;
        j = null;
    }

    public static void a(WorkSource workSource, int i2, String str) {
        Method method = c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i2), str});
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method2 = b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, new Object[]{Integer.valueOf(i2)});
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo c2 = G6.e.a(context).c(str, 0);
                if (c2 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i2 = c2.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i2, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        synchronized (x.class) {
            Boolean bool = j;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            boolean z = H1.a.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
            j = Boolean.valueOf(z);
            return z;
        }
    }
}
