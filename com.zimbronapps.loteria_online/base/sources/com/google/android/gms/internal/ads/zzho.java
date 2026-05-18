package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzho extends zzgt {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzho() {
        super(false);
    }

    public final int zza(byte[] bArr, int i, int i2) throws zzhn {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzc;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            String str = zzfj.zza;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.zzc -= read;
                zzh(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzhn(e, 2000);
        }
    }

    public final long zzb(zzhf zzhfVar) throws zzhn {
        Uri uri = zzhfVar.zza;
        this.zzb = uri;
        zzf(zzhfVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                long j = zzhfVar.zze;
                randomAccessFile.seek(j);
                long j2 = zzhfVar.zzf;
                if (j2 == -1) {
                    j2 = this.zza.length() - j;
                }
                this.zzc = j2;
                if (j2 < 0) {
                    throw new zzhn(null, null, 2008);
                }
                this.zzd = true;
                zzg(zzhfVar);
                return this.zzc;
            } catch (IOException e) {
                throw new zzhn(e, 2000);
            }
        } catch (RuntimeException e2) {
            throw new zzhn(e2, 2000);
        } catch (SecurityException e3) {
            throw new zzhn(e3, 2006);
        } catch (FileNotFoundException e4) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzhn(e4, ((e4.getCause() instanceof ErrnoException) && e4.getCause().errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new zzhn(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e4, 1004);
        }
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() throws zzhn {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzi();
                }
            } catch (IOException e) {
                throw new zzhn(e, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzi();
            }
            throw th;
        }
    }
}
