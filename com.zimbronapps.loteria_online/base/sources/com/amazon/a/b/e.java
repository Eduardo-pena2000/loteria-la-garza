package com.amazon.a.b;

import com.amazon.a.a.i.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class e {
    public static final com.amazon.a.a.i.c a;
    public static final com.amazon.a.a.i.c b;
    public static final com.amazon.a.a.i.c c;
    public static final com.amazon.a.a.i.c d;
    public static final com.amazon.a.a.i.c e;
    public static final com.amazon.a.a.i.c f;
    public static final com.amazon.a.a.i.c g;
    private static final String h = "Quit";
    private static final String i = "Help";
    private static final String j = "Update";

    static {
        c.a aVar = c.a.a;
        c.a aVar2 = c.a.b;
        a = new com.amazon.a.a.i.c(new String[]{"Amazon Appstore required"}, "Amazon Appstore is not installed on your device. Please install Amazon Appstore and sign in to Amazon to use this app.", new String[]{"Quit", "Help"}, new c.a[]{aVar, aVar2}, true, true, 1, 1);
        b = new com.amazon.a.a.i.c("Amazon Appstore connection failure", "An error occurred connecting to Amazon Appstore. Please try opening this app again", "Quit", true, false);
        c = new com.amazon.a.a.i.c(new String[]{"New Appstore version required", "Amazon Appstore Update Required"}, "Amazon Appstore is out of date.  Please visit the Amazon website to install the latest version of the Appstore. ", new String[]{"Quit", "Help"}, new c.a[]{aVar, aVar2}, true, true, 1, 2);
        d = new com.amazon.a.a.i.c("Internet connection required", "An internet connection is required to open this app. Please connect to the internet and reopen this app.", "Quit", true, false);
        e = new com.amazon.a.a.i.c(new String[]{"Connection error"}, "An unknown error occurred connecting to Amazon Appstore.", new String[]{"Quit", "Help"}, new c.a[]{aVar, aVar2}, true, true, 1, 3);
        f = new com.amazon.a.a.i.c("Internal error", "An internal error occurred, please try opening this app again", "Quit", true, false);
        g = new com.amazon.a.a.i.c("App update required", "Please update this app from the Amazon Appstore.", new String[]{"Quit", "Update"}, new c.a[]{aVar, c.a.c}, true, false, 0);
    }

    private e() {
    }
}
