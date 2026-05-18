package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhx extends zzgt {
    private final Context zza;
    private zzhf zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzhx(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 15);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    private static AssetFileDescriptor zzk(Context context, zzhf zzhfVar) throws zzhw {
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = zzhfVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 61);
                sb.append("rawresource:// URI must have exactly one path element, found ");
                sb.append(size);
                throw new zzhw(sb.toString());
            }
            identifier = zzl((String) pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                String scheme = normalizeScheme.getScheme();
                StringBuilder sb2 = new StringBuilder(String.valueOf(scheme).length() + 62);
                sb2.append("Unsupported URI scheme (");
                sb2.append(scheme);
                sb2.append("). Only android.resource is supported.");
                throw new zzhw(sb2.toString(), null, 1004);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new zzhw("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzl(path);
            } else {
                StringBuilder sb3 = new StringBuilder(packageName.length() + 1 + path.length());
                sb3.append(packageName);
                sb3.append(":");
                sb3.append(path);
                identifier = resourcesForApplication.getIdentifier(sb3.toString(), "raw", (String) null);
                if (identifier == 0) {
                    throw new zzhw("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzhw("Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new zzhw(null, e2, 2005);
        }
    }

    private static int zzl(String str) throws zzhw {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzhw("Resource identifier must be an integer.", null, 1004);
        }
    }

    public final int zza(byte[] bArr, int i, int i2) throws zzhw {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzhw(null, e, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        String str = zzfj.zza;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzhw("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - read;
        }
        zzh(read);
        return read;
    }

    public final long zzb(zzhf zzhfVar) throws zzhw {
        long j;
        this.zzb = zzhfVar;
        zzf(zzhfVar);
        AssetFileDescriptor zzk = zzk(this.zza, zzhfVar);
        this.zzc = zzk;
        long length = zzk.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzhfVar.zze > length) {
                    throw new zzhw(null, null, 2008);
                }
            } catch (zzhw e) {
                throw e;
            } catch (IOException e2) {
                throw new zzhw(null, e2, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long j2 = zzhfVar.zze;
        long skip = fileInputStream.skip(startOffset + j2) - startOffset;
        if (skip != j2) {
            throw new zzhw(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                j = -1;
            } else {
                j = channel.size() - channel.position();
                this.zze = j;
                if (j < 0) {
                    throw new zzhw(null, null, 2008);
                }
            }
        } else {
            j = length - skip;
            this.zze = j;
            if (j < 0) {
                throw new zzhc(2008);
            }
        }
        long j3 = zzhfVar.zzf;
        if (j3 != -1) {
            this.zze = j == -1 ? j3 : Math.min(j, j3);
        }
        this.zzf = true;
        zzg(zzhfVar);
        return j3 != -1 ? j3 : this.zze;
    }

    public final Uri zzc() {
        zzhf zzhfVar = this.zzb;
        if (zzhfVar != null) {
            return zzhfVar.zza;
        }
        return null;
    }

    public final void zzd() throws zzhw {
        this.zzb = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                    } catch (IOException e) {
                        throw new zzhw(null, e, 2000);
                    }
                } catch (IOException e2) {
                    throw new zzhw(null, e2, 2000);
                }
            } catch (Throwable th) {
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzi();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzhw(null, e3, 2000);
                }
            }
        } catch (Throwable th2) {
            this.zzc = null;
            if (this.zzf) {
                this.zzf = false;
                zzi();
            }
            throw th2;
        }
    }
}
