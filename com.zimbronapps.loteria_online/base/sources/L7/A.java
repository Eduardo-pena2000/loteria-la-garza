package l7;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;
import v6.h;
import v6.i;
import v6.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class a {
    public static final String a = "a";
    public static final h b = h.f();
    public static final Object c = new Object();
    public static DynamiteModule d = null;
    public static String e = "0";

    public static Task a(Context context) {
        t.m(context, "Context must not be null");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (b()) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new b(context, taskCompletionSource)).start();
        return taskCompletionSource.getTask();
    }

    public static boolean b() {
        return c() != null;
    }

    public static DynamiteModule c() {
        DynamiteModule dynamiteModule;
        synchronized (c) {
            dynamiteModule = d;
        }
        return dynamiteModule;
    }

    public static String d() {
        String str;
        synchronized (c) {
            str = e;
        }
        return str;
    }

    public static void e(Context context) {
        synchronized (c) {
            try {
                if (b()) {
                    return;
                }
                t.m(context, "Context must not be null");
                try {
                    ((ClassLoader) t.l(a.class.getClassLoader())).loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    h hVar = b;
                    hVar.k(context, 11925000);
                    try {
                        DynamiteModule e2 = DynamiteModule.e(context, DynamiteModule.b, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class loadClass = e2.b().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (loadClass.getClassLoader() == a.class.getClassLoader()) {
                                Log.e(a, "ImplVersion class is missing from Cronet module.");
                                throw new i(8);
                            }
                            Method method = loadClass.getMethod("getApiLevel", (Class[]) null);
                            Method method2 = loadClass.getMethod("getCronetVersion", (Class[]) null);
                            int intValue = ((Integer) t.l((Integer) method.invoke((Object) null, (Object[]) null))).intValue();
                            e = (String) t.l((String) method2.invoke((Object) null, (Object[]) null));
                            if (apiLevel <= intValue) {
                                d = e2;
                                return;
                            }
                            Intent b2 = hVar.b(context, 2, "cr");
                            if (b2 == null) {
                                Log.e(a, "Unable to fetch error resolution intent");
                                throw new i(2);
                            }
                            String str = e;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 174);
                            sb.append("Google Play Services update is required. The API Level of the client is ");
                            sb.append(apiLevel);
                            sb.append(". The API Level of the implementation is ");
                            sb.append(intValue);
                            sb.append(". The Cronet implementation version is ");
                            sb.append(str);
                            throw new j(2, sb.toString(), b2);
                        } catch (Exception e3) {
                            Log.e(a, "Unable to read Cronet version from the Cronet module ", e3);
                            throw new i(8).initCause(e3);
                        }
                    } catch (DynamiteModule.a e4) {
                        Log.e(a, "Unable to load Cronet module", e4);
                        throw new i(8).initCause(e4);
                    }
                } catch (ClassNotFoundException e5) {
                    Log.e(a, "Cronet API is not available. Have you included all required dependencies?");
                    throw new i(10).initCause(e5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
