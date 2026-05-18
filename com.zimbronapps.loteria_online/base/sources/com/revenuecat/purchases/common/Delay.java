package com.revenuecat.purchases.common;

import ab.b;
import ab.d;
import ab.e;

/* JADX WARN: Enum visitor error
LI11I1ll1Ii11.IIiLliI1l1li1: Init of enum field 'NONE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:112)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:70)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:9)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:39)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:46)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:50)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:41)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:136)
	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Delay {
    private static final /* synthetic */ Delay[] $VALUES;
    public static final Delay DEFAULT;
    public static final Delay LONG;
    public static final Delay NONE;
    private final long maxDelay;
    private final long minDelay;

    private static final /* synthetic */ Delay[] $values() {
        return new Delay[]{NONE, DEFAULT, LONG};
    }

    static {
        b.a aVar = ab.b.b;
        e eVar = e.d;
        NONE = new Delay("NONE", 0, d.s(0, eVar), d.s(0, eVar));
        long s = d.s(0, eVar);
        DispatcherConstants dispatcherConstants = DispatcherConstants.INSTANCE;
        DEFAULT = new Delay("DEFAULT", 1, s, dispatcherConstants.getJitterDelay-UwyO8pc());
        LONG = new Delay("LONG", 2, dispatcherConstants.getJitterDelay-UwyO8pc(), dispatcherConstants.getJitterLongDelay-UwyO8pc());
        $VALUES = $values();
    }

    private Delay(String str, int i, long j, long j2) {
        this.minDelay = j;
        this.maxDelay = j2;
    }

    public static Delay valueOf(String str) {
        return (Delay) Enum.valueOf(Delay.class, str);
    }

    public static Delay[] values() {
        return (Delay[]) $VALUES.clone();
    }

    public final long getMaxDelay-UwyO8pc() {
        return this.maxDelay;
    }

    public final long getMinDelay-UwyO8pc() {
        return this.minDelay;
    }
}
