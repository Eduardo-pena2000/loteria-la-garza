package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbgj {

    public static /* synthetic */ class 1 {
        static final /* synthetic */ int[] zza;

        static {
            int[] iArr = new int[zzibq.values().length];
            zza = iArr;
            try {
                iArr[zzibq.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zza[zzibq.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zza[zzibq.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zza[zzibq.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zza[zzibq.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zza[zzibq.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zza[zzibq.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public final class zza extends zzibr implements zzf {
        private static final zza zzB;
        private static volatile zzidk zzC = null;
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        public static final int zzk = 17;
        private int zzl;
        private int zzm;
        private zzg zzo;
        private zzi zzp;
        private zzk zzv;
        private zzah zzw;
        private zzac zzx;
        private zzx zzy;
        private zzz zzz;
        private int zzn = 1000;
        private zzicd zzu = zzibr.zzbM();
        private zzicd zzA = zzibr.zzbM();

        public enum zza implements zzibv {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10),
            REWARDED_INTERSTITIAL(11);

            public static final int zzm = 0;
            public static final int zzn = 1;
            public static final int zzo = 2;
            public static final int zzp = 3;
            public static final int zzq = 4;
            public static final int zzr = 5;
            public static final int zzs = 6;
            public static final int zzt = 7;
            public static final int zzu = 8;
            public static final int zzv = 9;
            public static final int zzw = 10;
            public static final int zzx = 11;
            private static final zzibw zzy = new 1();
            private final int zzz;

            public class 1 implements zzibw {
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zza zzb(int i) {
                    return zza.zzc(i);
                }
            }

            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                public boolean zza(int i) {
                    return zza.zzc(i) != null;
                }
            }

            zza(int i) {
                this.zzz = i;
            }

            public static zza zzc(int i) {
                switch (i) {
                    case 0:
                        return AD_INITIATER_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return DFP_BANNER;
                    case 3:
                        return INTERSTITIAL;
                    case 4:
                        return DFP_INTERSTITIAL;
                    case 5:
                        return NATIVE_EXPRESS;
                    case 6:
                        return AD_LOADER;
                    case 7:
                        return REWARD_BASED_VIDEO_AD;
                    case 8:
                        return BANNER_SEARCH_ADS;
                    case 9:
                        return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                    case 10:
                        return APP_OPEN;
                    case 11:
                        return REWARDED_INTERSTITIAL;
                    default:
                        return null;
                }
            }

            public static zzibw zzd() {
                return zzy;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            public final String toString() {
                return Integer.toString(this.zzz);
            }

            public final int zza() {
                return this.zzz;
            }
        }

        public final class zzb extends zzibl implements zzf {
            public /* synthetic */ zzb(byte[] bArr) {
                this();
            }

            public zzb zzA(int i, zzd zzdVar) {
                zzbg();
                ((zza) this.zza).zzX(i, zzdVar);
                return this;
            }

            public zzb zzB(zzd.zzb zzbVar) {
                zzbg();
                ((zza) this.zza).zzW((zzd) zzbVar.zzbu());
                return this;
            }

            public zzb zzC(int i, zzd.zzb zzbVar) {
                zzbg();
                ((zza) this.zza).zzX(i, (zzd) zzbVar.zzbu());
                return this;
            }

            public zzb zzD(Iterable iterable) {
                zzbg();
                ((zza) this.zza).zzaa(iterable);
                return this;
            }

            public zzb zzE() {
                zzbg();
                ((zza) this.zza).zzab();
                return this;
            }

            public zzb zzF(int i) {
                zzbg();
                ((zza) this.zza).zzac(i);
                return this;
            }

            public boolean zzG() {
                return ((zza) this.zza).zzG();
            }

            public zzk zzH() {
                return ((zza) this.zza).zzH();
            }

            public zzb zzI(zzk zzkVar) {
                zzbg();
                ((zza) this.zza).zzad(zzkVar);
                return this;
            }

            public zzb zzJ(zzk.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzad((zzk) zzaVar.zzbu());
                return this;
            }

            public zzb zzK(zzk zzkVar) {
                zzbg();
                ((zza) this.zza).zzag(zzkVar);
                return this;
            }

            public zzb zzL() {
                zzbg();
                ((zza) this.zza).zzah();
                return this;
            }

            public boolean zzM() {
                return ((zza) this.zza).zzM();
            }

            public zzah zzN() {
                return ((zza) this.zza).zzN();
            }

            public zzb zzO(zzah zzahVar) {
                zzbg();
                ((zza) this.zza).zzai(zzahVar);
                return this;
            }

            public zzb zzP(zzah.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzai((zzah) zzaVar.zzbu());
                return this;
            }

            public zzb zzQ(zzah zzahVar) {
                zzbg();
                ((zza) this.zza).zzaj(zzahVar);
                return this;
            }

            public zzb zzR() {
                zzbg();
                ((zza) this.zza).zzan();
                return this;
            }

            public boolean zzS() {
                return ((zza) this.zza).zzS();
            }

            public zzac zzT() {
                return ((zza) this.zza).zzT();
            }

            public zzb zzU(zzac zzacVar) {
                zzbg();
                ((zza) this.zza).zzao(zzacVar);
                return this;
            }

            public zzb zzV(zzac.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzao((zzac) zzaVar.zzbu());
                return this;
            }

            public zzb zzW(zzac zzacVar) {
                zzbg();
                ((zza) this.zza).zzap(zzacVar);
                return this;
            }

            public zzb zzX() {
                zzbg();
                ((zza) this.zza).zzaq();
                return this;
            }

            public boolean zzY() {
                return ((zza) this.zza).zzY();
            }

            public zzx zzZ() {
                return ((zza) this.zza).zzZ();
            }

            public boolean zza() {
                return ((zza) this.zza).zza();
            }

            public zzb zzaa(zzx zzxVar) {
                zzbg();
                ((zza) this.zza).zzar(zzxVar);
                return this;
            }

            public zzb zzab(zzx.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzar((zzx) zzaVar.zzbu());
                return this;
            }

            public zzb zzac(zzx zzxVar) {
                zzbg();
                ((zza) this.zza).zzas(zzxVar);
                return this;
            }

            public zzb zzad() {
                zzbg();
                ((zza) this.zza).zzat();
                return this;
            }

            public boolean zzae() {
                return ((zza) this.zza).zzae();
            }

            public zzz zzaf() {
                return ((zza) this.zza).zzaf();
            }

            public zzb zzag(zzz zzzVar) {
                zzbg();
                ((zza) this.zza).zzau(zzzVar);
                return this;
            }

            public zzb zzah(zzz.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzau((zzz) zzaVar.zzbu());
                return this;
            }

            public zzb zzai(zzz zzzVar) {
                zzbg();
                ((zza) this.zza).zzav(zzzVar);
                return this;
            }

            public zzb zzaj() {
                zzbg();
                ((zza) this.zza).zzaw();
                return this;
            }

            public List zzak() {
                return Collections.unmodifiableList(((zza) this.zza).zzak());
            }

            public int zzal() {
                return ((zza) this.zza).zzal();
            }

            public zzat zzam(int i) {
                return ((zza) this.zza).zzam(i);
            }

            public zzb zzan(int i, zzat zzatVar) {
                zzbg();
                ((zza) this.zza).zzax(i, zzatVar);
                return this;
            }

            public zzb zzao(int i, zzat.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzax(i, (zzat) zzaVar.zzbu());
                return this;
            }

            public zzb zzap(zzat zzatVar) {
                zzbg();
                ((zza) this.zza).zzay(zzatVar);
                return this;
            }

            public zzb zzaq(int i, zzat zzatVar) {
                zzbg();
                ((zza) this.zza).zzaz(i, zzatVar);
                return this;
            }

            public zzb zzar(zzat.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzay((zzat) zzaVar.zzbu());
                return this;
            }

            public zzb zzas(int i, zzat.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzaz(i, (zzat) zzaVar.zzbu());
                return this;
            }

            public zzb zzat(Iterable iterable) {
                zzbg();
                ((zza) this.zza).zzaA(iterable);
                return this;
            }

            public zzb zzau() {
                zzbg();
                ((zza) this.zza).zzaB();
                return this;
            }

            public zzb zzav(int i) {
                zzbg();
                ((zza) this.zza).zzaC(i);
                return this;
            }

            public zza zzb() {
                return ((zza) this.zza).zzb();
            }

            public zzb zzc(zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzF(zzaVar);
                return this;
            }

            public zzb zzd() {
                zzbg();
                ((zza) this.zza).zzI();
                return this;
            }

            public boolean zze() {
                return ((zza) this.zza).zze();
            }

            public zzq zzf() {
                return ((zza) this.zza).zzf();
            }

            public zzb zzg(zzq zzqVar) {
                zzbg();
                ((zza) this.zza).zzJ(zzqVar);
                return this;
            }

            public zzb zzh() {
                zzbg();
                ((zza) this.zza).zzK();
                return this;
            }

            public boolean zzi() {
                return ((zza) this.zza).zzi();
            }

            public zzg zzj() {
                return ((zza) this.zza).zzj();
            }

            public zzb zzk(zzg zzgVar) {
                zzbg();
                ((zza) this.zza).zzL(zzgVar);
                return this;
            }

            public zzb zzl(zzg.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzL((zzg) zzaVar.zzbu());
                return this;
            }

            public zzb zzm(zzg zzgVar) {
                zzbg();
                ((zza) this.zza).zzO(zzgVar);
                return this;
            }

            public zzb zzn() {
                zzbg();
                ((zza) this.zza).zzP();
                return this;
            }

            public boolean zzo() {
                return ((zza) this.zza).zzo();
            }

            public zzi zzp() {
                return ((zza) this.zza).zzp();
            }

            public zzb zzq(zzi zziVar) {
                zzbg();
                ((zza) this.zza).zzQ(zziVar);
                return this;
            }

            public zzb zzr(zzi.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzQ((zzi) zzaVar.zzbu());
                return this;
            }

            public zzb zzs(zzi zziVar) {
                zzbg();
                ((zza) this.zza).zzR(zziVar);
                return this;
            }

            public zzb zzt() {
                zzbg();
                ((zza) this.zza).zzU();
                return this;
            }

            public List zzu() {
                return Collections.unmodifiableList(((zza) this.zza).zzu());
            }

            public int zzv() {
                return ((zza) this.zza).zzv();
            }

            public zzd zzw(int i) {
                return ((zza) this.zza).zzw(i);
            }

            public zzb zzx(int i, zzd zzdVar) {
                zzbg();
                ((zza) this.zza).zzV(i, zzdVar);
                return this;
            }

            public zzb zzy(int i, zzd.zzb zzbVar) {
                zzbg();
                ((zza) this.zza).zzV(i, (zzd) zzbVar.zzbu());
                return this;
            }

            public zzb zzz(zzd zzdVar) {
                zzbg();
                ((zza) this.zza).zzW(zzdVar);
                return this;
            }

            private zzb() {
                super(zza.zzaD());
            }
        }

        static {
            zza zzaVar = new zza();
            zzB = zzaVar;
            zzibr.zzbu(zza.class, zzaVar);
        }

        private zza() {
        }

        public static zza zzA(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zza) zzibr.zzbZ(zzB, zziaqVar, zzibbVar);
        }

        public static zzb zzB() {
            return (zzb) zzB.zzbn();
        }

        public static zzb zzC(zza zzaVar) {
            return (zzb) zzB.zzbo(zzaVar);
        }

        public static zza zzD() {
            return zzB;
        }

        public static zzidk zzE() {
            return zzB.zzbd();
        }

        public static /* synthetic */ zza zzaD() {
            return zzB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzF(zza zzaVar) {
            this.zzm = zzaVar.zza();
            this.zzl |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzl &= -2;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
        public void zzJ(zzq zzqVar) {
            this.zzn = zzqVar.zza();
            this.zzl |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
        public void zzK() {
            this.zzl &= -3;
            this.zzn = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
        public void zzL(zzg zzgVar) {
            zzgVar.getClass();
            this.zzo = zzgVar;
            this.zzl |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
        public void zzO(zzg zzgVar) {
            zzgVar.getClass();
            zzg zzgVar2 = this.zzo;
            if (zzgVar2 != null && zzgVar2 != zzg.zzz()) {
                zzg.zza zzy = zzg.zzy(zzgVar2);
                zzy.zzbo(zzgVar);
                zzgVar = (zzg) zzy.zzbt();
            }
            this.zzo = zzgVar;
            this.zzl |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzo = null;
            this.zzl &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaL, reason: merged with bridge method [inline-methods] */
        public void zzQ(zzi zziVar) {
            zziVar.getClass();
            this.zzp = zziVar;
            this.zzl |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcA, reason: merged with bridge method [inline-methods] */
        public void zzav(zzz zzzVar) {
            zzzVar.getClass();
            zzz zzzVar2 = this.zzz;
            if (zzzVar2 != null && zzzVar2 != zzz.zzA()) {
                zzz.zza zzz = zzz.zzz(zzzVar2);
                zzz.zzbo(zzzVar);
                zzzVar = (zzz) zzz.zzbt();
            }
            this.zzz = zzzVar;
            this.zzl |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcB, reason: merged with bridge method [inline-methods] */
        public void zzaw() {
            this.zzz = null;
            this.zzl &= -257;
        }

        private void zzcC() {
            zzicd zzicdVar = this.zzA;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzA = zzibr.zzbN(zzicdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcD, reason: merged with bridge method [inline-methods] */
        public void zzax(int i, zzat zzatVar) {
            zzatVar.getClass();
            zzcC();
            this.zzA.set(i, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcE, reason: merged with bridge method [inline-methods] */
        public void zzay(zzat zzatVar) {
            zzatVar.getClass();
            zzcC();
            this.zzA.add(zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcF, reason: merged with bridge method [inline-methods] */
        public void zzaz(int i, zzat zzatVar) {
            zzatVar.getClass();
            zzcC();
            this.zzA.add(i, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcG, reason: merged with bridge method [inline-methods] */
        public void zzaA(Iterable iterable) {
            zzcC();
            zzhzw.zzaW(iterable, this.zzA);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcH, reason: merged with bridge method [inline-methods] */
        public void zzaB() {
            this.zzA = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcI, reason: merged with bridge method [inline-methods] */
        public void zzaC(int i) {
            zzcC();
            this.zzA.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzce, reason: merged with bridge method [inline-methods] */
        public void zzR(zzi zziVar) {
            zziVar.getClass();
            zzi zziVar2 = this.zzp;
            if (zziVar2 != null && zziVar2 != zzi.zzD()) {
                zzi.zza zzC2 = zzi.zzC(zziVar2);
                zzC2.zzbo(zziVar);
                zziVar = (zzi) zzC2.zzbt();
            }
            this.zzp = zziVar;
            this.zzl |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcf, reason: merged with bridge method [inline-methods] */
        public void zzU() {
            this.zzp = null;
            this.zzl &= -9;
        }

        private void zzcg() {
            zzicd zzicdVar = this.zzu;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzu = zzibr.zzbN(zzicdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzch, reason: merged with bridge method [inline-methods] */
        public void zzV(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzcg();
            this.zzu.set(i, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzci, reason: merged with bridge method [inline-methods] */
        public void zzW(zzd zzdVar) {
            zzdVar.getClass();
            zzcg();
            this.zzu.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcj, reason: merged with bridge method [inline-methods] */
        public void zzX(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzcg();
            this.zzu.add(i, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzck, reason: merged with bridge method [inline-methods] */
        public void zzaa(Iterable iterable) {
            zzcg();
            zzhzw.zzaW(iterable, this.zzu);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcl, reason: merged with bridge method [inline-methods] */
        public void zzab() {
            this.zzu = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcm, reason: merged with bridge method [inline-methods] */
        public void zzac(int i) {
            zzcg();
            this.zzu.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcn, reason: merged with bridge method [inline-methods] */
        public void zzad(zzk zzkVar) {
            zzkVar.getClass();
            this.zzv = zzkVar;
            this.zzl |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzco, reason: merged with bridge method [inline-methods] */
        public void zzag(zzk zzkVar) {
            zzkVar.getClass();
            zzk zzkVar2 = this.zzv;
            if (zzkVar2 != null && zzkVar2 != zzk.zzB()) {
                zzk.zza zzA = zzk.zzA(zzkVar2);
                zzA.zzbo(zzkVar);
                zzkVar = (zzk) zzA.zzbt();
            }
            this.zzv = zzkVar;
            this.zzl |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcp, reason: merged with bridge method [inline-methods] */
        public void zzah() {
            this.zzv = null;
            this.zzl &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcq, reason: merged with bridge method [inline-methods] */
        public void zzai(zzah zzahVar) {
            zzahVar.getClass();
            this.zzw = zzahVar;
            this.zzl |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcr, reason: merged with bridge method [inline-methods] */
        public void zzaj(zzah zzahVar) {
            zzahVar.getClass();
            zzah zzahVar2 = this.zzw;
            if (zzahVar2 != null && zzahVar2 != zzah.zzE()) {
                zzah.zza zzB2 = zzah.zzB(zzahVar2);
                zzB2.zzbo(zzahVar);
                zzahVar = (zzah) zzB2.zzbt();
            }
            this.zzw = zzahVar;
            this.zzl |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcs, reason: merged with bridge method [inline-methods] */
        public void zzan() {
            this.zzw = null;
            this.zzl &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzct, reason: merged with bridge method [inline-methods] */
        public void zzao(zzac zzacVar) {
            zzacVar.getClass();
            this.zzx = zzacVar;
            this.zzl |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcu, reason: merged with bridge method [inline-methods] */
        public void zzap(zzac zzacVar) {
            zzacVar.getClass();
            zzac zzacVar2 = this.zzx;
            if (zzacVar2 != null && zzacVar2 != zzac.zzs()) {
                zzac.zza zzr = zzac.zzr(zzacVar2);
                zzr.zzbo(zzacVar);
                zzacVar = (zzac) zzr.zzbt();
            }
            this.zzx = zzacVar;
            this.zzl |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcv, reason: merged with bridge method [inline-methods] */
        public void zzaq() {
            this.zzx = null;
            this.zzl &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcw, reason: merged with bridge method [inline-methods] */
        public void zzar(zzx zzxVar) {
            zzxVar.getClass();
            this.zzy = zzxVar;
            this.zzl |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcx, reason: merged with bridge method [inline-methods] */
        public void zzas(zzx zzxVar) {
            zzxVar.getClass();
            zzx zzxVar2 = this.zzy;
            if (zzxVar2 != null && zzxVar2 != zzx.zzt()) {
                zzx.zza zzs = zzx.zzs(zzxVar2);
                zzs.zzbo(zzxVar);
                zzxVar = (zzx) zzs.zzbt();
            }
            this.zzy = zzxVar;
            this.zzl |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcy, reason: merged with bridge method [inline-methods] */
        public void zzat() {
            this.zzy = null;
            this.zzl &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcz, reason: merged with bridge method [inline-methods] */
        public void zzau(zzz zzzVar) {
            zzzVar.getClass();
            this.zzz = zzzVar;
            this.zzl |= 256;
        }

        public static zza zzk(ByteBuffer byteBuffer) throws zzicg {
            return (zza) zzibr.zzbR(zzB, byteBuffer);
        }

        public static zza zzl(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zza) zzibr.zzbQ(zzB, byteBuffer, zzibbVar);
        }

        public static zza zzm(zzian zzianVar) throws zzicg {
            return (zza) zzibr.zzbS(zzB, zzianVar);
        }

        public static zza zzn(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zza) zzibr.zzbT(zzB, zzianVar, zzibbVar);
        }

        public static zza zzq(byte[] bArr) throws zzicg {
            return (zza) zzibr.zzbU(zzB, bArr);
        }

        public static zza zzr(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zza) zzibr.zzbV(zzB, bArr, zzibbVar);
        }

        public static zza zzs(InputStream inputStream) throws IOException {
            return (zza) zzibr.zzbW(zzB, inputStream);
        }

        public static zza zzt(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zza) zzibr.zzbX(zzB, inputStream, zzibbVar);
        }

        public static zza zzx(InputStream inputStream) throws IOException {
            return (zza) zzibr.zzca(zzB, inputStream);
        }

        public static zza zzy(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zza) zzibr.zzcb(zzB, inputStream, zzibbVar);
        }

        public static zza zzz(zziaq zziaqVar) throws IOException {
            return (zza) zzibr.zzbY(zzB, zziaqVar);
        }

        public boolean zzG() {
            return (this.zzl & 16) != 0;
        }

        public zzk zzH() {
            zzk zzkVar = this.zzv;
            return zzkVar == null ? zzk.zzB() : zzkVar;
        }

        public boolean zzM() {
            return (this.zzl & 32) != 0;
        }

        public zzah zzN() {
            zzah zzahVar = this.zzw;
            return zzahVar == null ? zzah.zzE() : zzahVar;
        }

        public boolean zzS() {
            return (this.zzl & 64) != 0;
        }

        public zzac zzT() {
            zzac zzacVar = this.zzx;
            return zzacVar == null ? zzac.zzs() : zzacVar;
        }

        public boolean zzY() {
            return (this.zzl & 128) != 0;
        }

        public zzx zzZ() {
            zzx zzxVar = this.zzy;
            return zzxVar == null ? zzx.zzt() : zzxVar;
        }

        public boolean zza() {
            return (this.zzl & 1) != 0;
        }

        public boolean zzae() {
            return (this.zzl & 256) != 0;
        }

        public zzz zzaf() {
            zzz zzzVar = this.zzz;
            return zzzVar == null ? zzz.zzA() : zzzVar;
        }

        public List zzak() {
            return this.zzA;
        }

        public int zzal() {
            return this.zzA.size();
        }

        public zzat zzam(int i) {
            return (zzat) this.zzA.get(i);
        }

        public zza zzb() {
            zza zzc2 = zza.zzc(this.zzm);
            return zzc2 == null ? zza.AD_INITIATER_UNSPECIFIED : zzc2;
        }

        public List zzc() {
            return this.zzu;
        }

        public zze zzd(int i) {
            return (zze) this.zzu.get(i);
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", zza.zze(), "zzn", zzq.zze(), "zzo", "zzp", "zzu", zzd.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzat.class});
            }
            if (ordinal == 3) {
                return new zza();
            }
            if (ordinal == 4) {
                return new zzb(null);
            }
            if (ordinal == 5) {
                return zzB;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzC;
            if (zzidkVar == null) {
                synchronized (zza.class) {
                    try {
                        zzidkVar = zzC;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzB);
                            zzC = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzl & 2) != 0;
        }

        public zzq zzf() {
            zzq zzc2 = zzq.zzc(this.zzn);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public List zzg() {
            return this.zzA;
        }

        public zzbi zzh(int i) {
            return (zzbi) this.zzA.get(i);
        }

        public boolean zzi() {
            return (this.zzl & 4) != 0;
        }

        public zzg zzj() {
            zzg zzgVar = this.zzo;
            return zzgVar == null ? zzg.zzz() : zzgVar;
        }

        public boolean zzo() {
            return (this.zzl & 8) != 0;
        }

        public zzi zzp() {
            zzi zziVar = this.zzp;
            return zziVar == null ? zzi.zzD() : zziVar;
        }

        public List zzu() {
            return this.zzu;
        }

        public int zzv() {
            return this.zzu.size();
        }

        public zzd zzw(int i) {
            return (zzd) this.zzu.get(i);
        }
    }

    public interface zzaa extends zzidd {
        boolean zza();

        zzv zzb();

        List zzg();

        int zzh();

        zzan zzi(int i);

        boolean zzs();

        zzq zzt();

        boolean zzw();

        zzap zzx();
    }

    public final class zzab extends zzibr implements zzae {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzab zzf;
        private static volatile zzidk zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public final class zza extends zzibl implements zzae {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzab) this.zza).zza();
            }

            public zzc zzb() {
                return ((zzab) this.zza).zzb();
            }

            public zza zzc(zzc zzcVar) {
                zzbg();
                ((zzab) this.zza).zzu(zzcVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzab) this.zza).zzv();
                return this;
            }

            public boolean zze() {
                return ((zzab) this.zza).zze();
            }

            public zzb zzf() {
                return ((zzab) this.zza).zzf();
            }

            public zza zzg(zzb zzbVar) {
                zzbg();
                ((zzab) this.zza).zzw(zzbVar);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzab) this.zza).zzx();
                return this;
            }

            private zza() {
                super(zzab.zzy());
            }
        }

        public enum zzb implements zzibv {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);

            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 4;
            private static final zzibw zzi = new 1();
            private final int zzj;

            public class 1 implements zzibw {
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i) {
                    return zzb.zzc(i);
                }
            }

            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                public boolean zza(int i) {
                    return zzb.zzc(i) != null;
                }
            }

            zzb(int i) {
                this.zzj = i;
            }

            public static zzb zzc(int i) {
                if (i == 0) {
                    return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return TWO_G;
                }
                if (i == 2) {
                    return THREE_G;
                }
                if (i != 4) {
                    return null;
                }
                return LTE;
            }

            public static zzibw zzd() {
                return zzi;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            public final String toString() {
                return Integer.toString(this.zzj);
            }

            public final int zza() {
                return this.zzj;
            }
        }

        public enum zzc implements zzibv {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);

            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzibw zzg = new 1();
            private final int zzh;

            public class 1 implements zzibw {
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzc zzb(int i) {
                    return zzc.zzc(i);
                }
            }

            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                public boolean zza(int i) {
                    return zzc.zzc(i) != null;
                }
            }

            zzc(int i) {
                this.zzh = i;
            }

            public static zzc zzc(int i) {
                if (i == 0) {
                    return NETWORKTYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return CELL;
                }
                if (i != 2) {
                    return null;
                }
                return WIFI;
            }

            public static zzibw zzd() {
                return zzg;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            public final String toString() {
                return Integer.toString(this.zzh);
            }

            public final int zza() {
                return this.zzh;
            }
        }

        static {
            zzab zzabVar = new zzab();
            zzf = zzabVar;
            zzibr.zzbu(zzab.class, zzabVar);
        }

        private zzab() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(zzb zzbVar) {
            this.zze = zzbVar.zza();
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzab zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzab) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzab zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzab) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzab zzg(zzian zzianVar) throws zzicg {
            return (zzab) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzab zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzab) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzab zzi(byte[] bArr) throws zzicg {
            return (zzab) zzibr.zzbU(zzf, bArr);
        }

        public static zzab zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzab) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzab zzk(InputStream inputStream) throws IOException {
            return (zzab) zzibr.zzbW(zzf, inputStream);
        }

        public static zzab zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzab) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzab zzm(InputStream inputStream) throws IOException {
            return (zzab) zzibr.zzca(zzf, inputStream);
        }

        public static zzab zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzab) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzab zzo(zziaq zziaqVar) throws IOException {
            return (zzab) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzab zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzab) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzab zzabVar) {
            return (zza) zzf.zzbo(zzabVar);
        }

        public static zzab zzs() {
            return zzf;
        }

        public static zzidk zzt() {
            return zzf.zzbd();
        }

        public static /* synthetic */ zzab zzy() {
            return zzf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(zzc zzcVar) {
            this.zzd = zzcVar.zza();
            this.zzc |= 1;
        }

        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public zzc zzb() {
            zzc zzc2 = zzc.zzc(this.zzd);
            return zzc2 == null ? zzc.NETWORKTYPE_UNSPECIFIED : zzc2;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", zzc.zze(), "zze", zzb.zze()});
            }
            if (ordinal == 3) {
                return new zzab();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzf;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzg;
            if (zzidkVar == null) {
                synchronized (zzab.class) {
                    try {
                        zzidkVar = zzg;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzf);
                            zzg = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        public zzb zzf() {
            zzb zzc2 = zzb.zzc(this.zze);
            return zzc2 == null ? zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED : zzc2;
        }
    }

    public final class zzac extends zzibr implements zzad {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzac zzf;
        private static volatile zzidk zzg;
        private int zzc;
        private int zzd;
        private zzap zze;

        public final class zza extends zzibl implements zzad {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzac) this.zza).zza();
            }

            public zzq zzb() {
                return ((zzac) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzac) this.zza).zzu(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzac) this.zza).zzv();
                return this;
            }

            public boolean zze() {
                return ((zzac) this.zza).zze();
            }

            public zzap zzf() {
                return ((zzac) this.zza).zzf();
            }

            public zza zzg(zzap zzapVar) {
                zzbg();
                ((zzac) this.zza).zzw(zzapVar);
                return this;
            }

            public zza zzh(zzap.zza zzaVar) {
                zzbg();
                ((zzac) this.zza).zzw((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzap zzapVar) {
                zzbg();
                ((zzac) this.zza).zzx(zzapVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzac) this.zza).zzy();
                return this;
            }

            private zza() {
                super(zzac.zzz());
            }
        }

        static {
            zzac zzacVar = new zzac();
            zzf = zzacVar;
            zzibr.zzbu(zzac.class, zzacVar);
        }

        private zzac() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzu(zzq zzqVar) {
            this.zzd = zzqVar.zza();
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzw(zzap zzapVar) {
            zzapVar.getClass();
            this.zze = zzapVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzx(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zze;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zze = zzapVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzy() {
            this.zze = null;
            this.zzc &= -3;
        }

        public static zzac zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzac) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzac zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzac) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzac zzg(zzian zzianVar) throws zzicg {
            return (zzac) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzac zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzac) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzac zzi(byte[] bArr) throws zzicg {
            return (zzac) zzibr.zzbU(zzf, bArr);
        }

        public static zzac zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzac) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzac zzk(InputStream inputStream) throws IOException {
            return (zzac) zzibr.zzbW(zzf, inputStream);
        }

        public static zzac zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzac) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzac zzm(InputStream inputStream) throws IOException {
            return (zzac) zzibr.zzca(zzf, inputStream);
        }

        public static zzac zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzac) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzac zzo(zziaq zziaqVar) throws IOException {
            return (zzac) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzac zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzac) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzac zzacVar) {
            return (zza) zzf.zzbo(zzacVar);
        }

        public static zzac zzs() {
            return zzf;
        }

        public static zzidk zzt() {
            return zzf.zzbd();
        }

        public static /* synthetic */ zzac zzz() {
            return zzf;
        }

        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public zzq zzb() {
            zzq zzc = zzq.zzc(this.zzd);
            return zzc == null ? zzq.ENUM_FALSE : zzc;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zzq.zze(), "zze"});
            }
            if (ordinal == 3) {
                return new zzac();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzf;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzg;
            if (zzidkVar == null) {
                synchronized (zzac.class) {
                    try {
                        zzidkVar = zzg;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzf);
                            zzg = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        public zzap zzf() {
            zzap zzapVar = this.zze;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzad extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzap zzf();
    }

    public interface zzae extends zzidd {
        boolean zza();

        zzab.zzc zzb();

        boolean zze();

        zzab.zzb zzf();
    }

    public final class zzaf extends zzibr implements zzag {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzaf zzv;
        private static volatile zzidk zzw;
        private int zzi;
        private int zzk;
        private int zzl;
        private long zzm;
        private long zzp;
        private int zzu;
        private zzicd zzj = zzibr.zzbM();
        private String zzn = "";
        private String zzo = "";

        public final class zza extends zzibr implements zzb {
            private static final zza zzG;
            private static volatile zzidk zzH = null;
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            public static final int zzd = 4;
            public static final int zze = 5;
            public static final int zzf = 6;
            public static final int zzg = 7;
            public static final int zzh = 8;
            public static final int zzi = 9;
            public static final int zzj = 10;
            public static final int zzk = 11;
            public static final int zzl = 12;
            public static final int zzm = 13;
            private static final zzica zzx = new 1();
            private int zzA;
            private int zzB;
            private int zzC;
            private int zzD;
            private int zzE;
            private long zzF;
            private int zzn;
            private long zzo;
            private int zzp;
            private long zzu;
            private long zzv;
            private zzibz zzw = zzibr.zzbC();
            private zzab zzy;
            private int zzz;

            public class 1 implements zzica {
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd.zza zzb(int i) {
                    zzd.zza zzc = zzd.zza.zzc(i);
                    return zzc == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzc;
                }
            }

            public final class zza extends zzibl implements zzb {
                public /* synthetic */ zza(byte[] bArr) {
                    this();
                }

                public zza zzA(zzab.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzad((zzab) zzaVar.zzbu());
                    return this;
                }

                public zza zzB(zzab zzabVar) {
                    zzbg();
                    ((zza) this.zza).zzae(zzabVar);
                    return this;
                }

                public zza zzC() {
                    zzbg();
                    ((zza) this.zza).zzaf();
                    return this;
                }

                public boolean zzD() {
                    return ((zza) this.zza).zzD();
                }

                public zzq zzE() {
                    return ((zza) this.zza).zzE();
                }

                public zza zzF(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzag(zzqVar);
                    return this;
                }

                public zza zzG() {
                    zzbg();
                    ((zza) this.zza).zzah();
                    return this;
                }

                public boolean zzH() {
                    return ((zza) this.zza).zzH();
                }

                public zzq zzI() {
                    return ((zza) this.zza).zzI();
                }

                public zza zzJ(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzai(zzqVar);
                    return this;
                }

                public zza zzK() {
                    zzbg();
                    ((zza) this.zza).zzaj();
                    return this;
                }

                public boolean zzL() {
                    return ((zza) this.zza).zzL();
                }

                public zzq zzM() {
                    return ((zza) this.zza).zzM();
                }

                public zza zzN(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzak(zzqVar);
                    return this;
                }

                public zza zzO() {
                    zzbg();
                    ((zza) this.zza).zzal();
                    return this;
                }

                public boolean zzP() {
                    return ((zza) this.zza).zzP();
                }

                public int zzQ() {
                    return ((zza) this.zza).zzQ();
                }

                public zza zzR(int i) {
                    zzbg();
                    ((zza) this.zza).zzam(i);
                    return this;
                }

                public zza zzS() {
                    zzbg();
                    ((zza) this.zza).zzan();
                    return this;
                }

                public boolean zzT() {
                    return ((zza) this.zza).zzT();
                }

                public zzq zzU() {
                    return ((zza) this.zza).zzU();
                }

                public zza zzV(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzao(zzqVar);
                    return this;
                }

                public zza zzW() {
                    zzbg();
                    ((zza) this.zza).zzap();
                    return this;
                }

                public boolean zzX() {
                    return ((zza) this.zza).zzX();
                }

                public zzd zzY() {
                    return ((zza) this.zza).zzY();
                }

                public zza zzZ(zzd zzdVar) {
                    zzbg();
                    ((zza) this.zza).zzaq(zzdVar);
                    return this;
                }

                public boolean zza() {
                    return ((zza) this.zza).zza();
                }

                public zza zzaa() {
                    zzbg();
                    ((zza) this.zza).zzar();
                    return this;
                }

                public boolean zzab() {
                    return ((zza) this.zza).zzab();
                }

                public long zzac() {
                    return ((zza) this.zza).zzac();
                }

                public zza zzad(long j) {
                    zzbg();
                    ((zza) this.zza).zzas(j);
                    return this;
                }

                public zza zzae() {
                    zzbg();
                    ((zza) this.zza).zzat();
                    return this;
                }

                public long zzb() {
                    return ((zza) this.zza).zzb();
                }

                public zza zzc(long j) {
                    zzbg();
                    ((zza) this.zza).zzF(j);
                    return this;
                }

                public zza zzd() {
                    zzbg();
                    ((zza) this.zza).zzG();
                    return this;
                }

                public boolean zze() {
                    return ((zza) this.zza).zze();
                }

                public zzq zzf() {
                    return ((zza) this.zza).zzf();
                }

                public zza zzg(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzJ(zzqVar);
                    return this;
                }

                public zza zzh() {
                    zzbg();
                    ((zza) this.zza).zzK();
                    return this;
                }

                public boolean zzi() {
                    return ((zza) this.zza).zzi();
                }

                public long zzj() {
                    return ((zza) this.zza).zzj();
                }

                public zza zzk(long j) {
                    zzbg();
                    ((zza) this.zza).zzN(j);
                    return this;
                }

                public zza zzl() {
                    zzbg();
                    ((zza) this.zza).zzO();
                    return this;
                }

                public boolean zzm() {
                    return ((zza) this.zza).zzm();
                }

                public long zzn() {
                    return ((zza) this.zza).zzn();
                }

                public zza zzo(long j) {
                    zzbg();
                    ((zza) this.zza).zzR(j);
                    return this;
                }

                public zza zzp() {
                    zzbg();
                    ((zza) this.zza).zzS();
                    return this;
                }

                public List zzq() {
                    return ((zza) this.zza).zzq();
                }

                public int zzr() {
                    return ((zza) this.zza).zzr();
                }

                public zzd.zza zzs(int i) {
                    return ((zza) this.zza).zzs(i);
                }

                public zza zzt(int i, zzd.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzV(i, zzaVar);
                    return this;
                }

                public zza zzu(zzd.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzW(zzaVar);
                    return this;
                }

                public zza zzv(Iterable iterable) {
                    zzbg();
                    ((zza) this.zza).zzZ(iterable);
                    return this;
                }

                public zza zzw() {
                    zzbg();
                    ((zza) this.zza).zzaa();
                    return this;
                }

                public boolean zzx() {
                    return ((zza) this.zza).zzx();
                }

                public zzab zzy() {
                    return ((zza) this.zza).zzy();
                }

                public zza zzz(zzab zzabVar) {
                    zzbg();
                    ((zza) this.zza).zzad(zzabVar);
                    return this;
                }

                private zza() {
                    super(zza.zzau());
                }
            }

            static {
                zza zzaVar = new zza();
                zzG = zzaVar;
                zzibr.zzbu(zza.class, zzaVar);
            }

            private zza() {
            }

            public static zza zzA(zza zzaVar) {
                return (zza) zzG.zzbo(zzaVar);
            }

            public static zza zzB() {
                return zzG;
            }

            public static zzidk zzC() {
                return zzG.zzbd();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaA, reason: merged with bridge method [inline-methods] */
            public void zzO() {
                this.zzn &= -5;
                this.zzu = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaB, reason: merged with bridge method [inline-methods] */
            public void zzR(long j) {
                this.zzn |= 8;
                this.zzv = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaC, reason: merged with bridge method [inline-methods] */
            public void zzS() {
                this.zzn &= -9;
                this.zzv = 0L;
            }

            private void zzaD() {
                zzibz zzibzVar = this.zzw;
                if (zzibzVar.zza()) {
                    return;
                }
                this.zzw = zzibr.zzbD(zzibzVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
            public void zzV(int i, zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaD();
                this.zzw.zzg(i, zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
            public void zzW(zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaD();
                this.zzw.zzi(zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
            public void zzZ(Iterable iterable) {
                zzaD();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    this.zzw.zzi(((zzd.zza) it.next()).zza());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
            public void zzaa() {
                this.zzw = zzibr.zzbC();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
            public void zzad(zzab zzabVar) {
                zzabVar.getClass();
                this.zzy = zzabVar;
                this.zzn |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
            public void zzae(zzab zzabVar) {
                zzabVar.getClass();
                zzab zzabVar2 = this.zzy;
                if (zzabVar2 != null && zzabVar2 != zzab.zzs()) {
                    zzab.zza zzr = zzab.zzr(zzabVar2);
                    zzr.zzbo(zzabVar);
                    zzabVar = (zzab) zzr.zzbt();
                }
                this.zzy = zzabVar;
                this.zzn |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
            public void zzaf() {
                this.zzy = null;
                this.zzn &= -17;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaL, reason: merged with bridge method [inline-methods] */
            public void zzag(zzq zzqVar) {
                this.zzz = zzqVar.zza();
                this.zzn |= 32;
            }

            public static /* synthetic */ zza zzau() {
                return zzG;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzav, reason: merged with bridge method [inline-methods] */
            public void zzF(long j) {
                this.zzn |= 1;
                this.zzo = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaw, reason: merged with bridge method [inline-methods] */
            public void zzG() {
                this.zzn &= -2;
                this.zzo = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzax, reason: merged with bridge method [inline-methods] */
            public void zzJ(zzq zzqVar) {
                this.zzp = zzqVar.zza();
                this.zzn |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzay, reason: merged with bridge method [inline-methods] */
            public void zzK() {
                this.zzn &= -3;
                this.zzp = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzaz, reason: merged with bridge method [inline-methods] */
            public void zzN(long j) {
                this.zzn |= 4;
                this.zzu = j;
            }

            public static zza zzc(ByteBuffer byteBuffer) throws zzicg {
                return (zza) zzibr.zzbR(zzG, byteBuffer);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzce, reason: merged with bridge method [inline-methods] */
            public void zzah() {
                this.zzn &= -33;
                this.zzz = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzcf, reason: merged with bridge method [inline-methods] */
            public void zzai(zzq zzqVar) {
                this.zzA = zzqVar.zza();
                this.zzn |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzcg, reason: merged with bridge method [inline-methods] */
            public void zzaj() {
                this.zzn &= -65;
                this.zzA = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzch, reason: merged with bridge method [inline-methods] */
            public void zzak(zzq zzqVar) {
                this.zzB = zzqVar.zza();
                this.zzn |= 128;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzci, reason: merged with bridge method [inline-methods] */
            public void zzal() {
                this.zzn &= -129;
                this.zzB = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzcj, reason: merged with bridge method [inline-methods] */
            public void zzam(int i) {
                this.zzn |= 256;
                this.zzC = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzck, reason: merged with bridge method [inline-methods] */
            public void zzan() {
                this.zzn &= -257;
                this.zzC = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzcl, reason: merged with bridge method [inline-methods] */
            public void zzao(zzq zzqVar) {
                this.zzD = zzqVar.zza();
                this.zzn |= 512;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzcm, reason: merged with bridge method [inline-methods] */
            public void zzap() {
                this.zzn &= -513;
                this.zzD = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzcn, reason: merged with bridge method [inline-methods] */
            public void zzaq(zzd zzdVar) {
                this.zzE = zzdVar.zza();
                this.zzn |= 1024;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzco, reason: merged with bridge method [inline-methods] */
            public void zzar() {
                this.zzn &= -1025;
                this.zzE = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzcp, reason: merged with bridge method [inline-methods] */
            public void zzas(long j) {
                this.zzn |= 2048;
                this.zzF = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzcq, reason: merged with bridge method [inline-methods] */
            public void zzat() {
                this.zzn &= -2049;
                this.zzF = 0L;
            }

            public static zza zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
                return (zza) zzibr.zzbQ(zzG, byteBuffer, zzibbVar);
            }

            public static zza zzg(zzian zzianVar) throws zzicg {
                return (zza) zzibr.zzbS(zzG, zzianVar);
            }

            public static zza zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
                return (zza) zzibr.zzbT(zzG, zzianVar, zzibbVar);
            }

            public static zza zzk(byte[] bArr) throws zzicg {
                return (zza) zzibr.zzbU(zzG, bArr);
            }

            public static zza zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
                return (zza) zzibr.zzbV(zzG, bArr, zzibbVar);
            }

            public static zza zzo(InputStream inputStream) throws IOException {
                return (zza) zzibr.zzbW(zzG, inputStream);
            }

            public static zza zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zza) zzibr.zzbX(zzG, inputStream, zzibbVar);
            }

            public static zza zzt(InputStream inputStream) throws IOException {
                return (zza) zzibr.zzca(zzG, inputStream);
            }

            public static zza zzu(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zza) zzibr.zzcb(zzG, inputStream, zzibbVar);
            }

            public static zza zzv(zziaq zziaqVar) throws IOException {
                return (zza) zzibr.zzbY(zzG, zziaqVar);
            }

            public static zza zzw(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
                return (zza) zzibr.zzbZ(zzG, zziaqVar, zzibbVar);
            }

            public static zza zzz() {
                return (zza) zzG.zzbn();
            }

            public boolean zzD() {
                return (this.zzn & 32) != 0;
            }

            public zzq zzE() {
                zzq zzc2 = zzq.zzc(this.zzz);
                return zzc2 == null ? zzq.ENUM_FALSE : zzc2;
            }

            public boolean zzH() {
                return (this.zzn & 64) != 0;
            }

            public zzq zzI() {
                zzq zzc2 = zzq.zzc(this.zzA);
                return zzc2 == null ? zzq.ENUM_FALSE : zzc2;
            }

            public boolean zzL() {
                return (this.zzn & 128) != 0;
            }

            public zzq zzM() {
                zzq zzc2 = zzq.zzc(this.zzB);
                return zzc2 == null ? zzq.ENUM_FALSE : zzc2;
            }

            public boolean zzP() {
                return (this.zzn & 256) != 0;
            }

            public int zzQ() {
                return this.zzC;
            }

            public boolean zzT() {
                return (this.zzn & 512) != 0;
            }

            public zzq zzU() {
                zzq zzc2 = zzq.zzc(this.zzD);
                return zzc2 == null ? zzq.ENUM_FALSE : zzc2;
            }

            public boolean zzX() {
                return (this.zzn & 1024) != 0;
            }

            public zzd zzY() {
                zzd zzc2 = zzd.zzc(this.zzE);
                return zzc2 == null ? zzd.UNSPECIFIED : zzc2;
            }

            public boolean zza() {
                return (this.zzn & 1) != 0;
            }

            public boolean zzab() {
                return (this.zzn & 2048) != 0;
            }

            public long zzac() {
                return this.zzF;
            }

            public long zzb() {
                return this.zzo;
            }

            public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
                int ordinal = zzibqVar.ordinal();
                if (ordinal == 0) {
                    return (byte) 1;
                }
                if (ordinal == 2) {
                    return zzibr.zzbv(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", zzq.zze(), "zzu", "zzv", "zzw", zzd.zza.zze(), "zzy", "zzz", zzq.zze(), "zzA", zzq.zze(), "zzB", zzq.zze(), "zzC", "zzD", zzq.zze(), "zzE", zzd.zze(), "zzF"});
                }
                if (ordinal == 3) {
                    return new zza();
                }
                if (ordinal == 4) {
                    return new zza(null);
                }
                if (ordinal == 5) {
                    return zzG;
                }
                if (ordinal != 6) {
                    throw null;
                }
                zzidk zzidkVar = zzH;
                if (zzidkVar == null) {
                    synchronized (zza.class) {
                        try {
                            zzidkVar = zzH;
                            if (zzidkVar == null) {
                                zzidkVar = new zzibm(zzG);
                                zzH = zzidkVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzidkVar;
            }

            public boolean zze() {
                return (this.zzn & 2) != 0;
            }

            public zzq zzf() {
                zzq zzc2 = zzq.zzc(this.zzp);
                return zzc2 == null ? zzq.ENUM_FALSE : zzc2;
            }

            public boolean zzi() {
                return (this.zzn & 4) != 0;
            }

            public long zzj() {
                return this.zzu;
            }

            public boolean zzm() {
                return (this.zzn & 8) != 0;
            }

            public long zzn() {
                return this.zzv;
            }

            public List zzq() {
                return new zzicb(this.zzw, zzx);
            }

            public int zzr() {
                return this.zzw.size();
            }

            public zzd.zza zzs(int i) {
                zzd.zza zzc2 = zzd.zza.zzc(this.zzw.zzf(i));
                return zzc2 == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzc2;
            }

            public boolean zzx() {
                return (this.zzn & 16) != 0;
            }

            public zzab zzy() {
                zzab zzabVar = this.zzy;
                return zzabVar == null ? zzab.zzs() : zzabVar;
            }
        }

        public interface zzb extends zzidd {
            boolean zzD();

            zzq zzE();

            boolean zzH();

            zzq zzI();

            boolean zzL();

            zzq zzM();

            boolean zzP();

            int zzQ();

            boolean zzT();

            zzq zzU();

            boolean zzX();

            zzd zzY();

            boolean zza();

            boolean zzab();

            long zzac();

            long zzb();

            boolean zze();

            zzq zzf();

            boolean zzi();

            long zzj();

            boolean zzm();

            long zzn();

            List zzq();

            int zzr();

            zzd.zza zzs(int i);

            boolean zzx();

            zzab zzy();
        }

        public final class zzc extends zzibl implements zzag {
            public /* synthetic */ zzc(byte[] bArr) {
                this();
            }

            public zzian zzA() {
                return ((zzaf) this.zza).zzA();
            }

            public zzc zzB(String str) {
                zzbg();
                ((zzaf) this.zza).zzY(str);
                return this;
            }

            public zzc zzC() {
                zzbg();
                ((zzaf) this.zza).zzZ();
                return this;
            }

            public zzc zzD(zzian zzianVar) {
                zzbg();
                ((zzaf) this.zza).zzaa(zzianVar);
                return this;
            }

            public boolean zzE() {
                return ((zzaf) this.zza).zzE();
            }

            public String zzF() {
                return ((zzaf) this.zza).zzF();
            }

            public zzian zzG() {
                return ((zzaf) this.zza).zzG();
            }

            public zzc zzH(String str) {
                zzbg();
                ((zzaf) this.zza).zzab(str);
                return this;
            }

            public zzc zzI() {
                zzbg();
                ((zzaf) this.zza).zzac();
                return this;
            }

            public zzc zzJ(zzian zzianVar) {
                zzbg();
                ((zzaf) this.zza).zzad(zzianVar);
                return this;
            }

            public boolean zzK() {
                return ((zzaf) this.zza).zzK();
            }

            public long zzL() {
                return ((zzaf) this.zza).zzL();
            }

            public zzc zzM(long j) {
                zzbg();
                ((zzaf) this.zza).zzae(j);
                return this;
            }

            public zzc zzN() {
                zzbg();
                ((zzaf) this.zza).zzaf();
                return this;
            }

            public boolean zzO() {
                return ((zzaf) this.zza).zzO();
            }

            public int zzP() {
                return ((zzaf) this.zza).zzP();
            }

            public zzc zzQ(int i) {
                zzbg();
                ((zzaf) this.zza).zzag(i);
                return this;
            }

            public zzc zzR() {
                zzbg();
                ((zzaf) this.zza).zzah();
                return this;
            }

            public List zza() {
                return Collections.unmodifiableList(((zzaf) this.zza).zza());
            }

            public int zzb() {
                return ((zzaf) this.zza).zzb();
            }

            public zza zzc(int i) {
                return ((zzaf) this.zza).zzc(i);
            }

            public zzc zzd(int i, zza zzaVar) {
                zzbg();
                ((zzaf) this.zza).zzI(i, zzaVar);
                return this;
            }

            public zzc zze(int i, zza.zza zzaVar) {
                zzbg();
                ((zzaf) this.zza).zzI(i, (zza) zzaVar.zzbu());
                return this;
            }

            public zzc zzf(zza zzaVar) {
                zzbg();
                ((zzaf) this.zza).zzJ(zzaVar);
                return this;
            }

            public zzc zzg(int i, zza zzaVar) {
                zzbg();
                ((zzaf) this.zza).zzM(i, zzaVar);
                return this;
            }

            public zzc zzh(zza.zza zzaVar) {
                zzbg();
                ((zzaf) this.zza).zzJ((zza) zzaVar.zzbu());
                return this;
            }

            public zzc zzi(int i, zza.zza zzaVar) {
                zzbg();
                ((zzaf) this.zza).zzM(i, (zza) zzaVar.zzbu());
                return this;
            }

            public zzc zzj(Iterable iterable) {
                zzbg();
                ((zzaf) this.zza).zzN(iterable);
                return this;
            }

            public zzc zzk() {
                zzbg();
                ((zzaf) this.zza).zzQ();
                return this;
            }

            public zzc zzl(int i) {
                zzbg();
                ((zzaf) this.zza).zzR(i);
                return this;
            }

            public boolean zzm() {
                return ((zzaf) this.zza).zzm();
            }

            public int zzn() {
                return ((zzaf) this.zza).zzn();
            }

            public zzc zzo(int i) {
                zzbg();
                ((zzaf) this.zza).zzS(i);
                return this;
            }

            public zzc zzp() {
                zzbg();
                ((zzaf) this.zza).zzT();
                return this;
            }

            public boolean zzq() {
                return ((zzaf) this.zza).zzq();
            }

            public int zzr() {
                return ((zzaf) this.zza).zzr();
            }

            public zzc zzs(int i) {
                zzbg();
                ((zzaf) this.zza).zzU(i);
                return this;
            }

            public zzc zzt() {
                zzbg();
                ((zzaf) this.zza).zzV();
                return this;
            }

            public boolean zzu() {
                return ((zzaf) this.zza).zzu();
            }

            public long zzv() {
                return ((zzaf) this.zza).zzv();
            }

            public zzc zzw(long j) {
                zzbg();
                ((zzaf) this.zza).zzW(j);
                return this;
            }

            public zzc zzx() {
                zzbg();
                ((zzaf) this.zza).zzX();
                return this;
            }

            public boolean zzy() {
                return ((zzaf) this.zza).zzy();
            }

            public String zzz() {
                return ((zzaf) this.zza).zzz();
            }

            private zzc() {
                super(zzaf.zzai());
            }
        }

        public enum zzd implements zzibv {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);

            public static final int zzg = 0;
            public static final int zzh = 1;
            public static final int zzi = 2;
            public static final int zzj = 3;
            public static final int zzk = 4;
            public static final int zzl = 5;
            private static final zzibw zzm = new 1();
            private final int zzn;

            public class 1 implements zzibw {
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd zzb(int i) {
                    return zzd.zzc(i);
                }
            }

            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                public boolean zza(int i) {
                    return zzd.zzc(i) != null;
                }
            }

            zzd(int i) {
                this.zzn = i;
            }

            public static zzd zzc(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i == 1) {
                    return CONNECTING;
                }
                if (i == 2) {
                    return CONNECTED;
                }
                if (i == 3) {
                    return DISCONNECTING;
                }
                if (i == 4) {
                    return DISCONNECTED;
                }
                if (i != 5) {
                    return null;
                }
                return SUSPENDED;
            }

            public static zzibw zzd() {
                return zzm;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            public final String toString() {
                return Integer.toString(this.zzn);
            }

            public final int zza() {
                return this.zzn;
            }
        }

        static {
            zzaf zzafVar = new zzaf();
            zzv = zzafVar;
            zzibr.zzbu(zzaf.class, zzafVar);
        }

        private zzaf() {
        }

        public static zzc zzB() {
            return (zzc) zzv.zzbn();
        }

        public static zzc zzC(zzaf zzafVar) {
            return (zzc) zzv.zzbo(zzafVar);
        }

        public static zzaf zzD() {
            return zzv;
        }

        public static zzidk zzH() {
            return zzv.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaA, reason: merged with bridge method [inline-methods] */
        public void zzac() {
            this.zzi &= -17;
            this.zzo = zzD().zzF();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaB, reason: merged with bridge method [inline-methods] */
        public void zzad(zzian zzianVar) {
            this.zzo = zzianVar.zzz();
            this.zzi |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaC, reason: merged with bridge method [inline-methods] */
        public void zzae(long j) {
            this.zzi |= 32;
            this.zzp = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaD, reason: merged with bridge method [inline-methods] */
        public void zzaf() {
            this.zzi &= -33;
            this.zzp = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzag(int i) {
            this.zzi |= 64;
            this.zzu = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzah() {
            this.zzi &= -65;
            this.zzu = 0;
        }

        public static /* synthetic */ zzaf zzai() {
            return zzv;
        }

        private void zzaj() {
            zzicd zzicdVar = this.zzj;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzj = zzibr.zzbN(zzicdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzak, reason: merged with bridge method [inline-methods] */
        public void zzI(int i, zza zzaVar) {
            zzaVar.getClass();
            zzaj();
            this.zzj.set(i, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzal, reason: merged with bridge method [inline-methods] */
        public void zzJ(zza zzaVar) {
            zzaVar.getClass();
            zzaj();
            this.zzj.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzam, reason: merged with bridge method [inline-methods] */
        public void zzM(int i, zza zzaVar) {
            zzaVar.getClass();
            zzaj();
            this.zzj.add(i, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzan, reason: merged with bridge method [inline-methods] */
        public void zzN(Iterable iterable) {
            zzaj();
            zzhzw.zzaW(iterable, this.zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzao, reason: merged with bridge method [inline-methods] */
        public void zzQ() {
            this.zzj = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzap, reason: merged with bridge method [inline-methods] */
        public void zzR(int i) {
            zzaj();
            this.zzj.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaq, reason: merged with bridge method [inline-methods] */
        public void zzS(int i) {
            this.zzi |= 1;
            this.zzk = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzar, reason: merged with bridge method [inline-methods] */
        public void zzT() {
            this.zzi &= -2;
            this.zzk = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzU(int i) {
            this.zzi |= 2;
            this.zzl = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzat, reason: merged with bridge method [inline-methods] */
        public void zzV() {
            this.zzi &= -3;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzau, reason: merged with bridge method [inline-methods] */
        public void zzW(long j) {
            this.zzi |= 4;
            this.zzm = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzav, reason: merged with bridge method [inline-methods] */
        public void zzX() {
            this.zzi &= -5;
            this.zzm = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaw, reason: merged with bridge method [inline-methods] */
        public void zzY(String str) {
            str.getClass();
            this.zzi |= 8;
            this.zzn = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzax, reason: merged with bridge method [inline-methods] */
        public void zzZ() {
            this.zzi &= -9;
            this.zzn = zzD().zzz();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzay, reason: merged with bridge method [inline-methods] */
        public void zzaa(zzian zzianVar) {
            this.zzn = zzianVar.zzz();
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaz, reason: merged with bridge method [inline-methods] */
        public void zzab(String str) {
            str.getClass();
            this.zzi |= 16;
            this.zzo = str;
        }

        public static zzaf zzg(ByteBuffer byteBuffer) throws zzicg {
            return (zzaf) zzibr.zzbR(zzv, byteBuffer);
        }

        public static zzaf zzh(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzaf) zzibr.zzbQ(zzv, byteBuffer, zzibbVar);
        }

        public static zzaf zzi(zzian zzianVar) throws zzicg {
            return (zzaf) zzibr.zzbS(zzv, zzianVar);
        }

        public static zzaf zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzaf) zzibr.zzbT(zzv, zzianVar, zzibbVar);
        }

        public static zzaf zzk(byte[] bArr) throws zzicg {
            return (zzaf) zzibr.zzbU(zzv, bArr);
        }

        public static zzaf zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzaf) zzibr.zzbV(zzv, bArr, zzibbVar);
        }

        public static zzaf zzo(InputStream inputStream) throws IOException {
            return (zzaf) zzibr.zzbW(zzv, inputStream);
        }

        public static zzaf zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzaf) zzibr.zzbX(zzv, inputStream, zzibbVar);
        }

        public static zzaf zzs(InputStream inputStream) throws IOException {
            return (zzaf) zzibr.zzca(zzv, inputStream);
        }

        public static zzaf zzt(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzaf) zzibr.zzcb(zzv, inputStream, zzibbVar);
        }

        public static zzaf zzw(zziaq zziaqVar) throws IOException {
            return (zzaf) zzibr.zzbY(zzv, zziaqVar);
        }

        public static zzaf zzx(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzaf) zzibr.zzbZ(zzv, zziaqVar, zzibbVar);
        }

        public zzian zzA() {
            return zzian.zzv(this.zzn);
        }

        public boolean zzE() {
            return (this.zzi & 16) != 0;
        }

        public String zzF() {
            return this.zzo;
        }

        public zzian zzG() {
            return zzian.zzv(this.zzo);
        }

        public boolean zzK() {
            return (this.zzi & 32) != 0;
        }

        public long zzL() {
            return this.zzp;
        }

        public boolean zzO() {
            return (this.zzi & 64) != 0;
        }

        public int zzP() {
            return this.zzu;
        }

        public List zza() {
            return this.zzj;
        }

        public int zzb() {
            return this.zzj.size();
        }

        public zza zzc(int i) {
            return (zza) this.zzj.get(i);
        }

        public List zzd() {
            return this.zzj;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", zza.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
            }
            if (ordinal == 3) {
                return new zzaf();
            }
            if (ordinal == 4) {
                return new zzc(null);
            }
            if (ordinal == 5) {
                return zzv;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzw;
            if (zzidkVar == null) {
                synchronized (zzaf.class) {
                    try {
                        zzidkVar = zzw;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzv);
                            zzw = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public zzb zze(int i) {
            return (zzb) this.zzj.get(i);
        }

        public boolean zzm() {
            return (this.zzi & 1) != 0;
        }

        public int zzn() {
            return this.zzk;
        }

        public boolean zzq() {
            return (this.zzi & 2) != 0;
        }

        public int zzr() {
            return this.zzl;
        }

        public boolean zzu() {
            return (this.zzi & 4) != 0;
        }

        public long zzv() {
            return this.zzm;
        }

        public boolean zzy() {
            return (this.zzi & 8) != 0;
        }

        public String zzz() {
            return this.zzn;
        }
    }

    public interface zzag extends zzidd {
        zzian zzA();

        boolean zzE();

        String zzF();

        zzian zzG();

        boolean zzK();

        long zzL();

        boolean zzO();

        int zzP();

        List zza();

        int zzb();

        zzaf.zza zzc(int i);

        boolean zzm();

        int zzn();

        boolean zzq();

        int zzr();

        boolean zzu();

        long zzv();

        boolean zzy();

        String zzz();
    }

    public final class zzah extends zzibr implements zzak {
        private static final zzah zzB;
        private static volatile zzidk zzC = null;
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        public static final int zzi = 9;
        public static final int zzj = 10;
        public static final int zzk = 11;
        private zzai zzA;
        private int zzl;
        private int zzm = 1000;
        private int zzn = 1000;
        private int zzo;
        private int zzp;
        private int zzu;
        private int zzv;
        private int zzw;
        private int zzx;
        private int zzy;
        private int zzz;

        public final class zza extends zzibl implements zzak {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public zza zzA(int i) {
                zzbg();
                ((zzah) this.zza).zzY(i);
                return this;
            }

            public zza zzB() {
                zzbg();
                ((zzah) this.zza).zzZ();
                return this;
            }

            public boolean zzC() {
                return ((zzah) this.zza).zzC();
            }

            public int zzD() {
                return ((zzah) this.zza).zzD();
            }

            public zza zzE(int i) {
                zzbg();
                ((zzah) this.zza).zzaa(i);
                return this;
            }

            public zza zzF() {
                zzbg();
                ((zzah) this.zza).zzab();
                return this;
            }

            public boolean zzG() {
                return ((zzah) this.zza).zzG();
            }

            public int zzH() {
                return ((zzah) this.zza).zzH();
            }

            public zza zzI(int i) {
                zzbg();
                ((zzah) this.zza).zzac(i);
                return this;
            }

            public zza zzJ() {
                zzbg();
                ((zzah) this.zza).zzad();
                return this;
            }

            public boolean zzK() {
                return ((zzah) this.zza).zzK();
            }

            public int zzL() {
                return ((zzah) this.zza).zzL();
            }

            public zza zzM(int i) {
                zzbg();
                ((zzah) this.zza).zzae(i);
                return this;
            }

            public zza zzN() {
                zzbg();
                ((zzah) this.zza).zzaf();
                return this;
            }

            public boolean zzO() {
                return ((zzah) this.zza).zzO();
            }

            public zzai zzP() {
                return ((zzah) this.zza).zzP();
            }

            public zza zzQ(zzai zzaiVar) {
                zzbg();
                ((zzah) this.zza).zzag(zzaiVar);
                return this;
            }

            public zza zzR(zzai.zza zzaVar) {
                zzbg();
                ((zzah) this.zza).zzag((zzai) zzaVar.zzbu());
                return this;
            }

            public zza zzS(zzai zzaiVar) {
                zzbg();
                ((zzah) this.zza).zzah(zzaiVar);
                return this;
            }

            public zza zzT() {
                zzbg();
                ((zzah) this.zza).zzai();
                return this;
            }

            public boolean zza() {
                return ((zzah) this.zza).zza();
            }

            public zzq zzb() {
                return ((zzah) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzah) this.zza).zzI(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzah) this.zza).zzJ();
                return this;
            }

            public boolean zze() {
                return ((zzah) this.zza).zze();
            }

            public zzq zzf() {
                return ((zzah) this.zza).zzf();
            }

            public zza zzg(zzq zzqVar) {
                zzbg();
                ((zzah) this.zza).zzM(zzqVar);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzah) this.zza).zzN();
                return this;
            }

            public boolean zzi() {
                return ((zzah) this.zza).zzi();
            }

            public int zzj() {
                return ((zzah) this.zza).zzj();
            }

            public zza zzk(int i) {
                zzbg();
                ((zzah) this.zza).zzQ(i);
                return this;
            }

            public zza zzl() {
                zzbg();
                ((zzah) this.zza).zzR();
                return this;
            }

            public boolean zzm() {
                return ((zzah) this.zza).zzm();
            }

            public int zzn() {
                return ((zzah) this.zza).zzn();
            }

            public zza zzo(int i) {
                zzbg();
                ((zzah) this.zza).zzS(i);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzah) this.zza).zzT();
                return this;
            }

            public boolean zzq() {
                return ((zzah) this.zza).zzq();
            }

            public int zzr() {
                return ((zzah) this.zza).zzr();
            }

            public zza zzs(int i) {
                zzbg();
                ((zzah) this.zza).zzU(i);
                return this;
            }

            public zza zzt() {
                zzbg();
                ((zzah) this.zza).zzV();
                return this;
            }

            public boolean zzu() {
                return ((zzah) this.zza).zzu();
            }

            public int zzv() {
                return ((zzah) this.zza).zzv();
            }

            public zza zzw(int i) {
                zzbg();
                ((zzah) this.zza).zzW(i);
                return this;
            }

            public zza zzx() {
                zzbg();
                ((zzah) this.zza).zzX();
                return this;
            }

            public boolean zzy() {
                return ((zzah) this.zza).zzy();
            }

            public int zzz() {
                return ((zzah) this.zza).zzz();
            }

            private zza() {
                super(zzah.zzaj());
            }
        }

        static {
            zzah zzahVar = new zzah();
            zzB = zzahVar;
            zzibr.zzbu(zzah.class, zzahVar);
        }

        private zzah() {
        }

        public static zza zzA() {
            return (zza) zzB.zzbn();
        }

        public static zza zzB(zzah zzahVar) {
            return (zza) zzB.zzbo(zzahVar);
        }

        public static zzah zzE() {
            return zzB;
        }

        public static zzidk zzF() {
            return zzB.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaA, reason: merged with bridge method [inline-methods] */
        public void zzac(int i) {
            this.zzl |= 256;
            this.zzy = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaB, reason: merged with bridge method [inline-methods] */
        public void zzad() {
            this.zzl &= -257;
            this.zzy = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaC, reason: merged with bridge method [inline-methods] */
        public void zzae(int i) {
            this.zzl |= 512;
            this.zzz = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaD, reason: merged with bridge method [inline-methods] */
        public void zzaf() {
            this.zzl &= -513;
            this.zzz = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzag(zzai zzaiVar) {
            zzaiVar.getClass();
            this.zzA = zzaiVar;
            this.zzl |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzah(zzai zzaiVar) {
            zzaiVar.getClass();
            zzai zzaiVar2 = this.zzA;
            if (zzaiVar2 != null && zzaiVar2 != zzai.zzs()) {
                zzai.zza zzr = zzai.zzr(zzaiVar2);
                zzr.zzbo(zzaiVar);
                zzaiVar = (zzai) zzr.zzbt();
            }
            this.zzA = zzaiVar;
            this.zzl |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
        public void zzai() {
            this.zzA = null;
            this.zzl &= -1025;
        }

        public static /* synthetic */ zzah zzaj() {
            return zzB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzak, reason: merged with bridge method [inline-methods] */
        public void zzI(zzq zzqVar) {
            this.zzm = zzqVar.zza();
            this.zzl |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzal, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzl &= -2;
            this.zzm = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzam, reason: merged with bridge method [inline-methods] */
        public void zzM(zzq zzqVar) {
            this.zzn = zzqVar.zza();
            this.zzl |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzan, reason: merged with bridge method [inline-methods] */
        public void zzN() {
            this.zzl &= -3;
            this.zzn = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzao, reason: merged with bridge method [inline-methods] */
        public void zzQ(int i) {
            this.zzl |= 4;
            this.zzo = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzap, reason: merged with bridge method [inline-methods] */
        public void zzR() {
            this.zzl &= -5;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaq, reason: merged with bridge method [inline-methods] */
        public void zzS(int i) {
            this.zzl |= 8;
            this.zzp = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzar, reason: merged with bridge method [inline-methods] */
        public void zzT() {
            this.zzl &= -9;
            this.zzp = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzU(int i) {
            this.zzl |= 16;
            this.zzu = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzat, reason: merged with bridge method [inline-methods] */
        public void zzV() {
            this.zzl &= -17;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzau, reason: merged with bridge method [inline-methods] */
        public void zzW(int i) {
            this.zzl |= 32;
            this.zzv = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzav, reason: merged with bridge method [inline-methods] */
        public void zzX() {
            this.zzl &= -33;
            this.zzv = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaw, reason: merged with bridge method [inline-methods] */
        public void zzY(int i) {
            this.zzl |= 64;
            this.zzw = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzax, reason: merged with bridge method [inline-methods] */
        public void zzZ() {
            this.zzl &= -65;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzay, reason: merged with bridge method [inline-methods] */
        public void zzaa(int i) {
            this.zzl |= 128;
            this.zzx = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaz, reason: merged with bridge method [inline-methods] */
        public void zzab() {
            this.zzl &= -129;
            this.zzx = 0;
        }

        public static zzah zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzah) zzibr.zzbR(zzB, byteBuffer);
        }

        public static zzah zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzah) zzibr.zzbQ(zzB, byteBuffer, zzibbVar);
        }

        public static zzah zzg(zzian zzianVar) throws zzicg {
            return (zzah) zzibr.zzbS(zzB, zzianVar);
        }

        public static zzah zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzah) zzibr.zzbT(zzB, zzianVar, zzibbVar);
        }

        public static zzah zzk(byte[] bArr) throws zzicg {
            return (zzah) zzibr.zzbU(zzB, bArr);
        }

        public static zzah zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzah) zzibr.zzbV(zzB, bArr, zzibbVar);
        }

        public static zzah zzo(InputStream inputStream) throws IOException {
            return (zzah) zzibr.zzbW(zzB, inputStream);
        }

        public static zzah zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzah) zzibr.zzbX(zzB, inputStream, zzibbVar);
        }

        public static zzah zzs(InputStream inputStream) throws IOException {
            return (zzah) zzibr.zzca(zzB, inputStream);
        }

        public static zzah zzt(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzah) zzibr.zzcb(zzB, inputStream, zzibbVar);
        }

        public static zzah zzw(zziaq zziaqVar) throws IOException {
            return (zzah) zzibr.zzbY(zzB, zziaqVar);
        }

        public static zzah zzx(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzah) zzibr.zzbZ(zzB, zziaqVar, zzibbVar);
        }

        public boolean zzC() {
            return (this.zzl & 128) != 0;
        }

        public int zzD() {
            return this.zzx;
        }

        public boolean zzG() {
            return (this.zzl & 256) != 0;
        }

        public int zzH() {
            return this.zzy;
        }

        public boolean zzK() {
            return (this.zzl & 512) != 0;
        }

        public int zzL() {
            return this.zzz;
        }

        public boolean zzO() {
            return (this.zzl & 1024) != 0;
        }

        public zzai zzP() {
            zzai zzaiVar = this.zzA;
            return zzaiVar == null ? zzai.zzs() : zzaiVar;
        }

        public boolean zza() {
            return (this.zzl & 1) != 0;
        }

        public zzq zzb() {
            zzq zzc2 = zzq.zzc(this.zzm);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzB, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzl", "zzm", zzq.zze(), "zzn", zzq.zze(), "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA"});
            }
            if (ordinal == 3) {
                return new zzah();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzB;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzC;
            if (zzidkVar == null) {
                synchronized (zzah.class) {
                    try {
                        zzidkVar = zzC;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzB);
                            zzC = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzl & 2) != 0;
        }

        public zzq zzf() {
            zzq zzc2 = zzq.zzc(this.zzn);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public boolean zzi() {
            return (this.zzl & 4) != 0;
        }

        public int zzj() {
            return this.zzo;
        }

        public boolean zzm() {
            return (this.zzl & 8) != 0;
        }

        public int zzn() {
            return this.zzp;
        }

        public boolean zzq() {
            return (this.zzl & 16) != 0;
        }

        public int zzr() {
            return this.zzu;
        }

        public boolean zzu() {
            return (this.zzl & 32) != 0;
        }

        public int zzv() {
            return this.zzv;
        }

        public boolean zzy() {
            return (this.zzl & 64) != 0;
        }

        public int zzz() {
            return this.zzw;
        }
    }

    public final class zzai extends zzibr implements zzaj {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzai zzf;
        private static volatile zzidk zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public final class zza extends zzibl implements zzaj {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzai) this.zza).zza();
            }

            public int zzb() {
                return ((zzai) this.zza).zzb();
            }

            public zza zzc(int i) {
                zzbg();
                ((zzai) this.zza).zzu(i);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzai) this.zza).zzv();
                return this;
            }

            public boolean zze() {
                return ((zzai) this.zza).zze();
            }

            public int zzf() {
                return ((zzai) this.zza).zzf();
            }

            public zza zzg(int i) {
                zzbg();
                ((zzai) this.zza).zzw(i);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzai) this.zza).zzx();
                return this;
            }

            private zza() {
                super(zzai.zzy());
            }
        }

        static {
            zzai zzaiVar = new zzai();
            zzf = zzaiVar;
            zzibr.zzbu(zzai.class, zzaiVar);
        }

        private zzai() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(int i) {
            this.zzc |= 2;
            this.zze = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzai zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzai) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzai zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzai) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzai zzg(zzian zzianVar) throws zzicg {
            return (zzai) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzai zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzai) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzai zzi(byte[] bArr) throws zzicg {
            return (zzai) zzibr.zzbU(zzf, bArr);
        }

        public static zzai zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzai) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzai zzk(InputStream inputStream) throws IOException {
            return (zzai) zzibr.zzbW(zzf, inputStream);
        }

        public static zzai zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzai) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzai zzm(InputStream inputStream) throws IOException {
            return (zzai) zzibr.zzca(zzf, inputStream);
        }

        public static zzai zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzai) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzai zzo(zziaq zziaqVar) throws IOException {
            return (zzai) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzai zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzai) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzai zzaiVar) {
            return (zza) zzf.zzbo(zzaiVar);
        }

        public static zzai zzs() {
            return zzf;
        }

        public static zzidk zzt() {
            return zzf.zzbd();
        }

        public static /* synthetic */ zzai zzy() {
            return zzf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public int zzb() {
            return this.zzd;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            if (ordinal == 3) {
                return new zzai();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzf;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzg;
            if (zzidkVar == null) {
                synchronized (zzai.class) {
                    try {
                        zzidkVar = zzg;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzf);
                            zzg = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        public int zzf() {
            return this.zze;
        }
    }

    public interface zzaj extends zzidd {
        boolean zza();

        int zzb();

        boolean zze();

        int zzf();
    }

    public interface zzak extends zzidd {
        boolean zzC();

        int zzD();

        boolean zzG();

        int zzH();

        boolean zzK();

        int zzL();

        boolean zzO();

        zzai zzP();

        boolean zza();

        zzq zzb();

        boolean zze();

        zzq zzf();

        boolean zzi();

        int zzj();

        boolean zzm();

        int zzn();

        boolean zzq();

        int zzr();

        boolean zzu();

        int zzv();

        boolean zzy();

        int zzz();
    }

    public final class zzal extends zzibr implements zzam {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzal zzf;
        private static volatile zzidk zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public final class zza extends zzibl implements zzam {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzal) this.zza).zza();
            }

            public int zzb() {
                return ((zzal) this.zza).zzb();
            }

            public zza zzc(int i) {
                zzbg();
                ((zzal) this.zza).zzu(i);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzal) this.zza).zzv();
                return this;
            }

            public boolean zze() {
                return ((zzal) this.zza).zze();
            }

            public int zzf() {
                return ((zzal) this.zza).zzf();
            }

            public zza zzg(int i) {
                zzbg();
                ((zzal) this.zza).zzw(i);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzal) this.zza).zzx();
                return this;
            }

            private zza() {
                super(zzal.zzy());
            }
        }

        static {
            zzal zzalVar = new zzal();
            zzf = zzalVar;
            zzibr.zzbu(zzal.class, zzalVar);
        }

        private zzal() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(int i) {
            this.zzc |= 2;
            this.zze = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzal zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzal) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzal zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzal) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzal zzg(zzian zzianVar) throws zzicg {
            return (zzal) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzal zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzal) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzal zzi(byte[] bArr) throws zzicg {
            return (zzal) zzibr.zzbU(zzf, bArr);
        }

        public static zzal zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzal) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzal zzk(InputStream inputStream) throws IOException {
            return (zzal) zzibr.zzbW(zzf, inputStream);
        }

        public static zzal zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzal) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzal zzm(InputStream inputStream) throws IOException {
            return (zzal) zzibr.zzca(zzf, inputStream);
        }

        public static zzal zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzal) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzal zzo(zziaq zziaqVar) throws IOException {
            return (zzal) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzal zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzal) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzal zzalVar) {
            return (zza) zzf.zzbo(zzalVar);
        }

        public static zzal zzs() {
            return zzf;
        }

        public static zzidk zzt() {
            return zzf.zzbd();
        }

        public static /* synthetic */ zzal zzy() {
            return zzf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public int zzb() {
            return this.zzd;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            if (ordinal == 3) {
                return new zzal();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzf;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzg;
            if (zzidkVar == null) {
                synchronized (zzal.class) {
                    try {
                        zzidkVar = zzg;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzf);
                            zzg = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        public int zzf() {
            return this.zze;
        }
    }

    public interface zzam extends zzidd {
        boolean zza();

        int zzb();

        boolean zze();

        int zzf();
    }

    public final class zzan extends zzibr implements zzao {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzan zzh;
        private static volatile zzidk zzi;
        private int zzd;
        private String zze = "";
        private int zzf;
        private zzap zzg;

        public final class zza extends zzibl implements zzao {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzan) this.zza).zza();
            }

            public String zzb() {
                return ((zzan) this.zza).zzb();
            }

            public zzian zzc() {
                return ((zzan) this.zza).zzc();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzan) this.zza).zzy(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzan) this.zza).zzz();
                return this;
            }

            public zza zzf(zzian zzianVar) {
                zzbg();
                ((zzan) this.zza).zzA(zzianVar);
                return this;
            }

            public boolean zzg() {
                return ((zzan) this.zza).zzg();
            }

            public zzq zzh() {
                return ((zzan) this.zza).zzh();
            }

            public zza zzi(zzq zzqVar) {
                zzbg();
                ((zzan) this.zza).zzB(zzqVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzan) this.zza).zzC();
                return this;
            }

            public boolean zzk() {
                return ((zzan) this.zza).zzk();
            }

            public zzap zzl() {
                return ((zzan) this.zza).zzl();
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzan) this.zza).zzD(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzan) this.zza).zzD((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzan) this.zza).zzE(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzan) this.zza).zzF();
                return this;
            }

            private zza() {
                super(zzan.zzG());
            }
        }

        static {
            zzan zzanVar = new zzan();
            zzh = zzanVar;
            zzibr.zzbu(zzan.class, zzanVar);
        }

        private zzan() {
        }

        public static /* synthetic */ zzan zzG() {
            return zzh;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzy(String str) {
            str.getClass();
            this.zzd |= 1;
            this.zze = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzz() {
            this.zzd &= -2;
            this.zze = zzw().zzb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzA(zzian zzianVar) {
            this.zze = zzianVar.zzz();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
        public void zzB(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzC() {
            this.zzd &= -3;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzD(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzE(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzF() {
            this.zzg = null;
            this.zzd &= -5;
        }

        public static zzan zzd(ByteBuffer byteBuffer) throws zzicg {
            return (zzan) zzibr.zzbR(zzh, byteBuffer);
        }

        public static zzan zze(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzan) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
        }

        public static zzan zzi(zzian zzianVar) throws zzicg {
            return (zzan) zzibr.zzbS(zzh, zzianVar);
        }

        public static zzan zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzan) zzibr.zzbT(zzh, zzianVar, zzibbVar);
        }

        public static zzan zzm(byte[] bArr) throws zzicg {
            return (zzan) zzibr.zzbU(zzh, bArr);
        }

        public static zzan zzn(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzan) zzibr.zzbV(zzh, bArr, zzibbVar);
        }

        public static zzan zzo(InputStream inputStream) throws IOException {
            return (zzan) zzibr.zzbW(zzh, inputStream);
        }

        public static zzan zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzan) zzibr.zzbX(zzh, inputStream, zzibbVar);
        }

        public static zzan zzq(InputStream inputStream) throws IOException {
            return (zzan) zzibr.zzca(zzh, inputStream);
        }

        public static zzan zzr(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzan) zzibr.zzcb(zzh, inputStream, zzibbVar);
        }

        public static zzan zzs(zziaq zziaqVar) throws IOException {
            return (zzan) zzibr.zzbY(zzh, zziaqVar);
        }

        public static zzan zzt(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzan) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
        }

        public static zza zzu() {
            return (zza) zzh.zzbn();
        }

        public static zza zzv(zzan zzanVar) {
            return (zza) zzh.zzbo(zzanVar);
        }

        public static zzan zzw() {
            return zzh;
        }

        public static zzidk zzx() {
            return zzh.zzbd();
        }

        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        public String zzb() {
            return this.zze;
        }

        public zzian zzc() {
            return zzian.zzv(this.zze);
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzq.zze(), "zzg"});
            }
            if (ordinal == 3) {
                return new zzan();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzh;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzi;
            if (zzidkVar == null) {
                synchronized (zzan.class) {
                    try {
                        zzidkVar = zzi;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzh);
                            zzi = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zzg() {
            return (this.zzd & 2) != 0;
        }

        public zzq zzh() {
            zzq zzc2 = zzq.zzc(this.zzf);
            return zzc2 == null ? zzq.ENUM_FALSE : zzc2;
        }

        public boolean zzk() {
            return (this.zzd & 4) != 0;
        }

        public zzap zzl() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzao extends zzidd {
        boolean zza();

        String zzb();

        zzian zzc();

        boolean zzg();

        zzq zzh();

        boolean zzk();

        zzap zzl();
    }

    public final class zzap extends zzibr implements zzaq {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzap zzf;
        private static volatile zzidk zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public final class zza extends zzibl implements zzaq {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzap) this.zza).zza();
            }

            public int zzb() {
                return ((zzap) this.zza).zzb();
            }

            public zza zzc(int i) {
                zzbg();
                ((zzap) this.zza).zzu(i);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzap) this.zza).zzv();
                return this;
            }

            public boolean zze() {
                return ((zzap) this.zza).zze();
            }

            public int zzf() {
                return ((zzap) this.zza).zzf();
            }

            public zza zzg(int i) {
                zzbg();
                ((zzap) this.zza).zzw(i);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzap) this.zza).zzx();
                return this;
            }

            private zza() {
                super(zzap.zzy());
            }
        }

        static {
            zzap zzapVar = new zzap();
            zzf = zzapVar;
            zzibr.zzbu(zzap.class, zzapVar);
        }

        private zzap() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(int i) {
            this.zzc |= 2;
            this.zze = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzap zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzap) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzap zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzap) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzap zzg(zzian zzianVar) throws zzicg {
            return (zzap) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzap zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzap) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzap zzi(byte[] bArr) throws zzicg {
            return (zzap) zzibr.zzbU(zzf, bArr);
        }

        public static zzap zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzap) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzap zzk(InputStream inputStream) throws IOException {
            return (zzap) zzibr.zzbW(zzf, inputStream);
        }

        public static zzap zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzap) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzap zzm(InputStream inputStream) throws IOException {
            return (zzap) zzibr.zzca(zzf, inputStream);
        }

        public static zzap zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzap) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzap zzo(zziaq zziaqVar) throws IOException {
            return (zzap) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzap zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzap) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzap zzapVar) {
            return (zza) zzf.zzbo(zzapVar);
        }

        public static zzap zzs() {
            return zzf;
        }

        public static zzidk zzt() {
            return zzf.zzbd();
        }

        public static /* synthetic */ zzap zzy() {
            return zzf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public int zzb() {
            return this.zzd;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            if (ordinal == 3) {
                return new zzap();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzf;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzg;
            if (zzidkVar == null) {
                synchronized (zzap.class) {
                    try {
                        zzidkVar = zzg;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzf);
                            zzg = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        public int zzf() {
            return this.zze;
        }
    }

    public interface zzaq extends zzidd {
        boolean zza();

        int zzb();

        boolean zze();

        int zzf();
    }

    public final class zzar extends zzibr implements zzas {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzar zzh;
        private static volatile zzidk zzi;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public final class zza extends zzibl implements zzas {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzar) this.zza).zza();
            }

            public int zzb() {
                return ((zzar) this.zza).zzb();
            }

            public zza zzc(int i) {
                zzbg();
                ((zzar) this.zza).zzw(i);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzar) this.zza).zzx();
                return this;
            }

            public boolean zze() {
                return ((zzar) this.zza).zze();
            }

            public int zzf() {
                return ((zzar) this.zza).zzf();
            }

            public zza zzg(int i) {
                zzbg();
                ((zzar) this.zza).zzy(i);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzar) this.zza).zzz();
                return this;
            }

            public boolean zzi() {
                return ((zzar) this.zza).zzi();
            }

            public int zzj() {
                return ((zzar) this.zza).zzj();
            }

            public zza zzk(int i) {
                zzbg();
                ((zzar) this.zza).zzA(i);
                return this;
            }

            public zza zzl() {
                zzbg();
                ((zzar) this.zza).zzB();
                return this;
            }

            private zza() {
                super(zzar.zzC());
            }
        }

        static {
            zzar zzarVar = new zzar();
            zzh = zzarVar;
            zzibr.zzbu(zzar.class, zzarVar);
        }

        private zzar() {
        }

        public static /* synthetic */ zzar zzC() {
            return zzh;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzw(int i) {
            this.zzd |= 1;
            this.zze = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzd &= -2;
            this.zze = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzy(int i) {
            this.zzd |= 2;
            this.zzf = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzz() {
            this.zzd &= -3;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzA(int i) {
            this.zzd |= 4;
            this.zzg = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzB() {
            this.zzd &= -5;
            this.zzg = 0;
        }

        public static zzar zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzar) zzibr.zzbR(zzh, byteBuffer);
        }

        public static zzar zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzar) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
        }

        public static zzar zzg(zzian zzianVar) throws zzicg {
            return (zzar) zzibr.zzbS(zzh, zzianVar);
        }

        public static zzar zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzar) zzibr.zzbT(zzh, zzianVar, zzibbVar);
        }

        public static zzar zzk(byte[] bArr) throws zzicg {
            return (zzar) zzibr.zzbU(zzh, bArr);
        }

        public static zzar zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzar) zzibr.zzbV(zzh, bArr, zzibbVar);
        }

        public static zzar zzm(InputStream inputStream) throws IOException {
            return (zzar) zzibr.zzbW(zzh, inputStream);
        }

        public static zzar zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzar) zzibr.zzbX(zzh, inputStream, zzibbVar);
        }

        public static zzar zzo(InputStream inputStream) throws IOException {
            return (zzar) zzibr.zzca(zzh, inputStream);
        }

        public static zzar zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzar) zzibr.zzcb(zzh, inputStream, zzibbVar);
        }

        public static zzar zzq(zziaq zziaqVar) throws IOException {
            return (zzar) zzibr.zzbY(zzh, zziaqVar);
        }

        public static zzar zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzar) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
        }

        public static zza zzs() {
            return (zza) zzh.zzbn();
        }

        public static zza zzt(zzar zzarVar) {
            return (zza) zzh.zzbo(zzarVar);
        }

        public static zzar zzu() {
            return zzh;
        }

        public static zzidk zzv() {
            return zzh.zzbd();
        }

        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        public int zzb() {
            return this.zze;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            if (ordinal == 3) {
                return new zzar();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzh;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzi;
            if (zzidkVar == null) {
                synchronized (zzar.class) {
                    try {
                        zzidkVar = zzi;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzh);
                            zzi = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzd & 2) != 0;
        }

        public int zzf() {
            return this.zzf;
        }

        public boolean zzi() {
            return (this.zzd & 4) != 0;
        }

        public int zzj() {
            return this.zzg;
        }
    }

    public interface zzas extends zzidd {
        boolean zza();

        int zzb();

        boolean zze();

        int zzf();

        boolean zzi();

        int zzj();
    }

    public final class zzat extends zzibr implements zzbi {
        private static final zzat zzL;
        private static volatile zzidk zzM = null;
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        public static final int zze = 9;
        public static final int zzf = 10;
        public static final int zzg = 11;
        public static final int zzh = 12;
        public static final int zzi = 13;
        public static final int zzj = 14;
        public static final int zzk = 15;
        public static final int zzl = 16;
        public static final int zzm = 17;
        public static final int zzn = 18;
        public static final int zzo = 19;
        public static final int zzp = 20;
        private zzbc zzA;
        private zzay zzB;
        private int zzC;
        private int zzD;
        private zzap zzE;
        private int zzF;
        private int zzG;
        private int zzH;
        private int zzI;
        private int zzJ;
        private long zzK;
        private int zzu;
        private zzba zzv;
        private zzbe zzw;
        private zzbg zzx;
        private zzbj zzy;
        private zzau zzz;

        public final class zza extends zzibl implements zzbi {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public zza zzA(zzau zzauVar) {
                zzbg();
                ((zzat) this.zza).zzT(zzauVar);
                return this;
            }

            public zza zzB(zzau.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzT((zzau) zzaVar.zzbu());
                return this;
            }

            public zza zzC(zzau zzauVar) {
                zzbg();
                ((zzat) this.zza).zzW(zzauVar);
                return this;
            }

            public zza zzD() {
                zzbg();
                ((zzat) this.zza).zzX();
                return this;
            }

            public boolean zzE() {
                return ((zzat) this.zza).zzE();
            }

            public zzbc zzF() {
                return ((zzat) this.zza).zzF();
            }

            public zza zzG(zzbc zzbcVar) {
                zzbg();
                ((zzat) this.zza).zzaa(zzbcVar);
                return this;
            }

            public zza zzH(zzbc.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzaa((zzbc) zzaVar.zzbu());
                return this;
            }

            public zza zzI(zzbc zzbcVar) {
                zzbg();
                ((zzat) this.zza).zzab(zzbcVar);
                return this;
            }

            public zza zzJ() {
                zzbg();
                ((zzat) this.zza).zzac();
                return this;
            }

            public boolean zzK() {
                return ((zzat) this.zza).zzK();
            }

            public zzay zzL() {
                return ((zzat) this.zza).zzL();
            }

            public zza zzM(zzay zzayVar) {
                zzbg();
                ((zzat) this.zza).zzad(zzayVar);
                return this;
            }

            public zza zzN(zzay.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzad((zzay) zzaVar.zzbu());
                return this;
            }

            public zza zzO(zzay zzayVar) {
                zzbg();
                ((zzat) this.zza).zzag(zzayVar);
                return this;
            }

            public zza zzP() {
                zzbg();
                ((zzat) this.zza).zzah();
                return this;
            }

            public boolean zzQ() {
                return ((zzat) this.zza).zzQ();
            }

            public int zzR() {
                return ((zzat) this.zza).zzR();
            }

            public zza zzS(int i) {
                zzbg();
                ((zzat) this.zza).zzak(i);
                return this;
            }

            public zza zzT() {
                zzbg();
                ((zzat) this.zza).zzal();
                return this;
            }

            public boolean zzU() {
                return ((zzat) this.zza).zzU();
            }

            public int zzV() {
                return ((zzat) this.zza).zzV();
            }

            public zza zzW(int i) {
                zzbg();
                ((zzat) this.zza).zzao(i);
                return this;
            }

            public zza zzX() {
                zzbg();
                ((zzat) this.zza).zzap();
                return this;
            }

            public boolean zzY() {
                return ((zzat) this.zza).zzY();
            }

            public zzap zzZ() {
                return ((zzat) this.zza).zzZ();
            }

            public boolean zza() {
                return ((zzat) this.zza).zza();
            }

            public zza zzaA(long j) {
                zzbg();
                ((zzat) this.zza).zzaJ(j);
                return this;
            }

            public zza zzaB() {
                zzbg();
                ((zzat) this.zza).zzaK();
                return this;
            }

            public zza zzaa(zzap zzapVar) {
                zzbg();
                ((zzat) this.zza).zzas(zzapVar);
                return this;
            }

            public zza zzab(zzap.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzas((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzac(zzap zzapVar) {
                zzbg();
                ((zzat) this.zza).zzat(zzapVar);
                return this;
            }

            public zza zzad() {
                zzbg();
                ((zzat) this.zza).zzaw();
                return this;
            }

            public boolean zzae() {
                return ((zzat) this.zza).zzae();
            }

            public int zzaf() {
                return ((zzat) this.zza).zzaf();
            }

            public zza zzag(int i) {
                zzbg();
                ((zzat) this.zza).zzax(i);
                return this;
            }

            public zza zzah() {
                zzbg();
                ((zzat) this.zza).zzaA();
                return this;
            }

            public boolean zzai() {
                return ((zzat) this.zza).zzai();
            }

            public int zzaj() {
                return ((zzat) this.zza).zzaj();
            }

            public zza zzak(int i) {
                zzbg();
                ((zzat) this.zza).zzaB(i);
                return this;
            }

            public zza zzal() {
                zzbg();
                ((zzat) this.zza).zzaC();
                return this;
            }

            public boolean zzam() {
                return ((zzat) this.zza).zzam();
            }

            public int zzan() {
                return ((zzat) this.zza).zzan();
            }

            public zza zzao(int i) {
                zzbg();
                ((zzat) this.zza).zzaD(i);
                return this;
            }

            public zza zzap() {
                zzbg();
                ((zzat) this.zza).zzaE();
                return this;
            }

            public boolean zzaq() {
                return ((zzat) this.zza).zzaq();
            }

            public int zzar() {
                return ((zzat) this.zza).zzar();
            }

            public zza zzas(int i) {
                zzbg();
                ((zzat) this.zza).zzaF(i);
                return this;
            }

            public zza zzat() {
                zzbg();
                ((zzat) this.zza).zzaG();
                return this;
            }

            public boolean zzau() {
                return ((zzat) this.zza).zzau();
            }

            public int zzav() {
                return ((zzat) this.zza).zzav();
            }

            public zza zzaw(int i) {
                zzbg();
                ((zzat) this.zza).zzaH(i);
                return this;
            }

            public zza zzax() {
                zzbg();
                ((zzat) this.zza).zzaI();
                return this;
            }

            public boolean zzay() {
                return ((zzat) this.zza).zzay();
            }

            public long zzaz() {
                return ((zzat) this.zza).zzaz();
            }

            public zzba zzb() {
                return ((zzat) this.zza).zzb();
            }

            public zza zzc(zzba zzbaVar) {
                zzbg();
                ((zzat) this.zza).zzB(zzbaVar);
                return this;
            }

            public zza zzd(zzba.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzB((zzba) zzaVar.zzbu());
                return this;
            }

            public zza zze(zzba zzbaVar) {
                zzbg();
                ((zzat) this.zza).zzC(zzbaVar);
                return this;
            }

            public zza zzf() {
                zzbg();
                ((zzat) this.zza).zzD();
                return this;
            }

            public boolean zzg() {
                return ((zzat) this.zza).zzg();
            }

            public zzbe zzh() {
                return ((zzat) this.zza).zzh();
            }

            public zza zzi(zzbe zzbeVar) {
                zzbg();
                ((zzat) this.zza).zzG(zzbeVar);
                return this;
            }

            public zza zzj(zzbe.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzG((zzbe) zzaVar.zzbu());
                return this;
            }

            public zza zzk(zzbe zzbeVar) {
                zzbg();
                ((zzat) this.zza).zzH(zzbeVar);
                return this;
            }

            public zza zzl() {
                zzbg();
                ((zzat) this.zza).zzI();
                return this;
            }

            public boolean zzm() {
                return ((zzat) this.zza).zzm();
            }

            public zzbg zzn() {
                return ((zzat) this.zza).zzn();
            }

            public zza zzo(zzbg zzbgVar) {
                zzbg();
                ((zzat) this.zza).zzJ(zzbgVar);
                return this;
            }

            public zza zzp(zzbg.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzJ((zzbg) zzaVar.zzbu());
                return this;
            }

            public zza zzq(zzbg zzbgVar) {
                zzbg();
                ((zzat) this.zza).zzM(zzbgVar);
                return this;
            }

            public zza zzr() {
                zzbg();
                ((zzat) this.zza).zzN();
                return this;
            }

            public boolean zzs() {
                return ((zzat) this.zza).zzs();
            }

            public zzbj zzt() {
                return ((zzat) this.zza).zzt();
            }

            public zza zzu(zzbj zzbjVar) {
                zzbg();
                ((zzat) this.zza).zzO(zzbjVar);
                return this;
            }

            public zza zzv(zzbj.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzO((zzbj) zzaVar.zzbu());
                return this;
            }

            public zza zzw(zzbj zzbjVar) {
                zzbg();
                ((zzat) this.zza).zzP(zzbjVar);
                return this;
            }

            public zza zzx() {
                zzbg();
                ((zzat) this.zza).zzS();
                return this;
            }

            public boolean zzy() {
                return ((zzat) this.zza).zzy();
            }

            public zzau zzz() {
                return ((zzat) this.zza).zzz();
            }

            private zza() {
                super(zzat.zzaL());
            }
        }

        static {
            zzat zzatVar = new zzat();
            zzL = zzatVar;
            zzibr.zzbu(zzat.class, zzatVar);
        }

        private zzat() {
        }

        public static zzidk zzA() {
            return zzL.zzbd();
        }

        public static /* synthetic */ zzat zzaL() {
            return zzL;
        }

        public static zzat zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzat) zzibr.zzbR(zzL, byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcA, reason: merged with bridge method [inline-methods] */
        public void zzal() {
            this.zzu &= -129;
            this.zzC = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcB, reason: merged with bridge method [inline-methods] */
        public void zzao(int i) {
            this.zzu |= 256;
            this.zzD = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcC, reason: merged with bridge method [inline-methods] */
        public void zzap() {
            this.zzu &= -257;
            this.zzD = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcD, reason: merged with bridge method [inline-methods] */
        public void zzas(zzap zzapVar) {
            zzapVar.getClass();
            this.zzE = zzapVar;
            this.zzu |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcE, reason: merged with bridge method [inline-methods] */
        public void zzat(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzE;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zzE = zzapVar;
            this.zzu |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcF, reason: merged with bridge method [inline-methods] */
        public void zzaw() {
            this.zzE = null;
            this.zzu &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcG, reason: merged with bridge method [inline-methods] */
        public void zzax(int i) {
            this.zzu |= 1024;
            this.zzF = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcH, reason: merged with bridge method [inline-methods] */
        public void zzaA() {
            this.zzu &= -1025;
            this.zzF = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcI, reason: merged with bridge method [inline-methods] */
        public void zzaB(int i) {
            this.zzu |= 2048;
            this.zzG = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcJ, reason: merged with bridge method [inline-methods] */
        public void zzaC() {
            this.zzu &= -2049;
            this.zzG = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcK, reason: merged with bridge method [inline-methods] */
        public void zzaD(int i) {
            this.zzu |= 4096;
            this.zzH = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcL, reason: merged with bridge method [inline-methods] */
        public void zzaE() {
            this.zzu &= -4097;
            this.zzH = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcM, reason: merged with bridge method [inline-methods] */
        public void zzaF(int i) {
            this.zzu |= 8192;
            this.zzI = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcN, reason: merged with bridge method [inline-methods] */
        public void zzaG() {
            this.zzu &= -8193;
            this.zzI = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcO, reason: merged with bridge method [inline-methods] */
        public void zzaH(int i) {
            this.zzu |= 16384;
            this.zzJ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcP, reason: merged with bridge method [inline-methods] */
        public void zzaI() {
            this.zzu &= -16385;
            this.zzJ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcQ, reason: merged with bridge method [inline-methods] */
        public void zzaJ(long j) {
            this.zzu |= 32768;
            this.zzK = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcR, reason: merged with bridge method [inline-methods] */
        public void zzaK() {
            this.zzu &= -32769;
            this.zzK = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzce, reason: merged with bridge method [inline-methods] */
        public void zzB(zzba zzbaVar) {
            zzbaVar.getClass();
            this.zzv = zzbaVar;
            this.zzu |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcf, reason: merged with bridge method [inline-methods] */
        public void zzC(zzba zzbaVar) {
            zzbaVar.getClass();
            zzba zzbaVar2 = this.zzv;
            if (zzbaVar2 != null && zzbaVar2 != zzba.zzy()) {
                zzba.zza zzx = zzba.zzx(zzbaVar2);
                zzx.zzbo(zzbaVar);
                zzbaVar = (zzba) zzx.zzbt();
            }
            this.zzv = zzbaVar;
            this.zzu |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcg, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzv = null;
            this.zzu &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzch, reason: merged with bridge method [inline-methods] */
        public void zzG(zzbe zzbeVar) {
            zzbeVar.getClass();
            this.zzw = zzbeVar;
            this.zzu |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzci, reason: merged with bridge method [inline-methods] */
        public void zzH(zzbe zzbeVar) {
            zzbeVar.getClass();
            zzbe zzbeVar2 = this.zzw;
            if (zzbeVar2 != null && zzbeVar2 != zzbe.zzA()) {
                zzbe.zza zzz = zzbe.zzz(zzbeVar2);
                zzz.zzbo(zzbeVar);
                zzbeVar = (zzbe) zzz.zzbt();
            }
            this.zzw = zzbeVar;
            this.zzu |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcj, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzw = null;
            this.zzu &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzck, reason: merged with bridge method [inline-methods] */
        public void zzJ(zzbg zzbgVar) {
            zzbgVar.getClass();
            this.zzx = zzbgVar;
            this.zzu |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcl, reason: merged with bridge method [inline-methods] */
        public void zzM(zzbg zzbgVar) {
            zzbgVar.getClass();
            zzbg zzbgVar2 = this.zzx;
            if (zzbgVar2 != null && zzbgVar2 != zzbg.zzu()) {
                zzbg.zza zzt = zzbg.zzt(zzbgVar2);
                zzt.zzbo(zzbgVar);
                zzbgVar = (zzbg) zzt.zzbt();
            }
            this.zzx = zzbgVar;
            this.zzu |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcm, reason: merged with bridge method [inline-methods] */
        public void zzN() {
            this.zzx = null;
            this.zzu &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcn, reason: merged with bridge method [inline-methods] */
        public void zzO(zzbj zzbjVar) {
            zzbjVar.getClass();
            this.zzy = zzbjVar;
            this.zzu |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzco, reason: merged with bridge method [inline-methods] */
        public void zzP(zzbj zzbjVar) {
            zzbjVar.getClass();
            zzbj zzbjVar2 = this.zzy;
            if (zzbjVar2 != null && zzbjVar2 != zzbj.zzs()) {
                zzbj.zza zzr = zzbj.zzr(zzbjVar2);
                zzr.zzbo(zzbjVar);
                zzbjVar = (zzbj) zzr.zzbt();
            }
            this.zzy = zzbjVar;
            this.zzu |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcp, reason: merged with bridge method [inline-methods] */
        public void zzS() {
            this.zzy = null;
            this.zzu &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcq, reason: merged with bridge method [inline-methods] */
        public void zzT(zzau zzauVar) {
            zzauVar.getClass();
            this.zzz = zzauVar;
            this.zzu |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcr, reason: merged with bridge method [inline-methods] */
        public void zzW(zzau zzauVar) {
            zzauVar.getClass();
            zzau zzauVar2 = this.zzz;
            if (zzauVar2 != null && zzauVar2 != zzau.zzu()) {
                zzau.zza zzt = zzau.zzt(zzauVar2);
                zzt.zzbo(zzauVar);
                zzauVar = (zzau) zzt.zzbt();
            }
            this.zzz = zzauVar;
            this.zzu |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcs, reason: merged with bridge method [inline-methods] */
        public void zzX() {
            this.zzz = null;
            this.zzu &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzct, reason: merged with bridge method [inline-methods] */
        public void zzaa(zzbc zzbcVar) {
            zzbcVar.getClass();
            this.zzA = zzbcVar;
            this.zzu |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcu, reason: merged with bridge method [inline-methods] */
        public void zzab(zzbc zzbcVar) {
            zzbcVar.getClass();
            zzbc zzbcVar2 = this.zzA;
            if (zzbcVar2 != null && zzbcVar2 != zzbc.zzu()) {
                zzbc.zza zzt = zzbc.zzt(zzbcVar2);
                zzt.zzbo(zzbcVar);
                zzbcVar = (zzbc) zzt.zzbt();
            }
            this.zzA = zzbcVar;
            this.zzu |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcv, reason: merged with bridge method [inline-methods] */
        public void zzac() {
            this.zzA = null;
            this.zzu &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcw, reason: merged with bridge method [inline-methods] */
        public void zzad(zzay zzayVar) {
            zzayVar.getClass();
            this.zzB = zzayVar;
            this.zzu |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcx, reason: merged with bridge method [inline-methods] */
        public void zzag(zzay zzayVar) {
            zzayVar.getClass();
            zzay zzayVar2 = this.zzB;
            if (zzayVar2 != null && zzayVar2 != zzay.zzx()) {
                zzay.zza zzw = zzay.zzw(zzayVar2);
                zzw.zzbo(zzayVar);
                zzayVar = (zzay) zzw.zzbt();
            }
            this.zzB = zzayVar;
            this.zzu |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcy, reason: merged with bridge method [inline-methods] */
        public void zzah() {
            this.zzB = null;
            this.zzu &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcz, reason: merged with bridge method [inline-methods] */
        public void zzak(int i) {
            this.zzu |= 128;
            this.zzC = i;
        }

        public static zzat zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzat) zzibr.zzbQ(zzL, byteBuffer, zzibbVar);
        }

        public static zzat zze(zzian zzianVar) throws zzicg {
            return (zzat) zzibr.zzbS(zzL, zzianVar);
        }

        public static zzat zzi(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzat) zzibr.zzbT(zzL, zzianVar, zzibbVar);
        }

        public static zzat zzj(byte[] bArr) throws zzicg {
            return (zzat) zzibr.zzbU(zzL, bArr);
        }

        public static zzat zzk(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzat) zzibr.zzbV(zzL, bArr, zzibbVar);
        }

        public static zzat zzl(InputStream inputStream) throws IOException {
            return (zzat) zzibr.zzbW(zzL, inputStream);
        }

        public static zzat zzo(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzat) zzibr.zzbX(zzL, inputStream, zzibbVar);
        }

        public static zzat zzp(InputStream inputStream) throws IOException {
            return (zzat) zzibr.zzca(zzL, inputStream);
        }

        public static zzat zzq(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzat) zzibr.zzcb(zzL, inputStream, zzibbVar);
        }

        public static zzat zzr(zziaq zziaqVar) throws IOException {
            return (zzat) zzibr.zzbY(zzL, zziaqVar);
        }

        public static zzat zzu(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzat) zzibr.zzbZ(zzL, zziaqVar, zzibbVar);
        }

        public static zza zzv() {
            return (zza) zzL.zzbn();
        }

        public static zza zzw(zzat zzatVar) {
            return (zza) zzL.zzbo(zzatVar);
        }

        public static zzat zzx() {
            return zzL;
        }

        public boolean zzE() {
            return (this.zzu & 32) != 0;
        }

        public zzbc zzF() {
            zzbc zzbcVar = this.zzA;
            return zzbcVar == null ? zzbc.zzu() : zzbcVar;
        }

        public boolean zzK() {
            return (this.zzu & 64) != 0;
        }

        public zzay zzL() {
            zzay zzayVar = this.zzB;
            return zzayVar == null ? zzay.zzx() : zzayVar;
        }

        public boolean zzQ() {
            return (this.zzu & 128) != 0;
        }

        public int zzR() {
            return this.zzC;
        }

        public boolean zzU() {
            return (this.zzu & 256) != 0;
        }

        public int zzV() {
            return this.zzD;
        }

        public boolean zzY() {
            return (this.zzu & 512) != 0;
        }

        public zzap zzZ() {
            zzap zzapVar = this.zzE;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        public boolean zza() {
            return (this.zzu & 1) != 0;
        }

        public boolean zzae() {
            return (this.zzu & 1024) != 0;
        }

        public int zzaf() {
            return this.zzF;
        }

        public boolean zzai() {
            return (this.zzu & 2048) != 0;
        }

        public int zzaj() {
            return this.zzG;
        }

        public boolean zzam() {
            return (this.zzu & 4096) != 0;
        }

        public int zzan() {
            return this.zzH;
        }

        public boolean zzaq() {
            return (this.zzu & 8192) != 0;
        }

        public int zzar() {
            return this.zzI;
        }

        public boolean zzau() {
            return (this.zzu & 16384) != 0;
        }

        public int zzav() {
            return this.zzJ;
        }

        public boolean zzay() {
            return (this.zzu & 32768) != 0;
        }

        public long zzaz() {
            return this.zzK;
        }

        public zzba zzb() {
            zzba zzbaVar = this.zzv;
            return zzbaVar == null ? zzba.zzy() : zzbaVar;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzL, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK"});
            }
            if (ordinal == 3) {
                return new zzat();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzL;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzM;
            if (zzidkVar == null) {
                synchronized (zzat.class) {
                    try {
                        zzidkVar = zzM;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzL);
                            zzM = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zzg() {
            return (this.zzu & 2) != 0;
        }

        public zzbe zzh() {
            zzbe zzbeVar = this.zzw;
            return zzbeVar == null ? zzbe.zzA() : zzbeVar;
        }

        public boolean zzm() {
            return (this.zzu & 4) != 0;
        }

        public zzbg zzn() {
            zzbg zzbgVar = this.zzx;
            return zzbgVar == null ? zzbg.zzu() : zzbgVar;
        }

        public boolean zzs() {
            return (this.zzu & 8) != 0;
        }

        public zzbj zzt() {
            zzbj zzbjVar = this.zzy;
            return zzbjVar == null ? zzbj.zzs() : zzbjVar;
        }

        public boolean zzy() {
            return (this.zzu & 16) != 0;
        }

        public zzau zzz() {
            zzau zzauVar = this.zzz;
            return zzauVar == null ? zzau.zzu() : zzauVar;
        }
    }

    public final class zzau extends zzibr implements zzav {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzau zzh;
        private static volatile zzidk zzi;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        public final class zza extends zzibl implements zzav {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzau) this.zza).zza();
            }

            public zzq zzb() {
                return ((zzau) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzau) this.zza).zzw(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzau) this.zza).zzx();
                return this;
            }

            public boolean zze() {
                return ((zzau) this.zza).zze();
            }

            public zzaw zzf() {
                return ((zzau) this.zza).zzf();
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzau) this.zza).zzy(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzau) this.zza).zzy((zzaw) zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzau) this.zza).zzz(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzau) this.zza).zzA();
                return this;
            }

            public boolean zzk() {
                return ((zzau) this.zza).zzk();
            }

            public zzap zzl() {
                return ((zzau) this.zza).zzl();
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzau) this.zza).zzB(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzau) this.zza).zzB((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzau) this.zza).zzC(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzau) this.zza).zzD();
                return this;
            }

            private zza() {
                super(zzau.zzE());
            }
        }

        static {
            zzau zzauVar = new zzau();
            zzh = zzauVar;
            zzibr.zzbu(zzau.class, zzauVar);
        }

        private zzau() {
        }

        public static /* synthetic */ zzau zzE() {
            return zzh;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzw(zzq zzqVar) {
            this.zze = zzqVar.zza();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzd &= -2;
            this.zze = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzy(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzz(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzf;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzq = zzaw.zzq(zzawVar2);
                zzq.zzbo(zzawVar);
                zzawVar = (zzaw) zzq.zzbt();
            }
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zzf = null;
            this.zzd &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
        public void zzB(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzC(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzg = null;
            this.zzd &= -5;
        }

        public static zzau zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzau) zzibr.zzbR(zzh, byteBuffer);
        }

        public static zzau zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzau) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
        }

        public static zzau zzg(zzian zzianVar) throws zzicg {
            return (zzau) zzibr.zzbS(zzh, zzianVar);
        }

        public static zzau zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzau) zzibr.zzbT(zzh, zzianVar, zzibbVar);
        }

        public static zzau zzi(byte[] bArr) throws zzicg {
            return (zzau) zzibr.zzbU(zzh, bArr);
        }

        public static zzau zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzau) zzibr.zzbV(zzh, bArr, zzibbVar);
        }

        public static zzau zzm(InputStream inputStream) throws IOException {
            return (zzau) zzibr.zzbW(zzh, inputStream);
        }

        public static zzau zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzau) zzibr.zzbX(zzh, inputStream, zzibbVar);
        }

        public static zzau zzo(InputStream inputStream) throws IOException {
            return (zzau) zzibr.zzca(zzh, inputStream);
        }

        public static zzau zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzau) zzibr.zzcb(zzh, inputStream, zzibbVar);
        }

        public static zzau zzq(zziaq zziaqVar) throws IOException {
            return (zzau) zzibr.zzbY(zzh, zziaqVar);
        }

        public static zzau zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzau) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
        }

        public static zza zzs() {
            return (zza) zzh.zzbn();
        }

        public static zza zzt(zzau zzauVar) {
            return (zza) zzh.zzbo(zzauVar);
        }

        public static zzau zzu() {
            return zzh;
        }

        public static zzidk zzv() {
            return zzh.zzbd();
        }

        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        public zzq zzb() {
            zzq zzc2 = zzq.zzc(this.zze);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzq.zze(), "zzf", "zzg"});
            }
            if (ordinal == 3) {
                return new zzau();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzh;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzi;
            if (zzidkVar == null) {
                synchronized (zzau.class) {
                    try {
                        zzidkVar = zzi;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzh);
                            zzi = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzd & 2) != 0;
        }

        public zzaw zzf() {
            zzaw zzawVar = this.zzf;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        public boolean zzk() {
            return (this.zzd & 4) != 0;
        }

        public zzap zzl() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzav extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        zzap zzl();
    }

    public final class zzaw extends zzibr implements zzax {
        public static final int zza = 1;
        private static final zzaw zzd;
        private static volatile zzidk zze;
        private int zzb;
        private int zzc;

        public final class zza extends zzibl implements zzax {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzaw) this.zza).zza();
            }

            public zzb zzb() {
                return ((zzaw) this.zza).zzb();
            }

            public zza zzc(zzb zzbVar) {
                zzbg();
                ((zzaw) this.zza).zzt(zzbVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzaw) this.zza).zzu();
                return this;
            }

            private zza() {
                super(zzaw.zzv());
            }
        }

        public enum zzb implements zzibv {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);

            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 3;
            private static final zzibw zzi = new 1();
            private final int zzj;

            public class 1 implements zzibw {
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i) {
                    return zzb.zzc(i);
                }
            }

            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                public boolean zza(int i) {
                    return zzb.zzc(i) != null;
                }
            }

            zzb(int i) {
                this.zzj = i;
            }

            public static zzb zzc(int i) {
                if (i == 0) {
                    return VIDEO_ERROR_CODE_UNSPECIFIED;
                }
                if (i == 1) {
                    return OPENGL_RENDERING_FAILED;
                }
                if (i == 2) {
                    return CACHE_LOAD_FAILED;
                }
                if (i != 3) {
                    return null;
                }
                return ANDROID_TARGET_API_TOO_LOW;
            }

            public static zzibw zzd() {
                return zzi;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            public final String toString() {
                return Integer.toString(this.zzj);
            }

            public final int zza() {
                return this.zzj;
            }
        }

        static {
            zzaw zzawVar = new zzaw();
            zzd = zzawVar;
            zzibr.zzbu(zzaw.class, zzawVar);
        }

        private zzaw() {
        }

        public static zzaw zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzaw) zzibr.zzbR(zzd, byteBuffer);
        }

        public static zzaw zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzaw) zzibr.zzbQ(zzd, byteBuffer, zzibbVar);
        }

        public static zzaw zze(zzian zzianVar) throws zzicg {
            return (zzaw) zzibr.zzbS(zzd, zzianVar);
        }

        public static zzaw zzg(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzaw) zzibr.zzbT(zzd, zzianVar, zzibbVar);
        }

        public static zzaw zzh(byte[] bArr) throws zzicg {
            return (zzaw) zzibr.zzbU(zzd, bArr);
        }

        public static zzaw zzi(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzaw) zzibr.zzbV(zzd, bArr, zzibbVar);
        }

        public static zzaw zzj(InputStream inputStream) throws IOException {
            return (zzaw) zzibr.zzbW(zzd, inputStream);
        }

        public static zzaw zzk(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzaw) zzibr.zzbX(zzd, inputStream, zzibbVar);
        }

        public static zzaw zzl(InputStream inputStream) throws IOException {
            return (zzaw) zzibr.zzca(zzd, inputStream);
        }

        public static zzaw zzm(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzaw) zzibr.zzcb(zzd, inputStream, zzibbVar);
        }

        public static zzaw zzn(zziaq zziaqVar) throws IOException {
            return (zzaw) zzibr.zzbY(zzd, zziaqVar);
        }

        public static zzaw zzo(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzaw) zzibr.zzbZ(zzd, zziaqVar, zzibbVar);
        }

        public static zza zzp() {
            return (zza) zzd.zzbn();
        }

        public static zza zzq(zzaw zzawVar) {
            return (zza) zzd.zzbo(zzawVar);
        }

        public static zzaw zzr() {
            return zzd;
        }

        public static zzidk zzs() {
            return zzd.zzbd();
        }

        public static /* synthetic */ zzaw zzv() {
            return zzd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzw, reason: merged with bridge method [inline-methods] */
        public void zzt(zzb zzbVar) {
            this.zzc = zzbVar.zza();
            this.zzb |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzx, reason: merged with bridge method [inline-methods] */
        public void zzu() {
            this.zzb &= -2;
            this.zzc = 0;
        }

        public boolean zza() {
            return (this.zzb & 1) != 0;
        }

        public zzb zzb() {
            zzb zzc = zzb.zzc(this.zzc);
            return zzc == null ? zzb.VIDEO_ERROR_CODE_UNSPECIFIED : zzc;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzc", zzb.zze()});
            }
            if (ordinal == 3) {
                return new zzaw();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzd;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zze;
            if (zzidkVar == null) {
                synchronized (zzaw.class) {
                    try {
                        zzidkVar = zze;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzd);
                            zze = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }
    }

    public interface zzax extends zzidd {
        boolean zza();

        zzaw.zzb zzb();
    }

    public final class zzay extends zzibr implements zzaz {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzay zzj;
        private static volatile zzidk zzk;
        private int zze;
        private zzar zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        public final class zza extends zzibl implements zzaz {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzay) this.zza).zza();
            }

            public zzar zzb() {
                return ((zzay) this.zza).zzb();
            }

            public zza zzc(zzar zzarVar) {
                zzbg();
                ((zzay) this.zza).zzz(zzarVar);
                return this;
            }

            public zza zzd(zzar.zza zzaVar) {
                zzbg();
                ((zzay) this.zza).zzz((zzar) zzaVar.zzbu());
                return this;
            }

            public zza zze(zzar zzarVar) {
                zzbg();
                ((zzay) this.zza).zzA(zzarVar);
                return this;
            }

            public zza zzf() {
                zzbg();
                ((zzay) this.zza).zzB();
                return this;
            }

            public boolean zzg() {
                return ((zzay) this.zza).zzg();
            }

            public zzq zzh() {
                return ((zzay) this.zza).zzh();
            }

            public zza zzi(zzq zzqVar) {
                zzbg();
                ((zzay) this.zza).zzC(zzqVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzay) this.zza).zzD();
                return this;
            }

            public boolean zzk() {
                return ((zzay) this.zza).zzk();
            }

            public zzaw zzl() {
                return ((zzay) this.zza).zzl();
            }

            public zza zzm(zzaw zzawVar) {
                zzbg();
                ((zzay) this.zza).zzE(zzawVar);
                return this;
            }

            public zza zzn(zzaw.zza zzaVar) {
                zzbg();
                ((zzay) this.zza).zzE((zzaw) zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzaw zzawVar) {
                zzbg();
                ((zzay) this.zza).zzF(zzawVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzay) this.zza).zzG();
                return this;
            }

            public boolean zzq() {
                return ((zzay) this.zza).zzq();
            }

            public zzap zzr() {
                return ((zzay) this.zza).zzr();
            }

            public zza zzs(zzap zzapVar) {
                zzbg();
                ((zzay) this.zza).zzH(zzapVar);
                return this;
            }

            public zza zzt(zzap.zza zzaVar) {
                zzbg();
                ((zzay) this.zza).zzH((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzu(zzap zzapVar) {
                zzbg();
                ((zzay) this.zza).zzI(zzapVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzay) this.zza).zzJ();
                return this;
            }

            private zza() {
                super(zzay.zzK());
            }
        }

        static {
            zzay zzayVar = new zzay();
            zzj = zzayVar;
            zzibr.zzbu(zzay.class, zzayVar);
        }

        private zzay() {
        }

        public static /* synthetic */ zzay zzK() {
            return zzj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzz(zzar zzarVar) {
            zzarVar.getClass();
            this.zzf = zzarVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzA(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzf;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzt = zzar.zzt(zzarVar2);
                zzt.zzbo(zzarVar);
                zzarVar = (zzar) zzt.zzbt();
            }
            this.zzf = zzarVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzB() {
            this.zzf = null;
            this.zze &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzC(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zze &= -3;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzE(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzF(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzq = zzaw.zzq(zzawVar2);
                zzq.zzbo(zzawVar);
                zzawVar = (zzaw) zzq.zzbt();
            }
            this.zzh = zzawVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zzh = null;
            this.zze &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzH(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zze |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzI(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zzi = zzapVar;
            this.zze |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzi = null;
            this.zze &= -9;
        }

        public static zzay zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzay) zzibr.zzbR(zzj, byteBuffer);
        }

        public static zzay zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzay) zzibr.zzbQ(zzj, byteBuffer, zzibbVar);
        }

        public static zzay zze(zzian zzianVar) throws zzicg {
            return (zzay) zzibr.zzbS(zzj, zzianVar);
        }

        public static zzay zzi(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzay) zzibr.zzbT(zzj, zzianVar, zzibbVar);
        }

        public static zzay zzj(byte[] bArr) throws zzicg {
            return (zzay) zzibr.zzbU(zzj, bArr);
        }

        public static zzay zzm(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzay) zzibr.zzbV(zzj, bArr, zzibbVar);
        }

        public static zzay zzn(InputStream inputStream) throws IOException {
            return (zzay) zzibr.zzbW(zzj, inputStream);
        }

        public static zzay zzo(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzay) zzibr.zzbX(zzj, inputStream, zzibbVar);
        }

        public static zzay zzp(InputStream inputStream) throws IOException {
            return (zzay) zzibr.zzca(zzj, inputStream);
        }

        public static zzay zzs(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzay) zzibr.zzcb(zzj, inputStream, zzibbVar);
        }

        public static zzay zzt(zziaq zziaqVar) throws IOException {
            return (zzay) zzibr.zzbY(zzj, zziaqVar);
        }

        public static zzay zzu(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzay) zzibr.zzbZ(zzj, zziaqVar, zzibbVar);
        }

        public static zza zzv() {
            return (zza) zzj.zzbn();
        }

        public static zza zzw(zzay zzayVar) {
            return (zza) zzj.zzbo(zzayVar);
        }

        public static zzay zzx() {
            return zzj;
        }

        public static zzidk zzy() {
            return zzj.zzbd();
        }

        public boolean zza() {
            return (this.zze & 1) != 0;
        }

        public zzar zzb() {
            zzar zzarVar = this.zzf;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", zzq.zze(), "zzh", "zzi"});
            }
            if (ordinal == 3) {
                return new zzay();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzj;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzk;
            if (zzidkVar == null) {
                synchronized (zzay.class) {
                    try {
                        zzidkVar = zzk;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzj);
                            zzk = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        public zzq zzh() {
            zzq zzc2 = zzq.zzc(this.zzg);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public boolean zzk() {
            return (this.zze & 4) != 0;
        }

        public zzaw zzl() {
            zzaw zzawVar = this.zzh;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        public boolean zzq() {
            return (this.zze & 8) != 0;
        }

        public zzap zzr() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzaz extends zzidd {
        boolean zza();

        zzar zzb();

        boolean zzg();

        zzq zzh();

        boolean zzk();

        zzaw zzl();

        boolean zzq();

        zzap zzr();
    }

    public final class zzb extends zzibr implements zzc {
        public static final int zza = 1;
        private static final zzb zzc;
        private static volatile zzidk zzd;
        private zzicd zzb = zzibr.zzbM();

        public final class zza extends zzibr implements zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zza zzh;
            private static volatile zzidk zzi;
            private int zzd;
            private int zze;
            private zze zzf;
            private zzg zzg;

            public final class zza extends zzibl implements zzb {
                public /* synthetic */ zza(byte[] bArr) {
                    this();
                }

                public boolean zza() {
                    return ((zza) this.zza).zza();
                }

                public zzd zzb() {
                    return ((zza) this.zza).zzb();
                }

                public zza zzc(zzd zzdVar) {
                    zzbg();
                    ((zza) this.zza).zzw(zzdVar);
                    return this;
                }

                public zza zzd() {
                    zzbg();
                    ((zza) this.zza).zzx();
                    return this;
                }

                public boolean zze() {
                    return ((zza) this.zza).zze();
                }

                public zze zzf() {
                    return ((zza) this.zza).zzf();
                }

                public zza zzg(zze zzeVar) {
                    zzbg();
                    ((zza) this.zza).zzy(zzeVar);
                    return this;
                }

                public zza zzh(zze.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzy((zze) zzaVar.zzbu());
                    return this;
                }

                public zza zzi(zze zzeVar) {
                    zzbg();
                    ((zza) this.zza).zzz(zzeVar);
                    return this;
                }

                public zza zzj() {
                    zzbg();
                    ((zza) this.zza).zzA();
                    return this;
                }

                public boolean zzk() {
                    return ((zza) this.zza).zzk();
                }

                public zzg zzl() {
                    return ((zza) this.zza).zzl();
                }

                public zza zzm(zzg zzgVar) {
                    zzbg();
                    ((zza) this.zza).zzB(zzgVar);
                    return this;
                }

                public zza zzn(zzg.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzB((zzg) zzaVar.zzbu());
                    return this;
                }

                public zza zzo(zzg zzgVar) {
                    zzbg();
                    ((zza) this.zza).zzC(zzgVar);
                    return this;
                }

                public zza zzp() {
                    zzbg();
                    ((zza) this.zza).zzD();
                    return this;
                }

                private zza() {
                    super(zza.zzE());
                }
            }

            static {
                zza zzaVar = new zza();
                zzh = zzaVar;
                zzibr.zzbu(zza.class, zzaVar);
            }

            private zza() {
            }

            public static /* synthetic */ zza zzE() {
                return zzh;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzF, reason: merged with bridge method [inline-methods] */
            public void zzw(zzd zzdVar) {
                this.zze = zzdVar.zza();
                this.zzd |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzG, reason: merged with bridge method [inline-methods] */
            public void zzx() {
                this.zzd &= -2;
                this.zze = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
            public void zzy(zze zzeVar) {
                zzeVar.getClass();
                this.zzf = zzeVar;
                this.zzd |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzI, reason: merged with bridge method [inline-methods] */
            public void zzz(zze zzeVar) {
                zzeVar.getClass();
                zze zzeVar2 = this.zzf;
                if (zzeVar2 != null && zzeVar2 != zze.zzs()) {
                    zze.zza zzr = zze.zzr(zzeVar2);
                    zzr.zzbo(zzeVar);
                    zzeVar = (zze) zzr.zzbt();
                }
                this.zzf = zzeVar;
                this.zzd |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzJ, reason: merged with bridge method [inline-methods] */
            public void zzA() {
                this.zzf = null;
                this.zzd &= -3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
            public void zzB(zzg zzgVar) {
                zzgVar.getClass();
                this.zzg = zzgVar;
                this.zzd |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzL, reason: merged with bridge method [inline-methods] */
            public void zzC(zzg zzgVar) {
                zzgVar.getClass();
                zzg zzgVar2 = this.zzg;
                if (zzgVar2 != null && zzgVar2 != zzg.zzu()) {
                    zzg.zza zzt = zzg.zzt(zzgVar2);
                    zzt.zzbo(zzgVar);
                    zzgVar = (zzg) zzt.zzbt();
                }
                this.zzg = zzgVar;
                this.zzd |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzM, reason: merged with bridge method [inline-methods] */
            public void zzD() {
                this.zzg = null;
                this.zzd &= -5;
            }

            public static zza zzc(ByteBuffer byteBuffer) throws zzicg {
                return (zza) zzibr.zzbR(zzh, byteBuffer);
            }

            public static zza zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
                return (zza) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
            }

            public static zza zzg(zzian zzianVar) throws zzicg {
                return (zza) zzibr.zzbS(zzh, zzianVar);
            }

            public static zza zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
                return (zza) zzibr.zzbT(zzh, zzianVar, zzibbVar);
            }

            public static zza zzi(byte[] bArr) throws zzicg {
                return (zza) zzibr.zzbU(zzh, bArr);
            }

            public static zza zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
                return (zza) zzibr.zzbV(zzh, bArr, zzibbVar);
            }

            public static zza zzm(InputStream inputStream) throws IOException {
                return (zza) zzibr.zzbW(zzh, inputStream);
            }

            public static zza zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zza) zzibr.zzbX(zzh, inputStream, zzibbVar);
            }

            public static zza zzo(InputStream inputStream) throws IOException {
                return (zza) zzibr.zzca(zzh, inputStream);
            }

            public static zza zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zza) zzibr.zzcb(zzh, inputStream, zzibbVar);
            }

            public static zza zzq(zziaq zziaqVar) throws IOException {
                return (zza) zzibr.zzbY(zzh, zziaqVar);
            }

            public static zza zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
                return (zza) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
            }

            public static zza zzs() {
                return (zza) zzh.zzbn();
            }

            public static zza zzt(zza zzaVar) {
                return (zza) zzh.zzbo(zzaVar);
            }

            public static zza zzu() {
                return zzh;
            }

            public static zzidk zzv() {
                return zzh.zzbd();
            }

            public boolean zza() {
                return (this.zzd & 1) != 0;
            }

            public zzd zzb() {
                zzd zzc2 = zzd.zzc(this.zze);
                return zzc2 == null ? zzd.UNSPECIFIED : zzc2;
            }

            public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
                int ordinal = zzibqVar.ordinal();
                if (ordinal == 0) {
                    return (byte) 1;
                }
                if (ordinal == 2) {
                    return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzd.zze(), "zzf", "zzg"});
                }
                if (ordinal == 3) {
                    return new zza();
                }
                if (ordinal == 4) {
                    return new zza(null);
                }
                if (ordinal == 5) {
                    return zzh;
                }
                if (ordinal != 6) {
                    throw null;
                }
                zzidk zzidkVar = zzi;
                if (zzidkVar == null) {
                    synchronized (zza.class) {
                        try {
                            zzidkVar = zzi;
                            if (zzidkVar == null) {
                                zzidkVar = new zzibm(zzh);
                                zzi = zzidkVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzidkVar;
            }

            public boolean zze() {
                return (this.zzd & 2) != 0;
            }

            public zze zzf() {
                zze zzeVar = this.zzf;
                return zzeVar == null ? zze.zzs() : zzeVar;
            }

            public boolean zzk() {
                return (this.zzd & 4) != 0;
            }

            public zzg zzl() {
                zzg zzgVar = this.zzg;
                return zzgVar == null ? zzg.zzu() : zzgVar;
            }
        }

        public interface zzb extends zzidd {
            boolean zza();

            zzd zzb();

            boolean zze();

            zze zzf();

            boolean zzk();

            zzg zzl();
        }

        public final class zzc extends zzibl implements zzc {
            public /* synthetic */ zzc(byte[] bArr) {
                this();
            }

            public List zza() {
                return Collections.unmodifiableList(((zzb) this.zza).zza());
            }

            public int zzb() {
                return ((zzb) this.zza).zzb();
            }

            public zza zzc(int i) {
                return ((zzb) this.zza).zzc(i);
            }

            public zzc zzd(int i, zza zzaVar) {
                zzbg();
                ((zzb) this.zza).zzw(i, zzaVar);
                return this;
            }

            public zzc zze(int i, zza.zza zzaVar) {
                zzbg();
                ((zzb) this.zza).zzw(i, (zza) zzaVar.zzbu());
                return this;
            }

            public zzc zzf(zza zzaVar) {
                zzbg();
                ((zzb) this.zza).zzx(zzaVar);
                return this;
            }

            public zzc zzg(int i, zza zzaVar) {
                zzbg();
                ((zzb) this.zza).zzy(i, zzaVar);
                return this;
            }

            public zzc zzh(zza.zza zzaVar) {
                zzbg();
                ((zzb) this.zza).zzx((zza) zzaVar.zzbu());
                return this;
            }

            public zzc zzi(int i, zza.zza zzaVar) {
                zzbg();
                ((zzb) this.zza).zzy(i, (zza) zzaVar.zzbu());
                return this;
            }

            public zzc zzj(Iterable iterable) {
                zzbg();
                ((zzb) this.zza).zzz(iterable);
                return this;
            }

            public zzc zzk() {
                zzbg();
                ((zzb) this.zza).zzA();
                return this;
            }

            public zzc zzl(int i) {
                zzbg();
                ((zzb) this.zza).zzB(i);
                return this;
            }

            private zzc() {
                super(zzb.zzC());
            }
        }

        public enum zzd implements zzibv {
            UNSPECIFIED(0),
            IN_MEMORY(1);

            public static final int zzc = 0;
            public static final int zzd = 1;
            private static final zzibw zze = new 1();
            private final int zzf;

            public class 1 implements zzibw {
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd zzb(int i) {
                    return zzd.zzc(i);
                }
            }

            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                public boolean zza(int i) {
                    return zzd.zzc(i) != null;
                }
            }

            zzd(int i) {
                this.zzf = i;
            }

            public static zzd zzc(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return IN_MEMORY;
            }

            public static zzibw zzd() {
                return zze;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            public final String toString() {
                return Integer.toString(this.zzf);
            }

            public final int zza() {
                return this.zzf;
            }
        }

        public final class zze extends zzibr implements zzf {
            public static final int zza = 1;
            public static final int zzb = 2;
            private static final zze zzf;
            private static volatile zzidk zzg;
            private int zzc;
            private boolean zzd;
            private int zze;

            public final class zza extends zzibl implements zzf {
                public /* synthetic */ zza(byte[] bArr) {
                    this();
                }

                public boolean zza() {
                    return ((zze) this.zza).zza();
                }

                public boolean zzb() {
                    return ((zze) this.zza).zzb();
                }

                public zza zzc(boolean z) {
                    zzbg();
                    ((zze) this.zza).zzu(z);
                    return this;
                }

                public zza zzd() {
                    zzbg();
                    ((zze) this.zza).zzv();
                    return this;
                }

                public boolean zze() {
                    return ((zze) this.zza).zze();
                }

                public int zzf() {
                    return ((zze) this.zza).zzf();
                }

                public zza zzg(int i) {
                    zzbg();
                    ((zze) this.zza).zzw(i);
                    return this;
                }

                public zza zzh() {
                    zzbg();
                    ((zze) this.zza).zzx();
                    return this;
                }

                private zza() {
                    super(zze.zzy());
                }
            }

            static {
                zze zzeVar = new zze();
                zzf = zzeVar;
                zzibr.zzbu(zze.class, zzeVar);
            }

            private zze() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
            public void zzv() {
                this.zzc &= -2;
                this.zzd = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
            public void zzw(int i) {
                this.zzc |= 2;
                this.zze = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
            public void zzx() {
                this.zzc &= -3;
                this.zze = 0;
            }

            public static zze zzc(ByteBuffer byteBuffer) throws zzicg {
                return (zze) zzibr.zzbR(zzf, byteBuffer);
            }

            public static zze zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
                return (zze) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
            }

            public static zze zzg(zzian zzianVar) throws zzicg {
                return (zze) zzibr.zzbS(zzf, zzianVar);
            }

            public static zze zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
                return (zze) zzibr.zzbT(zzf, zzianVar, zzibbVar);
            }

            public static zze zzi(byte[] bArr) throws zzicg {
                return (zze) zzibr.zzbU(zzf, bArr);
            }

            public static zze zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
                return (zze) zzibr.zzbV(zzf, bArr, zzibbVar);
            }

            public static zze zzk(InputStream inputStream) throws IOException {
                return (zze) zzibr.zzbW(zzf, inputStream);
            }

            public static zze zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zze) zzibr.zzbX(zzf, inputStream, zzibbVar);
            }

            public static zze zzm(InputStream inputStream) throws IOException {
                return (zze) zzibr.zzca(zzf, inputStream);
            }

            public static zze zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zze) zzibr.zzcb(zzf, inputStream, zzibbVar);
            }

            public static zze zzo(zziaq zziaqVar) throws IOException {
                return (zze) zzibr.zzbY(zzf, zziaqVar);
            }

            public static zze zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
                return (zze) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
            }

            public static zza zzq() {
                return (zza) zzf.zzbn();
            }

            public static zza zzr(zze zzeVar) {
                return (zza) zzf.zzbo(zzeVar);
            }

            public static zze zzs() {
                return zzf;
            }

            public static zzidk zzt() {
                return zzf.zzbd();
            }

            public static /* synthetic */ zze zzy() {
                return zzf;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
            public void zzu(boolean z) {
                this.zzc |= 1;
                this.zzd = z;
            }

            public boolean zza() {
                return (this.zzc & 1) != 0;
            }

            public boolean zzb() {
                return this.zzd;
            }

            public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
                int ordinal = zzibqVar.ordinal();
                if (ordinal == 0) {
                    return (byte) 1;
                }
                if (ordinal == 2) {
                    return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
                }
                if (ordinal == 3) {
                    return new zze();
                }
                if (ordinal == 4) {
                    return new zza(null);
                }
                if (ordinal == 5) {
                    return zzf;
                }
                if (ordinal != 6) {
                    throw null;
                }
                zzidk zzidkVar = zzg;
                if (zzidkVar == null) {
                    synchronized (zze.class) {
                        try {
                            zzidkVar = zzg;
                            if (zzidkVar == null) {
                                zzidkVar = new zzibm(zzf);
                                zzg = zzidkVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzidkVar;
            }

            public boolean zze() {
                return (this.zzc & 2) != 0;
            }

            public int zzf() {
                return this.zze;
            }
        }

        public interface zzf extends zzidd {
            boolean zza();

            boolean zzb();

            boolean zze();

            int zzf();
        }

        public final class zzg extends zzibr implements zzh {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zzg zzh;
            private static volatile zzidk zzi;
            private int zzd;
            private boolean zze;
            private boolean zzf;
            private int zzg;

            public final class zza extends zzibl implements zzh {
                public /* synthetic */ zza(byte[] bArr) {
                    this();
                }

                public boolean zza() {
                    return ((zzg) this.zza).zza();
                }

                public boolean zzb() {
                    return ((zzg) this.zza).zzb();
                }

                public zza zzc(boolean z) {
                    zzbg();
                    ((zzg) this.zza).zzw(z);
                    return this;
                }

                public zza zzd() {
                    zzbg();
                    ((zzg) this.zza).zzx();
                    return this;
                }

                public boolean zze() {
                    return ((zzg) this.zza).zze();
                }

                public boolean zzf() {
                    return ((zzg) this.zza).zzf();
                }

                public zza zzg(boolean z) {
                    zzbg();
                    ((zzg) this.zza).zzy(z);
                    return this;
                }

                public zza zzh() {
                    zzbg();
                    ((zzg) this.zza).zzz();
                    return this;
                }

                public boolean zzi() {
                    return ((zzg) this.zza).zzi();
                }

                public int zzj() {
                    return ((zzg) this.zza).zzj();
                }

                public zza zzk(int i) {
                    zzbg();
                    ((zzg) this.zza).zzA(i);
                    return this;
                }

                public zza zzl() {
                    zzbg();
                    ((zzg) this.zza).zzB();
                    return this;
                }

                private zza() {
                    super(zzg.zzC());
                }
            }

            static {
                zzg zzgVar = new zzg();
                zzh = zzgVar;
                zzibr.zzbu(zzg.class, zzgVar);
            }

            private zzg() {
            }

            public static /* synthetic */ zzg zzC() {
                return zzh;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
            public void zzw(boolean z) {
                this.zzd |= 1;
                this.zze = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzE, reason: merged with bridge method [inline-methods] */
            public void zzx() {
                this.zzd &= -2;
                this.zze = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzF, reason: merged with bridge method [inline-methods] */
            public void zzy(boolean z) {
                this.zzd |= 2;
                this.zzf = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzG, reason: merged with bridge method [inline-methods] */
            public void zzz() {
                this.zzd &= -3;
                this.zzf = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
            public void zzA(int i) {
                this.zzd |= 4;
                this.zzg = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: zzI, reason: merged with bridge method [inline-methods] */
            public void zzB() {
                this.zzd &= -5;
                this.zzg = 0;
            }

            public static zzg zzc(ByteBuffer byteBuffer) throws zzicg {
                return (zzg) zzibr.zzbR(zzh, byteBuffer);
            }

            public static zzg zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
                return (zzg) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
            }

            public static zzg zzg(zzian zzianVar) throws zzicg {
                return (zzg) zzibr.zzbS(zzh, zzianVar);
            }

            public static zzg zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
                return (zzg) zzibr.zzbT(zzh, zzianVar, zzibbVar);
            }

            public static zzg zzk(byte[] bArr) throws zzicg {
                return (zzg) zzibr.zzbU(zzh, bArr);
            }

            public static zzg zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
                return (zzg) zzibr.zzbV(zzh, bArr, zzibbVar);
            }

            public static zzg zzm(InputStream inputStream) throws IOException {
                return (zzg) zzibr.zzbW(zzh, inputStream);
            }

            public static zzg zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zzg) zzibr.zzbX(zzh, inputStream, zzibbVar);
            }

            public static zzg zzo(InputStream inputStream) throws IOException {
                return (zzg) zzibr.zzca(zzh, inputStream);
            }

            public static zzg zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zzg) zzibr.zzcb(zzh, inputStream, zzibbVar);
            }

            public static zzg zzq(zziaq zziaqVar) throws IOException {
                return (zzg) zzibr.zzbY(zzh, zziaqVar);
            }

            public static zzg zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
                return (zzg) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
            }

            public static zza zzs() {
                return (zza) zzh.zzbn();
            }

            public static zza zzt(zzg zzgVar) {
                return (zza) zzh.zzbo(zzgVar);
            }

            public static zzg zzu() {
                return zzh;
            }

            public static zzidk zzv() {
                return zzh.zzbd();
            }

            public boolean zza() {
                return (this.zzd & 1) != 0;
            }

            public boolean zzb() {
                return this.zze;
            }

            public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
                int ordinal = zzibqVar.ordinal();
                if (ordinal == 0) {
                    return (byte) 1;
                }
                if (ordinal == 2) {
                    return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
                }
                if (ordinal == 3) {
                    return new zzg();
                }
                if (ordinal == 4) {
                    return new zza(null);
                }
                if (ordinal == 5) {
                    return zzh;
                }
                if (ordinal != 6) {
                    throw null;
                }
                zzidk zzidkVar = zzi;
                if (zzidkVar == null) {
                    synchronized (zzg.class) {
                        try {
                            zzidkVar = zzi;
                            if (zzidkVar == null) {
                                zzidkVar = new zzibm(zzh);
                                zzi = zzidkVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzidkVar;
            }

            public boolean zze() {
                return (this.zzd & 2) != 0;
            }

            public boolean zzf() {
                return this.zzf;
            }

            public boolean zzi() {
                return (this.zzd & 4) != 0;
            }

            public int zzj() {
                return this.zzg;
            }
        }

        public interface zzh extends zzidd {
            boolean zza();

            boolean zzb();

            boolean zze();

            boolean zzf();

            boolean zzi();

            int zzj();
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzibr.zzbu(zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static /* synthetic */ zzb zzC() {
            return zzc;
        }

        private void zzD() {
            zzicd zzicdVar = this.zzb;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzb = zzibr.zzbN(zzicdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzw(int i, zza zzaVar) {
            zzaVar.getClass();
            zzD();
            this.zzb.set(i, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzx(zza zzaVar) {
            zzaVar.getClass();
            zzD();
            this.zzb.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzy(int i, zza zzaVar) {
            zzaVar.getClass();
            zzD();
            this.zzb.add(i, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzz(Iterable iterable) {
            zzD();
            zzhzw.zzaW(iterable, this.zzb);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zzb = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzB(int i) {
            zzD();
            this.zzb.remove(i);
        }

        public static zzb zzg(ByteBuffer byteBuffer) throws zzicg {
            return (zzb) zzibr.zzbR(zzc, byteBuffer);
        }

        public static zzb zzh(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzb) zzibr.zzbQ(zzc, byteBuffer, zzibbVar);
        }

        public static zzb zzi(zzian zzianVar) throws zzicg {
            return (zzb) zzibr.zzbS(zzc, zzianVar);
        }

        public static zzb zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzb) zzibr.zzbT(zzc, zzianVar, zzibbVar);
        }

        public static zzb zzk(byte[] bArr) throws zzicg {
            return (zzb) zzibr.zzbU(zzc, bArr);
        }

        public static zzb zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzb) zzibr.zzbV(zzc, bArr, zzibbVar);
        }

        public static zzb zzm(InputStream inputStream) throws IOException {
            return (zzb) zzibr.zzbW(zzc, inputStream);
        }

        public static zzb zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzb) zzibr.zzbX(zzc, inputStream, zzibbVar);
        }

        public static zzb zzo(InputStream inputStream) throws IOException {
            return (zzb) zzibr.zzca(zzc, inputStream);
        }

        public static zzb zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzb) zzibr.zzcb(zzc, inputStream, zzibbVar);
        }

        public static zzb zzq(zziaq zziaqVar) throws IOException {
            return (zzb) zzibr.zzbY(zzc, zziaqVar);
        }

        public static zzb zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzb) zzibr.zzbZ(zzc, zziaqVar, zzibbVar);
        }

        public static zzc zzs() {
            return (zzc) zzc.zzbn();
        }

        public static zzc zzt(zzb zzbVar) {
            return (zzc) zzc.zzbo(zzbVar);
        }

        public static zzb zzu() {
            return zzc;
        }

        public static zzidk zzv() {
            return zzc.zzbd();
        }

        public List zza() {
            return this.zzb;
        }

        public int zzb() {
            return this.zzb.size();
        }

        public zza zzc(int i) {
            return (zza) this.zzb.get(i);
        }

        public List zzd() {
            return this.zzb;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zza.class});
            }
            if (ordinal == 3) {
                return new zzb();
            }
            if (ordinal == 4) {
                return new zzc(null);
            }
            if (ordinal == 5) {
                return zzc;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzd;
            if (zzidkVar == null) {
                synchronized (zzb.class) {
                    try {
                        zzidkVar = zzd;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzc);
                            zzd = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public zzb zze(int i) {
            return (zzb) this.zzb.get(i);
        }
    }

    public final class zzba extends zzibr implements zzbb {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzba zzl;
        private static volatile zzidk zzm;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private int zzi;
        private int zzj;
        private int zzk;

        public final class zza extends zzibl implements zzbb {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzba) this.zza).zza();
            }

            public zzq zzb() {
                return ((zzba) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzba) this.zza).zzA(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzba) this.zza).zzB();
                return this;
            }

            public boolean zze() {
                return ((zzba) this.zza).zze();
            }

            public zzaw zzf() {
                return ((zzba) this.zza).zzf();
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzba) this.zza).zzC(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzba) this.zza).zzC((zzaw) zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzba) this.zza).zzD(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzba) this.zza).zzE();
                return this;
            }

            public boolean zzk() {
                return ((zzba) this.zza).zzk();
            }

            public int zzl() {
                return ((zzba) this.zza).zzl();
            }

            public zza zzm(int i) {
                zzbg();
                ((zzba) this.zza).zzF(i);
                return this;
            }

            public zza zzn() {
                zzbg();
                ((zzba) this.zza).zzG();
                return this;
            }

            public boolean zzo() {
                return ((zzba) this.zza).zzo();
            }

            public int zzp() {
                return ((zzba) this.zza).zzp();
            }

            public zza zzq(int i) {
                zzbg();
                ((zzba) this.zza).zzH(i);
                return this;
            }

            public zza zzr() {
                zzbg();
                ((zzba) this.zza).zzI();
                return this;
            }

            public boolean zzs() {
                return ((zzba) this.zza).zzs();
            }

            public int zzt() {
                return ((zzba) this.zza).zzt();
            }

            public zza zzu(int i) {
                zzbg();
                ((zzba) this.zza).zzJ(i);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzba) this.zza).zzK();
                return this;
            }

            private zza() {
                super(zzba.zzL());
            }
        }

        static {
            zzba zzbaVar = new zzba();
            zzl = zzbaVar;
            zzibr.zzbu(zzba.class, zzbaVar);
        }

        private zzba() {
        }

        public static /* synthetic */ zzba zzL() {
            return zzl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzA(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzB() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzC(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzD(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzq = zzaw.zzq(zzawVar2);
                zzq.zzbo(zzawVar);
                zzawVar = (zzaw) zzq.zzbt();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzE() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzF(int i) {
            this.zzf |= 4;
            this.zzi = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zzf &= -5;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzH(int i) {
            this.zzf |= 8;
            this.zzj = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzf &= -9;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzJ(int i) {
            this.zzf |= 16;
            this.zzk = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzK() {
            this.zzf &= -17;
            this.zzk = 0;
        }

        public static zzba zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzba) zzibr.zzbR(zzl, byteBuffer);
        }

        public static zzba zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzba) zzibr.zzbQ(zzl, byteBuffer, zzibbVar);
        }

        public static zzba zzg(zzian zzianVar) throws zzicg {
            return (zzba) zzibr.zzbS(zzl, zzianVar);
        }

        public static zzba zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzba) zzibr.zzbT(zzl, zzianVar, zzibbVar);
        }

        public static zzba zzi(byte[] bArr) throws zzicg {
            return (zzba) zzibr.zzbU(zzl, bArr);
        }

        public static zzba zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzba) zzibr.zzbV(zzl, bArr, zzibbVar);
        }

        public static zzba zzm(InputStream inputStream) throws IOException {
            return (zzba) zzibr.zzbW(zzl, inputStream);
        }

        public static zzba zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzba) zzibr.zzbX(zzl, inputStream, zzibbVar);
        }

        public static zzba zzq(InputStream inputStream) throws IOException {
            return (zzba) zzibr.zzca(zzl, inputStream);
        }

        public static zzba zzr(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzba) zzibr.zzcb(zzl, inputStream, zzibbVar);
        }

        public static zzba zzu(zziaq zziaqVar) throws IOException {
            return (zzba) zzibr.zzbY(zzl, zziaqVar);
        }

        public static zzba zzv(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzba) zzibr.zzbZ(zzl, zziaqVar, zzibbVar);
        }

        public static zza zzw() {
            return (zza) zzl.zzbn();
        }

        public static zza zzx(zzba zzbaVar) {
            return (zza) zzl.zzbo(zzbaVar);
        }

        public static zzba zzy() {
            return zzl;
        }

        public static zzidk zzz() {
            return zzl.zzbd();
        }

        public boolean zza() {
            return (this.zzf & 1) != 0;
        }

        public zzq zzb() {
            zzq zzc2 = zzq.zzc(this.zzg);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi", "zzj", "zzk"});
            }
            if (ordinal == 3) {
                return new zzba();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzl;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzm;
            if (zzidkVar == null) {
                synchronized (zzba.class) {
                    try {
                        zzidkVar = zzm;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzl);
                            zzm = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzf & 2) != 0;
        }

        public zzaw zzf() {
            zzaw zzawVar = this.zzh;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        public boolean zzk() {
            return (this.zzf & 4) != 0;
        }

        public int zzl() {
            return this.zzi;
        }

        public boolean zzo() {
            return (this.zzf & 8) != 0;
        }

        public int zzp() {
            return this.zzj;
        }

        public boolean zzs() {
            return (this.zzf & 16) != 0;
        }

        public int zzt() {
            return this.zzk;
        }
    }

    public interface zzbb extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        int zzl();

        boolean zzo();

        int zzp();

        boolean zzs();

        int zzt();
    }

    public final class zzbc extends zzibr implements zzbd {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbc zzh;
        private static volatile zzidk zzi;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        public final class zza extends zzibl implements zzbd {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzbc) this.zza).zza();
            }

            public zzq zzb() {
                return ((zzbc) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzbc) this.zza).zzw(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbc) this.zza).zzx();
                return this;
            }

            public boolean zze() {
                return ((zzbc) this.zza).zze();
            }

            public zzaw zzf() {
                return ((zzbc) this.zza).zzf();
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzbc) this.zza).zzy(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzbc) this.zza).zzy((zzaw) zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzbc) this.zza).zzz(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzbc) this.zza).zzA();
                return this;
            }

            public boolean zzk() {
                return ((zzbc) this.zza).zzk();
            }

            public zzap zzl() {
                return ((zzbc) this.zza).zzl();
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzbc) this.zza).zzB(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzbc) this.zza).zzB((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzbc) this.zza).zzC(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzbc) this.zza).zzD();
                return this;
            }

            private zza() {
                super(zzbc.zzE());
            }
        }

        static {
            zzbc zzbcVar = new zzbc();
            zzh = zzbcVar;
            zzibr.zzbu(zzbc.class, zzbcVar);
        }

        private zzbc() {
        }

        public static /* synthetic */ zzbc zzE() {
            return zzh;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzw(zzq zzqVar) {
            this.zze = zzqVar.zza();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzd &= -2;
            this.zze = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzy(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzz(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzf;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzq = zzaw.zzq(zzawVar2);
                zzq.zzbo(zzawVar);
                zzawVar = (zzaw) zzq.zzbt();
            }
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zzf = null;
            this.zzd &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
        public void zzB(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzC(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzg = null;
            this.zzd &= -5;
        }

        public static zzbc zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzbc) zzibr.zzbR(zzh, byteBuffer);
        }

        public static zzbc zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzbc) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
        }

        public static zzbc zzg(zzian zzianVar) throws zzicg {
            return (zzbc) zzibr.zzbS(zzh, zzianVar);
        }

        public static zzbc zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzbc) zzibr.zzbT(zzh, zzianVar, zzibbVar);
        }

        public static zzbc zzi(byte[] bArr) throws zzicg {
            return (zzbc) zzibr.zzbU(zzh, bArr);
        }

        public static zzbc zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzbc) zzibr.zzbV(zzh, bArr, zzibbVar);
        }

        public static zzbc zzm(InputStream inputStream) throws IOException {
            return (zzbc) zzibr.zzbW(zzh, inputStream);
        }

        public static zzbc zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbc) zzibr.zzbX(zzh, inputStream, zzibbVar);
        }

        public static zzbc zzo(InputStream inputStream) throws IOException {
            return (zzbc) zzibr.zzca(zzh, inputStream);
        }

        public static zzbc zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbc) zzibr.zzcb(zzh, inputStream, zzibbVar);
        }

        public static zzbc zzq(zziaq zziaqVar) throws IOException {
            return (zzbc) zzibr.zzbY(zzh, zziaqVar);
        }

        public static zzbc zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzbc) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
        }

        public static zza zzs() {
            return (zza) zzh.zzbn();
        }

        public static zza zzt(zzbc zzbcVar) {
            return (zza) zzh.zzbo(zzbcVar);
        }

        public static zzbc zzu() {
            return zzh;
        }

        public static zzidk zzv() {
            return zzh.zzbd();
        }

        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        public zzq zzb() {
            zzq zzc2 = zzq.zzc(this.zze);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzq.zze(), "zzf", "zzg"});
            }
            if (ordinal == 3) {
                return new zzbc();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzh;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzi;
            if (zzidkVar == null) {
                synchronized (zzbc.class) {
                    try {
                        zzidkVar = zzi;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzh);
                            zzi = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzd & 2) != 0;
        }

        public zzaw zzf() {
            zzaw zzawVar = this.zzf;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        public boolean zzk() {
            return (this.zzd & 4) != 0;
        }

        public zzap zzl() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzbd extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        zzap zzl();
    }

    public final class zzbe extends zzibr implements zzbf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzbe zzn;
        private static volatile zzidk zzo;
        private int zzg;
        private int zzh = 1000;
        private zzaw zzi;
        private int zzj;
        private int zzk;
        private int zzl;
        private long zzm;

        public final class zza extends zzibl implements zzbf {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzbe) this.zza).zza();
            }

            public zzq zzb() {
                return ((zzbe) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzbe) this.zza).zzC(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbe) this.zza).zzD();
                return this;
            }

            public boolean zze() {
                return ((zzbe) this.zza).zze();
            }

            public zzaw zzf() {
                return ((zzbe) this.zza).zzf();
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzbe) this.zza).zzE(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzbe) this.zza).zzE((zzaw) zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzbe) this.zza).zzF(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzbe) this.zza).zzG();
                return this;
            }

            public boolean zzk() {
                return ((zzbe) this.zza).zzk();
            }

            public int zzl() {
                return ((zzbe) this.zza).zzl();
            }

            public zza zzm(int i) {
                zzbg();
                ((zzbe) this.zza).zzH(i);
                return this;
            }

            public zza zzn() {
                zzbg();
                ((zzbe) this.zza).zzI();
                return this;
            }

            public boolean zzo() {
                return ((zzbe) this.zza).zzo();
            }

            public int zzp() {
                return ((zzbe) this.zza).zzp();
            }

            public zza zzq(int i) {
                zzbg();
                ((zzbe) this.zza).zzJ(i);
                return this;
            }

            public zza zzr() {
                zzbg();
                ((zzbe) this.zza).zzK();
                return this;
            }

            public boolean zzs() {
                return ((zzbe) this.zza).zzs();
            }

            public int zzt() {
                return ((zzbe) this.zza).zzt();
            }

            public zza zzu(int i) {
                zzbg();
                ((zzbe) this.zza).zzL(i);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzbe) this.zza).zzM();
                return this;
            }

            public boolean zzw() {
                return ((zzbe) this.zza).zzw();
            }

            public long zzx() {
                return ((zzbe) this.zza).zzx();
            }

            public zza zzy(long j) {
                zzbg();
                ((zzbe) this.zza).zzN(j);
                return this;
            }

            public zza zzz() {
                zzbg();
                ((zzbe) this.zza).zzO();
                return this;
            }

            private zza() {
                super(zzbe.zzP());
            }
        }

        static {
            zzbe zzbeVar = new zzbe();
            zzn = zzbeVar;
            zzibr.zzbu(zzbe.class, zzbeVar);
        }

        private zzbe() {
        }

        public static zzbe zzA() {
            return zzn;
        }

        public static zzidk zzB() {
            return zzn.zzbd();
        }

        public static /* synthetic */ zzbe zzP() {
            return zzn;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzC(zzq zzqVar) {
            this.zzh = zzqVar.zza();
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzg &= -2;
            this.zzh = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzE(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzi = zzawVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzF(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzi;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzq = zzaw.zzq(zzawVar2);
                zzq.zzbo(zzawVar);
                zzawVar = (zzaw) zzq.zzbt();
            }
            this.zzi = zzawVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zzi = null;
            this.zzg &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzH(int i) {
            this.zzg |= 4;
            this.zzj = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzg &= -5;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzJ(int i) {
            this.zzg |= 8;
            this.zzk = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public void zzK() {
            this.zzg &= -9;
            this.zzk = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzL(int i) {
            this.zzg |= 16;
            this.zzl = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzg &= -17;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzab, reason: merged with bridge method [inline-methods] */
        public void zzN(long j) {
            this.zzg |= 32;
            this.zzm = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzO() {
            this.zzg &= -33;
            this.zzm = 0L;
        }

        public static zzbe zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzbe) zzibr.zzbR(zzn, byteBuffer);
        }

        public static zzbe zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzbe) zzibr.zzbQ(zzn, byteBuffer, zzibbVar);
        }

        public static zzbe zzg(zzian zzianVar) throws zzicg {
            return (zzbe) zzibr.zzbS(zzn, zzianVar);
        }

        public static zzbe zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzbe) zzibr.zzbT(zzn, zzianVar, zzibbVar);
        }

        public static zzbe zzi(byte[] bArr) throws zzicg {
            return (zzbe) zzibr.zzbU(zzn, bArr);
        }

        public static zzbe zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzbe) zzibr.zzbV(zzn, bArr, zzibbVar);
        }

        public static zzbe zzm(InputStream inputStream) throws IOException {
            return (zzbe) zzibr.zzbW(zzn, inputStream);
        }

        public static zzbe zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbe) zzibr.zzbX(zzn, inputStream, zzibbVar);
        }

        public static zzbe zzq(InputStream inputStream) throws IOException {
            return (zzbe) zzibr.zzca(zzn, inputStream);
        }

        public static zzbe zzr(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbe) zzibr.zzcb(zzn, inputStream, zzibbVar);
        }

        public static zzbe zzu(zziaq zziaqVar) throws IOException {
            return (zzbe) zzibr.zzbY(zzn, zziaqVar);
        }

        public static zzbe zzv(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzbe) zzibr.zzbZ(zzn, zziaqVar, zzibbVar);
        }

        public static zza zzy() {
            return (zza) zzn.zzbn();
        }

        public static zza zzz(zzbe zzbeVar) {
            return (zza) zzn.zzbo(zzbeVar);
        }

        public boolean zza() {
            return (this.zzg & 1) != 0;
        }

        public zzq zzb() {
            zzq zzc2 = zzq.zzc(this.zzh);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzg", "zzh", zzq.zze(), "zzi", "zzj", "zzk", "zzl", "zzm"});
            }
            if (ordinal == 3) {
                return new zzbe();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzn;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzo;
            if (zzidkVar == null) {
                synchronized (zzbe.class) {
                    try {
                        zzidkVar = zzo;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzn);
                            zzo = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzg & 2) != 0;
        }

        public zzaw zzf() {
            zzaw zzawVar = this.zzi;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        public boolean zzk() {
            return (this.zzg & 4) != 0;
        }

        public int zzl() {
            return this.zzj;
        }

        public boolean zzo() {
            return (this.zzg & 8) != 0;
        }

        public int zzp() {
            return this.zzk;
        }

        public boolean zzs() {
            return (this.zzg & 16) != 0;
        }

        public int zzt() {
            return this.zzl;
        }

        public boolean zzw() {
            return (this.zzg & 32) != 0;
        }

        public long zzx() {
            return this.zzm;
        }
    }

    public interface zzbf extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        int zzl();

        boolean zzo();

        int zzp();

        boolean zzs();

        int zzt();

        boolean zzw();

        long zzx();
    }

    public final class zzbg extends zzibr implements zzbh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbg zzh;
        private static volatile zzidk zzi;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        public final class zza extends zzibl implements zzbh {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzbg) this.zza).zza();
            }

            public zzq zzb() {
                return ((zzbg) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzbg) this.zza).zzw(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbg) this.zza).zzx();
                return this;
            }

            public boolean zze() {
                return ((zzbg) this.zza).zze();
            }

            public zzaw zzf() {
                return ((zzbg) this.zza).zzf();
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzbg) this.zza).zzy(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzbg) this.zza).zzy((zzaw) zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzbg) this.zza).zzz(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzbg) this.zza).zzA();
                return this;
            }

            public boolean zzk() {
                return ((zzbg) this.zza).zzk();
            }

            public zzap zzl() {
                return ((zzbg) this.zza).zzl();
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzbg) this.zza).zzB(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzbg) this.zza).zzB((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzbg) this.zza).zzC(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzbg) this.zza).zzD();
                return this;
            }

            private zza() {
                super(zzbg.zzE());
            }
        }

        static {
            zzbg zzbgVar = new zzbg();
            zzh = zzbgVar;
            zzibr.zzbu(zzbg.class, zzbgVar);
        }

        private zzbg() {
        }

        public static /* synthetic */ zzbg zzE() {
            return zzh;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzw(zzq zzqVar) {
            this.zze = zzqVar.zza();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzd &= -2;
            this.zze = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzy(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzz(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzf;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzq = zzaw.zzq(zzawVar2);
                zzq.zzbo(zzawVar);
                zzawVar = (zzaw) zzq.zzbt();
            }
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zzf = null;
            this.zzd &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
        public void zzB(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzC(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzg = null;
            this.zzd &= -5;
        }

        public static zzbg zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzbg) zzibr.zzbR(zzh, byteBuffer);
        }

        public static zzbg zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzbg) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
        }

        public static zzbg zzg(zzian zzianVar) throws zzicg {
            return (zzbg) zzibr.zzbS(zzh, zzianVar);
        }

        public static zzbg zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzbg) zzibr.zzbT(zzh, zzianVar, zzibbVar);
        }

        public static zzbg zzi(byte[] bArr) throws zzicg {
            return (zzbg) zzibr.zzbU(zzh, bArr);
        }

        public static zzbg zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzbg) zzibr.zzbV(zzh, bArr, zzibbVar);
        }

        public static zzbg zzm(InputStream inputStream) throws IOException {
            return (zzbg) zzibr.zzbW(zzh, inputStream);
        }

        public static zzbg zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbg) zzibr.zzbX(zzh, inputStream, zzibbVar);
        }

        public static zzbg zzo(InputStream inputStream) throws IOException {
            return (zzbg) zzibr.zzca(zzh, inputStream);
        }

        public static zzbg zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbg) zzibr.zzcb(zzh, inputStream, zzibbVar);
        }

        public static zzbg zzq(zziaq zziaqVar) throws IOException {
            return (zzbg) zzibr.zzbY(zzh, zziaqVar);
        }

        public static zzbg zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzbg) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
        }

        public static zza zzs() {
            return (zza) zzh.zzbn();
        }

        public static zza zzt(zzbg zzbgVar) {
            return (zza) zzh.zzbo(zzbgVar);
        }

        public static zzbg zzu() {
            return zzh;
        }

        public static zzidk zzv() {
            return zzh.zzbd();
        }

        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        public zzq zzb() {
            zzq zzc2 = zzq.zzc(this.zze);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzq.zze(), "zzf", "zzg"});
            }
            if (ordinal == 3) {
                return new zzbg();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzh;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzi;
            if (zzidkVar == null) {
                synchronized (zzbg.class) {
                    try {
                        zzidkVar = zzi;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzh);
                            zzi = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzd & 2) != 0;
        }

        public zzaw zzf() {
            zzaw zzawVar = this.zzf;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        public boolean zzk() {
            return (this.zzd & 4) != 0;
        }

        public zzap zzl() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzbh extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        zzap zzl();
    }

    public interface zzbi extends zzidd {
        boolean zzE();

        zzbc zzF();

        boolean zzK();

        zzay zzL();

        boolean zzQ();

        int zzR();

        boolean zzU();

        int zzV();

        boolean zzY();

        zzap zzZ();

        boolean zza();

        boolean zzae();

        int zzaf();

        boolean zzai();

        int zzaj();

        boolean zzam();

        int zzan();

        boolean zzaq();

        int zzar();

        boolean zzau();

        int zzav();

        boolean zzay();

        long zzaz();

        zzba zzb();

        boolean zzg();

        zzbe zzh();

        boolean zzm();

        zzbg zzn();

        boolean zzs();

        zzbj zzt();

        boolean zzy();

        zzau zzz();
    }

    public final class zzbj extends zzibr implements zzbk {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbj zzf;
        private static volatile zzidk zzg;
        private int zzc;
        private int zzd = 1000;
        private zzaw zze;

        public final class zza extends zzibl implements zzbk {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzbj) this.zza).zza();
            }

            public zzq zzb() {
                return ((zzbj) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzbj) this.zza).zzu(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbj) this.zza).zzv();
                return this;
            }

            public boolean zze() {
                return ((zzbj) this.zza).zze();
            }

            public zzaw zzf() {
                return ((zzbj) this.zza).zzf();
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzbj) this.zza).zzw(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzbj) this.zza).zzw((zzaw) zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzbj) this.zza).zzx(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzbj) this.zza).zzy();
                return this;
            }

            private zza() {
                super(zzbj.zzz());
            }
        }

        static {
            zzbj zzbjVar = new zzbj();
            zzf = zzbjVar;
            zzibr.zzbu(zzbj.class, zzbjVar);
        }

        private zzbj() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzu(zzq zzqVar) {
            this.zzd = zzqVar.zza();
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzw(zzaw zzawVar) {
            zzawVar.getClass();
            this.zze = zzawVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzx(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zze;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzq = zzaw.zzq(zzawVar2);
                zzq.zzbo(zzawVar);
                zzawVar = (zzaw) zzq.zzbt();
            }
            this.zze = zzawVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzy() {
            this.zze = null;
            this.zzc &= -3;
        }

        public static zzbj zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzbj) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzbj zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzbj) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzbj zzg(zzian zzianVar) throws zzicg {
            return (zzbj) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzbj zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzbj) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzbj zzi(byte[] bArr) throws zzicg {
            return (zzbj) zzibr.zzbU(zzf, bArr);
        }

        public static zzbj zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzbj) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzbj zzk(InputStream inputStream) throws IOException {
            return (zzbj) zzibr.zzbW(zzf, inputStream);
        }

        public static zzbj zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbj) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzbj zzm(InputStream inputStream) throws IOException {
            return (zzbj) zzibr.zzca(zzf, inputStream);
        }

        public static zzbj zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbj) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzbj zzo(zziaq zziaqVar) throws IOException {
            return (zzbj) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzbj zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzbj) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzbj zzbjVar) {
            return (zza) zzf.zzbo(zzbjVar);
        }

        public static zzbj zzs() {
            return zzf;
        }

        public static zzidk zzt() {
            return zzf.zzbd();
        }

        public static /* synthetic */ zzbj zzz() {
            return zzf;
        }

        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public zzq zzb() {
            zzq zzc = zzq.zzc(this.zzd);
            return zzc == null ? zzq.ENUM_UNKNOWN : zzc;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zzq.zze(), "zze"});
            }
            if (ordinal == 3) {
                return new zzbj();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzf;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzg;
            if (zzidkVar == null) {
                synchronized (zzbj.class) {
                    try {
                        zzidkVar = zzg;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzf);
                            zzg = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        public zzaw zzf() {
            zzaw zzawVar = this.zze;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }
    }

    public interface zzbk extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();
    }

    public final class zzbl extends zzibr implements zzbm {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbl zzf;
        private static volatile zzidk zzg;
        private int zzc;
        private boolean zzd;
        private int zze;

        public final class zza extends zzibl implements zzbm {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzbl) this.zza).zza();
            }

            public boolean zzb() {
                return ((zzbl) this.zza).zzb();
            }

            public zza zzc(boolean z) {
                zzbg();
                ((zzbl) this.zza).zzu(z);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbl) this.zza).zzv();
                return this;
            }

            public boolean zze() {
                return ((zzbl) this.zza).zze();
            }

            public int zzf() {
                return ((zzbl) this.zza).zzf();
            }

            public zza zzg(int i) {
                zzbg();
                ((zzbl) this.zza).zzw(i);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzbl) this.zza).zzx();
                return this;
            }

            private zza() {
                super(zzbl.zzy());
            }
        }

        static {
            zzbl zzblVar = new zzbl();
            zzf = zzblVar;
            zzibr.zzbu(zzbl.class, zzblVar);
        }

        private zzbl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(int i) {
            this.zzc |= 2;
            this.zze = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzbl zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzbl) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzbl zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzbl) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzbl zzg(zzian zzianVar) throws zzicg {
            return (zzbl) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzbl zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzbl) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzbl zzi(byte[] bArr) throws zzicg {
            return (zzbl) zzibr.zzbU(zzf, bArr);
        }

        public static zzbl zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzbl) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzbl zzk(InputStream inputStream) throws IOException {
            return (zzbl) zzibr.zzbW(zzf, inputStream);
        }

        public static zzbl zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbl) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzbl zzm(InputStream inputStream) throws IOException {
            return (zzbl) zzibr.zzca(zzf, inputStream);
        }

        public static zzbl zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbl) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzbl zzo(zziaq zziaqVar) throws IOException {
            return (zzbl) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzbl zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzbl) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzbl zzblVar) {
            return (zza) zzf.zzbo(zzblVar);
        }

        public static zzbl zzs() {
            return zzf;
        }

        public static zzidk zzt() {
            return zzf.zzbd();
        }

        public static /* synthetic */ zzbl zzy() {
            return zzf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(boolean z) {
            this.zzc |= 1;
            this.zzd = z;
        }

        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public boolean zzb() {
            return this.zzd;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            if (ordinal == 3) {
                return new zzbl();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzf;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzg;
            if (zzidkVar == null) {
                synchronized (zzbl.class) {
                    try {
                        zzidkVar = zzg;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzf);
                            zzg = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        public int zzf() {
            return this.zze;
        }
    }

    public interface zzbm extends zzidd {
        boolean zza();

        boolean zzb();

        boolean zze();

        int zzf();
    }

    public interface zzc extends zzidd {
        List zza();

        int zzb();

        zzb.zza zzc(int i);
    }

    public final class zzd extends zzibr implements zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzd zzf;
        private static volatile zzidk zzg;
        private int zzc;
        private int zzd;
        private zzal zze;

        public enum zza implements zzibv {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);

            public static final int zzl = 0;
            public static final int zzm = 1;
            public static final int zzn = 2;
            public static final int zzo = 3;
            public static final int zzp = 4;
            public static final int zzq = 5;
            public static final int zzr = 6;
            public static final int zzs = 7;
            public static final int zzt = 8;
            public static final int zzu = 9;
            public static final int zzv = 10;
            private static final zzibw zzw = new 1();
            private final int zzx;

            public class 1 implements zzibw {
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zza zzb(int i) {
                    return zza.zzc(i);
                }
            }

            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                public boolean zza(int i) {
                    return zza.zzc(i) != null;
                }
            }

            zza(int i) {
                this.zzx = i;
            }

            public static zza zzc(int i) {
                switch (i) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static zzibw zzd() {
                return zzw;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            public final String toString() {
                return Integer.toString(this.zzx);
            }

            public final int zza() {
                return this.zzx;
            }
        }

        public final class zzb extends zzibl implements zze {
            public /* synthetic */ zzb(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzd) this.zza).zza();
            }

            public zza zzb() {
                return ((zzd) this.zza).zzb();
            }

            public zzb zzc(zza zzaVar) {
                zzbg();
                ((zzd) this.zza).zzu(zzaVar);
                return this;
            }

            public zzb zzd() {
                zzbg();
                ((zzd) this.zza).zzv();
                return this;
            }

            public boolean zze() {
                return ((zzd) this.zza).zze();
            }

            public zzal zzf() {
                return ((zzd) this.zza).zzf();
            }

            public zzb zzg(zzal zzalVar) {
                zzbg();
                ((zzd) this.zza).zzw(zzalVar);
                return this;
            }

            public zzb zzh(zzal.zza zzaVar) {
                zzbg();
                ((zzd) this.zza).zzw((zzal) zzaVar.zzbu());
                return this;
            }

            public zzb zzi(zzal zzalVar) {
                zzbg();
                ((zzd) this.zza).zzx(zzalVar);
                return this;
            }

            public zzb zzj() {
                zzbg();
                ((zzd) this.zza).zzy();
                return this;
            }

            private zzb() {
                super(zzd.zzz());
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzf = zzdVar;
            zzibr.zzbu(zzd.class, zzdVar);
        }

        private zzd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzu(zza zzaVar) {
            this.zzd = zzaVar.zza();
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzw(zzal zzalVar) {
            zzalVar.getClass();
            this.zze = zzalVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzx(zzal zzalVar) {
            zzalVar.getClass();
            zzal zzalVar2 = this.zze;
            if (zzalVar2 != null && zzalVar2 != zzal.zzs()) {
                zzal.zza zzr = zzal.zzr(zzalVar2);
                zzr.zzbo(zzalVar);
                zzalVar = (zzal) zzr.zzbt();
            }
            this.zze = zzalVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzy() {
            this.zze = null;
            this.zzc &= -3;
        }

        public static zzd zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzd) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzd zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzd) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzd zzg(zzian zzianVar) throws zzicg {
            return (zzd) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzd zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzd) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzd zzi(byte[] bArr) throws zzicg {
            return (zzd) zzibr.zzbU(zzf, bArr);
        }

        public static zzd zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzd) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzd zzk(InputStream inputStream) throws IOException {
            return (zzd) zzibr.zzbW(zzf, inputStream);
        }

        public static zzd zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzd) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzd zzm(InputStream inputStream) throws IOException {
            return (zzd) zzibr.zzca(zzf, inputStream);
        }

        public static zzd zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzd) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzd zzo(zziaq zziaqVar) throws IOException {
            return (zzd) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzd zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzd) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zzb zzq() {
            return (zzb) zzf.zzbn();
        }

        public static zzb zzr(zzd zzdVar) {
            return (zzb) zzf.zzbo(zzdVar);
        }

        public static zzd zzs() {
            return zzf;
        }

        public static zzidk zzt() {
            return zzf.zzbd();
        }

        public static /* synthetic */ zzd zzz() {
            return zzf;
        }

        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public zza zzb() {
            zza zzc = zza.zzc(this.zzd);
            return zzc == null ? zza.AD_FORMAT_TYPE_UNSPECIFIED : zzc;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zza.zze(), "zze"});
            }
            if (ordinal == 3) {
                return new zzd();
            }
            if (ordinal == 4) {
                return new zzb(null);
            }
            if (ordinal == 5) {
                return zzf;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzg;
            if (zzidkVar == null) {
                synchronized (zzd.class) {
                    try {
                        zzidkVar = zzg;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzf);
                            zzg = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        public zzal zzf() {
            zzal zzalVar = this.zze;
            return zzalVar == null ? zzal.zzs() : zzalVar;
        }
    }

    public interface zze extends zzidd {
        boolean zza();

        zzd.zza zzb();

        boolean zze();

        zzal zzf();
    }

    public interface zzf extends zzidd {
        boolean zzG();

        zzk zzH();

        boolean zzM();

        zzah zzN();

        boolean zzS();

        zzac zzT();

        boolean zzY();

        zzx zzZ();

        boolean zza();

        boolean zzae();

        zzz zzaf();

        List zzak();

        int zzal();

        zzat zzam(int i);

        zza.zza zzb();

        boolean zze();

        zzq zzf();

        boolean zzi();

        zzg zzj();

        boolean zzo();

        zzi zzp();

        List zzu();

        int zzv();

        zzd zzw(int i);
    }

    public final class zzg extends zzibr implements zzh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzg zzh;
        private static volatile zzidk zzi;
        private int zzd;
        private String zze = "";
        private zzicd zzf = zzibr.zzbM();
        private int zzg;

        public final class zza extends zzibl implements zzh {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzg) this.zza).zza();
            }

            public String zzb() {
                return ((zzg) this.zza).zzb();
            }

            public zzian zzc() {
                return ((zzg) this.zza).zzc();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzg) this.zza).zzB(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzg) this.zza).zzC();
                return this;
            }

            public zza zzf(zzian zzianVar) {
                zzbg();
                ((zzg) this.zza).zzD(zzianVar);
                return this;
            }

            public List zzg() {
                return Collections.unmodifiableList(((zzg) this.zza).zzg());
            }

            public int zzh() {
                return ((zzg) this.zza).zzh();
            }

            public zzd zzi(int i) {
                return ((zzg) this.zza).zzi(i);
            }

            public zza zzj(int i, zzd zzdVar) {
                zzbg();
                ((zzg) this.zza).zzE(i, zzdVar);
                return this;
            }

            public zza zzk(int i, zzd.zzb zzbVar) {
                zzbg();
                ((zzg) this.zza).zzE(i, (zzd) zzbVar.zzbu());
                return this;
            }

            public zza zzl(zzd zzdVar) {
                zzbg();
                ((zzg) this.zza).zzF(zzdVar);
                return this;
            }

            public zza zzm(int i, zzd zzdVar) {
                zzbg();
                ((zzg) this.zza).zzG(i, zzdVar);
                return this;
            }

            public zza zzn(zzd.zzb zzbVar) {
                zzbg();
                ((zzg) this.zza).zzF((zzd) zzbVar.zzbu());
                return this;
            }

            public zza zzo(int i, zzd.zzb zzbVar) {
                zzbg();
                ((zzg) this.zza).zzG(i, (zzd) zzbVar.zzbu());
                return this;
            }

            public zza zzp(Iterable iterable) {
                zzbg();
                ((zzg) this.zza).zzH(iterable);
                return this;
            }

            public zza zzq() {
                zzbg();
                ((zzg) this.zza).zzI();
                return this;
            }

            public zza zzr(int i) {
                zzbg();
                ((zzg) this.zza).zzJ(i);
                return this;
            }

            public boolean zzs() {
                return ((zzg) this.zza).zzs();
            }

            public zzq zzt() {
                return ((zzg) this.zza).zzt();
            }

            public zza zzu(zzq zzqVar) {
                zzbg();
                ((zzg) this.zza).zzK(zzqVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzg) this.zza).zzL();
                return this;
            }

            private zza() {
                super(zzg.zzM());
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzh = zzgVar;
            zzibr.zzbu(zzg.class, zzgVar);
        }

        private zzg() {
        }

        public static zzidk zzA() {
            return zzh.zzbd();
        }

        public static /* synthetic */ zzg zzM() {
            return zzh;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzB(String str) {
            str.getClass();
            this.zzd |= 1;
            this.zze = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzC() {
            this.zzd &= -2;
            this.zze = zzz().zzb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzD(zzian zzianVar) {
            this.zze = zzianVar.zzz();
            this.zzd |= 1;
        }

        private void zzQ() {
            zzicd zzicdVar = this.zzf;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzf = zzibr.zzbN(zzicdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzE(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzQ();
            this.zzf.set(i, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzF(zzd zzdVar) {
            zzdVar.getClass();
            zzQ();
            this.zzf.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzG(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzQ();
            this.zzf.add(i, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzH(Iterable iterable) {
            zzQ();
            zzhzw.zzaW(iterable, this.zzf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzf = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzJ(int i) {
            zzQ();
            this.zzf.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzK(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public void zzL() {
            this.zzd &= -3;
            this.zzg = 0;
        }

        public static zzg zzj(ByteBuffer byteBuffer) throws zzicg {
            return (zzg) zzibr.zzbR(zzh, byteBuffer);
        }

        public static zzg zzk(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzg) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
        }

        public static zzg zzl(zzian zzianVar) throws zzicg {
            return (zzg) zzibr.zzbS(zzh, zzianVar);
        }

        public static zzg zzm(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzg) zzibr.zzbT(zzh, zzianVar, zzibbVar);
        }

        public static zzg zzn(byte[] bArr) throws zzicg {
            return (zzg) zzibr.zzbU(zzh, bArr);
        }

        public static zzg zzo(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzg) zzibr.zzbV(zzh, bArr, zzibbVar);
        }

        public static zzg zzp(InputStream inputStream) throws IOException {
            return (zzg) zzibr.zzbW(zzh, inputStream);
        }

        public static zzg zzq(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzg) zzibr.zzbX(zzh, inputStream, zzibbVar);
        }

        public static zzg zzr(InputStream inputStream) throws IOException {
            return (zzg) zzibr.zzca(zzh, inputStream);
        }

        public static zzg zzu(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzg) zzibr.zzcb(zzh, inputStream, zzibbVar);
        }

        public static zzg zzv(zziaq zziaqVar) throws IOException {
            return (zzg) zzibr.zzbY(zzh, zziaqVar);
        }

        public static zzg zzw(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzg) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
        }

        public static zza zzx() {
            return (zza) zzh.zzbn();
        }

        public static zza zzy(zzg zzgVar) {
            return (zza) zzh.zzbo(zzgVar);
        }

        public static zzg zzz() {
            return zzh;
        }

        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        public String zzb() {
            return this.zze;
        }

        public zzian zzc() {
            return zzian.zzv(this.zze);
        }

        public List zzd() {
            return this.zzf;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzd.class, "zzg", zzq.zze()});
            }
            if (ordinal == 3) {
                return new zzg();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzh;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzi;
            if (zzidkVar == null) {
                synchronized (zzg.class) {
                    try {
                        zzidkVar = zzi;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzh);
                            zzi = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public zze zze(int i) {
            return (zze) this.zzf.get(i);
        }

        public List zzg() {
            return this.zzf;
        }

        public int zzh() {
            return this.zzf.size();
        }

        public zzd zzi(int i) {
            return (zzd) this.zzf.get(i);
        }

        public boolean zzs() {
            return (this.zzd & 2) != 0;
        }

        public zzq zzt() {
            zzq zzc2 = zzq.zzc(this.zzg);
            return zzc2 == null ? zzq.ENUM_FALSE : zzc2;
        }
    }

    public interface zzh extends zzidd {
        boolean zza();

        String zzb();

        zzian zzc();

        List zzg();

        int zzh();

        zzd zzi(int i);

        boolean zzs();

        zzq zzt();
    }

    public final class zzi extends zzibr implements zzj {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzi zzl;
        private static volatile zzidk zzm;
        private int zzf;
        private String zzg = "";
        private zzicd zzh = zzibr.zzbM();
        private int zzi = 1000;
        private int zzj = 1000;
        private int zzk = 1000;

        public final class zza extends zzibl implements zzj {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zzA() {
                return ((zzi) this.zza).zzA();
            }

            public zzq zzB() {
                return ((zzi) this.zza).zzB();
            }

            public zza zzC(zzq zzqVar) {
                zzbg();
                ((zzi) this.zza).zzS(zzqVar);
                return this;
            }

            public zza zzD() {
                zzbg();
                ((zzi) this.zza).zzT();
                return this;
            }

            public boolean zza() {
                return ((zzi) this.zza).zza();
            }

            public String zzb() {
                return ((zzi) this.zza).zzb();
            }

            public zzian zzc() {
                return ((zzi) this.zza).zzc();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzi) this.zza).zzF(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzi) this.zza).zzG();
                return this;
            }

            public zza zzf(zzian zzianVar) {
                zzbg();
                ((zzi) this.zza).zzH(zzianVar);
                return this;
            }

            public List zzg() {
                return Collections.unmodifiableList(((zzi) this.zza).zzg());
            }

            public int zzh() {
                return ((zzi) this.zza).zzh();
            }

            public zzd zzi(int i) {
                return ((zzi) this.zza).zzi(i);
            }

            public zza zzj(int i, zzd zzdVar) {
                zzbg();
                ((zzi) this.zza).zzI(i, zzdVar);
                return this;
            }

            public zza zzk(int i, zzd.zzb zzbVar) {
                zzbg();
                ((zzi) this.zza).zzI(i, (zzd) zzbVar.zzbu());
                return this;
            }

            public zza zzl(zzd zzdVar) {
                zzbg();
                ((zzi) this.zza).zzJ(zzdVar);
                return this;
            }

            public zza zzm(int i, zzd zzdVar) {
                zzbg();
                ((zzi) this.zza).zzK(i, zzdVar);
                return this;
            }

            public zza zzn(zzd.zzb zzbVar) {
                zzbg();
                ((zzi) this.zza).zzJ((zzd) zzbVar.zzbu());
                return this;
            }

            public zza zzo(int i, zzd.zzb zzbVar) {
                zzbg();
                ((zzi) this.zza).zzK(i, (zzd) zzbVar.zzbu());
                return this;
            }

            public zza zzp(Iterable iterable) {
                zzbg();
                ((zzi) this.zza).zzL(iterable);
                return this;
            }

            public zza zzq() {
                zzbg();
                ((zzi) this.zza).zzM();
                return this;
            }

            public zza zzr(int i) {
                zzbg();
                ((zzi) this.zza).zzN(i);
                return this;
            }

            public boolean zzs() {
                return ((zzi) this.zza).zzs();
            }

            public zzq zzt() {
                return ((zzi) this.zza).zzt();
            }

            public zza zzu(zzq zzqVar) {
                zzbg();
                ((zzi) this.zza).zzO(zzqVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzi) this.zza).zzP();
                return this;
            }

            public boolean zzw() {
                return ((zzi) this.zza).zzw();
            }

            public zzq zzx() {
                return ((zzi) this.zza).zzx();
            }

            public zza zzy(zzq zzqVar) {
                zzbg();
                ((zzi) this.zza).zzQ(zzqVar);
                return this;
            }

            public zza zzz() {
                zzbg();
                ((zzi) this.zza).zzR();
                return this;
            }

            private zza() {
                super(zzi.zzU());
            }
        }

        static {
            zzi zziVar = new zzi();
            zzl = zziVar;
            zzibr.zzbu(zzi.class, zziVar);
        }

        private zzi() {
        }

        public static zza zzC(zzi zziVar) {
            return (zza) zzl.zzbo(zziVar);
        }

        public static zzi zzD() {
            return zzl;
        }

        public static zzidk zzE() {
            return zzl.zzbd();
        }

        public static /* synthetic */ zzi zzU() {
            return zzl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzF(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zzf &= -2;
            this.zzg = zzD().zzb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzH(zzian zzianVar) {
            this.zzg = zzianVar.zzz();
            this.zzf |= 1;
        }

        private void zzY() {
            zzicd zzicdVar = this.zzh;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzh = zzibr.zzbN(zzicdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzI(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzY();
            this.zzh.set(i, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzJ(zzd zzdVar) {
            zzdVar.getClass();
            zzY();
            this.zzh.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzab, reason: merged with bridge method [inline-methods] */
        public void zzK(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzY();
            this.zzh.add(i, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzL(Iterable iterable) {
            zzY();
            zzhzw.zzaW(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzh = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public void zzN(int i) {
            zzY();
            this.zzh.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public void zzO(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzf &= -3;
            this.zzi = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzah, reason: merged with bridge method [inline-methods] */
        public void zzQ(zzq zzqVar) {
            this.zzj = zzqVar.zza();
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzai, reason: merged with bridge method [inline-methods] */
        public void zzR() {
            this.zzf &= -5;
            this.zzj = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
        public void zzS(zzq zzqVar) {
            this.zzk = zzqVar.zza();
            this.zzf |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzak, reason: merged with bridge method [inline-methods] */
        public void zzT() {
            this.zzf &= -9;
            this.zzk = 1000;
        }

        public static zzi zzj(ByteBuffer byteBuffer) throws zzicg {
            return (zzi) zzibr.zzbR(zzl, byteBuffer);
        }

        public static zzi zzk(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzi) zzibr.zzbQ(zzl, byteBuffer, zzibbVar);
        }

        public static zzi zzl(zzian zzianVar) throws zzicg {
            return (zzi) zzibr.zzbS(zzl, zzianVar);
        }

        public static zzi zzm(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzi) zzibr.zzbT(zzl, zzianVar, zzibbVar);
        }

        public static zzi zzn(byte[] bArr) throws zzicg {
            return (zzi) zzibr.zzbU(zzl, bArr);
        }

        public static zzi zzo(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzi) zzibr.zzbV(zzl, bArr, zzibbVar);
        }

        public static zzi zzp(InputStream inputStream) throws IOException {
            return (zzi) zzibr.zzbW(zzl, inputStream);
        }

        public static zzi zzq(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzi) zzibr.zzbX(zzl, inputStream, zzibbVar);
        }

        public static zzi zzr(InputStream inputStream) throws IOException {
            return (zzi) zzibr.zzca(zzl, inputStream);
        }

        public static zzi zzu(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzi) zzibr.zzcb(zzl, inputStream, zzibbVar);
        }

        public static zzi zzv(zziaq zziaqVar) throws IOException {
            return (zzi) zzibr.zzbY(zzl, zziaqVar);
        }

        public static zzi zzy(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzi) zzibr.zzbZ(zzl, zziaqVar, zzibbVar);
        }

        public static zza zzz() {
            return (zza) zzl.zzbn();
        }

        public boolean zzA() {
            return (this.zzf & 8) != 0;
        }

        public zzq zzB() {
            zzq zzc2 = zzq.zzc(this.zzk);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public boolean zza() {
            return (this.zzf & 1) != 0;
        }

        public String zzb() {
            return this.zzg;
        }

        public zzian zzc() {
            return zzian.zzv(this.zzg);
        }

        public List zzd() {
            return this.zzh;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", zzd.class, "zzi", zzq.zze(), "zzj", zzq.zze(), "zzk", zzq.zze()});
            }
            if (ordinal == 3) {
                return new zzi();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzl;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzm;
            if (zzidkVar == null) {
                synchronized (zzi.class) {
                    try {
                        zzidkVar = zzm;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzl);
                            zzm = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public zze zze(int i) {
            return (zze) this.zzh.get(i);
        }

        public List zzg() {
            return this.zzh;
        }

        public int zzh() {
            return this.zzh.size();
        }

        public zzd zzi(int i) {
            return (zzd) this.zzh.get(i);
        }

        public boolean zzs() {
            return (this.zzf & 2) != 0;
        }

        public zzq zzt() {
            zzq zzc2 = zzq.zzc(this.zzi);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public boolean zzw() {
            return (this.zzf & 4) != 0;
        }

        public zzq zzx() {
            zzq zzc2 = zzq.zzc(this.zzj);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }
    }

    public interface zzj extends zzidd {
        boolean zzA();

        zzq zzB();

        boolean zza();

        String zzb();

        zzian zzc();

        List zzg();

        int zzh();

        zzd zzi(int i);

        boolean zzs();

        zzq zzt();

        boolean zzw();

        zzq zzx();
    }

    public final class zzk extends zzibr implements zzl {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzk zzn;
        private static volatile zzidk zzo;
        private int zzg;
        private int zzh;
        private zzap zzi;
        private zzap zzj;
        private zzap zzk;
        private zzicd zzl = zzibr.zzbM();
        private int zzm;

        public final class zza extends zzibl implements zzl {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public zza zzA(int i, zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzQ(i, (zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzB(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzR(zzapVar);
                return this;
            }

            public zza zzC(int i, zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzS(i, zzapVar);
                return this;
            }

            public zza zzD(zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzR((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzE(int i, zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzS(i, (zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzF(Iterable iterable) {
                zzbg();
                ((zzk) this.zza).zzT(iterable);
                return this;
            }

            public zza zzG() {
                zzbg();
                ((zzk) this.zza).zzU();
                return this;
            }

            public zza zzH(int i) {
                zzbg();
                ((zzk) this.zza).zzV(i);
                return this;
            }

            public boolean zzI() {
                return ((zzk) this.zza).zzI();
            }

            public int zzJ() {
                return ((zzk) this.zza).zzJ();
            }

            public zza zzK(int i) {
                zzbg();
                ((zzk) this.zza).zzW(i);
                return this;
            }

            public zza zzL() {
                zzbg();
                ((zzk) this.zza).zzX();
                return this;
            }

            public boolean zza() {
                return ((zzk) this.zza).zza();
            }

            public int zzb() {
                return ((zzk) this.zza).zzb();
            }

            public zza zzc(int i) {
                zzbg();
                ((zzk) this.zza).zzD(i);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzk) this.zza).zzE();
                return this;
            }

            public boolean zze() {
                return ((zzk) this.zza).zze();
            }

            public zzap zzf() {
                return ((zzk) this.zza).zzf();
            }

            public zza zzg(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzF(zzapVar);
                return this;
            }

            public zza zzh(zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzF((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzG(zzapVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzk) this.zza).zzH();
                return this;
            }

            public boolean zzk() {
                return ((zzk) this.zza).zzk();
            }

            public zzap zzl() {
                return ((zzk) this.zza).zzl();
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzK((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzk) this.zza).zzM();
                return this;
            }

            public boolean zzq() {
                return ((zzk) this.zza).zzq();
            }

            public zzap zzr() {
                return ((zzk) this.zza).zzr();
            }

            public zza zzs(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzN(zzapVar);
                return this;
            }

            public zza zzt(zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzN((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzu(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzO(zzapVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzk) this.zza).zzP();
                return this;
            }

            public List zzw() {
                return Collections.unmodifiableList(((zzk) this.zza).zzw());
            }

            public int zzx() {
                return ((zzk) this.zza).zzx();
            }

            public zzap zzy(int i) {
                return ((zzk) this.zza).zzy(i);
            }

            public zza zzz(int i, zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzQ(i, zzapVar);
                return this;
            }

            private zza() {
                super(zzk.zzY());
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzn = zzkVar;
            zzibr.zzbu(zzk.class, zzkVar);
        }

        private zzk() {
        }

        public static zza zzA(zzk zzkVar) {
            return (zza) zzn.zzbo(zzkVar);
        }

        public static zzk zzB() {
            return zzn;
        }

        public static zzidk zzC() {
            return zzn.zzbd();
        }

        public static /* synthetic */ zzk zzY() {
            return zzn;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzD(int i) {
            this.zzg |= 1;
            this.zzh = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzE() {
            this.zzg &= -2;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzab, reason: merged with bridge method [inline-methods] */
        public void zzF(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzG(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zzi = zzapVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
        public void zzH() {
            this.zzi = null;
            this.zzg &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            this.zzj = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzj;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zzj = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzj = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzah, reason: merged with bridge method [inline-methods] */
        public void zzN(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzai, reason: merged with bridge method [inline-methods] */
        public void zzO(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzk = null;
            this.zzg &= -9;
        }

        private void zzak() {
            zzicd zzicdVar = this.zzl;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzl = zzibr.zzbN(zzicdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzal, reason: merged with bridge method [inline-methods] */
        public void zzQ(int i, zzap zzapVar) {
            zzapVar.getClass();
            zzak();
            this.zzl.set(i, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzam, reason: merged with bridge method [inline-methods] */
        public void zzR(zzap zzapVar) {
            zzapVar.getClass();
            zzak();
            this.zzl.add(zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzan, reason: merged with bridge method [inline-methods] */
        public void zzS(int i, zzap zzapVar) {
            zzapVar.getClass();
            zzak();
            this.zzl.add(i, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzao, reason: merged with bridge method [inline-methods] */
        public void zzT(Iterable iterable) {
            zzak();
            zzhzw.zzaW(iterable, this.zzl);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzap, reason: merged with bridge method [inline-methods] */
        public void zzU() {
            this.zzl = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaq, reason: merged with bridge method [inline-methods] */
        public void zzV(int i) {
            zzak();
            this.zzl.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzar, reason: merged with bridge method [inline-methods] */
        public void zzW(int i) {
            this.zzg |= 16;
            this.zzm = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzX() {
            this.zzg &= -17;
            this.zzm = 0;
        }

        public static zzk zzg(ByteBuffer byteBuffer) throws zzicg {
            return (zzk) zzibr.zzbR(zzn, byteBuffer);
        }

        public static zzk zzh(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzk) zzibr.zzbQ(zzn, byteBuffer, zzibbVar);
        }

        public static zzk zzi(zzian zzianVar) throws zzicg {
            return (zzk) zzibr.zzbS(zzn, zzianVar);
        }

        public static zzk zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzk) zzibr.zzbT(zzn, zzianVar, zzibbVar);
        }

        public static zzk zzm(byte[] bArr) throws zzicg {
            return (zzk) zzibr.zzbU(zzn, bArr);
        }

        public static zzk zzn(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzk) zzibr.zzbV(zzn, bArr, zzibbVar);
        }

        public static zzk zzo(InputStream inputStream) throws IOException {
            return (zzk) zzibr.zzbW(zzn, inputStream);
        }

        public static zzk zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzk) zzibr.zzbX(zzn, inputStream, zzibbVar);
        }

        public static zzk zzs(InputStream inputStream) throws IOException {
            return (zzk) zzibr.zzca(zzn, inputStream);
        }

        public static zzk zzt(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzk) zzibr.zzcb(zzn, inputStream, zzibbVar);
        }

        public static zzk zzu(zziaq zziaqVar) throws IOException {
            return (zzk) zzibr.zzbY(zzn, zziaqVar);
        }

        public static zzk zzv(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzk) zzibr.zzbZ(zzn, zziaqVar, zzibbVar);
        }

        public static zza zzz() {
            return (zza) zzn.zzbn();
        }

        public boolean zzI() {
            return (this.zzg & 16) != 0;
        }

        public int zzJ() {
            return this.zzm;
        }

        public boolean zza() {
            return (this.zzg & 1) != 0;
        }

        public int zzb() {
            return this.zzh;
        }

        public List zzc() {
            return this.zzl;
        }

        public zzaq zzd(int i) {
            return (zzaq) this.zzl.get(i);
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzap.class, "zzm"});
            }
            if (ordinal == 3) {
                return new zzk();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzn;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzo;
            if (zzidkVar == null) {
                synchronized (zzk.class) {
                    try {
                        zzidkVar = zzo;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzn);
                            zzo = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzg & 2) != 0;
        }

        public zzap zzf() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        public boolean zzk() {
            return (this.zzg & 4) != 0;
        }

        public zzap zzl() {
            zzap zzapVar = this.zzj;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        public boolean zzq() {
            return (this.zzg & 8) != 0;
        }

        public zzap zzr() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        public List zzw() {
            return this.zzl;
        }

        public int zzx() {
            return this.zzl.size();
        }

        public zzap zzy(int i) {
            return (zzap) this.zzl.get(i);
        }
    }

    public interface zzl extends zzidd {
        boolean zzI();

        int zzJ();

        boolean zza();

        int zzb();

        boolean zze();

        zzap zzf();

        boolean zzk();

        zzap zzl();

        boolean zzq();

        zzap zzr();

        List zzw();

        int zzx();

        zzap zzy(int i);
    }

    public final class zzm extends zzibr implements zzn {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzm zzv;
        private static volatile zzidk zzw;
        private int zzi;
        private zzap zzk;
        private int zzl;
        private zzar zzm;
        private int zzn;
        private String zzj = "";
        private int zzo = 1000;
        private int zzp = 1000;
        private int zzu = 1000;

        public final class zza extends zzibl implements zzn {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zzA() {
                return ((zzm) this.zza).zzA();
            }

            public zzq zzB() {
                return ((zzm) this.zza).zzB();
            }

            public zza zzC(zzq zzqVar) {
                zzbg();
                ((zzm) this.zza).zzV(zzqVar);
                return this;
            }

            public zza zzD() {
                zzbg();
                ((zzm) this.zza).zzW();
                return this;
            }

            public boolean zzE() {
                return ((zzm) this.zza).zzE();
            }

            public zzq zzF() {
                return ((zzm) this.zza).zzF();
            }

            public zza zzG(zzq zzqVar) {
                zzbg();
                ((zzm) this.zza).zzX(zzqVar);
                return this;
            }

            public zza zzH() {
                zzbg();
                ((zzm) this.zza).zzY();
                return this;
            }

            public boolean zzI() {
                return ((zzm) this.zza).zzI();
            }

            public zzq zzJ() {
                return ((zzm) this.zza).zzJ();
            }

            public zza zzK(zzq zzqVar) {
                zzbg();
                ((zzm) this.zza).zzZ(zzqVar);
                return this;
            }

            public zza zzL() {
                zzbg();
                ((zzm) this.zza).zzaa();
                return this;
            }

            public boolean zza() {
                return ((zzm) this.zza).zza();
            }

            public String zzb() {
                return ((zzm) this.zza).zzb();
            }

            public zzian zzc() {
                return ((zzm) this.zza).zzc();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzm) this.zza).zzG(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzm) this.zza).zzH();
                return this;
            }

            public zza zzf(zzian zzianVar) {
                zzbg();
                ((zzm) this.zza).zzK(zzianVar);
                return this;
            }

            public boolean zzg() {
                return ((zzm) this.zza).zzg();
            }

            public zzap zzh() {
                return ((zzm) this.zza).zzh();
            }

            public zza zzi(zzap zzapVar) {
                zzbg();
                ((zzm) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzj(zzap.zza zzaVar) {
                zzbg();
                ((zzm) this.zza).zzL((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbg();
                ((zzm) this.zza).zzM(zzapVar);
                return this;
            }

            public zza zzl() {
                zzbg();
                ((zzm) this.zza).zzN();
                return this;
            }

            public boolean zzm() {
                return ((zzm) this.zza).zzm();
            }

            public int zzn() {
                return ((zzm) this.zza).zzn();
            }

            public zza zzo(int i) {
                zzbg();
                ((zzm) this.zza).zzO(i);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzm) this.zza).zzP();
                return this;
            }

            public boolean zzq() {
                return ((zzm) this.zza).zzq();
            }

            public zzar zzr() {
                return ((zzm) this.zza).zzr();
            }

            public zza zzs(zzar zzarVar) {
                zzbg();
                ((zzm) this.zza).zzQ(zzarVar);
                return this;
            }

            public zza zzt(zzar.zza zzaVar) {
                zzbg();
                ((zzm) this.zza).zzQ((zzar) zzaVar.zzbu());
                return this;
            }

            public zza zzu(zzar zzarVar) {
                zzbg();
                ((zzm) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzm) this.zza).zzS();
                return this;
            }

            public boolean zzw() {
                return ((zzm) this.zza).zzw();
            }

            public int zzx() {
                return ((zzm) this.zza).zzx();
            }

            public zza zzy(int i) {
                zzbg();
                ((zzm) this.zza).zzT(i);
                return this;
            }

            public zza zzz() {
                zzbg();
                ((zzm) this.zza).zzU();
                return this;
            }

            private zza() {
                super(zzm.zzab());
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzv = zzmVar;
            zzibr.zzbu(zzm.class, zzmVar);
        }

        private zzm() {
        }

        public static zzm zzC() {
            return zzv;
        }

        public static zzidk zzD() {
            return zzv.zzbd();
        }

        public static /* synthetic */ zzm zzab() {
            return zzv;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzG(String str) {
            str.getClass();
            this.zzi |= 1;
            this.zzj = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
        public void zzH() {
            this.zzi &= -2;
            this.zzj = zzC().zzb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public void zzK(zzian zzianVar) {
            this.zzj = zzianVar.zzz();
            this.zzi |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public void zzM(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzah, reason: merged with bridge method [inline-methods] */
        public void zzN() {
            this.zzk = null;
            this.zzi &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzai, reason: merged with bridge method [inline-methods] */
        public void zzO(int i) {
            this.zzi |= 4;
            this.zzl = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzi &= -5;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzak, reason: merged with bridge method [inline-methods] */
        public void zzQ(zzar zzarVar) {
            zzarVar.getClass();
            this.zzm = zzarVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzal, reason: merged with bridge method [inline-methods] */
        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzm;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzt = zzar.zzt(zzarVar2);
                zzt.zzbo(zzarVar);
                zzarVar = (zzar) zzt.zzbt();
            }
            this.zzm = zzarVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzam, reason: merged with bridge method [inline-methods] */
        public void zzS() {
            this.zzm = null;
            this.zzi &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzan, reason: merged with bridge method [inline-methods] */
        public void zzT(int i) {
            this.zzi |= 16;
            this.zzn = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzao, reason: merged with bridge method [inline-methods] */
        public void zzU() {
            this.zzi &= -17;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzap, reason: merged with bridge method [inline-methods] */
        public void zzV(zzq zzqVar) {
            this.zzo = zzqVar.zza();
            this.zzi |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaq, reason: merged with bridge method [inline-methods] */
        public void zzW() {
            this.zzi &= -33;
            this.zzo = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzar, reason: merged with bridge method [inline-methods] */
        public void zzX(zzq zzqVar) {
            this.zzp = zzqVar.zza();
            this.zzi |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzY() {
            this.zzi &= -65;
            this.zzp = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzat, reason: merged with bridge method [inline-methods] */
        public void zzZ(zzq zzqVar) {
            this.zzu = zzqVar.zza();
            this.zzi |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzau, reason: merged with bridge method [inline-methods] */
        public void zzaa() {
            this.zzi &= -129;
            this.zzu = 1000;
        }

        public static zzm zzd(ByteBuffer byteBuffer) throws zzicg {
            return (zzm) zzibr.zzbR(zzv, byteBuffer);
        }

        public static zzm zze(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzm) zzibr.zzbQ(zzv, byteBuffer, zzibbVar);
        }

        public static zzm zzi(zzian zzianVar) throws zzicg {
            return (zzm) zzibr.zzbS(zzv, zzianVar);
        }

        public static zzm zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzm) zzibr.zzbT(zzv, zzianVar, zzibbVar);
        }

        public static zzm zzk(byte[] bArr) throws zzicg {
            return (zzm) zzibr.zzbU(zzv, bArr);
        }

        public static zzm zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzm) zzibr.zzbV(zzv, bArr, zzibbVar);
        }

        public static zzm zzo(InputStream inputStream) throws IOException {
            return (zzm) zzibr.zzbW(zzv, inputStream);
        }

        public static zzm zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzm) zzibr.zzbX(zzv, inputStream, zzibbVar);
        }

        public static zzm zzs(InputStream inputStream) throws IOException {
            return (zzm) zzibr.zzca(zzv, inputStream);
        }

        public static zzm zzt(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzm) zzibr.zzcb(zzv, inputStream, zzibbVar);
        }

        public static zzm zzu(zziaq zziaqVar) throws IOException {
            return (zzm) zzibr.zzbY(zzv, zziaqVar);
        }

        public static zzm zzv(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzm) zzibr.zzbZ(zzv, zziaqVar, zzibbVar);
        }

        public static zza zzy() {
            return (zza) zzv.zzbn();
        }

        public static zza zzz(zzm zzmVar) {
            return (zza) zzv.zzbo(zzmVar);
        }

        public boolean zzA() {
            return (this.zzi & 32) != 0;
        }

        public zzq zzB() {
            zzq zzc2 = zzq.zzc(this.zzo);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public boolean zzE() {
            return (this.zzi & 64) != 0;
        }

        public zzq zzF() {
            zzq zzc2 = zzq.zzc(this.zzp);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public boolean zzI() {
            return (this.zzi & 128) != 0;
        }

        public zzq zzJ() {
            zzq zzc2 = zzq.zzc(this.zzu);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public boolean zza() {
            return (this.zzi & 1) != 0;
        }

        public String zzb() {
            return this.zzj;
        }

        public zzian zzc() {
            return zzian.zzv(this.zzj);
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzq.zze(), "zzp", zzq.zze(), "zzu", zzq.zze()});
            }
            if (ordinal == 3) {
                return new zzm();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzv;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzw;
            if (zzidkVar == null) {
                synchronized (zzm.class) {
                    try {
                        zzidkVar = zzw;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzv);
                            zzw = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zzg() {
            return (this.zzi & 2) != 0;
        }

        public zzap zzh() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        public boolean zzm() {
            return (this.zzi & 4) != 0;
        }

        public int zzn() {
            return this.zzl;
        }

        public boolean zzq() {
            return (this.zzi & 8) != 0;
        }

        public zzar zzr() {
            zzar zzarVar = this.zzm;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        public boolean zzw() {
            return (this.zzi & 16) != 0;
        }

        public int zzx() {
            return this.zzn;
        }
    }

    public interface zzn extends zzidd {
        boolean zzA();

        zzq zzB();

        boolean zzE();

        zzq zzF();

        boolean zzI();

        zzq zzJ();

        boolean zza();

        String zzb();

        zzian zzc();

        boolean zzg();

        zzap zzh();

        boolean zzm();

        int zzn();

        boolean zzq();

        zzar zzr();

        boolean zzw();

        int zzx();
    }

    public final class zzo extends zzibr implements zzp {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        private static final zzo zzj;
        private static volatile zzidk zzk;
        private int zze;
        private int zzf;
        private zzar zzg;
        private String zzh = "";
        private String zzi = "";

        public final class zza extends zzibl implements zzp {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzo) this.zza).zza();
            }

            public zzb zzb() {
                return ((zzo) this.zza).zzb();
            }

            public zza zzc(zzb zzbVar) {
                zzbg();
                ((zzo) this.zza).zzA(zzbVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzo) this.zza).zzB();
                return this;
            }

            public boolean zze() {
                return ((zzo) this.zza).zze();
            }

            public zzar zzf() {
                return ((zzo) this.zza).zzf();
            }

            public zza zzg(zzar zzarVar) {
                zzbg();
                ((zzo) this.zza).zzC(zzarVar);
                return this;
            }

            public zza zzh(zzar.zza zzaVar) {
                zzbg();
                ((zzo) this.zza).zzC((zzar) zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzar zzarVar) {
                zzbg();
                ((zzo) this.zza).zzD(zzarVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzo) this.zza).zzE();
                return this;
            }

            public boolean zzk() {
                return ((zzo) this.zza).zzk();
            }

            public String zzl() {
                return ((zzo) this.zza).zzl();
            }

            public zzian zzm() {
                return ((zzo) this.zza).zzm();
            }

            public zza zzn(String str) {
                zzbg();
                ((zzo) this.zza).zzF(str);
                return this;
            }

            public zza zzo() {
                zzbg();
                ((zzo) this.zza).zzG();
                return this;
            }

            public zza zzp(zzian zzianVar) {
                zzbg();
                ((zzo) this.zza).zzH(zzianVar);
                return this;
            }

            public boolean zzq() {
                return ((zzo) this.zza).zzq();
            }

            public String zzr() {
                return ((zzo) this.zza).zzr();
            }

            public zzian zzs() {
                return ((zzo) this.zza).zzs();
            }

            public zza zzt(String str) {
                zzbg();
                ((zzo) this.zza).zzI(str);
                return this;
            }

            public zza zzu() {
                zzbg();
                ((zzo) this.zza).zzJ();
                return this;
            }

            public zza zzv(zzian zzianVar) {
                zzbg();
                ((zzo) this.zza).zzK(zzianVar);
                return this;
            }

            private zza() {
                super(zzo.zzL());
            }
        }

        public enum zzb implements zzibv {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);

            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzibw zzg = new 1();
            private final int zzh;

            public class 1 implements zzibw {
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i) {
                    return zzb.zzc(i);
                }
            }

            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                public boolean zza(int i) {
                    return zzb.zzc(i) != null;
                }
            }

            zzb(int i) {
                this.zzh = i;
            }

            public static zzb zzc(int i) {
                if (i == 0) {
                    return PLATFORM_UNSPECIFIED;
                }
                if (i == 1) {
                    return IOS;
                }
                if (i != 2) {
                    return null;
                }
                return ANDROID;
            }

            public static zzibw zzd() {
                return zzg;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            public final String toString() {
                return Integer.toString(this.zzh);
            }

            public final int zza() {
                return this.zzh;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzj = zzoVar;
            zzibr.zzbu(zzo.class, zzoVar);
        }

        private zzo() {
        }

        public static /* synthetic */ zzo zzL() {
            return zzj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzA(zzb zzbVar) {
            this.zzf = zzbVar.zza();
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzB() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzC(zzar zzarVar) {
            zzarVar.getClass();
            this.zzg = zzarVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzD(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzg;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzt = zzar.zzt(zzarVar2);
                zzt.zzbo(zzarVar);
                zzarVar = (zzar) zzt.zzbt();
            }
            this.zzg = zzarVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzE() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzF(String str) {
            str.getClass();
            this.zze |= 4;
            this.zzh = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zze &= -5;
            this.zzh = zzy().zzl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzH(zzian zzianVar) {
            this.zzh = zzianVar.zzz();
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzI(String str) {
            str.getClass();
            this.zze |= 8;
            this.zzi = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zze &= -9;
            this.zzi = zzy().zzr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzK(zzian zzianVar) {
            this.zzi = zzianVar.zzz();
            this.zze |= 8;
        }

        public static zzo zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzo) zzibr.zzbR(zzj, byteBuffer);
        }

        public static zzo zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzo) zzibr.zzbQ(zzj, byteBuffer, zzibbVar);
        }

        public static zzo zzg(zzian zzianVar) throws zzicg {
            return (zzo) zzibr.zzbS(zzj, zzianVar);
        }

        public static zzo zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzo) zzibr.zzbT(zzj, zzianVar, zzibbVar);
        }

        public static zzo zzi(byte[] bArr) throws zzicg {
            return (zzo) zzibr.zzbU(zzj, bArr);
        }

        public static zzo zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzo) zzibr.zzbV(zzj, bArr, zzibbVar);
        }

        public static zzo zzn(InputStream inputStream) throws IOException {
            return (zzo) zzibr.zzbW(zzj, inputStream);
        }

        public static zzo zzo(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzo) zzibr.zzbX(zzj, inputStream, zzibbVar);
        }

        public static zzo zzp(InputStream inputStream) throws IOException {
            return (zzo) zzibr.zzca(zzj, inputStream);
        }

        public static zzo zzt(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzo) zzibr.zzcb(zzj, inputStream, zzibbVar);
        }

        public static zzo zzu(zziaq zziaqVar) throws IOException {
            return (zzo) zzibr.zzbY(zzj, zziaqVar);
        }

        public static zzo zzv(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzo) zzibr.zzbZ(zzj, zziaqVar, zzibbVar);
        }

        public static zza zzw() {
            return (zza) zzj.zzbn();
        }

        public static zza zzx(zzo zzoVar) {
            return (zza) zzj.zzbo(zzoVar);
        }

        public static zzo zzy() {
            return zzj;
        }

        public static zzidk zzz() {
            return zzj.zzbd();
        }

        public boolean zza() {
            return (this.zze & 1) != 0;
        }

        public zzb zzb() {
            zzb zzc2 = zzb.zzc(this.zzf);
            return zzc2 == null ? zzb.PLATFORM_UNSPECIFIED : zzc2;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzj, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", zzb.zze(), "zzg", "zzh", "zzi"});
            }
            if (ordinal == 3) {
                return new zzo();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzj;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzk;
            if (zzidkVar == null) {
                synchronized (zzo.class) {
                    try {
                        zzidkVar = zzk;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzj);
                            zzk = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zze & 2) != 0;
        }

        public zzar zzf() {
            zzar zzarVar = this.zzg;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        public boolean zzk() {
            return (this.zze & 4) != 0;
        }

        public String zzl() {
            return this.zzh;
        }

        public zzian zzm() {
            return zzian.zzv(this.zzh);
        }

        public boolean zzq() {
            return (this.zze & 8) != 0;
        }

        public String zzr() {
            return this.zzi;
        }

        public zzian zzs() {
            return zzian.zzv(this.zzi);
        }
    }

    public interface zzp extends zzidd {
        boolean zza();

        zzo.zzb zzb();

        boolean zze();

        zzar zzf();

        boolean zzk();

        String zzl();

        zzian zzm();

        boolean zzq();

        String zzr();

        zzian zzs();
    }

    public enum zzq implements zzibv {
        ENUM_FALSE(0),
        ENUM_TRUE(1),
        ENUM_UNKNOWN(1000);

        public static final int zzd = 0;
        public static final int zze = 1;
        public static final int zzf = 1000;
        private static final zzibw zzg = new 1();
        private final int zzh;

        public class 1 implements zzibw {
            /* renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzq zzb(int i) {
                return zzq.zzc(i);
            }
        }

        final class zza implements zzibx {
            static final zzibx zza = new zza();

            private zza() {
            }

            public boolean zza(int i) {
                return zzq.zzc(i) != null;
            }
        }

        zzq(int i) {
            this.zzh = i;
        }

        public static zzq zzc(int i) {
            if (i == 0) {
                return ENUM_FALSE;
            }
            if (i == 1) {
                return ENUM_TRUE;
            }
            if (i != 1000) {
                return null;
            }
            return ENUM_UNKNOWN;
        }

        public static zzibw zzd() {
            return zzg;
        }

        public static zzibx zze() {
            return zza.zza;
        }

        public final String toString() {
            return Integer.toString(this.zzh);
        }

        public final int zza() {
            return this.zzh;
        }
    }

    public final class zzr extends zzibr implements zzs {
        private static final zzr zzB;
        private static volatile zzidk zzC = null;
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        private int zzk;
        private int zzl;
        private zzar zzn;
        private int zzo;
        private int zzv;
        private int zzw;
        private static final zzica zzy = new 1();
        private static final zzica zzA = new 2();
        private String zzm = "";
        private String zzp = "";
        private String zzu = "";
        private zzibz zzx = zzibr.zzbC();
        private zzibz zzz = zzibr.zzbC();

        public class 1 implements zzica {
            /* renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzd.zza zzb(int i) {
                zzd.zza zzc = zzd.zza.zzc(i);
                return zzc == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzc;
            }
        }

        public class 2 implements zzica {
            /* renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzd.zza zzb(int i) {
                zzd.zza zzc = zzd.zza.zzc(i);
                return zzc == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzc;
            }
        }

        public final class zza extends zzibl implements zzs {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zzA() {
                return ((zzr) this.zza).zzA();
            }

            public String zzB() {
                return ((zzr) this.zza).zzB();
            }

            public zzian zzC() {
                return ((zzr) this.zza).zzC();
            }

            public zza zzD(String str) {
                zzbg();
                ((zzr) this.zza).zzac(str);
                return this;
            }

            public zza zzE() {
                zzbg();
                ((zzr) this.zza).zzad();
                return this;
            }

            public zza zzF(zzian zzianVar) {
                zzbg();
                ((zzr) this.zza).zzae(zzianVar);
                return this;
            }

            public boolean zzG() {
                return ((zzr) this.zza).zzG();
            }

            public zzab.zzc zzH() {
                return ((zzr) this.zza).zzH();
            }

            public zza zzI(zzab.zzc zzcVar) {
                zzbg();
                ((zzr) this.zza).zzaf(zzcVar);
                return this;
            }

            public zza zzJ() {
                zzbg();
                ((zzr) this.zza).zzag();
                return this;
            }

            public boolean zzK() {
                return ((zzr) this.zza).zzK();
            }

            public zza.zza zzL() {
                return ((zzr) this.zza).zzL();
            }

            public zza zzM(zza.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzah(zzaVar);
                return this;
            }

            public zza zzN() {
                zzbg();
                ((zzr) this.zza).zzai();
                return this;
            }

            public List zzO() {
                return ((zzr) this.zza).zzO();
            }

            public int zzP() {
                return ((zzr) this.zza).zzP();
            }

            public zzd.zza zzQ(int i) {
                return ((zzr) this.zza).zzQ(i);
            }

            public zza zzR(int i, zzd.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzaj(i, zzaVar);
                return this;
            }

            public zza zzS(zzd.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzak(zzaVar);
                return this;
            }

            public zza zzT(Iterable iterable) {
                zzbg();
                ((zzr) this.zza).zzal(iterable);
                return this;
            }

            public zza zzU() {
                zzbg();
                ((zzr) this.zza).zzam();
                return this;
            }

            public List zzV() {
                return ((zzr) this.zza).zzV();
            }

            public int zzW() {
                return ((zzr) this.zza).zzW();
            }

            public zzd.zza zzX(int i) {
                return ((zzr) this.zza).zzX(i);
            }

            public zza zzY(int i, zzd.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzan(i, zzaVar);
                return this;
            }

            public zza zzZ(zzd.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzao(zzaVar);
                return this;
            }

            public boolean zza() {
                return ((zzr) this.zza).zza();
            }

            public zza zzaa(Iterable iterable) {
                zzbg();
                ((zzr) this.zza).zzap(iterable);
                return this;
            }

            public zza zzab() {
                zzbg();
                ((zzr) this.zza).zzaq();
                return this;
            }

            public int zzb() {
                return ((zzr) this.zza).zzb();
            }

            public zza zzc(int i) {
                zzbg();
                ((zzr) this.zza).zzF(i);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzr) this.zza).zzI();
                return this;
            }

            public boolean zze() {
                return ((zzr) this.zza).zze();
            }

            public String zzf() {
                return ((zzr) this.zza).zzf();
            }

            public zzian zzg() {
                return ((zzr) this.zza).zzg();
            }

            public zza zzh(String str) {
                zzbg();
                ((zzr) this.zza).zzJ(str);
                return this;
            }

            public zza zzi() {
                zzbg();
                ((zzr) this.zza).zzM();
                return this;
            }

            public zza zzj(zzian zzianVar) {
                zzbg();
                ((zzr) this.zza).zzN(zzianVar);
                return this;
            }

            public boolean zzk() {
                return ((zzr) this.zza).zzk();
            }

            public zzar zzl() {
                return ((zzr) this.zza).zzl();
            }

            public zza zzm(zzar zzarVar) {
                zzbg();
                ((zzr) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzn(zzar.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzR((zzar) zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzar zzarVar) {
                zzbg();
                ((zzr) this.zza).zzS(zzarVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzr) this.zza).zzT();
                return this;
            }

            public boolean zzq() {
                return ((zzr) this.zza).zzq();
            }

            public zzo.zzb zzr() {
                return ((zzr) this.zza).zzr();
            }

            public zza zzs(zzo.zzb zzbVar) {
                zzbg();
                ((zzr) this.zza).zzU(zzbVar);
                return this;
            }

            public zza zzt() {
                zzbg();
                ((zzr) this.zza).zzY();
                return this;
            }

            public boolean zzu() {
                return ((zzr) this.zza).zzu();
            }

            public String zzv() {
                return ((zzr) this.zza).zzv();
            }

            public zzian zzw() {
                return ((zzr) this.zza).zzw();
            }

            public zza zzx(String str) {
                zzbg();
                ((zzr) this.zza).zzZ(str);
                return this;
            }

            public zza zzy() {
                zzbg();
                ((zzr) this.zza).zzaa();
                return this;
            }

            public zza zzz(zzian zzianVar) {
                zzbg();
                ((zzr) this.zza).zzab(zzianVar);
                return this;
            }

            private zza() {
                super(zzr.zzar());
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzB = zzrVar;
            zzibr.zzbu(zzr.class, zzrVar);
        }

        private zzr() {
        }

        public static zzr zzD() {
            return zzB;
        }

        public static zzidk zzE() {
            return zzB.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaA, reason: merged with bridge method [inline-methods] */
        public void zzU(zzo.zzb zzbVar) {
            this.zzo = zzbVar.zza();
            this.zzk |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaB, reason: merged with bridge method [inline-methods] */
        public void zzY() {
            this.zzk &= -9;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaC, reason: merged with bridge method [inline-methods] */
        public void zzZ(String str) {
            str.getClass();
            this.zzk |= 16;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaD, reason: merged with bridge method [inline-methods] */
        public void zzaa() {
            this.zzk &= -17;
            this.zzp = zzD().zzv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzab(zzian zzianVar) {
            this.zzp = zzianVar.zzz();
            this.zzk |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzac(String str) {
            str.getClass();
            this.zzk |= 32;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
        public void zzad() {
            this.zzk &= -33;
            this.zzu = zzD().zzB();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
        public void zzae(zzian zzianVar) {
            this.zzu = zzianVar.zzz();
            this.zzk |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
        public void zzaf(zzab.zzc zzcVar) {
            this.zzv = zzcVar.zza();
            this.zzk |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
        public void zzag() {
            this.zzk &= -65;
            this.zzv = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
        public void zzah(zza.zza zzaVar) {
            this.zzw = zzaVar.zza();
            this.zzk |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaL, reason: merged with bridge method [inline-methods] */
        public void zzai() {
            this.zzk &= -129;
            this.zzw = 0;
        }

        public static /* synthetic */ zzr zzar() {
            return zzB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzF(int i) {
            this.zzk |= 1;
            this.zzl = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzat, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzk &= -2;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzau, reason: merged with bridge method [inline-methods] */
        public void zzJ(String str) {
            str.getClass();
            this.zzk |= 2;
            this.zzm = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzav, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzk &= -3;
            this.zzm = zzD().zzf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaw, reason: merged with bridge method [inline-methods] */
        public void zzN(zzian zzianVar) {
            this.zzm = zzianVar.zzz();
            this.zzk |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzax, reason: merged with bridge method [inline-methods] */
        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            this.zzn = zzarVar;
            this.zzk |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzay, reason: merged with bridge method [inline-methods] */
        public void zzS(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzn;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzt = zzar.zzt(zzarVar2);
                zzt.zzbo(zzarVar);
                zzarVar = (zzar) zzt.zzbt();
            }
            this.zzn = zzarVar;
            this.zzk |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaz, reason: merged with bridge method [inline-methods] */
        public void zzT() {
            this.zzn = null;
            this.zzk &= -5;
        }

        public static zzr zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzr) zzibr.zzbR(zzB, byteBuffer);
        }

        private void zzce() {
            zzibz zzibzVar = this.zzx;
            if (zzibzVar.zza()) {
                return;
            }
            this.zzx = zzibr.zzbD(zzibzVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcf, reason: merged with bridge method [inline-methods] */
        public void zzaj(int i, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzce();
            this.zzx.zzg(i, zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcg, reason: merged with bridge method [inline-methods] */
        public void zzak(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzce();
            this.zzx.zzi(zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzch, reason: merged with bridge method [inline-methods] */
        public void zzal(Iterable iterable) {
            zzce();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.zzx.zzi(((zzd.zza) it.next()).zza());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzci, reason: merged with bridge method [inline-methods] */
        public void zzam() {
            this.zzx = zzibr.zzbC();
        }

        private void zzcj() {
            zzibz zzibzVar = this.zzz;
            if (zzibzVar.zza()) {
                return;
            }
            this.zzz = zzibr.zzbD(zzibzVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzck, reason: merged with bridge method [inline-methods] */
        public void zzan(int i, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzcj();
            this.zzz.zzg(i, zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcl, reason: merged with bridge method [inline-methods] */
        public void zzao(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzcj();
            this.zzz.zzi(zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcm, reason: merged with bridge method [inline-methods] */
        public void zzap(Iterable iterable) {
            zzcj();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.zzz.zzi(((zzd.zza) it.next()).zza());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcn, reason: merged with bridge method [inline-methods] */
        public void zzaq() {
            this.zzz = zzibr.zzbC();
        }

        public static zzr zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzr) zzibr.zzbQ(zzB, byteBuffer, zzibbVar);
        }

        public static zzr zzh(zzian zzianVar) throws zzicg {
            return (zzr) zzibr.zzbS(zzB, zzianVar);
        }

        public static zzr zzi(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzr) zzibr.zzbT(zzB, zzianVar, zzibbVar);
        }

        public static zzr zzj(byte[] bArr) throws zzicg {
            return (zzr) zzibr.zzbU(zzB, bArr);
        }

        public static zzr zzm(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzr) zzibr.zzbV(zzB, bArr, zzibbVar);
        }

        public static zzr zzn(InputStream inputStream) throws IOException {
            return (zzr) zzibr.zzbW(zzB, inputStream);
        }

        public static zzr zzo(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzr) zzibr.zzbX(zzB, inputStream, zzibbVar);
        }

        public static zzr zzp(InputStream inputStream) throws IOException {
            return (zzr) zzibr.zzca(zzB, inputStream);
        }

        public static zzr zzs(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzr) zzibr.zzcb(zzB, inputStream, zzibbVar);
        }

        public static zzr zzt(zziaq zziaqVar) throws IOException {
            return (zzr) zzibr.zzbY(zzB, zziaqVar);
        }

        public static zzr zzx(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzr) zzibr.zzbZ(zzB, zziaqVar, zzibbVar);
        }

        public static zza zzy() {
            return (zza) zzB.zzbn();
        }

        public static zza zzz(zzr zzrVar) {
            return (zza) zzB.zzbo(zzrVar);
        }

        public boolean zzA() {
            return (this.zzk & 32) != 0;
        }

        public String zzB() {
            return this.zzu;
        }

        public zzian zzC() {
            return zzian.zzv(this.zzu);
        }

        public boolean zzG() {
            return (this.zzk & 64) != 0;
        }

        public zzab.zzc zzH() {
            zzab.zzc zzc2 = zzab.zzc.zzc(this.zzv);
            return zzc2 == null ? zzab.zzc.NETWORKTYPE_UNSPECIFIED : zzc2;
        }

        public boolean zzK() {
            return (this.zzk & 128) != 0;
        }

        public zza.zza zzL() {
            zza.zza zzc2 = zza.zza.zzc(this.zzw);
            return zzc2 == null ? zza.zza.AD_INITIATER_UNSPECIFIED : zzc2;
        }

        public List zzO() {
            return new zzicb(this.zzx, zzy);
        }

        public int zzP() {
            return this.zzx.size();
        }

        public zzd.zza zzQ(int i) {
            zzd.zza zzc2 = zzd.zza.zzc(this.zzx.zzf(i));
            return zzc2 == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzc2;
        }

        public List zzV() {
            return new zzicb(this.zzz, zzA);
        }

        public int zzW() {
            return this.zzz.size();
        }

        public zzd.zza zzX(int i) {
            zzd.zza zzc2 = zzd.zza.zzc(this.zzz.zzf(i));
            return zzc2 == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzc2;
        }

        public boolean zza() {
            return (this.zzk & 1) != 0;
        }

        public int zzb() {
            return this.zzl;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzB, "\u0004\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007င\u0000\bဈ\u0001\tဉ\u0002\n᠌\u0003\u000bဈ\u0004\fဈ\u0005\r᠌\u0006\u000e᠌\u0007\u000fࠞ\u0010ࠞ", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", zzo.zzb.zze(), "zzp", "zzu", "zzv", zzab.zzc.zze(), "zzw", zza.zza.zze(), "zzx", zzd.zza.zze(), "zzz", zzd.zza.zze()});
            }
            if (ordinal == 3) {
                return new zzr();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzB;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzC;
            if (zzidkVar == null) {
                synchronized (zzr.class) {
                    try {
                        zzidkVar = zzC;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzB);
                            zzC = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzk & 2) != 0;
        }

        public String zzf() {
            return this.zzm;
        }

        public zzian zzg() {
            return zzian.zzv(this.zzm);
        }

        public boolean zzk() {
            return (this.zzk & 4) != 0;
        }

        public zzar zzl() {
            zzar zzarVar = this.zzn;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        public boolean zzq() {
            return (this.zzk & 8) != 0;
        }

        public zzo.zzb zzr() {
            zzo.zzb zzc2 = zzo.zzb.zzc(this.zzo);
            return zzc2 == null ? zzo.zzb.PLATFORM_UNSPECIFIED : zzc2;
        }

        public boolean zzu() {
            return (this.zzk & 16) != 0;
        }

        public String zzv() {
            return this.zzp;
        }

        public zzian zzw() {
            return zzian.zzv(this.zzp);
        }
    }

    public interface zzs extends zzidd {
        boolean zzA();

        String zzB();

        zzian zzC();

        boolean zzG();

        zzab.zzc zzH();

        boolean zzK();

        zza.zza zzL();

        List zzO();

        int zzP();

        zzd.zza zzQ(int i);

        List zzV();

        int zzW();

        zzd.zza zzX(int i);

        boolean zza();

        int zzb();

        boolean zze();

        String zzf();

        zzian zzg();

        boolean zzk();

        zzar zzl();

        boolean zzq();

        zzo.zzb zzr();

        boolean zzu();

        String zzv();

        zzian zzw();
    }

    public final class zzt extends zzibr implements zzu {
        private static final zzt zzF;
        private static volatile zzidk zzG = null;
        public static final int zza = 9;
        public static final int zzb = 10;
        public static final int zzc = 11;
        public static final int zzd = 12;
        public static final int zze = 13;
        public static final int zzf = 14;
        public static final int zzg = 15;
        public static final int zzh = 16;
        public static final int zzi = 17;
        public static final int zzj = 18;
        public static final int zzk = 19;
        public static final int zzl = 20;
        public static final int zzm = 21;
        private zzab zzA;
        private zza zzB;
        private zzaf zzC;
        private zzbl zzD;
        private zzb zzE;
        private int zzn;
        private int zzo;
        private int zzu;
        private zzar zzw;
        private zzm zzy;
        private zzo zzz;
        private String zzp = "";
        private int zzv = 1000;
        private zzicc zzx = zzibr.zzbE();

        public final class zza extends zzibl implements zzu {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public long zzA(int i) {
                return ((zzt) this.zza).zzA(i);
            }

            public zza zzB(int i, long j) {
                zzbg();
                ((zzt) this.zza).zzW(i, j);
                return this;
            }

            public zza zzC(long j) {
                zzbg();
                ((zzt) this.zza).zzZ(j);
                return this;
            }

            public zza zzD(Iterable iterable) {
                zzbg();
                ((zzt) this.zza).zzaa(iterable);
                return this;
            }

            public zza zzE() {
                zzbg();
                ((zzt) this.zza).zzab();
                return this;
            }

            public boolean zzF() {
                return ((zzt) this.zza).zzF();
            }

            public zzm zzG() {
                return ((zzt) this.zza).zzG();
            }

            public zza zzH(zzm zzmVar) {
                zzbg();
                ((zzt) this.zza).zzac(zzmVar);
                return this;
            }

            public zza zzI(zzm.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzac((zzm) zzaVar.zzbu());
                return this;
            }

            public zza zzJ(zzm zzmVar) {
                zzbg();
                ((zzt) this.zza).zzaf(zzmVar);
                return this;
            }

            public zza zzK() {
                zzbg();
                ((zzt) this.zza).zzag();
                return this;
            }

            public boolean zzL() {
                return ((zzt) this.zza).zzL();
            }

            public zzo zzM() {
                return ((zzt) this.zza).zzM();
            }

            public zza zzN(zzo zzoVar) {
                zzbg();
                ((zzt) this.zza).zzah(zzoVar);
                return this;
            }

            public zza zzO(zzo.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzah((zzo) zzaVar.zzbu());
                return this;
            }

            public zza zzP(zzo zzoVar) {
                zzbg();
                ((zzt) this.zza).zzai(zzoVar);
                return this;
            }

            public zza zzQ() {
                zzbg();
                ((zzt) this.zza).zzal();
                return this;
            }

            public boolean zzR() {
                return ((zzt) this.zza).zzR();
            }

            public zzab zzS() {
                return ((zzt) this.zza).zzS();
            }

            public zza zzT(zzab zzabVar) {
                zzbg();
                ((zzt) this.zza).zzam(zzabVar);
                return this;
            }

            public zza zzU(zzab.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzam((zzab) zzaVar.zzbu());
                return this;
            }

            public zza zzV(zzab zzabVar) {
                zzbg();
                ((zzt) this.zza).zzan(zzabVar);
                return this;
            }

            public zza zzW() {
                zzbg();
                ((zzt) this.zza).zzao();
                return this;
            }

            public boolean zzX() {
                return ((zzt) this.zza).zzX();
            }

            public zza zzY() {
                return ((zzt) this.zza).zzY();
            }

            public zza zzZ(zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzar(zzaVar);
                return this;
            }

            public boolean zza() {
                return ((zzt) this.zza).zza();
            }

            public zza zzaa(zza.zzb zzbVar) {
                zzbg();
                ((zzt) this.zza).zzar((zza) zzbVar.zzbu());
                return this;
            }

            public zza zzab(zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzas(zzaVar);
                return this;
            }

            public zza zzac() {
                zzbg();
                ((zzt) this.zza).zzat();
                return this;
            }

            public boolean zzad() {
                return ((zzt) this.zza).zzad();
            }

            public zzaf zzae() {
                return ((zzt) this.zza).zzae();
            }

            public zza zzaf(zzaf zzafVar) {
                zzbg();
                ((zzt) this.zza).zzau(zzafVar);
                return this;
            }

            public zza zzag(zzaf.zzc zzcVar) {
                zzbg();
                ((zzt) this.zza).zzau((zzaf) zzcVar.zzbu());
                return this;
            }

            public zza zzah(zzaf zzafVar) {
                zzbg();
                ((zzt) this.zza).zzav(zzafVar);
                return this;
            }

            public zza zzai() {
                zzbg();
                ((zzt) this.zza).zzaw();
                return this;
            }

            public boolean zzaj() {
                return ((zzt) this.zza).zzaj();
            }

            public zzbl zzak() {
                return ((zzt) this.zza).zzak();
            }

            public zza zzal(zzbl zzblVar) {
                zzbg();
                ((zzt) this.zza).zzax(zzblVar);
                return this;
            }

            public zza zzam(zzbl.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzax((zzbl) zzaVar.zzbu());
                return this;
            }

            public zza zzan(zzbl zzblVar) {
                zzbg();
                ((zzt) this.zza).zzay(zzblVar);
                return this;
            }

            public zza zzao() {
                zzbg();
                ((zzt) this.zza).zzaz();
                return this;
            }

            public boolean zzap() {
                return ((zzt) this.zza).zzap();
            }

            public zzb zzaq() {
                return ((zzt) this.zza).zzaq();
            }

            public zza zzar(zzb zzbVar) {
                zzbg();
                ((zzt) this.zza).zzaA(zzbVar);
                return this;
            }

            public zza zzas(zzb.zzc zzcVar) {
                zzbg();
                ((zzt) this.zza).zzaA((zzb) zzcVar.zzbu());
                return this;
            }

            public zza zzat(zzb zzbVar) {
                zzbg();
                ((zzt) this.zza).zzaB(zzbVar);
                return this;
            }

            public zza zzau() {
                zzbg();
                ((zzt) this.zza).zzaC();
                return this;
            }

            public int zzb() {
                return ((zzt) this.zza).zzb();
            }

            public zza zzc(int i) {
                zzbg();
                ((zzt) this.zza).zzE(i);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzt) this.zza).zzH();
                return this;
            }

            public boolean zze() {
                return ((zzt) this.zza).zze();
            }

            public String zzf() {
                return ((zzt) this.zza).zzf();
            }

            public zzian zzg() {
                return ((zzt) this.zza).zzg();
            }

            public zza zzh(String str) {
                zzbg();
                ((zzt) this.zza).zzI(str);
                return this;
            }

            public zza zzi() {
                zzbg();
                ((zzt) this.zza).zzJ();
                return this;
            }

            public zza zzj(zzian zzianVar) {
                zzbg();
                ((zzt) this.zza).zzK(zzianVar);
                return this;
            }

            public boolean zzk() {
                return ((zzt) this.zza).zzk();
            }

            public int zzl() {
                return ((zzt) this.zza).zzl();
            }

            public zza zzm(int i) {
                zzbg();
                ((zzt) this.zza).zzN(i);
                return this;
            }

            public zza zzn() {
                zzbg();
                ((zzt) this.zza).zzO();
                return this;
            }

            public boolean zzo() {
                return ((zzt) this.zza).zzo();
            }

            public zzq zzp() {
                return ((zzt) this.zza).zzp();
            }

            public zza zzq(zzq zzqVar) {
                zzbg();
                ((zzt) this.zza).zzP(zzqVar);
                return this;
            }

            public zza zzr() {
                zzbg();
                ((zzt) this.zza).zzQ();
                return this;
            }

            public boolean zzs() {
                return ((zzt) this.zza).zzs();
            }

            public zzar zzt() {
                return ((zzt) this.zza).zzt();
            }

            public zza zzu(zzar zzarVar) {
                zzbg();
                ((zzt) this.zza).zzT(zzarVar);
                return this;
            }

            public zza zzv(zzar.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzT((zzar) zzaVar.zzbu());
                return this;
            }

            public zza zzw(zzar zzarVar) {
                zzbg();
                ((zzt) this.zza).zzU(zzarVar);
                return this;
            }

            public zza zzx() {
                zzbg();
                ((zzt) this.zza).zzV();
                return this;
            }

            public List zzy() {
                return Collections.unmodifiableList(((zzt) this.zza).zzy());
            }

            public int zzz() {
                return ((zzt) this.zza).zzz();
            }

            private zza() {
                super(zzt.zzaD());
            }
        }

        static {
            zzt zztVar = new zzt();
            zzF = zztVar;
            zzibr.zzbu(zzt.class, zztVar);
        }

        private zzt() {
        }

        public static zza zzB(zzt zztVar) {
            return (zza) zzF.zzbo(zztVar);
        }

        public static zzt zzC() {
            return zzF;
        }

        public static zzidk zzD() {
            return zzF.zzbd();
        }

        public static /* synthetic */ zzt zzaD() {
            return zzF;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzE(int i) {
            this.zzn |= 1;
            this.zzo = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzH() {
            this.zzn &= -2;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
        public void zzI(String str) {
            str.getClass();
            this.zzn |= 2;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzn &= -3;
            this.zzp = zzC().zzf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
        public void zzK(zzian zzianVar) {
            this.zzp = zzianVar.zzz();
            this.zzn |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
        public void zzN(int i) {
            this.zzn |= 4;
            this.zzu = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
        public void zzO() {
            this.zzn &= -5;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaL, reason: merged with bridge method [inline-methods] */
        public void zzP(zzq zzqVar) {
            this.zzv = zzqVar.zza();
            this.zzn |= 8;
        }

        public static zzt zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzt) zzibr.zzbR(zzF, byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcA, reason: merged with bridge method [inline-methods] */
        public void zzav(zzaf zzafVar) {
            zzafVar.getClass();
            zzaf zzafVar2 = this.zzC;
            if (zzafVar2 != null && zzafVar2 != zzaf.zzD()) {
                zzaf.zzc zzC = zzaf.zzC(zzafVar2);
                zzC.zzbo(zzafVar);
                zzafVar = (zzaf) zzC.zzbt();
            }
            this.zzC = zzafVar;
            this.zzn |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcB, reason: merged with bridge method [inline-methods] */
        public void zzaw() {
            this.zzC = null;
            this.zzn &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcC, reason: merged with bridge method [inline-methods] */
        public void zzax(zzbl zzblVar) {
            zzblVar.getClass();
            this.zzD = zzblVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcD, reason: merged with bridge method [inline-methods] */
        public void zzay(zzbl zzblVar) {
            zzblVar.getClass();
            zzbl zzblVar2 = this.zzD;
            if (zzblVar2 != null && zzblVar2 != zzbl.zzs()) {
                zzbl.zza zzr = zzbl.zzr(zzblVar2);
                zzr.zzbo(zzblVar);
                zzblVar = (zzbl) zzr.zzbt();
            }
            this.zzD = zzblVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcE, reason: merged with bridge method [inline-methods] */
        public void zzaz() {
            this.zzD = null;
            this.zzn &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcF, reason: merged with bridge method [inline-methods] */
        public void zzaA(zzb zzbVar) {
            zzbVar.getClass();
            this.zzE = zzbVar;
            this.zzn |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcG, reason: merged with bridge method [inline-methods] */
        public void zzaB(zzb zzbVar) {
            zzbVar.getClass();
            zzb zzbVar2 = this.zzE;
            if (zzbVar2 != null && zzbVar2 != zzb.zzu()) {
                zzb.zzc zzt = zzb.zzt(zzbVar2);
                zzt.zzbo(zzbVar);
                zzbVar = (zzb) zzt.zzbt();
            }
            this.zzE = zzbVar;
            this.zzn |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcH, reason: merged with bridge method [inline-methods] */
        public void zzaC() {
            this.zzE = null;
            this.zzn &= -2049;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzce, reason: merged with bridge method [inline-methods] */
        public void zzQ() {
            this.zzn &= -9;
            this.zzv = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcf, reason: merged with bridge method [inline-methods] */
        public void zzT(zzar zzarVar) {
            zzarVar.getClass();
            this.zzw = zzarVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcg, reason: merged with bridge method [inline-methods] */
        public void zzU(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzw;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzt = zzar.zzt(zzarVar2);
                zzt.zzbo(zzarVar);
                zzarVar = (zzar) zzt.zzbt();
            }
            this.zzw = zzarVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzch, reason: merged with bridge method [inline-methods] */
        public void zzV() {
            this.zzw = null;
            this.zzn &= -17;
        }

        private void zzci() {
            zzicc zziccVar = this.zzx;
            if (zziccVar.zza()) {
                return;
            }
            this.zzx = zzibr.zzbF(zziccVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcj, reason: merged with bridge method [inline-methods] */
        public void zzW(int i, long j) {
            zzci();
            this.zzx.zze(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzck, reason: merged with bridge method [inline-methods] */
        public void zzZ(long j) {
            zzci();
            this.zzx.zzd(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcl, reason: merged with bridge method [inline-methods] */
        public void zzaa(Iterable iterable) {
            zzci();
            zzhzw.zzaW(iterable, this.zzx);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcm, reason: merged with bridge method [inline-methods] */
        public void zzab() {
            this.zzx = zzibr.zzbE();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcn, reason: merged with bridge method [inline-methods] */
        public void zzac(zzm zzmVar) {
            zzmVar.getClass();
            this.zzy = zzmVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzco, reason: merged with bridge method [inline-methods] */
        public void zzaf(zzm zzmVar) {
            zzmVar.getClass();
            zzm zzmVar2 = this.zzy;
            if (zzmVar2 != null && zzmVar2 != zzm.zzC()) {
                zzm.zza zzz = zzm.zzz(zzmVar2);
                zzz.zzbo(zzmVar);
                zzmVar = (zzm) zzz.zzbt();
            }
            this.zzy = zzmVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcp, reason: merged with bridge method [inline-methods] */
        public void zzag() {
            this.zzy = null;
            this.zzn &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcq, reason: merged with bridge method [inline-methods] */
        public void zzah(zzo zzoVar) {
            zzoVar.getClass();
            this.zzz = zzoVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcr, reason: merged with bridge method [inline-methods] */
        public void zzai(zzo zzoVar) {
            zzoVar.getClass();
            zzo zzoVar2 = this.zzz;
            if (zzoVar2 != null && zzoVar2 != zzo.zzy()) {
                zzo.zza zzx = zzo.zzx(zzoVar2);
                zzx.zzbo(zzoVar);
                zzoVar = (zzo) zzx.zzbt();
            }
            this.zzz = zzoVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcs, reason: merged with bridge method [inline-methods] */
        public void zzal() {
            this.zzz = null;
            this.zzn &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzct, reason: merged with bridge method [inline-methods] */
        public void zzam(zzab zzabVar) {
            zzabVar.getClass();
            this.zzA = zzabVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcu, reason: merged with bridge method [inline-methods] */
        public void zzan(zzab zzabVar) {
            zzabVar.getClass();
            zzab zzabVar2 = this.zzA;
            if (zzabVar2 != null && zzabVar2 != zzab.zzs()) {
                zzab.zza zzr = zzab.zzr(zzabVar2);
                zzr.zzbo(zzabVar);
                zzabVar = (zzab) zzr.zzbt();
            }
            this.zzA = zzabVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcv, reason: merged with bridge method [inline-methods] */
        public void zzao() {
            this.zzA = null;
            this.zzn &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcw, reason: merged with bridge method [inline-methods] */
        public void zzar(zza zzaVar) {
            zzaVar.getClass();
            this.zzB = zzaVar;
            this.zzn |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcx, reason: merged with bridge method [inline-methods] */
        public void zzas(zza zzaVar) {
            zzaVar.getClass();
            zza zzaVar2 = this.zzB;
            if (zzaVar2 != null && zzaVar2 != zza.zzD()) {
                zza.zzb zzC = zza.zzC(zzaVar2);
                zzC.zzbo(zzaVar);
                zzaVar = (zza) zzC.zzbt();
            }
            this.zzB = zzaVar;
            this.zzn |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcy, reason: merged with bridge method [inline-methods] */
        public void zzat() {
            this.zzB = null;
            this.zzn &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzcz, reason: merged with bridge method [inline-methods] */
        public void zzau(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzC = zzafVar;
            this.zzn |= 512;
        }

        public static zzt zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzt) zzibr.zzbQ(zzF, byteBuffer, zzibbVar);
        }

        public static zzt zzh(zzian zzianVar) throws zzicg {
            return (zzt) zzibr.zzbS(zzF, zzianVar);
        }

        public static zzt zzi(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzt) zzibr.zzbT(zzF, zzianVar, zzibbVar);
        }

        public static zzt zzj(byte[] bArr) throws zzicg {
            return (zzt) zzibr.zzbU(zzF, bArr);
        }

        public static zzt zzm(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzt) zzibr.zzbV(zzF, bArr, zzibbVar);
        }

        public static zzt zzn(InputStream inputStream) throws IOException {
            return (zzt) zzibr.zzbW(zzF, inputStream);
        }

        public static zzt zzq(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzt) zzibr.zzbX(zzF, inputStream, zzibbVar);
        }

        public static zzt zzr(InputStream inputStream) throws IOException {
            return (zzt) zzibr.zzca(zzF, inputStream);
        }

        public static zzt zzu(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzt) zzibr.zzcb(zzF, inputStream, zzibbVar);
        }

        public static zzt zzv(zziaq zziaqVar) throws IOException {
            return (zzt) zzibr.zzbY(zzF, zziaqVar);
        }

        public static zzt zzw(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzt) zzibr.zzbZ(zzF, zziaqVar, zzibbVar);
        }

        public static zza zzx() {
            return (zza) zzF.zzbn();
        }

        public long zzA(int i) {
            return this.zzx.zzc(i);
        }

        public boolean zzF() {
            return (this.zzn & 32) != 0;
        }

        public zzm zzG() {
            zzm zzmVar = this.zzy;
            return zzmVar == null ? zzm.zzC() : zzmVar;
        }

        public boolean zzL() {
            return (this.zzn & 64) != 0;
        }

        public zzo zzM() {
            zzo zzoVar = this.zzz;
            return zzoVar == null ? zzo.zzy() : zzoVar;
        }

        public boolean zzR() {
            return (this.zzn & 128) != 0;
        }

        public zzab zzS() {
            zzab zzabVar = this.zzA;
            return zzabVar == null ? zzab.zzs() : zzabVar;
        }

        public boolean zzX() {
            return (this.zzn & 256) != 0;
        }

        public zza zzY() {
            zza zzaVar = this.zzB;
            return zzaVar == null ? zza.zzD() : zzaVar;
        }

        public boolean zza() {
            return (this.zzn & 1) != 0;
        }

        public boolean zzad() {
            return (this.zzn & 512) != 0;
        }

        public zzaf zzae() {
            zzaf zzafVar = this.zzC;
            return zzafVar == null ? zzaf.zzD() : zzafVar;
        }

        public boolean zzaj() {
            return (this.zzn & 1024) != 0;
        }

        public zzbl zzak() {
            zzbl zzblVar = this.zzD;
            return zzblVar == null ? zzbl.zzs() : zzblVar;
        }

        public boolean zzap() {
            return (this.zzn & 2048) != 0;
        }

        public zzb zzaq() {
            zzb zzbVar = this.zzE;
            return zzbVar == null ? zzb.zzu() : zzbVar;
        }

        public int zzb() {
            return this.zzo;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", zzq.zze(), "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
            }
            if (ordinal == 3) {
                return new zzt();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzF;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzG;
            if (zzidkVar == null) {
                synchronized (zzt.class) {
                    try {
                        zzidkVar = zzG;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzF);
                            zzG = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zze() {
            return (this.zzn & 2) != 0;
        }

        public String zzf() {
            return this.zzp;
        }

        public zzian zzg() {
            return zzian.zzv(this.zzp);
        }

        public boolean zzk() {
            return (this.zzn & 4) != 0;
        }

        public int zzl() {
            return this.zzu;
        }

        public boolean zzo() {
            return (this.zzn & 8) != 0;
        }

        public zzq zzp() {
            zzq zzc2 = zzq.zzc(this.zzv);
            return zzc2 == null ? zzq.ENUM_UNKNOWN : zzc2;
        }

        public boolean zzs() {
            return (this.zzn & 16) != 0;
        }

        public zzar zzt() {
            zzar zzarVar = this.zzw;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        public List zzy() {
            return this.zzx;
        }

        public int zzz() {
            return this.zzx.size();
        }
    }

    public interface zzu extends zzidd {
        long zzA(int i);

        boolean zzF();

        zzm zzG();

        boolean zzL();

        zzo zzM();

        boolean zzR();

        zzab zzS();

        boolean zzX();

        zza zzY();

        boolean zza();

        boolean zzad();

        zzaf zzae();

        boolean zzaj();

        zzbl zzak();

        boolean zzap();

        zzb zzaq();

        int zzb();

        boolean zze();

        String zzf();

        zzian zzg();

        boolean zzk();

        int zzl();

        boolean zzo();

        zzq zzp();

        boolean zzs();

        zzar zzt();

        List zzy();

        int zzz();
    }

    public final class zzv extends zzibr implements zzw {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzv zzj;
        private static volatile zzidk zzk;
        private int zze;
        private int zzg;
        private zzap zzi;
        private String zzf = "";
        private zzibz zzh = zzibr.zzbC();

        public final class zza extends zzibl implements zzw {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzv) this.zza).zza();
            }

            public String zzb() {
                return ((zzv) this.zza).zzb();
            }

            public zzian zzc() {
                return ((zzv) this.zza).zzc();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzv) this.zza).zzB(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzv) this.zza).zzC();
                return this;
            }

            public zza zzf(zzian zzianVar) {
                zzbg();
                ((zzv) this.zza).zzD(zzianVar);
                return this;
            }

            public boolean zzg() {
                return ((zzv) this.zza).zzg();
            }

            public zzq zzh() {
                return ((zzv) this.zza).zzh();
            }

            public zza zzi(zzq zzqVar) {
                zzbg();
                ((zzv) this.zza).zzE(zzqVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzv) this.zza).zzF();
                return this;
            }

            public List zzk() {
                return Collections.unmodifiableList(((zzv) this.zza).zzk());
            }

            public int zzl() {
                return ((zzv) this.zza).zzl();
            }

            public int zzm(int i) {
                return ((zzv) this.zza).zzm(i);
            }

            public zza zzn(int i, int i2) {
                zzbg();
                ((zzv) this.zza).zzG(i, i2);
                return this;
            }

            public zza zzo(int i) {
                zzbg();
                ((zzv) this.zza).zzH(i);
                return this;
            }

            public zza zzp(Iterable iterable) {
                zzbg();
                ((zzv) this.zza).zzI(iterable);
                return this;
            }

            public zza zzq() {
                zzbg();
                ((zzv) this.zza).zzJ();
                return this;
            }

            public boolean zzr() {
                return ((zzv) this.zza).zzr();
            }

            public zzap zzs() {
                return ((zzv) this.zza).zzs();
            }

            public zza zzt(zzap zzapVar) {
                zzbg();
                ((zzv) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzu(zzap.zza zzaVar) {
                zzbg();
                ((zzv) this.zza).zzK((zzap) zzaVar.zzbu());
                return this;
            }

            public zza zzv(zzap zzapVar) {
                zzbg();
                ((zzv) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzw() {
                zzbg();
                ((zzv) this.zza).zzM();
                return this;
            }

            private zza() {
                super(zzv.zzN());
            }
        }

        static {
            zzv zzvVar = new zzv();
            zzj = zzvVar;
            zzibr.zzbu(zzv.class, zzvVar);
        }

        private zzv() {
        }

        public static zzidk zzA() {
            return zzj.zzbd();
        }

        public static /* synthetic */ zzv zzN() {
            return zzj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzB(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzf = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzC() {
            this.zze &= -2;
            this.zzf = zzz().zzb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzD(zzian zzianVar) {
            this.zzf = zzianVar.zzz();
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzE(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzF() {
            this.zze &= -3;
            this.zzg = 0;
        }

        private void zzT() {
            zzibz zzibzVar = this.zzh;
            if (zzibzVar.zza()) {
                return;
            }
            this.zzh = zzibr.zzbD(zzibzVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzG(int i, int i2) {
            zzT();
            this.zzh.zzg(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzH(int i) {
            zzT();
            this.zzh.zzi(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzI(Iterable iterable) {
            zzT();
            zzhzw.zzaW(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzh = zzibr.zzbC();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zzi = zzapVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzi = null;
            this.zze &= -5;
        }

        public static zzv zzd(ByteBuffer byteBuffer) throws zzicg {
            return (zzv) zzibr.zzbR(zzj, byteBuffer);
        }

        public static zzv zze(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzv) zzibr.zzbQ(zzj, byteBuffer, zzibbVar);
        }

        public static zzv zzi(zzian zzianVar) throws zzicg {
            return (zzv) zzibr.zzbS(zzj, zzianVar);
        }

        public static zzv zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzv) zzibr.zzbT(zzj, zzianVar, zzibbVar);
        }

        public static zzv zzn(byte[] bArr) throws zzicg {
            return (zzv) zzibr.zzbU(zzj, bArr);
        }

        public static zzv zzo(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzv) zzibr.zzbV(zzj, bArr, zzibbVar);
        }

        public static zzv zzp(InputStream inputStream) throws IOException {
            return (zzv) zzibr.zzbW(zzj, inputStream);
        }

        public static zzv zzq(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzv) zzibr.zzbX(zzj, inputStream, zzibbVar);
        }

        public static zzv zzt(InputStream inputStream) throws IOException {
            return (zzv) zzibr.zzca(zzj, inputStream);
        }

        public static zzv zzu(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzv) zzibr.zzcb(zzj, inputStream, zzibbVar);
        }

        public static zzv zzv(zziaq zziaqVar) throws IOException {
            return (zzv) zzibr.zzbY(zzj, zziaqVar);
        }

        public static zzv zzw(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzv) zzibr.zzbZ(zzj, zziaqVar, zzibbVar);
        }

        public static zza zzx() {
            return (zza) zzj.zzbn();
        }

        public static zza zzy(zzv zzvVar) {
            return (zza) zzj.zzbo(zzvVar);
        }

        public static zzv zzz() {
            return zzj;
        }

        public boolean zza() {
            return (this.zze & 1) != 0;
        }

        public String zzb() {
            return this.zzf;
        }

        public zzian zzc() {
            return zzian.zzv(this.zzf);
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzq.zze(), "zzh", "zzi"});
            }
            if (ordinal == 3) {
                return new zzv();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzj;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzk;
            if (zzidkVar == null) {
                synchronized (zzv.class) {
                    try {
                        zzidkVar = zzk;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzj);
                            zzk = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        public zzq zzh() {
            zzq zzc2 = zzq.zzc(this.zzg);
            return zzc2 == null ? zzq.ENUM_FALSE : zzc2;
        }

        public List zzk() {
            return this.zzh;
        }

        public int zzl() {
            return this.zzh.size();
        }

        public int zzm(int i) {
            return this.zzh.zzf(i);
        }

        public boolean zzr() {
            return (this.zze & 4) != 0;
        }

        public zzap zzs() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzw extends zzidd {
        boolean zza();

        String zzb();

        zzian zzc();

        boolean zzg();

        zzq zzh();

        List zzk();

        int zzl();

        int zzm(int i);

        boolean zzr();

        zzap zzs();
    }

    public final class zzx extends zzibr implements zzy {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzx zzf;
        private static volatile zzidk zzg;
        private int zzc;
        private int zzd;
        private zzibz zze = zzibr.zzbC();

        public final class zza extends zzibl implements zzy {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public boolean zza() {
                return ((zzx) this.zza).zza();
            }

            public zzq zzb() {
                return ((zzx) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzx) this.zza).zzv(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzx) this.zza).zzw();
                return this;
            }

            public List zze() {
                return Collections.unmodifiableList(((zzx) this.zza).zze());
            }

            public int zzf() {
                return ((zzx) this.zza).zzf();
            }

            public int zzg(int i) {
                return ((zzx) this.zza).zzg(i);
            }

            public zza zzh(int i, int i2) {
                zzbg();
                ((zzx) this.zza).zzx(i, i2);
                return this;
            }

            public zza zzi(int i) {
                zzbg();
                ((zzx) this.zza).zzy(i);
                return this;
            }

            public zza zzj(Iterable iterable) {
                zzbg();
                ((zzx) this.zza).zzz(iterable);
                return this;
            }

            public zza zzk() {
                zzbg();
                ((zzx) this.zza).zzA();
                return this;
            }

            private zza() {
                super(zzx.zzB());
            }
        }

        static {
            zzx zzxVar = new zzx();
            zzf = zzxVar;
            zzibr.zzbu(zzx.class, zzxVar);
        }

        private zzx() {
        }

        public static /* synthetic */ zzx zzB() {
            return zzf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzv(zzq zzqVar) {
            this.zzd = zzqVar.zza();
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzw() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        private void zzE() {
            zzibz zzibzVar = this.zze;
            if (zzibzVar.zza()) {
                return;
            }
            this.zze = zzibr.zzbD(zzibzVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzx(int i, int i2) {
            zzE();
            this.zze.zzg(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzy(int i) {
            zzE();
            this.zze.zzi(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzz(Iterable iterable) {
            zzE();
            zzhzw.zzaW(iterable, this.zze);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zze = zzibr.zzbC();
        }

        public static zzx zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzx) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzx zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzx) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzx zzh(zzian zzianVar) throws zzicg {
            return (zzx) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzx zzi(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzx) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzx zzj(byte[] bArr) throws zzicg {
            return (zzx) zzibr.zzbU(zzf, bArr);
        }

        public static zzx zzk(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzx) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzx zzl(InputStream inputStream) throws IOException {
            return (zzx) zzibr.zzbW(zzf, inputStream);
        }

        public static zzx zzm(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzx) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzx zzn(InputStream inputStream) throws IOException {
            return (zzx) zzibr.zzca(zzf, inputStream);
        }

        public static zzx zzo(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzx) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzx zzp(zziaq zziaqVar) throws IOException {
            return (zzx) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzx zzq(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzx) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzr() {
            return (zza) zzf.zzbn();
        }

        public static zza zzs(zzx zzxVar) {
            return (zza) zzf.zzbo(zzxVar);
        }

        public static zzx zzt() {
            return zzf;
        }

        public static zzidk zzu() {
            return zzf.zzbd();
        }

        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public zzq zzb() {
            zzq zzc = zzq.zzc(this.zzd);
            return zzc == null ? zzq.ENUM_FALSE : zzc;
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzc", "zzd", zzq.zze(), "zze"});
            }
            if (ordinal == 3) {
                return new zzx();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzf;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzg;
            if (zzidkVar == null) {
                synchronized (zzx.class) {
                    try {
                        zzidkVar = zzg;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzf);
                            zzg = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public List zze() {
            return this.zze;
        }

        public int zzf() {
            return this.zze.size();
        }

        public int zzg(int i) {
            return this.zze.zzf(i);
        }
    }

    public interface zzy extends zzidd {
        boolean zza();

        zzq zzb();

        List zze();

        int zzf();

        int zzg(int i);
    }

    public final class zzz extends zzibr implements zzaa {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzz zzj;
        private static volatile zzidk zzk;
        private int zze;
        private zzv zzf;
        private zzicd zzg = zzibr.zzbM();
        private int zzh;
        private zzap zzi;

        public final class zza extends zzibl implements zzaa {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public zza zzA(zzap zzapVar) {
                zzbg();
                ((zzz) this.zza).zzO(zzapVar);
                return this;
            }

            public zza zzB() {
                zzbg();
                ((zzz) this.zza).zzP();
                return this;
            }

            public boolean zza() {
                return ((zzz) this.zza).zza();
            }

            public zzv zzb() {
                return ((zzz) this.zza).zzb();
            }

            public zza zzc(zzv zzvVar) {
                zzbg();
                ((zzz) this.zza).zzC(zzvVar);
                return this;
            }

            public zza zzd(zzv.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzC((zzv) zzaVar.zzbu());
                return this;
            }

            public zza zze(zzv zzvVar) {
                zzbg();
                ((zzz) this.zza).zzD(zzvVar);
                return this;
            }

            public zza zzf() {
                zzbg();
                ((zzz) this.zza).zzE();
                return this;
            }

            public List zzg() {
                return Collections.unmodifiableList(((zzz) this.zza).zzg());
            }

            public int zzh() {
                return ((zzz) this.zza).zzh();
            }

            public zzan zzi(int i) {
                return ((zzz) this.zza).zzi(i);
            }

            public zza zzj(int i, zzan zzanVar) {
                zzbg();
                ((zzz) this.zza).zzF(i, zzanVar);
                return this;
            }

            public zza zzk(int i, zzan.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzF(i, (zzan) zzaVar.zzbu());
                return this;
            }

            public zza zzl(zzan zzanVar) {
                zzbg();
                ((zzz) this.zza).zzG(zzanVar);
                return this;
            }

            public zza zzm(int i, zzan zzanVar) {
                zzbg();
                ((zzz) this.zza).zzH(i, zzanVar);
                return this;
            }

            public zza zzn(zzan.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzG((zzan) zzaVar.zzbu());
                return this;
            }

            public zza zzo(int i, zzan.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzH(i, (zzan) zzaVar.zzbu());
                return this;
            }

            public zza zzp(Iterable iterable) {
                zzbg();
                ((zzz) this.zza).zzI(iterable);
                return this;
            }

            public zza zzq() {
                zzbg();
                ((zzz) this.zza).zzJ();
                return this;
            }

            public zza zzr(int i) {
                zzbg();
                ((zzz) this.zza).zzK(i);
                return this;
            }

            public boolean zzs() {
                return ((zzz) this.zza).zzs();
            }

            public zzq zzt() {
                return ((zzz) this.zza).zzt();
            }

            public zza zzu(zzq zzqVar) {
                zzbg();
                ((zzz) this.zza).zzL(zzqVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzz) this.zza).zzM();
                return this;
            }

            public boolean zzw() {
                return ((zzz) this.zza).zzw();
            }

            public zzap zzx() {
                return ((zzz) this.zza).zzx();
            }

            public zza zzy(zzap zzapVar) {
                zzbg();
                ((zzz) this.zza).zzN(zzapVar);
                return this;
            }

            public zza zzz(zzap.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzN((zzap) zzaVar.zzbu());
                return this;
            }

            private zza() {
                super(zzz.zzQ());
            }
        }

        static {
            zzz zzzVar = new zzz();
            zzj = zzzVar;
            zzibr.zzbu(zzz.class, zzzVar);
        }

        private zzz() {
        }

        public static zzz zzA() {
            return zzj;
        }

        public static zzidk zzB() {
            return zzj.zzbd();
        }

        public static /* synthetic */ zzz zzQ() {
            return zzj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzC(zzv zzvVar) {
            zzvVar.getClass();
            this.zzf = zzvVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzD(zzv zzvVar) {
            zzvVar.getClass();
            zzv zzvVar2 = this.zzf;
            if (zzvVar2 != null && zzvVar2 != zzv.zzz()) {
                zzv.zza zzy = zzv.zzy(zzvVar2);
                zzy.zzbo(zzvVar);
                zzvVar = (zzv) zzy.zzbt();
            }
            this.zzf = zzvVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzE() {
            this.zzf = null;
            this.zze &= -2;
        }

        private void zzU() {
            zzicd zzicdVar = this.zzg;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzg = zzibr.zzbN(zzicdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzF(int i, zzan zzanVar) {
            zzanVar.getClass();
            zzU();
            this.zzg.set(i, zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzG(zzan zzanVar) {
            zzanVar.getClass();
            zzU();
            this.zzg.add(zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzH(int i, zzan zzanVar) {
            zzanVar.getClass();
            zzU();
            this.zzg.add(i, zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public void zzI(Iterable iterable) {
            zzU();
            zzhzw.zzaW(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzg = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzK(int i) {
            zzU();
            this.zzg.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzab, reason: merged with bridge method [inline-methods] */
        public void zzL(zzq zzqVar) {
            this.zzh = zzqVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zze &= -3;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
        public void zzN(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public void zzO(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzr = zzap.zzr(zzapVar2);
                zzr.zzbo(zzapVar);
                zzapVar = (zzap) zzr.zzbt();
            }
            this.zzi = zzapVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzi = null;
            this.zze &= -5;
        }

        public static zzz zze(ByteBuffer byteBuffer) throws zzicg {
            return (zzz) zzibr.zzbR(zzj, byteBuffer);
        }

        public static zzz zzj(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzz) zzibr.zzbQ(zzj, byteBuffer, zzibbVar);
        }

        public static zzz zzk(zzian zzianVar) throws zzicg {
            return (zzz) zzibr.zzbS(zzj, zzianVar);
        }

        public static zzz zzl(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzz) zzibr.zzbT(zzj, zzianVar, zzibbVar);
        }

        public static zzz zzm(byte[] bArr) throws zzicg {
            return (zzz) zzibr.zzbU(zzj, bArr);
        }

        public static zzz zzn(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzz) zzibr.zzbV(zzj, bArr, zzibbVar);
        }

        public static zzz zzo(InputStream inputStream) throws IOException {
            return (zzz) zzibr.zzbW(zzj, inputStream);
        }

        public static zzz zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzz) zzibr.zzbX(zzj, inputStream, zzibbVar);
        }

        public static zzz zzq(InputStream inputStream) throws IOException {
            return (zzz) zzibr.zzca(zzj, inputStream);
        }

        public static zzz zzr(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzz) zzibr.zzcb(zzj, inputStream, zzibbVar);
        }

        public static zzz zzu(zziaq zziaqVar) throws IOException {
            return (zzz) zzibr.zzbY(zzj, zziaqVar);
        }

        public static zzz zzv(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzz) zzibr.zzbZ(zzj, zziaqVar, zzibbVar);
        }

        public static zza zzy() {
            return (zza) zzj.zzbn();
        }

        public static zza zzz(zzz zzzVar) {
            return (zza) zzj.zzbo(zzzVar);
        }

        public boolean zza() {
            return (this.zze & 1) != 0;
        }

        public zzv zzb() {
            zzv zzvVar = this.zzf;
            return zzvVar == null ? zzv.zzz() : zzvVar;
        }

        public List zzc() {
            return this.zzg;
        }

        public zzao zzd(int i) {
            return (zzao) this.zzg.get(i);
        }

        public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            int ordinal = zzibqVar.ordinal();
            if (ordinal == 0) {
                return (byte) 1;
            }
            if (ordinal == 2) {
                return zzibr.zzbv(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzan.class, "zzh", zzq.zze(), "zzi"});
            }
            if (ordinal == 3) {
                return new zzz();
            }
            if (ordinal == 4) {
                return new zza(null);
            }
            if (ordinal == 5) {
                return zzj;
            }
            if (ordinal != 6) {
                throw null;
            }
            zzidk zzidkVar = zzk;
            if (zzidkVar == null) {
                synchronized (zzz.class) {
                    try {
                        zzidkVar = zzk;
                        if (zzidkVar == null) {
                            zzidkVar = new zzibm(zzj);
                            zzk = zzidkVar;
                        }
                    } finally {
                    }
                }
            }
            return zzidkVar;
        }

        public List zzg() {
            return this.zzg;
        }

        public int zzh() {
            return this.zzg.size();
        }

        public zzan zzi(int i) {
            return (zzan) this.zzg.get(i);
        }

        public boolean zzs() {
            return (this.zze & 2) != 0;
        }

        public zzq zzt() {
            zzq zzc2 = zzq.zzc(this.zzh);
            return zzc2 == null ? zzq.ENUM_FALSE : zzc2;
        }

        public boolean zzw() {
            return (this.zze & 4) != 0;
        }

        public zzap zzx() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    private zzbgj() {
    }

    public static void zza(zzibb zzibbVar) {
    }
}
