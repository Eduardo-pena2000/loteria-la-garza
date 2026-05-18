package W9;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class f {
    public boolean a = false;
    public c b;
    public long c;
    public W9.b d;
    public FlutterJNI e;
    public ExecutorService f;
    public Future g;

    public class a implements Callable {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        public static /* synthetic */ void a(a aVar) {
            aVar.c();
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b call() {
            String str;
            String str2;
            String[] strArr;
            Aa.d g = Aa.d.g("FlutterLoader initTask");
            try {
                f.c(f.this, this.a);
                try {
                    f.d(f.this).loadLibrary(this.a);
                    f.d(f.this).updateRefreshRate();
                    f.f(f.this).execute(new e(this));
                    b bVar = new b(Aa.b.d(this.a), Aa.b.a(this.a), Aa.b.c(this.a), null);
                    if (g != null) {
                        g.close();
                    }
                    return bVar;
                } catch (UnsatisfiedLinkError e) {
                    if (!e.toString().contains("couldn't find \"libflutter.so\"") && !e.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                        throw e;
                    }
                    String property = System.getProperty("os.arch");
                    f fVar = f.this;
                    File l = fVar.l(f.e(fVar).f);
                    String[] list = l.list();
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    int length = strArr2.length;
                    int i = 0;
                    while (i < length) {
                        String str3 = strArr2[i];
                        StringBuilder sb = new StringBuilder();
                        sb.append("!");
                        String str4 = File.separator;
                        sb.append(str4);
                        sb.append("lib");
                        sb.append(str4);
                        sb.append(str3);
                        String sb2 = sb.toString();
                        String[] strArr3 = this.a.getApplicationInfo().splitSourceDirs;
                        ArrayList arrayList2 = new ArrayList();
                        if (strArr3 != null) {
                            int length2 = strArr3.length;
                            int i2 = 0;
                            while (i2 < length2) {
                                arrayList2.add(strArr3[i2] + sb2);
                                i2++;
                                strArr2 = strArr2;
                            }
                            strArr = strArr2;
                            arrayList.addAll(arrayList2);
                        } else {
                            strArr = strArr2;
                        }
                        String str5 = this.a.getApplicationInfo().sourceDir;
                        if (str5 != null && !str5.isEmpty()) {
                            arrayList.add(str5 + sb2);
                        }
                        i++;
                        strArr2 = strArr;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                    sb3.append(property);
                    sb3.append(", and the native libraries directory (with path ");
                    sb3.append(l.getAbsolutePath());
                    sb3.append(") ");
                    if (l.exists()) {
                        str = "contains the following files: " + Arrays.toString(list);
                    } else {
                        str = "does not exist";
                    }
                    sb3.append(str);
                    if (arrayList.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = ", and the split and source libraries directory (with path(s) " + arrayList + ")";
                    }
                    sb3.append(str2);
                    sb3.append(".");
                    throw new UnsupportedOperationException(sb3.toString(), e);
                }
            } finally {
            }
        }

        public final /* synthetic */ void c() {
            f.d(f.this).prefetchDefaultFontManager();
        }
    }

    public static class b {
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    public static class c {
        public String a;

        public String a() {
            return this.a;
        }
    }

    public f(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.e = flutterJNI;
        this.f = executorService;
    }

    public static /* synthetic */ void a(f fVar, Context context, String[] strArr, Handler handler, Runnable runnable) {
        fVar.r(context, strArr, handler, runnable);
    }

    public static /* synthetic */ void b(f fVar, Context context, String[] strArr, Handler handler, Runnable runnable) {
        fVar.s(context, strArr, handler, runnable);
    }

    public static /* synthetic */ g c(f fVar, Context context) {
        fVar.o(context);
        return null;
    }

    public static /* synthetic */ FlutterJNI d(f fVar) {
        return fVar.e;
    }

    public static /* synthetic */ W9.b e(f fVar) {
        return fVar.d;
    }

    public static /* synthetic */ ExecutorService f(f fVar) {
        return fVar.f;
    }

    public static boolean q(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean g() {
        return this.d.g;
    }

    public void h(Context context, String[] strArr) {
        if (this.a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            Aa.d g = Aa.d.g("FlutterLoader#ensureInitializationComplete");
            try {
                b bVar = (b) this.g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.d.f + File.separator + "libflutter.so");
                if (strArr != null) {
                    for (String str : strArr) {
                        if (str.startsWith("--aot-shared-library-name=")) {
                            String n = n(context, str);
                            if (n != null) {
                                str = n;
                                arrayList.add(str);
                            } else {
                                Q9.b.g("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
                            }
                        } else {
                            arrayList.add(str);
                        }
                    }
                }
                arrayList.add("--aot-shared-library-name=" + this.d.a);
                arrayList.add("--aot-shared-library-name=" + this.d.f + File.separator + this.d.a);
                StringBuilder sb = new StringBuilder();
                sb.append("--cache-dir-path=");
                sb.append(bVar.b);
                arrayList.add(sb.toString());
                if (this.d.e != null) {
                    arrayList.add("--domain-network-policy=" + this.d.e);
                }
                if (this.b.a() != null) {
                    arrayList.add("--log-tag=" + this.b.a());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i = (int) ((r8.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread", false)) {
                        throw new IllegalArgumentException("io.flutter.embedding.android.DisableMergedPlatformUIThread is no longer allowed.");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableFlutterGPU", false)) {
                        arrayList.add("--enable-flutter-gpu");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                        arrayList.add("--enable-surface-control");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                        arrayList.add("--impeller-lazy-shader-mode");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                        arrayList.add("--impeller-antialias-lines");
                    }
                }
                arrayList.add("--leak-vm=" + (q(bundle) ? "true" : "false"));
                this.e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.a, bVar.b, SystemClock.uptimeMillis() - this.c, Build.VERSION.SDK_INT);
                this.a = true;
                if (g != null) {
                    g.close();
                }
            } finally {
            }
        } catch (Exception e) {
            Q9.b.c("FlutterLoader", "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }

    public void i(Context context, String[] strArr, Handler handler, Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (this.a) {
            handler.post(runnable);
        } else {
            this.f.execute(new W9.c(this, context, strArr, handler, runnable));
        }
    }

    public String j() {
        return this.d.d;
    }

    public final String k(String str) {
        return this.d.d + File.separator + str;
    }

    public File l(String str) {
        return new File(str);
    }

    public String m(String str) {
        return k(str);
    }

    public final String n(Context context, String str) {
        if (!str.startsWith("--aot-shared-library-name=")) {
            throw new IllegalArgumentException("AOT shared library name flag was not specified correctly; please use --aot-shared-library-name=<path>.");
        }
        File l = l(str.substring(26));
        try {
            String canonicalPath = l.getCanonicalPath();
            boolean startsWith = canonicalPath.startsWith(context.getApplicationContext().getFilesDir().getCanonicalPath() + File.separator);
            boolean endsWith = canonicalPath.endsWith(".so");
            if (startsWith && endsWith) {
                return "--aot-shared-library-name=" + canonicalPath;
            }
            Q9.b.b("FlutterLoader", "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            Q9.b.b("FlutterLoader", "External path " + l.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    public final g o(Context context) {
        return null;
    }

    public boolean p() {
        return this.a;
    }

    public final /* synthetic */ void r(Context context, String[] strArr, Handler handler, Runnable runnable) {
        h(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    public final /* synthetic */ void s(Context context, String[] strArr, Handler handler, Runnable runnable) {
        try {
            Aa.a.a(Looper.getMainLooper()).post(new d(this, context, strArr, handler, runnable));
        } catch (Exception e) {
            Q9.b.c("FlutterLoader", "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }

    public void t(Context context) {
        u(context, new c());
    }

    public void u(Context context, c cVar) {
        if (this.b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        Aa.d g = Aa.d.g("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.b = cVar;
            this.c = SystemClock.uptimeMillis();
            this.d = W9.a.e(applicationContext);
            p.f((DisplayManager) applicationContext.getSystemService("display"), this.e).g();
            this.g = this.f.submit(new a(applicationContext));
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
