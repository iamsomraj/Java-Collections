import java.util.*;
class Main 
{
    public static void main(String args[]) {
        String services[] = {
            "ambulance",
            "helicopter",
            "lifeboat"
        };
        String drivers[][] = {
            {"aaa","bbb"},
            {"bbb","ccc","ddd"},
            {"eee","aaa","bbb","fff"}
        };

        LinkedHashMap<String, Set<String>> linkedHashMap = new LinkedHashMap<>();
        for(int i = 0; i < services.length; i++)
        {
            String service = services[i];
            String driverList[] = drivers[i];
            LinkedHashSet<String> driversListSet = new LinkedHashSet<>();
            for(String d: driverList)
            {
                driversListSet.add(d);
            }
            linkedHashMap.put(service,driversListSet);
        }

        for(Map.Entry<String,Set<String>> entry: linkedHashMap.entrySet())
        {
            String service = entry.getKey();
            Set<String> driverList = entry.getValue();
            System.out.println(service+"\t:\t"+driverList.toString());
        }
    }
}