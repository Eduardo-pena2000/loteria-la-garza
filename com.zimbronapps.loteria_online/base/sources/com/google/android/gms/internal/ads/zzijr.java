package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzijr implements Iterator, Closeable, zzatk {
    private static final zzatj zza = new zzijq("eof ");
    protected zzatg zzb;
    protected zzijs zzc;
    zzatj zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzijy.zzb(zzijr.class);
    }

    public void close() throws IOException {
    }

    public final boolean hasNext() {
        zzatj zzatjVar = this.zzd;
        if (zzatjVar == zza) {
            return false;
        }
        if (zzatjVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            List list = this.zzg;
            if (i >= list.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzatj) list.get(i)).toString());
            i++;
        }
    }

    public final List zzc() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzijx(this.zzg, this);
    }

    public final void zzd(zzijs zzijsVar, long j, zzatg zzatgVar) throws IOException {
        this.zzc = zzijsVar;
        this.zze = zzijsVar.zzc();
        zzijsVar.zzd(zzijsVar.zzc() + j);
        this.zzf = zzijsVar.zzc();
        this.zzb = zzatgVar;
    }

    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzatj next() {
        zzatj zzb;
        zzatj zzatjVar = this.zzd;
        if (zzatjVar != null && zzatjVar != zza) {
            this.zzd = null;
            return zzatjVar;
        }
        zzijs zzijsVar = this.zzc;
        if (zzijsVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzijsVar) {
                this.zzc.zzd(this.zze);
                zzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzc();
            }
            return zzb;
        } catch (IOException unused) {
            throw new NoSuchElementException();
        } catch (EOFException unused2) {
            throw new NoSuchElementException();
        }
    }
}
