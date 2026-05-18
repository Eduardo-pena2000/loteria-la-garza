package com.revenuecat.purchases.ui.revenuecatui.components.countdown;

import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CountdownTime {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final CountdownTime ZERO = new CountdownTime(0, 0, 0, 0);
    private final int days;
    private final int hours;
    private final int minutes;
    private final int seconds;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final CountdownTime fromInterval(long j) {
            long max = Math.max(0L, j / 1000);
            long j2 = 86400;
            long j3 = 3600;
            long j4 = 60;
            return new CountdownTime((int) (max / j2), (int) ((max % j2) / j3), (int) ((max % j3) / j4), (int) (max % j4));
        }

        public final CountdownTime getZERO() {
            return CountdownTime.access$getZERO$cp();
        }

        private Companion() {
        }
    }

    public CountdownTime(int i, int i2, int i3, int i4) {
        this.days = i;
        this.hours = i2;
        this.minutes = i3;
        this.seconds = i4;
    }

    public static final /* synthetic */ CountdownTime access$getZERO$cp() {
        return ZERO;
    }

    public static /* synthetic */ CountdownTime copy$default(CountdownTime countdownTime, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = countdownTime.days;
        }
        if ((i5 & 2) != 0) {
            i2 = countdownTime.hours;
        }
        if ((i5 & 4) != 0) {
            i3 = countdownTime.minutes;
        }
        if ((i5 & 8) != 0) {
            i4 = countdownTime.seconds;
        }
        return countdownTime.copy(i, i2, i3, i4);
    }

    public static /* synthetic */ void getTotalHours$annotations() {
    }

    public static /* synthetic */ void getTotalMinutes$annotations() {
    }

    public final int component1() {
        return this.days;
    }

    public final int component2() {
        return this.hours;
    }

    public final int component3() {
        return this.minutes;
    }

    public final int component4() {
        return this.seconds;
    }

    public final CountdownTime copy(int i, int i2, int i3, int i4) {
        return new CountdownTime(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountdownTime)) {
            return false;
        }
        CountdownTime countdownTime = (CountdownTime) obj;
        return this.days == countdownTime.days && this.hours == countdownTime.hours && this.minutes == countdownTime.minutes && this.seconds == countdownTime.seconds;
    }

    public final int getDays() {
        return this.days;
    }

    public final int getHours() {
        return this.hours;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public final int getTotalHours() {
        return (this.days * 24) + this.hours;
    }

    public final int getTotalMinutes() {
        return (this.days * 1440) + (this.hours * 60) + this.minutes;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.days) * 31) + Integer.hashCode(this.hours)) * 31) + Integer.hashCode(this.minutes)) * 31) + Integer.hashCode(this.seconds);
    }

    public String toString() {
        return "CountdownTime(days=" + this.days + ", hours=" + this.hours + ", minutes=" + this.minutes + ", seconds=" + this.seconds + ')';
    }
}
