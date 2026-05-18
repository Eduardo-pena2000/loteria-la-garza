package com.google.android.gms.internal.ads;

import V5.o0;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzchu extends zzchr {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzchu(zzcge zzcgeVar) {
        super(zzcgeVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i = o0.b;
            W5.p.f("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfxl.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String valueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i2 = o0.b;
            W5.p.f("Could not create preload cache directory at ".concat(valueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String valueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i3 = o0.b;
        W5.p.f("Could not set cache file permissions at ".concat(valueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfxl.zza().zza(this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0402, code lost:
    
        r33 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0404, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x040c, code lost:
    
        if (W5.p.j(3) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x040e, code lost:
    
        r0 = r15.format(r1);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r36).length());
        r3.append("Preloaded ");
        r3.append(r0);
        r3.append(" bytes from ");
        r3.append(r36);
        W5.p.a(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0440, code lost:
    
        r10.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0449, code lost:
    
        if (r0.isFile() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x044b, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0457, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchu.zze(java.lang.String):boolean");
    }

    public final void zzl() {
        this.zzh = true;
    }
}
