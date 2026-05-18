package com.google.android.gms.dynamite;

import E6.q;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class DynamiteModule {
    public static Boolean h = null;
    public static String i = null;
    public static boolean j = false;
    public static int k = -1;
    public static Boolean l;
    public static O6.h r;
    public static O6.i s;
    public final Context a;
    public static final ThreadLocal m = new ThreadLocal();
    public static final ThreadLocal n = new O6.f();
    public static final b.a o = new com.google.android.gms.dynamite.b();
    public static final b b = new c();
    public static final b c = new d();
    public static final b d = new e();
    public static final b e = new f();
    public static final b f = new g();
    public static final b g = new h();
    public static final b p = new i();
    public static final b q = new com.google.android.gms.dynamite.a();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public /* synthetic */ a(String str, Throwable th, byte[] bArr) {
            super(str, th);
        }

        public /* synthetic */ a(String str, byte[] bArr) {
            super(str);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z);

            int b(Context context, String str);
        }

        public static class b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        t.l(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (r.b(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:5:0x0043, B:9:0x00ba, B:14:0x00c6, B:17:0x00cc, B:32:0x00ea, B:126:0x027b, B:127:0x0286, B:131:0x0296, B:133:0x02be, B:135:0x02cd, B:136:0x02ed, B:137:0x02f5, B:119:0x0289, B:122:0x028a, B:123:0x0292, B:140:0x02f6, B:141:0x0317, B:142:0x0318, B:143:0x0368), top: B:4:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02db A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context r29, com.google.android.gms.dynamite.DynamiteModule.b r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b3 A[Catch: all -> 0x003a, TryCatch #11 {, blocks: (B:77:0x002a, B:79:0x0036, B:80:0x00bc, B:118:0x003f, B:84:0x0046, B:86:0x004c, B:89:0x0052, B:91:0x0056, B:95:0x0060, B:97:0x0068, B:100:0x006f, B:103:0x009b, B:104:0x00a3, B:108:0x0076, B:110:0x007c, B:111:0x008d, B:112:0x00a6, B:115:0x00a9, B:116:0x00b3, B:119:0x0042), top: B:76:0x002a, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018a A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x00f4, blocks: (B:4:0x0006, B:10:0x00e9, B:67:0x00ef, B:12:0x011b, B:43:0x017c, B:33:0x018a, B:54:0x01e4, B:55:0x01e7, B:50:0x01dc, B:71:0x00f8, B:130:0x01e9, B:6:0x0007, B:74:0x000d, B:75:0x0029, B:82:0x00e6, B:87:0x004d, B:105:0x00a4, B:113:0x00a7, B:124:0x00bf, B:9:0x00e8, B:127:0x00c5), top: B:3:0x0006, inners: #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0179 A[PHI: r0
      0x0179: PHI (r0v5 java.lang.String) = (r0v18 java.lang.String), (r0v19 java.lang.String) binds: [B:39:0x016c, B:41:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01da -> B:25:0x01df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01dc -> B:25:0x01df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(l)) {
            return true;
        }
        boolean z = false;
        if (l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != q.i() ? 0 : 268435456);
            if (v6.h.f().h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            l = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                j = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0145: MOVE (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:326), block:B:112:0x0145 */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int h(android.content.Context r15, java.lang.String r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.h(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static boolean i(Cursor cursor) {
        O6.g gVar = (O6.g) m.get();
        if (gVar == null || gVar.a != null) {
            return false;
        }
        gVar.a = cursor;
        return true;
    }

    public static DynamiteModule j(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    public static void k(ClassLoader classLoader) {
        O6.i iVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor((Class[]) null).newInstance((Object[]) null);
            if (iBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                iVar = queryLocalInterface instanceof O6.i ? (O6.i) queryLocalInterface : new O6.i(iBinder);
            }
            s = iVar;
        } catch (NoSuchMethodException e2) {
            e = e2;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (ClassNotFoundException e3) {
            e = e3;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (IllegalAccessException e4) {
            e = e4;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (InstantiationException e6) {
            e = e6;
            throw new a("Failed to instantiate dynamite loader", e, null);
        }
    }

    public static O6.h l(Context context) {
        O6.h hVar;
        synchronized (DynamiteModule.class) {
            O6.h hVar2 = r;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = queryLocalInterface instanceof O6.h ? (O6.h) queryLocalInterface : new O6.h(iBinder);
                }
                if (hVar != null) {
                    r = hVar;
                    return hVar;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public Context b() {
        return this.a;
    }

    public IBinder d(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (IllegalAccessException | ClassNotFoundException | InstantiationException e2) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }
}
