package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzftv implements zzftt {
    private final zzftt zza;

    public zzftv(zzftt zzfttVar) {
        this.zza = zzfttVar;
    }

    public final JSONObject zza(View view) {
        JSONObject zzb = zzfud.zzb(0, 0, 0, 0);
        int zzb2 = zzfug.zzb();
        int i = zzb2 - 1;
        if (zzb2 == 0) {
            throw null;
        }
        try {
            zzb.put("noOutputDevice", i == 0);
        } catch (JSONException e) {
            zzfue.zza("Error with setting output device status", e);
        }
        return zzb;
    }

    public final void zzb(View view, JSONObject jSONObject, zzfts zzftsVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzfth zza = zzfth.zza();
        if (zza != null) {
            Collection zzf = zza.zzf();
            int size = zzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = zzf.iterator();
            while (it.hasNext()) {
                View zzi = ((zzfsn) it.next()).zzi();
                if (zzi != null && zzi.isAttachedToWindow() && zzi.isShown()) {
                    View view2 = zzi;
                    while (true) {
                        if (view2 == null) {
                            View rootView = zzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((View) arrayList.get(i)).getZ() <= z3) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzftsVar.zza((View) arrayList.get(i2), this.zza, jSONObject, z2);
        }
    }
}
