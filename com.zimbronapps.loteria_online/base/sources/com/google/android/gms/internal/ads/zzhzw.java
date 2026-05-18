package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzhzw implements zzidc {
    protected transient int zzq = 0;

    public static void zzaV(zzian zzianVar) throws IllegalArgumentException {
        if (!zzianVar.zzi()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public static void zzaW(Iterable iterable, List list) {
        zzhzv.zzaT(iterable, list);
    }

    private String zzdU(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + String.valueOf(str).length() + 44);
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public zzian zzaM() {
        try {
            int zzbr = zzbr();
            zzian zzianVar = zzian.zza;
            byte[] bArr = new byte[zzbr];
            int i = zziaw.zzf;
            zziat zziatVar = new zziat(bArr, 0, zzbr);
            zzcX(zziatVar);
            return zziaj.zza(zziatVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdU("ByteString"), e);
        }
    }

    public byte[] zzaN() {
        try {
            int zzbr = zzbr();
            byte[] bArr = new byte[zzbr];
            int i = zziaw.zzf;
            zziat zziatVar = new zziat(bArr, 0, zzbr);
            zzcX(zziatVar);
            zziatVar.zzD();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdU("byte array"), e);
        }
    }

    public void zzaO(OutputStream outputStream) throws IOException {
        zziav zziavVar = new zziav(outputStream, zziaw.zzz(zzbr()));
        zzcX(zziavVar);
        zziavVar.zzy();
    }

    public void zzaP(OutputStream outputStream) throws IOException {
        int zzbr = zzbr();
        zziav zziavVar = new zziav(outputStream, zziaw.zzz(zziaw.zzA(zzbr) + zzbr));
        zziavVar.zzs(zzbr);
        zzcX(zziavVar);
        zziavVar.zzy();
    }

    public int zzaQ() {
        throw new UnsupportedOperationException();
    }

    public void zzaR(int i) {
        throw new UnsupportedOperationException();
    }

    public zzidh zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public int zzaT(zzidu zziduVar) {
        return zzaQ();
    }

    public zziee zzaU() {
        return new zziee(this);
    }
}
