package V5;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class l0 {
    public static List b;
    public static final Map a = new HashMap();
    public static final Object c = new Object();

    public static List a(String str) {
        ArrayList arrayList;
        Object obj = c;
        synchronized (obj) {
            Map map = a;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (b == null) {
                            b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : b) {
                            if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("codecName", mediaCodecInfo.getName());
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                ArrayList arrayList2 = new ArrayList();
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                                }
                                hashMap.put("profileLevels", arrayList2);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                if (videoCapabilities != null) {
                                    hashMap.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                                    hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                    hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                    hashMap.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                                    hashMap.put("widths", b(videoCapabilities.getSupportedWidths()));
                                    hashMap.put("heights", b(videoCapabilities.getSupportedHeights()));
                                }
                                hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                arrayList.add(hashMap);
                            }
                        }
                        a.put(str, arrayList);
                    } finally {
                    }
                }
                return arrayList;
            } catch (LinkageError e) {
                e = e;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                a.put(str, arrayList3);
                return arrayList3;
            } catch (RuntimeException e2) {
                e = e2;
                HashMap hashMap22 = new HashMap();
                hashMap22.put("error", e.getClass().getSimpleName());
                ArrayList arrayList32 = new ArrayList();
                arrayList32.add(hashMap22);
                a.put(str, arrayList32);
                return arrayList32;
            }
        }
    }

    public static Integer[] b(Range range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }
}
