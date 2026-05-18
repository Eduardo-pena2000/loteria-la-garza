package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzasu implements zzari {
    private final zzast zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzasu(zzast zzastVar, int i) {
        this.zzc = zzastVar;
    }

    public static byte[] zzg(zzass zzassVar, long j) throws IOException {
        long zza = zzassVar.zza();
        if (j >= 0 && j <= zza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzassVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 33 + String.valueOf(zza).length());
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(zza);
        throw new IOException(sb.toString());
    }

    public static void zzh(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    public static void zzj(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static long zzk(InputStream inputStream) throws IOException {
        return (zzp(inputStream) & 255) | ((zzp(inputStream) & 255) << 8) | ((zzp(inputStream) & 255) << 16) | ((zzp(inputStream) & 255) << 24) | ((zzp(inputStream) & 255) << 32) | ((zzp(inputStream) & 255) << 40) | ((zzp(inputStream) & 255) << 48) | ((zzp(inputStream) & 255) << 56);
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static String zzm(zzass zzassVar) throws IOException {
        return new String(zzg(zzassVar, zzk(zzassVar)), "UTF-8");
    }

    private final void zzn(String str, zzasr zzasrVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb += zzasrVar.zza - ((zzasr) map.get(str)).zza;
        } else {
            this.zzb += zzasrVar.zza;
        }
        map.put(str, zzasrVar);
    }

    private final void zzo(String str) {
        zzasr zzasrVar = (zzasr) this.zza.remove(str);
        if (zzasrVar != null) {
            this.zzb -= zzasrVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public final synchronized zzarh zza(String str) {
        zzasr zzasrVar = (zzasr) this.zza.get(str);
        if (zzasrVar == null) {
            return null;
        }
        File zzf = zzf(str);
        try {
            zzass zzassVar = new zzass(new BufferedInputStream(new FileInputStream(zzf)), zzf.length());
            try {
                String str2 = zzasr.zza(zzassVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzask.zzb("%s: key=%s, found=%s", zzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    return null;
                }
                byte[] zzg = zzg(zzassVar, zzassVar.zza());
                zzarh zzarhVar = new zzarh();
                zzarhVar.zza = zzg;
                zzarhVar.zzb = zzasrVar.zzc;
                zzarhVar.zzc = zzasrVar.zzd;
                zzarhVar.zzd = zzasrVar.zze;
                zzarhVar.zze = zzasrVar.zzf;
                zzarhVar.zzf = zzasrVar.zzg;
                List<zzarq> list = zzasrVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzarq zzarqVar : list) {
                    treeMap.put(zzarqVar.zza(), zzarqVar.zzb());
                }
                zzarhVar.zzg = treeMap;
                zzarhVar.zzh = Collections.unmodifiableList(list);
                return zzarhVar;
            } finally {
                zzassVar.close();
            }
        } catch (IOException e) {
            zzask.zzb("%s: %s", zzf.getAbsolutePath(), e.toString());
            zze(str);
            return null;
        }
    }

    public final synchronized void zzb(String str, zzarh zzarhVar) {
        long j;
        try {
            long j2 = this.zzb;
            int length = zzarhVar.zza.length;
            long j3 = j2 + length;
            int i = this.zzd;
            if (j3 <= i || length <= i * 0.9f) {
                File zzf = zzf(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzf));
                    zzasr zzasrVar = new zzasr(str, zzarhVar);
                    try {
                        zzh(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzasrVar.zzb);
                        String str2 = zzasrVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzj(bufferedOutputStream, zzasrVar.zzd);
                        zzj(bufferedOutputStream, zzasrVar.zze);
                        zzj(bufferedOutputStream, zzasrVar.zzf);
                        zzj(bufferedOutputStream, zzasrVar.zzg);
                        List<zzarq> list = zzasrVar.zzh;
                        if (list != null) {
                            zzh(bufferedOutputStream, list.size());
                            for (zzarq zzarqVar : list) {
                                zzl(bufferedOutputStream, zzarqVar.zza());
                                zzl(bufferedOutputStream, zzarqVar.zzb());
                            }
                        } else {
                            zzh(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzarhVar.zza);
                        bufferedOutputStream.close();
                        zzasrVar.zza = zzf.length();
                        zzn(str, zzasrVar);
                        long j4 = this.zzb;
                        int i2 = this.zzd;
                        if (j4 >= i2) {
                            boolean z = zzask.zzb;
                            if (z) {
                                zzask.zza("Pruning old cache entries.", new Object[0]);
                            }
                            long j5 = this.zzb;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    j = j5;
                                    break;
                                }
                                zzasr zzasrVar2 = (zzasr) ((Map.Entry) it.next()).getValue();
                                String str3 = zzasrVar2.zzb;
                                if (zzf(str3).delete()) {
                                    j = j5;
                                    this.zzb -= zzasrVar2.zza;
                                } else {
                                    j = j5;
                                    zzask.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i3++;
                                if (this.zzb < i2 * 0.9f) {
                                    break;
                                } else {
                                    j5 = j;
                                }
                            }
                            if (z) {
                                zzask.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.zzb - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        zzask.zzb("%s", e.toString());
                        bufferedOutputStream.close();
                        zzask.zzb("Failed to write header for %s", zzf.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!zzf.delete()) {
                        zzask.zzb("Could not clean up file %s", zzf.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzask.zzb("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzc();
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void zzc() {
        File zza = this.zzc.zza();
        if (zza.exists()) {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        zzass zzassVar = new zzass(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzasr zza2 = zzasr.zza(zzassVar);
                            zza2.zza = length;
                            zzn(zza2.zzb, zza2);
                            zzassVar.close();
                        } catch (Throwable th) {
                            zzassVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!zza.mkdirs()) {
            zzask.zzc("Unable to create cache dir %s", zza.getAbsolutePath());
        }
    }

    public final synchronized void zzd(String str, boolean z) {
        zzarh zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzb(str, zza);
        }
    }

    public final synchronized void zze(String str) {
        boolean delete = zzf(str).delete();
        zzo(str);
        if (delete) {
            return;
        }
        zzask.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzasu(File file, int i) {
        this.zzc = new zzasq(this, file);
    }
}
