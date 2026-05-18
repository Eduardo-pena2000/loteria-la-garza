package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfwe {
    public static boolean zza(zzbch zzbchVar) {
        int ordinal = zzbchVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5;
    }

    public static final zzbch zzb(Context context, zzfvh zzfvhVar) {
        zzbch zzbchVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] listFiles = file.listFiles(new zzgxn(Pattern.compile(".*\\.so$", 2)));
            if (listFiles == null || listFiles.length == 0) {
                if (zzfvhVar != null) {
                    zzfvhVar.zze(5017, "No .so");
                } else {
                    zzfvhVar = null;
                }
                zzbchVar = zzbch.zzg;
            } else {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e) {
                    zzc(null, e.toString(), context, zzfvhVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzc(bArr, null, context, zzfvhVar);
                        zzbchVar = zzbch.zza;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            zzbchVar = zzbch.zzc;
                        } else if (s == 40) {
                            zzbchVar = zzbch.zzb;
                        } else if (s == 62) {
                            zzbchVar = zzbch.zze;
                        } else if (s == 183) {
                            zzbchVar = zzbch.zzd;
                        } else if (s != 243) {
                            zzc(bArr, null, context, zzfvhVar);
                            zzbchVar = zzbch.zza;
                        } else {
                            zzbchVar = zzbch.zzf;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzbchVar = zzbch.zza;
                }
            }
        } else {
            if (zzfvhVar != null) {
                zzfvhVar.zze(5017, "No lib/");
            } else {
                zzfvhVar = null;
            }
            zzbchVar = zzbch.zzg;
        }
        if (zzbchVar == zzbch.zzg) {
            String zzd = zzd(context, zzfvhVar);
            if (TextUtils.isEmpty(zzd)) {
                zzc(null, "Empty dev arch", context, zzfvhVar);
                zzbchVar = zzbch.zza;
            } else if (zzd.equalsIgnoreCase("i686") || zzd.equalsIgnoreCase("x86")) {
                zzbchVar = zzbch.zzc;
            } else if (zzd.equalsIgnoreCase("x86_64")) {
                zzbchVar = zzbch.zze;
            } else if (zzd.equalsIgnoreCase("arm64-v8a")) {
                zzbchVar = zzbch.zzd;
            } else if (zzd.equalsIgnoreCase("armeabi-v7a") || zzd.equalsIgnoreCase("armv71")) {
                zzbchVar = zzbch.zzb;
            } else if (zzd.equalsIgnoreCase("riscv64")) {
                zzbchVar = zzbch.zzf;
            } else {
                zzc(null, zzd, context, zzfvhVar);
                zzbchVar = zzbch.zza;
            }
        }
        if (zzfvhVar != null) {
            zzfvhVar.zze(5018, zzbchVar.name());
        }
        return zzbchVar;
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfvh zzfvhVar) {
        if (zzfvhVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(zzgrs.zzu.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (NoSuchFieldException | IllegalAccessException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfvhVar.zze(4007, sb.toString());
    }

    private static final String zzd(Context context, zzfvh zzfvhVar) {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"i686", "armv71"}));
        String zza = zzgrs.zzu.zza();
        if (!TextUtils.isEmpty(zza) && hashSet.contains(zza)) {
            return zza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e) {
            if (zzfvhVar != null) {
                zzfvhVar.zzc(2024, 0L, e);
            }
        } catch (NoSuchFieldException e2) {
            if (zzfvhVar != null) {
                zzfvhVar.zzc(2024, 0L, e2);
            }
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }
}
