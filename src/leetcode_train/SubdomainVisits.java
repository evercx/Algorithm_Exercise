package leetcode_train;
import java.util.*;

/**
 * Created by EVERCX on 2018/4/17.
 *
 * https://leetcode.com/problems/subdomain-visit-count/description/
 */
public class SubdomainVisits {


    public List<String> subdomainVisits(String[] cpdomains) {

        List<String> result = new ArrayList<>();

        HashMap<String,Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < cpdomains.length;i++){

            int countsIndex = cpdomains[i].indexOf(" ");
            int visits = Integer.parseInt(cpdomains[i].substring(0,countsIndex));
            String domainString = cpdomains[i].substring(countsIndex+1);
            if(map.containsKey(domainString)){
                int count = map.get(domainString);
                count += visits;
                map.put(domainString,count);
            }else {
                map.put(domainString,visits);
            }

            while(domainString.contains(".")){
                int pointIndex= domainString.indexOf(".");
                domainString = domainString.substring(pointIndex+1);
                if(map.containsKey(domainString)){
                    int count = map.get(domainString);
                    count += visits;
                    map.put(domainString,count);
                }else {
                    map.put(domainString,visits);
                }
            }
        }

        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()){

            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object value = entry.getValue();

            String str = value.toString() + " " +key.toString();
            result.add(str);
        }

        return result;

    }



    public static void main(String[] args) {

        String[] input = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> result = new SubdomainVisits().subdomainVisits(input);
        System.out.println(result);

    }
}
