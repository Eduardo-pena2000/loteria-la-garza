package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgrr {
    private final zzgrq zza;

    private zzgrr(zzgrq zzgrqVar) {
        int i = zzgqp.zzb;
        this.zza = zzgrqVar;
    }

    public static zzgrr zza(zzgqq zzgqqVar) {
        return new zzgrr(new zzgro(zzgqqVar));
    }

    public static zzgrr zzb(Pattern pattern) {
        zzgqv zzgqvVar = new zzgqv(pattern);
        zzgrc.zzf(!((zzgqu) zzgqvVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzgqvVar);
        return new zzgrr(new zzgrm(zzgqvVar));
    }

    public static zzgrr zzc(int i) {
        return new zzgrr(new zzgrn(4000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final Iterator zzf(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzgrl(this, charSequence);
    }

    public final List zze(CharSequence charSequence) {
        charSequence.getClass();
        Iterator zzf = zzf(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzf.hasNext()) {
            arrayList.add((String) zzf.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
