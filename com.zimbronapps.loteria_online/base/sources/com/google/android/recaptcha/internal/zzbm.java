package com.google.android.recaptcha.internal;

import Da.D;
import Da.t;
import Da.u;
import Da.w;
import Qa.l;
import Za.B;
import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    if (B.N(file.getName(), this.zzb, false, 2, (Object) null)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void zzc(String str, String str2) {
        Wa.c cVar = new Wa.c('A', 'z');
        ArrayList arrayList = new ArrayList(w.y(cVar, 10));
        t it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(it.a()));
        }
        String n0 = D.n0(u.f(arrayList).subList(0, 8), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(n0)));
        zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    public final boolean zzd(String str) {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = listFiles[i];
                    if (kotlin.jvm.internal.t.c(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i++;
                }
            }
            return file != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
