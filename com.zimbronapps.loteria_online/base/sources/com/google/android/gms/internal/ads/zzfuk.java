package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfuk {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final HashSet zzh = new HashSet();
    private final Map zzi = new WeakHashMap();
    private boolean zzj;

    public final HashSet zza() {
        return this.zze;
    }

    public final HashSet zzb() {
        return this.zzf;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final void zzd() {
        String str;
        Activity activity;
        Boolean bool;
        zzfth zza = zzfth.zza();
        if (zza != null) {
            for (zzfsn zzfsnVar : zza.zzf()) {
                View zzi = zzfsnVar.zzi();
                if (zzfsnVar.zzj()) {
                    String zzh = zzfsnVar.zzh();
                    if (zzi != null) {
                        Context context = zzi.getContext();
                        while (true) {
                            str = null;
                            if (!(context instanceof ContextWrapper)) {
                                activity = null;
                                break;
                            } else {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        }
                        boolean isInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                        if (isInPictureInPictureMode) {
                            this.zzh.add(zzh);
                        }
                        if (zzi.isAttachedToWindow()) {
                            if (zzi.hasWindowFocus()) {
                                this.zzi.remove(zzi);
                                bool = Boolean.FALSE;
                            } else {
                                Map map = this.zzi;
                                if (map.containsKey(zzi)) {
                                    bool = (Boolean) map.get(zzi);
                                } else {
                                    Boolean bool2 = Boolean.FALSE;
                                    map.put(zzi, bool2);
                                    bool = bool2;
                                }
                            }
                            if (!bool.booleanValue() || isInPictureInPictureMode) {
                                HashSet hashSet = new HashSet();
                                View view = zzi;
                                while (true) {
                                    if (view == null) {
                                        this.zzd.addAll(hashSet);
                                        break;
                                    }
                                    String zza2 = zzfui.zza(view);
                                    if (zza2 != null) {
                                        str = zza2;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        ViewParent parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.zze.add(zzh);
                            this.zza.put(zzi, zzh);
                            for (zzftk zzftkVar : zzfsnVar.zzf()) {
                                View view2 = (View) zzftkVar.zza().get();
                                if (view2 != null) {
                                    HashMap hashMap = this.zzb;
                                    zzfuj zzfujVar = (zzfuj) hashMap.get(view2);
                                    if (zzfujVar != null) {
                                        zzfujVar.zza(zzfsnVar.zzh());
                                    } else {
                                        hashMap.put(view2, new zzfuj(zzftkVar, zzfsnVar.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(zzh);
                            this.zzc.put(zzh, zzi);
                            this.zzg.put(zzh, str);
                        }
                    } else {
                        this.zzf.add(zzh);
                        this.zzg.put(zzh, "noAdView");
                    }
                }
            }
        }
    }

    public final void zze() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
        this.zzh.clear();
    }

    public final void zzf() {
        this.zzj = true;
    }

    public final String zzg(View view) {
        HashMap hashMap = this.zza;
        if (hashMap.size() == 0) {
            return null;
        }
        String str = (String) hashMap.get(view);
        if (str != null) {
            hashMap.remove(view);
        }
        return str;
    }

    public final View zzh(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfuj zzi(View view) {
        HashMap hashMap = this.zzb;
        zzfuj zzfujVar = (zzfuj) hashMap.get(view);
        if (zzfujVar != null) {
            hashMap.remove(view);
        }
        return zzfujVar;
    }

    public final boolean zzj(View view) {
        Map map = this.zzi;
        if (!map.containsKey(view)) {
            return true;
        }
        map.put(view, Boolean.TRUE);
        return false;
    }

    public final boolean zzk(String str) {
        return this.zzh.contains(str);
    }

    public final int zzl(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzj ? 2 : 3;
    }
}
