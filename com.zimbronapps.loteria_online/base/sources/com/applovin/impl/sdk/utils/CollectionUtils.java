package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.applovin.impl.sdk.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class CollectionUtils {
    public static boolean addObjectIfExists(Object obj, List list) {
        if (obj != null) {
            return list.add(obj);
        }
        return false;
    }

    public static boolean addUniqueObjectIfExists(Object obj, List list) {
        if (obj == null || list.contains(obj)) {
            return false;
        }
        return list.add(obj);
    }

    public static boolean atLeastOneValueMatch(Collection collection, Collection collection2) {
        Collection collection3 = collection.size() <= collection2.size() ? collection : collection2;
        if (collection.size() <= collection2.size()) {
            collection = collection2;
        }
        HashSet hashSet = new HashSet(collection3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (hashSet.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static List explode(String str) {
        return explode(str, ",\\s*");
    }

    public static boolean getBoolean(Map map, String str) {
        return getBoolean(map, str, false);
    }

    public static Set getDifferenceSet(Set set, Set set2) {
        if (set == null) {
            return null;
        }
        if (set2 == null) {
            return new HashSet(set);
        }
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    public static int getSizeSafely(Collection collection) {
        if (isEmpty(collection)) {
            return 0;
        }
        return collection.size();
    }

    public static HashMap hashMap(String str, String str2) {
        return map(str, str2);
    }

    public static String implode(Collection collection, int i) {
        return implode(collection, ",", i);
    }

    public static boolean isEmpty(Map map) {
        return map == null || map.isEmpty();
    }

    public static Map map(Map map) {
        return map == null ? new HashMap() : new HashMap(map);
    }

    public static void putBooleanIfValid(String str, Boolean bool, Map map) {
        if (!StringUtils.isValidString(str) || bool == null) {
            return;
        }
        map.put(str, bool);
    }

    public static void putDoubleIfValid(String str, Double d, Map map) {
        if (!StringUtils.isValidString(str) || d == null) {
            return;
        }
        map.put(str, d);
    }

    public static void putFloatIfValid(String str, Float f, Map map) {
        if (!StringUtils.isValidString(str) || f == null) {
            return;
        }
        map.put(str, f);
    }

    public static void putIntegerIfValid(String str, Integer num, Map map) {
        if (!StringUtils.isValidString(str) || num == null) {
            return;
        }
        map.put(str, num);
    }

    public static void putJsonArrayIfValid(String str, JSONArray jSONArray, Map map) {
        if (!StringUtils.isValidString(str) || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        map.put(str, jSONArray);
    }

    public static void putLongIfValid(String str, Long l, Map map) {
        if (!StringUtils.isValidString(str) || l == null) {
            return;
        }
        map.put(str, l);
    }

    public static void putObjectToStringIfValid(String str, Object obj, Map map) {
        if (obj == null) {
            return;
        }
        putStringIfValid(str, obj.toString(), map);
    }

    public static void putStringIfValid(String str, String str2, Map map) {
        if (StringUtils.isValidString(str) && StringUtils.isValidString(str2)) {
            map.put(str, str2);
        }
    }

    public static List removeTrimmedEmptyStrings(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!TextUtils.isEmpty(trim)) {
                arrayList.add(trim);
            }
        }
        return arrayList;
    }

    public static List synchronizedList() {
        return synchronizedList(-1);
    }

    public static Bundle toBundle(Map map) {
        if (map == null || map.size() == 0) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Map) {
                bundle.putBundle(str, toBundle((Map) obj));
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            }
        }
        return bundle;
    }

    public static JSONArray toJSONArray(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static JSONObject toJson(Map map) throws JSONException {
        if (map == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static String toJsonString(Map map, String str) {
        try {
            return toJson(map).toString();
        } catch (JSONException e) {
            o.c("CollectionUtils", "Failed to convert map '" + map + "' to JSON string.", e);
            return str;
        }
    }

    public static List explode(String str, String str2) {
        return TextUtils.isEmpty(str) ? Collections.emptyList() : Arrays.asList(str.split(str2));
    }

    public static boolean getBoolean(Map map, String str, boolean z) {
        if (map != null && map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof Number) {
                return ((Number) obj).intValue() >= 1;
            }
        }
        return z;
    }

    public static String implode(Collection collection, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("No glue specified");
        }
        if (collection == null || collection.size() < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (i2 >= i) {
                break;
            }
            i2++;
            sb.append(str2);
            sb.append(str);
        }
        if (sb.length() > str.length()) {
            sb.setLength(sb.length() - str.length());
        }
        return sb.toString();
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static List synchronizedList(int i) {
        return i >= 0 ? Collections.synchronizedList(new ArrayList(i)) : Collections.synchronizedList(new ArrayList());
    }

    public static Map map(Object obj, Object obj2) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(obj, obj2);
        return hashMap;
    }
}
