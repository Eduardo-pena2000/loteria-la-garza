package M9;

import Da.v;
import Da.w;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import da.i;
import da.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class c implements j.c {
    public final PackageManager a;
    public final ActivityManager b;
    public final ContentResolver c;

    public c(PackageManager packageManager, ActivityManager activityManager, ContentResolver contentResolver) {
        t.g(packageManager, "packageManager");
        t.g(activityManager, "activityManager");
        t.g(contentResolver, "contentResolver");
        this.a = packageManager;
        this.b = activityManager;
        this.c = contentResolver;
    }

    public final List a() {
        FeatureInfo[] systemAvailableFeatures = this.a.getSystemAvailableFeatures();
        t.f(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (featureInfo.name != null) {
                arrayList.add(featureInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureInfo) it.next()).name);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r6 = this;
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.t.f(r0, r1)
            java.lang.String r1 = "generic"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = Za.B.N(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L1f
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r5 = "DEVICE"
            kotlin.jvm.internal.t.f(r0, r5)
            boolean r0 = Za.B.N(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
        L1f:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r5 = "FINGERPRINT"
            kotlin.jvm.internal.t.f(r0, r5)
            boolean r1 = Za.B.N(r0, r1, r2, r3, r4)
            if (r1 != 0) goto Lb5
            kotlin.jvm.internal.t.f(r0, r5)
            java.lang.String r1 = "unknown"
            boolean r0 = Za.B.N(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "HARDWARE"
            kotlin.jvm.internal.t.f(r0, r1)
            java.lang.String r5 = "goldfish"
            boolean r5 = Za.E.T(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.t.f(r0, r1)
            java.lang.String r1 = "ranchu"
            boolean r0 = Za.E.T(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.t.f(r0, r1)
            java.lang.String r5 = "google_sdk"
            boolean r5 = Za.E.T(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.t.f(r0, r1)
            java.lang.String r5 = "Emulator"
            boolean r5 = Za.E.T(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.t.f(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = Za.E.T(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.t.f(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = Za.E.T(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r1 = "PRODUCT"
            kotlin.jvm.internal.t.f(r0, r1)
            java.lang.String r5 = "sdk"
            boolean r5 = Za.E.T(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.t.f(r0, r1)
            java.lang.String r5 = "vbox86p"
            boolean r5 = Za.E.T(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.t.f(r0, r1)
            java.lang.String r5 = "emulator"
            boolean r5 = Za.E.T(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.t.f(r0, r1)
            java.lang.String r1 = "simulator"
            boolean r0 = Za.E.T(r0, r1, r2, r3, r4)
            if (r0 == 0) goto Lb6
        Lb5:
            r2 = 1
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: M9.c.b():boolean");
    }

    public void onMethodCall(i call, j.d result) {
        String str;
        t.g(call, "call");
        t.g(result, "result");
        if (!call.a.equals("getDeviceInfo")) {
            result.c();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("board", Build.BOARD);
        hashMap.put("bootloader", Build.BOOTLOADER);
        hashMap.put("brand", Build.BRAND);
        hashMap.put("device", Build.DEVICE);
        hashMap.put("display", Build.DISPLAY);
        hashMap.put("fingerprint", Build.FINGERPRINT);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("host", Build.HOST);
        hashMap.put("id", Build.ID);
        hashMap.put("manufacturer", Build.MANUFACTURER);
        hashMap.put("model", Build.MODEL);
        hashMap.put("product", Build.PRODUCT);
        int i = Build.VERSION.SDK_INT;
        if (i >= 25) {
            String string = Settings.Global.getString(this.c, "device_name");
            if (string == null) {
                string = "";
            }
            hashMap.put("name", string);
        }
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        hashMap.put("supported32BitAbis", v.q(Arrays.copyOf(strArr, strArr.length)));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        hashMap.put("supported64BitAbis", v.q(Arrays.copyOf(strArr2, strArr2.length)));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        hashMap.put("supportedAbis", v.q(Arrays.copyOf(strArr3, strArr3.length)));
        hashMap.put("tags", Build.TAGS);
        hashMap.put("type", Build.TYPE);
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!b()));
        hashMap.put("systemFeatures", a());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        hashMap.put("freeDiskSize", Long.valueOf(statFs.getFreeBytes()));
        hashMap.put("totalDiskSize", Long.valueOf(statFs.getTotalBytes()));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("baseOS", Build.VERSION.BASE_OS);
        hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        hashMap2.put("codename", Build.VERSION.CODENAME);
        hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
        hashMap2.put("release", Build.VERSION.RELEASE);
        hashMap2.put("sdkInt", Integer.valueOf(i));
        hashMap.put("version", hashMap2);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.b.getMemoryInfo(memoryInfo);
        hashMap.put("isLowRamDevice", Boolean.valueOf(memoryInfo.lowMemory));
        hashMap.put("physicalRamSize", Long.valueOf(memoryInfo.totalMem / 1048576));
        hashMap.put("availableRamSize", Long.valueOf(memoryInfo.availMem / 1048576));
        if (i >= 26) {
            try {
                str = b.a();
            } catch (SecurityException unused) {
                str = "unknown";
            }
            hashMap.put("serialNumber", str);
        } else {
            hashMap.put("serialNumber", Build.SERIAL);
        }
        result.a(hashMap);
    }
}
