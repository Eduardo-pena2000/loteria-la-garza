package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzhzv implements zzidb {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 16 + String.valueOf(str).length() + 44);
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public static zziee zzaR(zzidc zzidcVar) {
        return new zziee(zzidcVar);
    }

    @Deprecated
    public static void zzaS(Iterable iterable, Collection collection) {
        zzaT(iterable, (List) collection);
    }

    public static void zzaT(Iterable iterable, List list) {
        byte[] bArr = zzice.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzicn)) {
            if (iterable instanceof zzidl) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List zza = ((zzicn) iterable).zza();
        zzicn zzicnVar = (zzicn) list;
        int size = list.size();
        for (Object obj : zza) {
            if (obj == null) {
                int size2 = zzicnVar.size() - size;
                StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                sb.append("Element at index ");
                sb.append(size2);
                sb.append(" is null.");
                String sb2 = sb.toString();
                int size3 = zzicnVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(sb2);
                    }
                    zzicnVar.remove(size3);
                }
            } else if (obj instanceof zzian) {
                zzicnVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzian.zzs(bArr2, 0, bArr2.length);
                zzicnVar.zzb();
            } else {
                zzicnVar.add((String) obj);
            }
        }
    }

    private static void zzb(Iterable iterable, List list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzidn) {
                ((zzidn) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            Object obj2 = list2.get(i);
            if (obj2 == null) {
                zzc(list, size2);
            }
            list.add(obj2);
        }
    }

    private static void zzc(List list, int i) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(sb2);
            }
            list.remove(size2);
        }
    }

    /* renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract zzhzv zzbf();

    /* renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public zzhzv zzbe(zziaq zziaqVar) throws IOException {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return zzbd(zziaqVar, zzibb.zza);
    }

    /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract zzhzv zzbd(zziaq zziaqVar, zzibb zzibbVar) throws IOException;

    public zzhzv zzaF(zzian zzianVar) throws zzicg {
        try {
            zziaq zzm = zzianVar.zzm();
            zzbe(zzm);
            zzm.zzb(0);
            return this;
        } catch (zzicg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    public zzhzv zzaG(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        try {
            zziaq zzm = zzianVar.zzm();
            zzbd(zzm, zzibbVar);
            zzm.zzb(0);
            return this;
        } catch (zzicg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public zzhzv zzba(byte[] bArr) throws zzicg {
        return zzaZ(bArr, 0, bArr.length);
    }

    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public zzhzv zzaZ(byte[] bArr, int i, int i2) throws zzicg {
        try {
            zziaq zzG = zziaq.zzG(bArr, i, i2, false);
            zzbe(zzG);
            zzG.zzb(0);
            return this;
        } catch (zzicg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public zzhzv zzaY(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return zzaX(bArr, 0, bArr.length, zzibbVar);
    }

    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public zzhzv zzaX(byte[] bArr, int i, int i2, zzibb zzibbVar) throws zzicg {
        try {
            zziaq zzG = zziaq.zzG(bArr, i, i2, false);
            zzbd(zzG, zzibbVar);
            zzG.zzb(0);
            return this;
        } catch (zzicg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public zzhzv zzaL(InputStream inputStream) throws IOException {
        zziaq zzF = zziaq.zzF(inputStream, 4096);
        zzbe(zzF);
        zzF.zzb(0);
        return this;
    }

    public zzhzv zzaM(InputStream inputStream, zzibb zzibbVar) throws IOException {
        zziaq zzF = zziaq.zzF(inputStream, 4096);
        zzbd(zzF, zzibbVar);
        zzF.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zzibb zzibbVar) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaM(new zzhzu(inputStream, zziaq.zzM(read, inputStream)), zzibbVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return zzaN(inputStream, zzibb.zza);
    }

    /* renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public zzhzv zzaU(zzidc zzidcVar) {
        if (zzbw().getClass().isInstance(zzidcVar)) {
            return zzaQ((zzhzw) zzidcVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract zzhzv zzaQ(zzhzw zzhzwVar);

    public /* bridge */ /* synthetic */ zzidb zzaV(InputStream inputStream, zzibb zzibbVar) throws IOException {
        zzaM(inputStream, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzbb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        zzaG(zzianVar, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzbc(zzian zzianVar) throws zzicg {
        zzaF(zzianVar);
        return this;
    }
}
