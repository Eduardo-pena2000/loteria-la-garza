package com.google.android.gms.internal.drive;

/* JADX WARN: Enum visitor error
LI11I1ll1Ii11.IIiLliI1l1li1: Init of enum field 'zzww' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:112)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:91)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:46)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:136)
	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zznm {
    public static final zznm zzwu;
    public static final zznm zzwv;
    public static final zznm zzww;
    public static final zznm zzwx;
    public static final zznm zzwy;
    public static final zznm zzwz;
    public static final zznm zzxa;
    public static final zznm zzxb;
    public static final zznm zzxc;
    public static final zznm zzxd;
    public static final zznm zzxe;
    public static final zznm zzxf;
    public static final zznm zzxg;
    public static final zznm zzxh;
    public static final zznm zzxi;
    public static final zznm zzxj;
    public static final zznm zzxk;
    public static final zznm zzxl;
    private static final /* synthetic */ zznm[] zzxo;
    private final zznr zzxm;
    private final int zzxn;

    static {
        zznm zznmVar = new zznm("DOUBLE", 0, zznr.zzxs, 1);
        zzwu = zznmVar;
        zznm zznmVar2 = new zznm("FLOAT", 1, zznr.zzxr, 5);
        zzwv = zznmVar2;
        zznr zznrVar = zznr.zzxq;
        zznm zznmVar3 = new zznm("INT64", 2, zznrVar, 0);
        zzww = zznmVar3;
        zznm zznmVar4 = new zznm("UINT64", 3, zznrVar, 0);
        zzwx = zznmVar4;
        zznr zznrVar2 = zznr.zzxp;
        zznm zznmVar5 = new zznm("INT32", 4, zznrVar2, 0);
        zzwy = zznmVar5;
        zznm zznmVar6 = new zznm("FIXED64", 5, zznrVar, 1);
        zzwz = zznmVar6;
        zznm zznmVar7 = new zznm("FIXED32", 6, zznrVar2, 5);
        zzxa = zznmVar7;
        zznm zznmVar8 = new zznm("BOOL", 7, zznr.zzxt, 0);
        zzxb = zznmVar8;
        zznn zznnVar = new zznn("STRING", 8, zznr.zzxu, 2);
        zzxc = zznnVar;
        zznr zznrVar3 = zznr.zzxx;
        zzno zznoVar = new zzno("GROUP", 9, zznrVar3, 3);
        zzxd = zznoVar;
        zznp zznpVar = new zznp("MESSAGE", 10, zznrVar3, 2);
        zzxe = zznpVar;
        zznq zznqVar = new zznq("BYTES", 11, zznr.zzxv, 2);
        zzxf = zznqVar;
        zznm zznmVar9 = new zznm("UINT32", 12, zznrVar2, 0);
        zzxg = zznmVar9;
        zznm zznmVar10 = new zznm("ENUM", 13, zznr.zzxw, 0);
        zzxh = zznmVar10;
        zznm zznmVar11 = new zznm("SFIXED32", 14, zznrVar2, 5);
        zzxi = zznmVar11;
        zznm zznmVar12 = new zznm("SFIXED64", 15, zznrVar, 1);
        zzxj = zznmVar12;
        zznm zznmVar13 = new zznm("SINT32", 16, zznrVar2, 0);
        zzxk = zznmVar13;
        zznm zznmVar14 = new zznm("SINT64", 17, zznrVar, 0);
        zzxl = zznmVar14;
        zzxo = new zznm[]{zznmVar, zznmVar2, zznmVar3, zznmVar4, zznmVar5, zznmVar6, zznmVar7, zznmVar8, zznnVar, zznoVar, zznpVar, zznqVar, zznmVar9, zznmVar10, zznmVar11, zznmVar12, zznmVar13, zznmVar14};
    }

    private zznm(String str, int i, zznr zznrVar, int i2) {
        this.zzxm = zznrVar;
        this.zzxn = i2;
    }

    public static zznm[] values() {
        return (zznm[]) zzxo.clone();
    }

    public final zznr zzfj() {
        return this.zzxm;
    }

    public final int zzfk() {
        return this.zzxn;
    }

    public /* synthetic */ zznm(String str, int i, zznr zznrVar, int i2, zznl zznlVar) {
        this(str, i, zznrVar, i2);
    }
}
