package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhzf extends Writer {
    private final Appendable zza;
    private final zzhze zzb = new zzhze(null);

    public zzhzf(Appendable appendable) {
        this.zza = appendable;
    }

    public final Writer append(CharSequence charSequence) throws IOException {
        this.zza.append(charSequence);
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final void write(int i) throws IOException {
        this.zza.append((char) i);
    }

    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    public final void write(String str, int i, int i2) throws IOException {
        Objects.requireNonNull(str);
        this.zza.append(str, i, i2 + i);
    }

    public final Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        this.zza.append(charSequence, i, i2);
        return this;
    }

    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        append(charSequence, i, i2);
        return this;
    }

    public final void write(char[] cArr, int i, int i2) throws IOException {
        zzhze zzhzeVar = this.zzb;
        zzhzeVar.zza(cArr);
        this.zza.append(zzhzeVar, i, i2 + i);
    }
}
