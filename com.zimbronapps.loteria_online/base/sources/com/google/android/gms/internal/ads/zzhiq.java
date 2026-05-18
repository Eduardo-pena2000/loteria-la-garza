package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhiq {
    static final long[] zza;
    static final long[] zzb;
    static final long[] zzc;
    static final zzhij[][] zzd;
    static final zzhij[] zze;
    private static final BigInteger zzf;
    private static final BigInteger zzg;
    private static final BigInteger zzh;
    private static final BigInteger zzi;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        zzf = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        zzg = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        zzh = mod2;
        BigInteger valueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger modPow = valueOf.modPow(subtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), subtract);
        zzi = modPow;
        zzhip zzhipVar = new zzhip(null);
        zzhipVar.zzd(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract));
        BigInteger zzc2 = zzhipVar.zzc();
        BigInteger multiply = zzc2.pow(2).subtract(bigInteger).multiply(mod.multiply(zzc2.pow(2)).add(bigInteger).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        zzhipVar.zzb(modPow2);
        zza = zzhiv.zzg(zzb(mod));
        zzb = zzhiv.zzg(zzb(mod2));
        zzc = zzhiv.zzg(zzb(modPow));
        zzd = (zzhij[][]) Array.newInstance(zzhij.class, new int[]{32, 8});
        zzhip zzhipVar2 = zzhipVar;
        for (int i = 0; i < 32; i++) {
            zzhip zzhipVar3 = zzhipVar2;
            for (int i2 = 0; i2 < 8; i2++) {
                zzd[i][i2] = zzc(zzhipVar3);
                zzhipVar3 = zza(zzhipVar3, zzhipVar2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                zzhipVar2 = zza(zzhipVar2, zzhipVar2);
            }
        }
        zzhip zza2 = zza(zzhipVar, zzhipVar);
        zze = new zzhij[8];
        for (int i4 = 0; i4 < 8; i4++) {
            zze[i4] = zzc(zzhipVar);
            zzhipVar = zza(zzhipVar, zza2);
        }
    }

    private static zzhip zza(zzhip zzhipVar, zzhip zzhipVar2) {
        zzhip zzhipVar3 = new zzhip(null);
        BigInteger multiply = zzg.multiply(zzhipVar.zza().multiply(zzhipVar2.zza()).multiply(zzhipVar.zzc()).multiply(zzhipVar2.zzc()));
        BigInteger bigInteger = zzf;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = zzhipVar.zza().multiply(zzhipVar2.zzc()).add(zzhipVar2.zza().multiply(zzhipVar.zzc()));
        BigInteger bigInteger2 = BigInteger.ONE;
        zzhipVar3.zzb(add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger));
        zzhipVar3.zzd(zzhipVar.zzc().multiply(zzhipVar2.zzc()).add(zzhipVar.zza().multiply(zzhipVar2.zza())).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger));
        return zzhipVar3;
    }

    private static byte[] zzb(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    private static zzhij zzc(zzhip zzhipVar) {
        BigInteger add = zzhipVar.zzc().add(zzhipVar.zza());
        BigInteger bigInteger = zzf;
        return new zzhij(zzhiv.zzg(zzb(add.mod(bigInteger))), zzhiv.zzg(zzb(zzhipVar.zzc().subtract(zzhipVar.zza()).mod(bigInteger))), zzhiv.zzg(zzb(zzh.multiply(zzhipVar.zza()).multiply(zzhipVar.zzc()).mod(bigInteger))));
    }
}
