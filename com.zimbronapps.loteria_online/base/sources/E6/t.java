package E6;

import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.internal.common.zzy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class t {
    public static String a;
    public static int b;
    public static Boolean c;

    public static String a() {
        String str;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                a = Q4.i.a();
            } else {
                int i = b;
                if (i == 0) {
                    i = Process.myPid();
                    b = i;
                }
                String str2 = null;
                if (i > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 14);
                        sb.append("/proc/");
                        sb.append(i);
                        sb.append("/cmdline");
                        String sb2 = sb.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            str = new BufferedReader(new FileReader(sb2));
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        str = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        String readLine = str.readLine();
                        com.google.android.gms.common.internal.t.l(readLine);
                        str2 = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = str;
                        m.b(str2);
                        throw th;
                    }
                    m.b(str);
                }
                a = str2;
            }
        }
        return a;
    }

    public static boolean b() {
        Boolean bool = c;
        if (bool == null) {
            if (q.h()) {
                bool = Boolean.valueOf(s.a());
            } else {
                try {
                    Object zza = zzj.zza(Process.class, "isIsolated", new zzi[0]);
                    Object[] objArr = new Object[0];
                    if (zza == null) {
                        throw new zzy(zzx.zza("expected a non-null reference", objArr));
                    }
                    bool = (Boolean) zza;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            c = bool;
        }
        return bool.booleanValue();
    }
}
